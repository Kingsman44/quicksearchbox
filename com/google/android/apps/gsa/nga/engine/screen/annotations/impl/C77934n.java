package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.y;
import com.google.android.apps.gsa.nga.engine.screen.annotations.impl.ScreenAnnotationEngineImpl;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80903ar;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.n */
/* compiled from: PG */
public final /* synthetic */ class C77934n implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ ScreenAnnotationEngineImpl f214674a;

    /* renamed from: b */
    public final /* synthetic */ C80903ar f214675b;

    public /* synthetic */ C77934n(ScreenAnnotationEngineImpl screenAnnotationEngineImpl, C80903ar arVar) {
        this.f214674a = screenAnnotationEngineImpl;
        this.f214675b = arVar;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        ScreenAnnotationEngineImpl screenAnnotationEngineImpl = this.f214674a;
        C80903ar arVar = this.f214675b;
        C77939s sVar = (C77939s) obj;
        if (sVar != null && !sVar.mo72906c().isEmpty() && !sVar.mo72905b().isEmpty()) {
            return new C60817ay(screenAnnotationEngineImpl.f214633e.mo72912a((y) sVar.mo72906c().get(), ((ScreenAnnotationEngineImpl.NativeScreenContent) sVar.mo72905b().get()).f214639a, arVar)).mo57272e(new C77924d(sVar), C60826bg.f164896a);
        }
        ((C58970a) ((C58970a) ScreenAnnotationEngineImpl.f214629a.mo56225c()).mo56372aa(4519)).mo56386p("Invalid input state for parsing.");
        return new C60817ay(C60856cj.m92900i(sVar));
    }
}
