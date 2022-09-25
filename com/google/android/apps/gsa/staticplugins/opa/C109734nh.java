package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nh */
/* compiled from: PG */
public final class C109734nh {

    /* renamed from: a */
    private final C69464a f305719a;

    /* renamed from: b */
    private final C69464a f305720b;

    /* renamed from: c */
    private final C69464a f305721c;

    /* renamed from: d */
    private final C69464a f305722d;

    /* renamed from: e */
    private final C69464a f305723e;

    /* renamed from: f */
    private final C69464a f305724f;

    /* renamed from: g */
    private final C69464a f305725g;

    /* renamed from: h */
    private final C69464a f305726h;

    public C109734nh(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8) {
        aVar.getClass();
        this.f305719a = aVar;
        aVar2.getClass();
        this.f305720b = aVar2;
        aVar3.getClass();
        this.f305721c = aVar3;
        aVar4.getClass();
        this.f305722d = aVar4;
        aVar5.getClass();
        this.f305723e = aVar5;
        aVar6.getClass();
        this.f305724f = aVar6;
        aVar7.getClass();
        this.f305725g = aVar7;
        this.f305726h = aVar8;
    }

    /* renamed from: a */
    public final C109733ng mo98054a(C108230ba baVar, C91097g gVar) {
        baVar.getClass();
        gVar.getClass();
        Context context = (Context) this.f305719a.mo17428b();
        context.getClass();
        C86124t tVar = (C86124t) this.f305720b.mo17428b();
        tVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.f305721c.mo17428b();
        sharedPreferences.getClass();
        Boolean bool = (Boolean) this.f305722d.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C113787bc bcVar = (C113787bc) this.f305723e.mo17428b();
        bcVar.getClass();
        Boolean bool2 = (Boolean) this.f305724f.mo17428b();
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        C86054o oVar = (C86054o) this.f305725g.mo17428b();
        oVar.getClass();
        C109790aj ajVar = (C109790aj) this.f305726h.mo17428b();
        ajVar.getClass();
        return new C109733ng(baVar, gVar, context, tVar, sharedPreferences, booleanValue, bcVar, booleanValue2, oVar, ajVar);
    }
}
