package com.google.common.p4522b;

import com.google.common.base.C58832aw;

/* renamed from: com.google.common.b.fm */
/* compiled from: PG */
final class C58450fm extends C58312aj {

    /* renamed from: a */
    final C58458fu f156057a;

    /* renamed from: b */
    final Object f156058b;

    /* renamed from: c */
    int f156059c;

    public C58450fm(C58458fu fuVar, int i) {
        this.f156057a = fuVar;
        this.f156058b = fuVar.f156072b[i];
        this.f156059c = i;
    }

    /* renamed from: a */
    private final void m89724a() {
        int i = this.f156059c;
        if (i != -1) {
            C58458fu fuVar = this.f156057a;
            if (i <= fuVar.f156073c && C58832aw.m90831a(this.f156058b, fuVar.f156072b[i])) {
                return;
            }
        }
        C58458fu fuVar2 = this.f156057a;
        Object obj = this.f156058b;
        this.f156059c = fuVar2.mo55334c(obj, C58462fy.m89758b(obj));
    }

    public final Object getKey() {
        return this.f156058b;
    }

    public final Object getValue() {
        m89724a();
        int i = this.f156059c;
        if (i == -1) {
            return null;
        }
        return this.f156057a.f156071a[i];
    }

    public final Object setValue(Object obj) {
        m89724a();
        int i = this.f156059c;
        if (i == -1) {
            this.f156057a.mo55345k(this.f156058b, obj);
            return null;
        }
        Object obj2 = this.f156057a.f156071a[i];
        if (C58832aw.m90831a(obj2, obj)) {
            return obj;
        }
        this.f156057a.mo55347l(this.f156059c, obj);
        return obj2;
    }
}
