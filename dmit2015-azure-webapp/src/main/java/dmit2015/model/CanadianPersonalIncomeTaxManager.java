package dmit2015.model;

import java.nio.file.Path;

public class CanadianPersonalIncomeTaxManager {
    public static void main(String[] args) {
        try {
            Path csvPath = Path.of(Thread.currentThread().getContextClassLoader().getResource("data/CanadianPersonalIncomeTaxManager").toURI());
        }


    }
}
