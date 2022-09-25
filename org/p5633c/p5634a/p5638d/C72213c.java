package org.p5633c.p5634a.p5638d;

import java.io.Serializable;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;

/* renamed from: org.c.a.d.c */
/* compiled from: PG */
public abstract class C72213c extends C72291o implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;

    /* renamed from: d */
    public final C72293q f192178d;

    protected C72213c(C72293q qVar) {
        if (qVar != null) {
            this.f192178d = qVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    /* renamed from: a */
    public int mo63473a(long j, long j2) {
        return C72218h.m106355a(mo63476d(j, j2));
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long e = ((C72291o) obj).mo63488e();
        long e2 = mo63488e();
        if (e2 == e) {
            return 0;
        }
        return e2 < e ? -1 : 1;
    }

    /* renamed from: g */
    public final C72293q mo63565g() {
        return this.f192178d;
    }

    /* renamed from: i */
    public final boolean mo63566i() {
        return true;
    }

    public final String toString() {
        String str = this.f192178d.f192448m;
        return "DurationField[" + str + "]";
    }
}
