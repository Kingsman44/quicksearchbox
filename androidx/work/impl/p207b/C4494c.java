package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: androidx.work.impl.b.c */
/* compiled from: PG */
final class C4494c extends C3966s {
    public C4494c(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C4465a aVar = (C4465a) obj;
        String str = aVar.f14202a;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
        String str2 = aVar.f14203b;
        if (str2 == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, str2);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
