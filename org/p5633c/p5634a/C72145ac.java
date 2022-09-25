package org.p5633c.p5634a;

import java.io.Serializable;
import org.p5633c.p5634a.p5635a.C72141i;
import org.p5633c.p5634a.p5639e.C72268y;
import org.p5633c.p5634a.p5639e.C72269z;

/* renamed from: org.c.a.ac */
/* compiled from: PG */
public final class C72145ac extends C72141i implements Serializable, C72152aj {
    private static final long serialVersionUID = 741052353876488155L;

    static {
        new C72145ac();
    }

    public C72145ac() {
        super((C72146ad) null);
    }

    /* renamed from: b */
    public static C72145ac m105759b(String str) {
        C72269z a = C72268y.m106711a();
        a.mo63645c();
        return new C72145ac(a.mo63643a(str));
    }

    /* renamed from: a */
    public final C72290n mo63428a() {
        if (this.f191965a.mo63429a(this, C72146ad.f191968a) != 0) {
            throw new UnsupportedOperationException("Cannot convert to Duration as this period contains months and months vary in length");
        } else if (this.f191965a.mo63429a(this, 0) == 0) {
            return new C72290n(((long) this.f191965a.mo63429a(this, C72146ad.f191974g)) + (((long) this.f191965a.mo63429a(this, C72146ad.f191973f)) * 1000) + (((long) this.f191965a.mo63429a(this, C72146ad.f191972e)) * 60000) + (((long) this.f191965a.mo63429a(this, C72146ad.f191971d)) * 3600000) + (((long) this.f191965a.mo63429a(this, C72146ad.f191970c)) * 86400000) + (((long) this.f191965a.mo63429a(this, C72146ad.f191969b)) * 604800000));
        } else {
            throw new UnsupportedOperationException("Cannot convert to Duration as this period contains years and years vary in length");
        }
    }

    public C72145ac(Object obj) {
        super(obj, (C72146ad) null);
    }
}
