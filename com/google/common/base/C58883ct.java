package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.ct */
/* compiled from: PG */
final class C58883ct implements Serializable, C58881cr {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58881cr f156723a;

    /* renamed from: b */
    volatile transient boolean f156724b;

    /* renamed from: c */
    transient Object f156725c;

    public C58883ct(C58881cr crVar) {
        crVar.getClass();
        this.f156723a = crVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        if (!this.f156724b) {
            synchronized (this) {
                if (!this.f156724b) {
                    Object a = this.f156723a.mo6453a();
                    this.f156725c = a;
                    this.f156724b = true;
                    return a;
                }
            }
        }
        return this.f156725c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f156724b) {
            obj = "<supplier that returned " + this.f156725c + ">";
        } else {
            obj = this.f156723a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
