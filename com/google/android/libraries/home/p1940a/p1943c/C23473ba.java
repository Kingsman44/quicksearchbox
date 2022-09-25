package com.google.android.libraries.home.p1940a.p1943c;

import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ba */
/* compiled from: PG */
public class C23473ba extends C23544dr {

    /* renamed from: a */
    public final float f64200a;

    /* renamed from: b */
    private final C23542dp f64201b;

    /* renamed from: c */
    private final boolean f64202c;

    /* renamed from: d */
    private final boolean f64203d;

    /* renamed from: e */
    private final String f64204e;

    /* renamed from: f */
    private final String f64205f;

    protected C23473ba(C23542dp dpVar, float f, boolean z, boolean z2, String str, String str2) {
        this.f64201b = dpVar;
        this.f64200a = f;
        this.f64202c = z;
        this.f64203d = z2;
        this.f64204e = str;
        this.f64205f = str2;
    }

    /* renamed from: a */
    public final C23542dp mo28874a() {
        return this.f64201b;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo28888b() {
        return Float.valueOf(this.f64200a);
    }

    /* renamed from: c */
    public final String mo28875c() {
        return this.f64205f;
    }

    /* renamed from: d */
    public final String mo28876d() {
        return this.f64204e;
    }

    /* renamed from: e */
    public final void mo28889e(C52021ht htVar) {
        C69664n.m101061g(htVar, "valueBuilder");
        float floatValue = Float.valueOf(this.f64200a).floatValue();
        htVar.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar.instance;
        C52022hu huVar2 = C52022hu.f136532f;
        huVar.f136534a |= 8;
        huVar.f136537d = floatValue;
    }

    /* renamed from: f */
    public final boolean mo28878f() {
        return this.f64202c;
    }

    /* renamed from: g */
    public final boolean mo28879g() {
        return this.f64203d;
    }
}
