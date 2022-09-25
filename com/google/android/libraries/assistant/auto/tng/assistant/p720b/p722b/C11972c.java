package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p722b;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11979e;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11980f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12180f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C11972c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11973d f38444a;

    /* renamed from: b */
    public final /* synthetic */ C12991i f38445b;

    public /* synthetic */ C11972c(C11973d dVar, C12991i iVar) {
        this.f38444a = dVar;
        this.f38445b = iVar;
    }

    public final C60870cx apply(Object obj) {
        C11973d dVar = this.f38444a;
        C12991i iVar = this.f38445b;
        C12180f fVar = (C12180f) obj;
        if (!fVar.mo20468a().mo56113h()) {
            return C60856cj.m92900i(fVar);
        }
        C11980f fVar2 = (C11980f) fVar.mo20468a().mo56107c();
        C60870cx b = dVar.f38447b.mo23063b();
        C60870cx a = dVar.f38446a.mo21169a(iVar);
        C60870cx a2 = C47638k.m84753d(b, a).mo51520a(new C11971b((C11979e) fVar2.toBuilder(), b, iVar, a, fVar2), dVar.f38448c);
        C11970a aVar = new C11970a(fVar);
        return C60922j.m93044g(a2, C47810es.m84963c(aVar), dVar.f38448c);
    }
}
