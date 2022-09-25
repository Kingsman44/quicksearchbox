package com.google.common.base;

import p3186j$.util.Objects;

/* renamed from: com.google.common.base.cu */
/* compiled from: PG */
final class C58884cu implements C58881cr {

    /* renamed from: a */
    volatile C58881cr f156726a;

    /* renamed from: b */
    volatile boolean f156727b;

    /* renamed from: c */
    Object f156728c;

    public C58884cu(C58881cr crVar) {
        crVar.getClass();
        this.f156726a = crVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        if (!this.f156727b) {
            synchronized (this) {
                if (!this.f156727b) {
                    Object a = ((C58881cr) Objects.requireNonNull(this.f156726a)).mo6453a();
                    this.f156728c = a;
                    this.f156727b = true;
                    this.f156726a = null;
                    return a;
                }
            }
        }
        return this.f156728c;
    }

    public final String toString() {
        Object obj = this.f156726a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f156728c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
