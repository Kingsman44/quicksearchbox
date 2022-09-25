package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4152bb.p4153a.C55065eo;
import com.google.p4152bb.p4153a.C55082fe;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.y */
/* compiled from: PG */
public final /* synthetic */ class C34971y implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C34942ap f92656a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f92657b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f92658c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f92659d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f92660e;

    /* renamed from: f */
    public final /* synthetic */ long f92661f;

    /* renamed from: g */
    public final /* synthetic */ C58485gu f92662g;

    public /* synthetic */ C34971y(C34942ap apVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, long j, C58485gu guVar) {
        this.f92656a = apVar;
        this.f92657b = cxVar;
        this.f92658c = cxVar2;
        this.f92659d = cxVar3;
        this.f92660e = cxVar4;
        this.f92661f = j;
        this.f92662g = guVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C34942ap apVar = this.f92656a;
        C60870cx cxVar = this.f92657b;
        C60870cx cxVar2 = this.f92658c;
        C60870cx cxVar3 = this.f92659d;
        C60870cx cxVar4 = this.f92660e;
        long j = this.f92661f;
        C58485gu guVar = this.f92662g;
        boolean booleanValue = ((Boolean) ((Optional) C34942ap.m63795c(cxVar2, Optional.empty())).orElse(false)).booleanValue();
        String str = (String) ((Optional) C34942ap.m63795c(cxVar3, Optional.m71637of(BuildConfig.FLAVOR))).orElse(BuildConfig.FLAVOR);
        C55065eo eoVar = (C55065eo) C55082fe.f144912z.createBuilder();
        String l = Long.toString(j);
        eoVar.copyOnWrite();
        C55082fe feVar = (C55082fe) eoVar.instance;
        l.getClass();
        feVar.f144914a |= 16;
        feVar.f144920g = l;
        eoVar.copyOnWrite();
        C55082fe feVar2 = (C55082fe) eoVar.instance;
        str.getClass();
        feVar2.f144914a |= 1;
        feVar2.f144915b = str;
        eoVar.mo54178b((C58485gu) Collection.EL.stream((C58485gu) C34942ap.m63795c(cxVar, C58485gu.m89845m())).map(new C34931ae(apVar)).collect(C58370cn.f155946a));
        eoVar.copyOnWrite();
        C55082fe feVar3 = (C55082fe) eoVar.instance;
        feVar3.f144914a |= 524288;
        feVar3.f144934u = booleanValue;
        Objects.requireNonNull(eoVar);
        ((Optional) C34942ap.m63795c(cxVar4, Optional.empty())).ifPresent(new C34938al(eoVar));
        C58490gz gzVar = new C58490gz(4);
        Collection.EL.stream(guVar).forEach(new C34940an(apVar, j, gzVar));
        return C60922j.m93044g(C60922j.m93044g(C60922j.m93044g(C60856cj.m92896e((C58485gu) Collection.EL.stream(gzVar.mo55427f(false).entrySet()).map(new C34949c(apVar)).collect(C58370cn.f155946a)), C47810es.m84963c(C34950d.f92627a), apVar.f92611b), C47810es.m84963c(new C34962p(C58485gu.m89837e())), apVar.f92611b), C47810es.m84963c(new C34932af(eoVar)), apVar.f92611b);
    }
}
