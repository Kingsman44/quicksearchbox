package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119662e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c.C119767q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119788aj;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119811bf;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119812bg;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119817bl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119818bm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119892k;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124381a;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124382b;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9383b.C124512j;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.e */
/* compiled from: PG */
public final class C124516e implements C124382b {

    /* renamed from: a */
    public final Executor f343581a;

    /* renamed from: b */
    public final C124512j f343582b;

    /* renamed from: c */
    public C124381a f343583c;

    /* renamed from: d */
    private final C119662e f343584d;

    /* renamed from: e */
    private final C124427a f343585e;

    /* renamed from: f */
    private final C119767q f343586f;

    public C124516e(C119767q qVar, C119662e eVar, Executor executor, C124512j jVar, C124427a aVar) {
        this.f343586f = qVar;
        this.f343584d = eVar;
        this.f343581a = new C60904dr(executor);
        this.f343582b = jVar;
        this.f343585e = aVar;
    }

    /* renamed from: a */
    public final C124381a mo106407a(C32849cq cqVar) {
        C58976aa aaVar = C58975e.f156826a;
        C124381a aVar = this.f343583c;
        if (aVar != null) {
            return aVar;
        }
        C119767q qVar = this.f343586f;
        C119788aj ajVar = (C119788aj) C119789ak.f333656k.createBuilder();
        C119892k kVar = (C119892k) C119893l.f333893e.createBuilder();
        C119891j jVar = C119891j.PCM_16BIT_AUDIO_ENCODING;
        kVar.copyOnWrite();
        C119893l lVar = (C119893l) kVar.instance;
        lVar.f333897d = jVar.f333891d;
        lVar.f333895a |= 1;
        kVar.mo104551a(C119889h.ONLINE);
        ajVar.copyOnWrite();
        C119789ak akVar = (C119789ak) ajVar.instance;
        C119893l lVar2 = (C119893l) kVar.build();
        lVar2.getClass();
        akVar.f333663f = lVar2;
        akVar.f333658a |= 8;
        C119811bf bfVar = (C119811bf) C119812bg.f333724c.createBuilder();
        bfVar.copyOnWrite();
        C119812bg bgVar = (C119812bg) bfVar.instance;
        cqVar.getClass();
        bgVar.f333727b = cqVar;
        bgVar.f333726a |= 1;
        C119812bg bgVar2 = (C119812bg) bfVar.build();
        ajVar.copyOnWrite();
        C119789ak akVar2 = (C119789ak) ajVar.instance;
        bgVar2.getClass();
        akVar2.f333660c = bgVar2;
        akVar2.f333658a |= 1;
        C119817bl blVar = (C119817bl) C119818bm.f333734b.createBuilder();
        blVar.mo104528a(this.f343584d.mo104474b());
        C119818bm bmVar = (C119818bm) blVar.build();
        ajVar.copyOnWrite();
        C119789ak akVar3 = (C119789ak) ajVar.instance;
        bmVar.getClass();
        akVar3.f333665h = bmVar;
        akVar3.f333658a |= 32;
        C124515d dVar = new C124515d(this, qVar.mo104511a((C119789ak) ajVar.build(), this.f343585e, this.f343581a));
        this.f343583c = dVar;
        return dVar;
    }
}
