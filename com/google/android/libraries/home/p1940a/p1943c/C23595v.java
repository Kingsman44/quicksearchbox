package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.p3926e.C52021ht;
import com.google.assistant.p3897e.p3921j.p3926e.C52022hu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.v */
/* compiled from: PG */
public final class C23595v extends C23476bd {

    /* renamed from: a */
    public static final C23594u f64615a = new C23594u();

    /* renamed from: b */
    public String f64616b = BuildConfig.FLAVOR;

    public C23595v(int i, boolean z) {
        super(C23542dp.COLOR_RGB, i, z, true, "colorSetting", "colorName");
        Integer.valueOf(this.f64210c).intValue();
    }

    /* renamed from: e */
    public final void mo28889e(C52021ht htVar) {
        C69664n.m101061g(htVar, "valueBuilder");
        String str = this.f64616b;
        htVar.copyOnWrite();
        C52022hu huVar = (C52022hu) htVar.instance;
        C52022hu huVar2 = C52022hu.f136532f;
        str.getClass();
        huVar.f136534a |= 1;
        huVar.f136535b = str;
    }
}
