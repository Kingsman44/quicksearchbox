package org.chromium.base.memory;

import android.os.Debug;
import java.io.IOException;
import org.chromium.base.C72387m;

/* compiled from: PG */
public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            C72387m.m107042c("JavaHprofGenerator", "Error writing to file " + str + ". Error: " + message, new Object[0]);
            return false;
        }
    }
}
