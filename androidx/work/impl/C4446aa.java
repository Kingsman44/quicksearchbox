package androidx.work.impl;

import android.content.Context;
import java.io.File;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.aa */
/* compiled from: PG */
public final class C4446aa {
    /* renamed from: a */
    public static final File m12676a(Context context) {
        C69664n.m101061g(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C69664n.m101060f(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }
}
