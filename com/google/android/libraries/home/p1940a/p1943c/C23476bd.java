package com.google.android.libraries.home.p1940a.p1943c;

import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.bd */
/* compiled from: PG */
public class C23476bd extends C23544dr {

    /* renamed from: a */
    private final C23542dp f64208a;

    /* renamed from: b */
    private final boolean f64209b;

    /* renamed from: c */
    public final int f64210c;

    /* renamed from: d */
    private final boolean f64211d;

    /* renamed from: e */
    private final String f64212e;

    /* renamed from: f */
    private final String f64213f;

    protected C23476bd(C23542dp dpVar, int i, boolean z, boolean z2, String str, String str2) {
        this.f64208a = dpVar;
        this.f64210c = i;
        this.f64209b = z;
        this.f64211d = z2;
        this.f64212e = str;
        this.f64213f = str2;
    }

    /* renamed from: a */
    public final C23542dp mo28874a() {
        return this.f64208a;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28888b() {
        return Integer.valueOf(this.f64210c);
    }

    /* renamed from: c */
    public final String mo28875c() {
        return this.f64213f;
    }

    /* renamed from: d */
    public final String mo28876d() {
        return this.f64212e;
    }

    /* renamed from: e */
    public void mo28889e(C52021ht htVar) {
        C69664n.m101061g(htVar, "valueBuilder");
        int intValue = Integer.valueOf(this.f64210c).intValue();
        htVar.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar.instance;
        C52022hu huVar2 = C52022hu.f136532f;
        huVar.f136534a |= 2;
        huVar.f136536c = intValue;
    }

    /* renamed from: f */
    public final boolean mo28878f() {
        return this.f64209b;
    }

    /* renamed from: g */
    public final boolean mo28879g() {
        return this.f64211d;
    }
}
