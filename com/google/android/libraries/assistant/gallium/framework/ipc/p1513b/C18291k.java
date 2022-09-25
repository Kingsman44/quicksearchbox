package com.google.android.libraries.assistant.gallium.framework.ipc.p1513b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.b.k */
/* compiled from: PG */
public final /* synthetic */ class C18291k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18294n f51896a;

    /* renamed from: b */
    public final /* synthetic */ C58817ah f51897b;

    public /* synthetic */ C18291k(C18294n nVar, C58817ah ahVar) {
        this.f51896a = nVar;
        this.f51897b = ahVar;
    }

    public final C60870cx apply(Object obj) {
        C18294n nVar = this.f51896a;
        C58817ah ahVar = this.f51897b;
        C18289i iVar = new C18289i(nVar, ahVar);
        return C60922j.m93045h((C60870cx) ahVar.apply((MessageLite) obj), C47810es.m84966f(iVar), nVar.f51908h.mo23659c());
    }
}
