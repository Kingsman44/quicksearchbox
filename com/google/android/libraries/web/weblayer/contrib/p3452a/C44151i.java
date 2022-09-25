package com.google.android.libraries.web.weblayer.contrib.p3452a;

import com.google.common.p4522b.C58759qy;
import com.google.common.p4536h.C59236ac;
import com.google.common.p4536h.C59237ad;
import com.google.common.p4541l.C59316ad;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.i */
/* compiled from: PG */
public final /* synthetic */ class C44151i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ File f114890a;

    public /* synthetic */ C44151i(File file) {
        this.f114890a = file;
    }

    public final Object call() {
        File file = this.f114890a;
        if (!file.exists()) {
            return null;
        }
        C59236ac acVar = C59316ad.f157487a;
        boolean z = true;
        for (File file2 : new C59237ad(acVar, acVar).mo56707b(new C58759qy(file))) {
            if (file2.exists()) {
                file2.setWritable(true);
                z &= file2.delete();
            }
        }
        if (z) {
            return null;
        }
        throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(file))));
    }
}
