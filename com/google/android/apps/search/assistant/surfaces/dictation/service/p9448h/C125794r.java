package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125077be;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125080bh;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125152dz;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125154ea;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9450i.C125806d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.r */
/* compiled from: PG */
public final /* synthetic */ class C125794r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125795s f346701a;

    /* renamed from: b */
    public final /* synthetic */ C125160i f346702b;

    public /* synthetic */ C125794r(C125795s sVar, C125160i iVar) {
        this.f346701a = sVar;
        this.f346702b = iVar;
    }

    public final C60870cx apply(Object obj) {
        C125795s sVar = this.f346701a;
        C125160i iVar = this.f346702b;
        sVar.f346706d.mo104279a(C125160i.ELIGIBLE.equals(iVar));
        C125806d dVar = sVar.f346705c;
        boolean equals = C125160i.ELIGIBLE.equals(iVar);
        boolean equals2 = C125160i.ELIGIBLE.equals((C125160i) obj);
        C125152dz dzVar = (C125152dz) C125154ea.f345239c.createBuilder();
        dzVar.copyOnWrite();
        ((C125154ea) dzVar.instance).f345241a = equals;
        dzVar.copyOnWrite();
        ((C125154ea) dzVar.instance).f345242b = equals2;
        C125077be beVar = dVar.f346725a;
        return C70876o.m103760a(beVar.f189039a.mo39510a(C125080bh.m204986a(), beVar.f189040b), (C125154ea) dzVar.build());
    }
}
