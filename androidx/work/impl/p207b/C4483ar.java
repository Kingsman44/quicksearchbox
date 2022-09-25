package androidx.work.impl.p207b;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;

/* renamed from: androidx.work.impl.b.ar */
/* compiled from: PG */
final class C4483ar extends C3933ap {
    public C4483ar(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
