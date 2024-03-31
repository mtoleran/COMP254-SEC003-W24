import java.util.Iterator;

public class Driver {
    public static void main(String[] args){
        // Chain Hash Map
        System.out.println("--CHAIN HASH MAP--");
        ChainHashMap<Integer, String> ssn = new ChainHashMap<>(2);

        ssn.put(19,"123-345-6789");
        ssn.put(19,"123-345-4444");
        ssn.put(50,"025-612-0001");
        ssn.put(89,"022-332-5555");

        Iterator<Entry<Integer,String>> ssnInfo = ssn.entrySet().iterator();

        for (Iterator<Entry<Integer, String>> it = ssnInfo; it.hasNext(); ) {
            Entry<Integer, String> value = it.next();
            System.out.println(value.getKey() + " " + value.getValue());
        }

        // Probe Hash Map
        System.out.println("\n--PROBE HASH MAP--");
        ProbeHashMap<Integer, String> ssnProbe = new ProbeHashMap<>(12);

        ssnProbe.put(18,"123-345-6789");
        ssnProbe.put(41,"555-967-0949");
        ssnProbe.put(22,"332-567-8749");
        ssnProbe.put(44,"025-612-0001");
        ssnProbe.put(59,"678-233-1111");
        ssnProbe.put(32,"234-156-9831");
        ssnProbe.put(31,"046-172-2542");
        ssnProbe.put(73,"976-764-1129");

        Iterator<Entry<Integer,String>> ssnProbeInfo = ssnProbe.entrySet().iterator();

        for (Iterator<Entry<Integer, String>> it = ssnProbeInfo; it.hasNext(); ) {
            Entry<Integer, String> value = it.next();
            System.out.println(" key: " + value.getKey() + " value: "+ value.getValue());
        }


    }
}
