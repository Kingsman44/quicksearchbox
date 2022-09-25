package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: androidx.work.impl.b.ah */
/* compiled from: PG */
final class C4473ah extends C3933ap {
    public C4473ah(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
