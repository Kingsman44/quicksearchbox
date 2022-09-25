package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.ep */
/* compiled from: PG */
public final class C58426ep extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58495hd f156039a;

    public C58426ep(C58495hd hdVar) {
        this.f156039a = hdVar;
    }

    /* renamed from: a */
    public final int mo55236a(Object obj) {
        Integer num = (Integer) this.f156039a.get(obj);
        if (num != null) {
            return num.intValue();
        }
        throw new C58709pb(obj);
    }

    public final int compare(Object obj, Object obj2) {
        return mo55236a(obj) - mo55236a(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58426ep) {
            return C58662ni.m90356o(this.f156039a, ((C58426ep) obj).f156039a);
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(this.f156039a.entrySet());
    }

    public final String toString() {
        return "Ordering.explicit(" + this.f156039a.keySet() + ")";
    }
}
