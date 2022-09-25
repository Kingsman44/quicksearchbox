package com.google.android.play.core.p3538g;

import android.content.Context;
import com.google.android.play.core.p3529c.C45053a;
import java.io.File;

/* renamed from: com.google.android.play.core.g.o */
/* compiled from: PG */
public final class C45180o {
    static {
        new C45053a("SplitInstallHelper");
    }

    /* renamed from: a */
    public static void m80432a(Context context, String str) {
        synchronized (C45175j.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (new File(str2).exists()) {
                    System.load(str2);
                } else {
                    throw e;
                }
            }
        }
    }
}
