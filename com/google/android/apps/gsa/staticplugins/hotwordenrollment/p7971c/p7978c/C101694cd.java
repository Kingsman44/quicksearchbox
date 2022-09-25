package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.assistant.settings.features.av.bg;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.cd */
/* compiled from: PG */
final class C101694cd {
    /* renamed from: a */
    public static C101644ah m168251a(C92371d dVar, C74555u uVar, boolean z) {
        bg createBuilder = bh.c.createBuilder();
        if (z) {
            String b = uVar.mo70888f().mo70865b();
            createBuilder.copyOnWrite();
            bh bhVar = createBuilder.instance;
            b.getClass();
            bhVar.a = 2;
            bhVar.b = b;
        } else {
            String str = (String) C58557jl.m90133n(dVar.mo87024e());
            createBuilder.copyOnWrite();
            bh bhVar2 = createBuilder.instance;
            str.getClass();
            bhVar2.a = 1;
            bhVar2.b = str;
        }
        C101643ag agVar = (C101643ag) C101644ah.f283624c.createBuilder();
        agVar.copyOnWrite();
        C101644ah ahVar = (C101644ah) agVar.instance;
        bh build = createBuilder.build();
        build.getClass();
        ahVar.f283627b = build;
        ahVar.f283626a |= 1;
        return (C101644ah) agVar.build();
    }
}
