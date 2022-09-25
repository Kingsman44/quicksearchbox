package com.google.android.libraries.elements.p1729h;

/* renamed from: com.google.android.libraries.elements.h.e */
/* compiled from: PG */
public final /* synthetic */ class C21207e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21208f f59506a;

    public /* synthetic */ C21207e(C21208f fVar) {
        this.f59506a = fVar;
    }

    public final void run() {
        String str;
        C21208f fVar = this.f59506a;
        if (!fVar.f59509d) {
            if (C21208f.f59507b.get(fVar.f59508c) == null) {
                str = C21199ab.UNKNOWN.f59483m;
            } else {
                str = ((C21199ab) C21208f.f59507b.get(fVar.f59508c)).f59483m;
            }
            fVar.mo26260f(str, fVar.f59510e, fVar.f59511f);
            long j = fVar.f59514i;
            if (j > 0) {
                long j2 = fVar.f59515j;
                if (j2 > 0) {
                    fVar.mo26260f(C21199ab.FIRST_ROOT_MATERIALIZATION.f59483m, j, j2);
                }
            }
            long j3 = fVar.f59512g;
            if (j3 > 0) {
                long j4 = fVar.f59513h;
                if (j4 > 0) {
                    fVar.mo26260f(C21199ab.FIRST_ROOT_MEASUREMENT.f59483m, j3, j4);
                }
            }
        }
    }
}
