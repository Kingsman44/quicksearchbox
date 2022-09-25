package org.tensorflow.lite;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
public final class TensorFlowLite {

    /* renamed from: a */
    private static final Logger f193251a = Logger.getLogger(C72669f.class.getName());

    /* renamed from: b */
    private static final String[][] f193252b;

    /* renamed from: c */
    private static final Throwable f193253c;

    /* renamed from: d */
    private static volatile boolean f193254d = false;

    /* renamed from: e */
    private static final AtomicBoolean[] f193255e = new AtomicBoolean[3];

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        f193252b = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            String[] strArr2 = strArr[i];
            int length = strArr2.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr2[i2];
                try {
                    System.loadLibrary(str);
                    Logger logger = f193251a;
                    Level level = Level.INFO;
                    logger.logp(level, "org.tensorflow.lite.TensorFlowLite", "<clinit>", "Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    f193251a.logp(Level.INFO, "org.tensorflow.lite.TensorFlowLite", "<clinit>", "Didn't load native library: ".concat(String.valueOf(str)));
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(unsatisfiedLinkError, new Object[]{e});
                        } catch (Exception unused) {
                        }
                    }
                    i2++;
                }
            }
        }
        f193253c = unsatisfiedLinkError;
        for (int i3 = 0; i3 < 3; i3++) {
            f193255e[i3] = new AtomicBoolean();
        }
    }

    private TensorFlowLite() {
    }

    /* renamed from: a */
    public static void m107466a() {
        if (!f193254d) {
            try {
                nativeDoNothing();
                f193254d = true;
            } catch (UnsatisfiedLinkError e) {
                Throwable th = f193253c;
                if (th == null) {
                    th = e;
                }
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  ".concat(th.toString()));
                unsatisfiedLinkError.initCause(e);
                throw unsatisfiedLinkError;
            }
        }
    }

    private static native void nativeDoNothing();
}
