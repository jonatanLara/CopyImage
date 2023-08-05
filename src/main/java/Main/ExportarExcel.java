
package Main;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Usuario1
 */
public class ExportarExcel {
    private File archivoXLS;
    private Workbook workbook;
    private Sheet sheet1;
    private FileOutputStream fout;
    private Row row;
    private Cell cell;
    private CellStyle cellstyle;
    
    public ExportarExcel(String ruta, String nameSheet){
        this.archivoXLS = new File(ruta);
        this.workbook = new XSSFWorkbook();
        this.sheet1 = workbook.createSheet(nameSheet);
        this.cellstyle = workbook.createCellStyle();
        
        this.row = null;
        this.cell = null;
    }
    
    public void crearArchivo(){
        try {
            fout = new FileOutputStream(archivoXLS);
            workbook.write(fout);
            fout.close();
        } catch (Exception e) {
        }
    }
    
    public void encabezado(int rowNum, int cellNum, String texto ){
            row = sheet1.createRow(rowNum);
            cell = row.createCell(cellNum);
            cell.setCellValue(texto);
    }
    
    public void encabezadoArray(String texto[]){
        row = sheet1.createRow(0); // numero de fila 
        for (int i = 0; i < texto.length; i++) {
            cell = row.createCell(i); // celdas en la fila actual o seleccionada
            cell.setCellValue(texto[i]);
            changeCellBackgroundColorWithPattern(cell);
        }    
    }
    
    public void ContenidoArray(int x,  String contenido[]){
        for (int j = 0; j < contenido.length; j++) {
            row = sheet1.createRow(x);
            for (int k = 0; k < contenido.length; k++) {
                cell = row.createCell(k); // celdas en la fila actual o seleccionada
                cell.setCellValue(contenido[k]);
            }
        }
    }
    
    public void ContenidoIndividual(int rowNum, int cellNum, String texto ){
        row = sheet1.createRow(rowNum);
        cell = row.createCell(cellNum);
        cell.setCellValue(texto);
    }
    
    public void changeCellBackgroundColorWithPattern(Cell cell) {
        CellStyle cellStyle = cell.getCellStyle();
        if(cellStyle == null) {
            cellStyle = cell.getSheet().getWorkbook().createCellStyle();
        }
        cellStyle.setFillBackgroundColor(IndexedColors.BLACK.index);
        cellStyle.setFillPattern(FillPatternType.BIG_SPOTS);
        cellStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        cell.setCellStyle(cellStyle);
    }
    
}
