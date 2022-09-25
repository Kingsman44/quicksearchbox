package androidx.work.impl.utils;

import androidx.work.impl.C4452ag;
import androidx.work.impl.WorkDatabase;

/* renamed from: androidx.work.impl.utils.d */
/* compiled from: PG */
public final class C4597d extends C4598e {

    /* renamed from: a */
    final /* synthetic */ C4452ag f14491a;

    /* renamed from: b */
    final /* synthetic */ String f14492b;

    /* renamed from: c */
    final /* synthetic */ boolean f14493c;

    public C4597d(C4452ag agVar, String str, boolean z) {
        this.f14491a = agVar;
        this.f14492b = str;
        this.f14493c = z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo9548a() {
        WorkDatabase workDatabase = this.f14491a.f14143e;
        workDatabase.mo8181p();
        try {
            for (String b : workDatabase.mo9364F().mo9428h(this.f14492b)) {
                m12992b(this.f14491a, b);
            }
            workDatabase.mo8188w();
            workDatabase.mo8183r();
            if (this.f14493c) {
                m12993c(this.f14491a);
            }
        } catch (Throwable th) {
            workDatabase.mo8183r();
            throw th;
        }
    }
}
