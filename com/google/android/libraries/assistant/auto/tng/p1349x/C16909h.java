package com.google.android.libraries.assistant.auto.tng.p1349x;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.x.h */
/* compiled from: PG */
public final /* synthetic */ class C16909h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C16911j f49433a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f49434b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f49435c;

    /* renamed from: d */
    public final /* synthetic */ C63088z f49436d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f49437e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f49438f;

    public /* synthetic */ C16909h(C16911j jVar, C60870cx cxVar, C60870cx cxVar2, C63088z zVar, C60870cx cxVar3, C60870cx cxVar4) {
        this.f49433a = jVar;
        this.f49434b = cxVar;
        this.f49435c = cxVar2;
        this.f49436d = zVar;
        this.f49437e = cxVar3;
        this.f49438f = cxVar4;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C16911j jVar = this.f49433a;
        C60870cx cxVar = this.f49434b;
        C60870cx cxVar2 = this.f49435c;
        C63088z zVar = this.f49436d;
        C60870cx cxVar3 = this.f49437e;
        C60870cx cxVar4 = this.f49438f;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar2);
        if (!axVar2.mo56113h()) {
            return C60856cj.m92899h(new IllegalArgumentException("No OAuth token is provided."));
        }
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("No account, please login."));
        }
        return C47633f.m84733g(jVar.f49445g.f49304a.mo46042d()).mo51515h(new C16907f(jVar, zVar, (String) axVar.mo56107c(), (String) C60856cj.m92909r(cxVar3), (String) C60856cj.m92909r(cxVar4)), jVar.f49443e).mo51516i(new C16908g(jVar, (String) axVar2.mo56107c(), zVar), jVar.f49443e);
    }
}
