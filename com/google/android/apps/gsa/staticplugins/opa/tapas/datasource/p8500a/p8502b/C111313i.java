package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4129b.p4136c.C54761i;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.i */
/* compiled from: PG */
public final /* synthetic */ class C111313i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309761a;

    /* renamed from: b */
    public final /* synthetic */ C49728r f309762b;

    /* renamed from: c */
    public final /* synthetic */ String f309763c;

    /* renamed from: d */
    public final /* synthetic */ C49301bt f309764d;

    /* renamed from: e */
    public final /* synthetic */ C48670ae f309765e;

    /* renamed from: f */
    public final /* synthetic */ Map f309766f;

    public /* synthetic */ C111313i(C111305ag agVar, C49728r rVar, String str, C49301bt btVar, C48670ae aeVar, Map map) {
        this.f309761a = agVar;
        this.f309762b = rVar;
        this.f309763c = str;
        this.f309764d = btVar;
        this.f309765e = aeVar;
        this.f309766f = map;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111305ag agVar = this.f309761a;
        C49728r rVar = this.f309762b;
        String str = this.f309763c;
        C49301bt btVar = this.f309764d;
        C48670ae aeVar = this.f309765e;
        Map map = this.f309766f;
        C58495hd hdVar = (C58495hd) obj;
        String str2 = rVar.f128342b;
        C54761i iVar = btVar.f127429e;
        if (iVar == null) {
            iVar = C54761i.f143683c;
        }
        return C60856cj.m92906o((C58485gu) Collection.EL.stream(iVar.f143685a).filter(new C111299aa(agVar, aeVar)).map(new C111300ab(agVar, rVar, str, btVar, hdVar, map)).collect(C58370cn.f155946a));
    }
}
