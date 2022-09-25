package com.google.android.apps.gsa.nga.engine.understanding.teleport;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.i */
/* compiled from: PG */
abstract class C79311i {
    /* renamed from: a */
    public abstract C79310h mo73870a();

    /* renamed from: b */
    public abstract String mo73871b();

    /* renamed from: c */
    public abstract String mo73872c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo73873d() {
        C79310h hVar = C79310h.APP;
        int ordinal = mo73870a().ordinal();
        if (ordinal == 0) {
            return mo73871b();
        }
        if (ordinal == 1) {
            return mo73872c();
        }
        throw new AssertionError(mo73870a());
    }
}
