package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: androidx.work.impl.b.ai */
/* compiled from: PG */
final class C4474ai extends C3933ap {
    public C4474ai(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
