package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.r;
import com.google.android.apps.gsa.nga.d.a.w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C77935o implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ ScreenAnnotationEngineImpl f214676a;

    /* renamed from: b */
    public final /* synthetic */ Optional f214677b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f214678c;

    public /* synthetic */ C77935o(ScreenAnnotationEngineImpl screenAnnotationEngineImpl, Optional optional, C58485gu guVar) {
        this.f214676a = screenAnnotationEngineImpl;
        this.f214677b = optional;
        this.f214678c = guVar;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C60870cx cxVar;
        ScreenAnnotationEngineImpl screenAnnotationEngineImpl = this.f214676a;
        Optional optional = this.f214677b;
        C58485gu guVar = this.f214678c;
        C77939s sVar = (C77939s) obj;
        if (sVar == null || sVar.mo72906c().isEmpty() || sVar.mo72905b().isEmpty() || sVar.mo72907d().isEmpty()) {
            ((C58970a) ((C58970a) ScreenAnnotationEngineImpl.f214629a.mo56225c()).mo56372aa(4520)).mo56386p("Invalid input state for annotation.");
            cxVar = C60856cj.m92900i(r.b);
        } else {
            cxVar = screenAnnotationEngineImpl.f214637i.mo28209i(screenAnnotationEngineImpl.f214634f.mo72897c((w) sVar.mo72907d().get(), optional), "[NGA] ScreenAnnotationEngineImpl.annotate", new C77923c(screenAnnotationEngineImpl, sVar, optional, guVar));
        }
        return new C60817ay(cxVar);
    }
}
