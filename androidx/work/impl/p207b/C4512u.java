package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: androidx.work.impl.b.u */
/* compiled from: PG */
final class C4512u extends C3966s {
    public C4512u(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C4510s sVar = (C4510s) obj;
        String str = sVar.f14271a;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
        String str2 = sVar.f14272b;
        if (str2 == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, str2);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
