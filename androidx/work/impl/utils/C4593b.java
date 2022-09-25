package androidx.work.impl.utils;

import androidx.work.impl.C4452ag;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.b */
/* compiled from: PG */
public final class C4593b extends C4598e {

    /* renamed from: a */
    final /* synthetic */ C4452ag f14483a;

    /* renamed from: b */
    final /* synthetic */ UUID f14484b;

    public C4593b(C4452ag agVar, UUID uuid) {
        this.f14483a = agVar;
        this.f14484b = uuid;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo9548a() {
        WorkDatabase workDatabase = this.f14483a.f14143e;
        workDatabase.mo8181p();
        try {
            m12992b(this.f14483a, this.f14484b.toString());
            workDatabase.mo8188w();
            workDatabase.mo8183r();
            m12993c(this.f14483a);
        } catch (Throwable th) {
            workDatabase.mo8183r();
            throw th;
        }
    }
}
