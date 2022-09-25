package com.google.android.libraries.home.p1940a.p1943c;

import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.j */
/* compiled from: PG */
public final class C23583j extends C23476bd {

    /* renamed from: a */
    public static final C23582i f64603a = new C23582i();

    public C23583j(int i, boolean z) {
        super(C23542dp.BRIGHTNESS, i, z, true, "brightness", "brightness");
    }

    /* renamed from: e */
    public final void mo28889e(C52021ht htVar) {
        C69664n.m101061g(htVar, "valueBuilder");
        int intValue = Integer.valueOf(this.f64210c).intValue();
        htVar.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar.instance;
        C52022hu huVar2 = C52022hu.f136532f;
        huVar.f136534a |= 8;
        huVar.f136537d = ((float) intValue) / 100.0f;
    }
}
