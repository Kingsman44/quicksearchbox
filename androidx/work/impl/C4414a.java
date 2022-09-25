package androidx.work.impl;

import android.content.Context;
import java.io.File;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a */
/* compiled from: PG */
public final class C4414a {

    /* renamed from: a */
    public static final C4414a f14098a = new C4414a();

    private C4414a() {
    }

    /* renamed from: a */
    public final File mo9367a(Context context) {
        C69664n.m101061g(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C69664n.m101060f(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
