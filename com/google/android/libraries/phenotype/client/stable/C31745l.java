package com.google.android.libraries.phenotype.client.stable;

/* renamed from: com.google.android.libraries.phenotype.client.stable.l */
/* compiled from: PG */
public abstract class C31745l implements C31747n {

    /* renamed from: a */
    private static volatile C31745l f85336a;

    /* renamed from: h */
    public static C31745l m59073h() {
        C31745l lVar = f85336a;
        if (lVar == null) {
            synchronized (C31745l.class) {
                if (f85336a == null) {
                    f85336a = new C31744k();
                }
                lVar = f85336a;
            }
        }
        return lVar;
    }

    /* renamed from: i */
    public static synchronized void m59074i(C31745l lVar) {
        synchronized (C31745l.class) {
            f85336a = lVar;
        }
    }
}
