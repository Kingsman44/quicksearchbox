package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.i */
/* compiled from: PG */
public final /* synthetic */ class C124303i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343139a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f343140b;

    /* renamed from: c */
    public final /* synthetic */ C124204t f343141c;

    public /* synthetic */ C124303i(C124315u uVar, AtomicReference atomicReference, C124204t tVar) {
        this.f343139a = uVar;
        this.f343140b = atomicReference;
        this.f343141c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124315u uVar = this.f343139a;
        AtomicReference atomicReference = this.f343140b;
        C124204t tVar = this.f343141c;
        if (!uVar.f343172i.get()) {
            ((C59052c) ((C59052c) C124315u.f343164a.mo56226d()).mo56372aa(36149)).mo56386p("Usonia server is already stopped");
            return C60856cj.m92899h(new IllegalStateException("Usonia server is not started"));
        } else if (!((Boolean) uVar.f343169f.mo17428b()).booleanValue()) {
            C124294b bVar = uVar.f343174k;
            if (bVar == null) {
                return C60856cj.m92899h(new IllegalStateException("Usonia gms is never initialized, this should never happen."));
            }
            atomicReference.set(bVar.mo106360a(tVar));
            return C60866ct.f164955a;
        } else {
            C60870cx g = uVar.mo106372g();
            C60870cx a = uVar.f343176m.mo106326a();
            return C47636i.m84746e(g, a).mo51519b(new C124307m(uVar, g, a, tVar, atomicReference), uVar.f343168e);
        }
    }
}
