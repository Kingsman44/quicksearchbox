package com.google.android.libraries.home.p1940a.p1943c;

import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.en */
/* compiled from: PG */
public class C23567en extends C23544dr {

    /* renamed from: a */
    private final C23542dp f64492a;

    /* renamed from: b */
    private final boolean f64493b;

    /* renamed from: c */
    public final String f64494c;

    /* renamed from: d */
    public final boolean f64495d;

    /* renamed from: e */
    private final String f64496e;

    /* renamed from: f */
    private final String f64497f;

    protected C23567en(C23542dp dpVar, String str, boolean z, boolean z2, String str2, String str3) {
        C69664n.m101061g(str, "value");
        this.f64492a = dpVar;
        this.f64494c = str;
        this.f64495d = z;
        this.f64493b = z2;
        this.f64496e = str2;
        this.f64497f = str3;
    }

    /* renamed from: a */
    public C23542dp mo28874a() {
        return this.f64492a;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28888b() {
        return this.f64494c;
    }

    /* renamed from: c */
    public String mo28875c() {
        return this.f64497f;
    }

    /* renamed from: d */
    public String mo28876d() {
        return this.f64496e;
    }

    /* renamed from: e */
    public final void mo28889e(C52021ht htVar) {
        C69664n.m101061g(htVar, "valueBuilder");
        String str = this.f64494c;
        htVar.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar.instance;
        C52022hu huVar2 = C52022hu.f136532f;
        str.getClass();
        huVar.f136534a |= 1;
        huVar.f136535b = str;
    }

    /* renamed from: f */
    public boolean mo28878f() {
        return this.f64495d;
    }

    /* renamed from: g */
    public boolean mo28879g() {
        return this.f64493b;
    }
}
