package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a.C125450p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a */
/* compiled from: PG */
public final /* synthetic */ class C125431a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125462c f345914a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f345915b;

    /* renamed from: c */
    public final /* synthetic */ C125463d f345916c;

    public /* synthetic */ C125431a(C125462c cVar, C51809dy dyVar, C125463d dVar) {
        this.f345914a = cVar;
        this.f345915b = dyVar;
        this.f345916c = dVar;
    }

    public final C60870cx apply(Object obj) {
        C125462c cVar = this.f345914a;
        C51809dy dyVar = this.f345915b;
        C125463d dVar = this.f345916c;
        Boolean bool = (Boolean) obj;
        ((C59052c) ((C59052c) C125462c.f345984a.mo56224b()).mo56372aa(36553)).mo56389s("Executing: %s [SD]", C126290c.m206497b(dyVar.f135936b));
        C125450p pVar = (C125450p) cVar.f345986c.get(dyVar.f135936b);
        if (pVar == null) {
            return C60856cj.m92899h(new IllegalArgumentException("Unsupported ClientOp: ".concat(String.valueOf(dyVar.f135936b))));
        }
        return pVar.mo66640a(dVar).mo20766a(dyVar);
    }
}
