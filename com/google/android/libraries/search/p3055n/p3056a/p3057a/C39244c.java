package com.google.android.libraries.search.p3055n.p3056a.p3057a;

import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.p5219a.C66752s;

/* renamed from: com.google.android.libraries.search.n.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C39244c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39250i f103379a;

    /* renamed from: b */
    public final /* synthetic */ C66999hh f103380b;

    /* renamed from: c */
    public final /* synthetic */ C66752s f103381c;

    public /* synthetic */ C39244c(C39250i iVar, C66999hh hhVar, C66752s sVar) {
        this.f103379a = iVar;
        this.f103380b = hhVar;
        this.f103381c = sVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39250i iVar = this.f103379a;
        C66999hh hhVar = this.f103380b;
        C66752s sVar = this.f103381c;
        int i = iVar.f103393f;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (i != 0) {
            C58838bb.m90884s(z, "Cannot connect if already connected/connecting.");
            iVar.f103393f = 2;
            return C47633f.m84733g(C2169h.m6027a(new C39245d(iVar, hhVar, sVar))).mo51515h(new C39246e(iVar), iVar.f103390c).mo51514f(Throwable.class, new C39247f(iVar), iVar.f103390c);
        }
        throw null;
    }
}
