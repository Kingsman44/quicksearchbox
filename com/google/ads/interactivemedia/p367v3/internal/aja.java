package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aja */
/* compiled from: PG */
final class aja {

    /* renamed from: a */
    final String f20739a;

    /* renamed from: b */
    final boolean f20740b;

    /* renamed from: c */
    final boolean f20741c;

    /* renamed from: d */
    final /* synthetic */ Field f20742d;

    /* renamed from: e */
    final /* synthetic */ boolean f20743e;

    /* renamed from: f */
    final /* synthetic */ agt f20744f;

    /* renamed from: g */
    final /* synthetic */ age f20745g;

    /* renamed from: h */
    final /* synthetic */ akz f20746h;

    /* renamed from: i */
    final /* synthetic */ boolean f20747i;

    protected aja(String str, boolean z, boolean z2) {
        this.f20739a = str;
        this.f20740b = z;
        this.f20741c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aja(String str, boolean z, boolean z2, Field field, boolean z3, agt agt, age age, akz akz, boolean z4) {
        this(str, z, z2);
        this.f20742d = field;
        this.f20743e = z3;
        this.f20744f = agt;
        this.f20745g = age;
        this.f20746h = akz;
        this.f20747i = z4;
    }

    /* renamed from: a */
    public void mo14867a(ald ald, Object obj) {
        agt agt;
        Object obj2 = this.f20742d.get(obj);
        if (this.f20743e) {
            agt = this.f20744f;
        } else {
            agt = new ajj(this.f20745g, this.f20744f, this.f20746h.mo14888b());
        }
        agt.write(ald, obj2);
    }

    /* renamed from: b */
    public void mo14868b(alb alb, Object obj) {
        Object read = this.f20744f.read(alb);
        if (read != null || !this.f20747i) {
            this.f20742d.set(obj, read);
        }
    }

    /* renamed from: c */
    public boolean mo14869c(Object obj) {
        return this.f20740b && this.f20742d.get(obj) != obj;
    }
}
