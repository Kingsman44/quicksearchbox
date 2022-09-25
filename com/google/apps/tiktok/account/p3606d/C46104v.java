package com.google.apps.tiktok.account.p3606d;

import com.google.common.p4522b.C58759qy;
import com.google.common.p4536h.C59236ac;
import com.google.common.p4536h.C59237ad;
import com.google.common.p4541l.C59316ad;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.d.v */
/* compiled from: PG */
public final /* synthetic */ class C46104v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ File f120993a;

    public /* synthetic */ C46104v(File file) {
        this.f120993a = file;
    }

    public final Object call() {
        File file = this.f120993a;
        if (!file.exists()) {
            return null;
        }
        C59236ac acVar = C59316ad.f157487a;
        boolean z = true;
        for (File file2 : new C59237ad(acVar, acVar).mo56707b(new C58759qy(file))) {
            if (!file.equals(file2) && file2.exists()) {
                file2.setWritable(true, true);
                z &= file2.delete();
            }
        }
        if (z && file.setWritable(false, false) && file.list().length == 0) {
            return null;
        }
        file.setWritable(true, true);
        throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(file))));
    }
}
