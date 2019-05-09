import java.util.LinkedHashMap;
import java.util.Map;

// 储存需要替换的方块
class Replace {
    private Map<String,String> Map(){
        Map<String,String> replaceMap = new LinkedHashMap<>();
        replaceMap.put("█","${AnsiColor.BRIGHT_YELLOW}█");
        replaceMap.put("▄","${AnsiColor.BRIGHT_YELLOW}▄");
        replaceMap.put("▐","${AnsiColor.BRIGHT_YELLOW}▐");
        replaceMap.put("▀","${AnsiColor.BRIGHT_YELLOW}▀");
        replaceMap.put("▌","${AnsiColor.BRIGHT_YELLOW}▌");
        replaceMap.put("▓","${AnsiColor.YELLOW}▓");
        replaceMap.put("░","${AnsiColor.BRIGHT_CYAN}░");
        replaceMap.put("▒","${AnsiColor.BRIGHT_MAGENTA}▒");
        return replaceMap;
    }

    // 判断是否包含相应的符号
    String replace(String line){
        for (Map.Entry<String,String> entry:Map().entrySet()){
            if (line.contains(entry.getKey())){
                line = line.replace(entry.getKey(),entry.getValue());
            }
        }
        return line;
    }
}






