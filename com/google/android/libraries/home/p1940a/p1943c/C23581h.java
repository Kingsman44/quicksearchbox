package com.google.android.libraries.home.p1940a.p1943c;

import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.h */
/* compiled from: PG */
public class C23581h extends C23544dr {

    /* renamed from: a */
    public final boolean f64597a;

    /* renamed from: b */
    private final C23542dp f64598b;

    /* renamed from: c */
    private final boolean f64599c;

    /* renamed from: d */
    private final boolean f64600d;

    /* renamed from: e */
    private final String f64601e;

    /* renamed from: f */
    private final String f64602f;

    protected C23581h(C23542dp dpVar, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.f64598b = dpVar;
        this.f64597a = z;
        this.f64599c = z2;
        this.f64600d = z3;
        this.f64601e = str;
        this.f64602f = str2;
    }

    /* renamed from: a */
    public C23542dp mo28874a() {
        return this.f64598b;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28888b() {
        return Boolean.valueOf(this.f64597a);
    }

    /* renamed from: c */
    public String mo28875c() {
        return this.f64602f;
    }

    /* renamed from: d */
    public String mo28876d() {
        return this.f64601e;
    }

    /* renamed from: e */
    public void mo28889e(C52021ht htVar) {
        C69664n.m101061g(htVar, "valueBuilder");
        boolean booleanValue = Boolean.valueOf(this.f64597a).booleanValue();
        htVar.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar.instance;
        C52022hu huVar2 = C52022hu.f136532f;
        huVar.f136534a |= 16;
        huVar.f136538e = booleanValue;
    }

    /* renamed from: f */
    public boolean mo28878f() {
        return this.f64599c;
    }

    /* renamed from: g */
    public boolean mo28879g() {
        return this.f64600d;
    }
}
