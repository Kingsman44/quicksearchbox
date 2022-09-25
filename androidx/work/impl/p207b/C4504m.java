package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: androidx.work.impl.b.m */
/* compiled from: PG */
final class C4504m extends C3966s {
    public C4504m(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C4502k kVar = (C4502k) obj;
        String str = kVar.f14262a;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
        lVar.mo8204e(2, (long) kVar.f14263b);
        lVar.mo8204e(3, (long) kVar.f14264c);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
