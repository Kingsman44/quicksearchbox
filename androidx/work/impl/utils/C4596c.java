package androidx.work.impl.utils;

import androidx.work.impl.C4452ag;
import androidx.work.impl.WorkDatabase;

/* renamed from: androidx.work.impl.utils.c */
/* compiled from: PG */
public final class C4596c extends C4598e {

    /* renamed from: a */
    final /* synthetic */ C4452ag f14489a;

    /* renamed from: b */
    final /* synthetic */ String f14490b;

    public C4596c(C4452ag agVar, String str) {
        this.f14489a = agVar;
        this.f14490b = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo9548a() {
        WorkDatabase workDatabase = this.f14489a.f14143e;
        workDatabase.mo8181p();
        try {
            for (String b : workDatabase.mo9364F().mo9429i(this.f14490b)) {
                m12992b(this.f14489a, b);
            }
            workDatabase.mo8188w();
            workDatabase.mo8183r();
            m12993c(this.f14489a);
        } catch (Throwable th) {
            workDatabase.mo8183r();
            throw th;
        }
    }
}
