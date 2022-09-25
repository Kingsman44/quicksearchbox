package com.google.common.p4522b;

import com.google.common.base.C58832aw;

/* renamed from: com.google.common.b.fl */
/* compiled from: PG */
final class C58449fl extends C58312aj {

    /* renamed from: a */
    final Object f156054a;

    /* renamed from: b */
    int f156055b;

    /* renamed from: c */
    final /* synthetic */ C58458fu f156056c;

    public C58449fl(C58458fu fuVar, int i) {
        this.f156056c = fuVar;
        this.f156054a = fuVar.f156071a[i];
        this.f156055b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo55309a() {
        int i = this.f156055b;
        if (i != -1) {
            C58458fu fuVar = this.f156056c;
            if (i <= fuVar.f156073c && C58832aw.m90831a(fuVar.f156071a[i], this.f156054a)) {
                return;
            }
        }
        C58458fu fuVar2 = this.f156056c;
        Object obj = this.f156054a;
        this.f156055b = fuVar2.mo55333b(obj, C58462fy.m89758b(obj));
    }

    public final Object getKey() {
        return this.f156054a;
    }

    public final Object getValue() {
        mo55309a();
        int i = this.f156055b;
        if (i == -1) {
            return null;
        }
        return this.f156056c.f156072b[i];
    }

    public final Object setValue(Object obj) {
        mo55309a();
        int i = this.f156055b;
        if (i == -1) {
            this.f156056c.mo55338d(this.f156054a, obj, false);
            return null;
        }
        Object obj2 = this.f156056c.f156072b[i];
        if (C58832aw.m90831a(obj2, obj)) {
            return obj;
        }
        this.f156056c.mo55344j(this.f156055b, obj, false);
        return obj2;
    }
}
