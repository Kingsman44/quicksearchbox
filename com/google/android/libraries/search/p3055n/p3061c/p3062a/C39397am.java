package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.media.AudioFormat;
import com.google.android.libraries.search.p2904c.C37461cj;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37474cw;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39536aa;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39538ac;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39580br;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39584c;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39587f;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39589h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39591j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.am */
/* compiled from: PG */
public final /* synthetic */ class C39397am implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39406av f103735a;

    /* renamed from: b */
    public final /* synthetic */ C39390af f103736b;

    public /* synthetic */ C39397am(C39406av avVar, C39390af afVar) {
        this.f103735a = avVar;
        this.f103736b = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        int i;
        C39406av avVar = this.f103735a;
        C39390af afVar = this.f103736b;
        C59104x b = C39406av.f103747a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordDetectorManager");
        ((C59052c) ((C59052c) b).mo56372aa(53527)).mo56386p("#startSoftwareHotwordDetection");
        AudioFormat.Builder builder = new AudioFormat.Builder();
        int i2 = avVar.f103751e.f395874F;
        if (i2 == 1) {
            i = 16;
        } else if (i2 == 2) {
            i = 12;
        } else {
            throw new IllegalStateException(String.format("Invalid channel count: %d", new Object[]{Integer.valueOf(i2)}));
        }
        AudioFormat build = builder.setChannelMask(i).setEncoding(2).setSampleRate(16000).build();
        C39587f fVar = new C39587f();
        fVar.mo41934b(build.getChannelCount());
        fVar.mo41935c(false);
        fVar.mo41936d(build.getSampleRate());
        C39536aa a = fVar.mo41933a();
        C39589h hVar = new C39589h();
        hVar.mo41887c(avVar.f103753g.mo41814a());
        hVar.mo41888d(avVar.f103753g.mo41817d());
        hVar.mo41889e(avVar.f103753g.mo41815b());
        hVar.mo41886b(avVar.f103751e.f395905z);
        C39538ac a2 = hVar.mo41885a();
        C39580br brVar = avVar.f103750d;
        C39591j jVar = new C39591j();
        jVar.mo41918d(a2);
        jVar.mo41917c(a);
        C39584c cVar = new C39584c();
        cVar.mo41881b(C39635q.m69089a(build, true));
        C37461cj cjVar = (C37461cj) C37462ck.f99442c.createBuilder();
        C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
        C37474cw cwVar = C37474cw.f99469a;
        coVar.copyOnWrite();
        C37467cp cpVar = (C37467cp) coVar.instance;
        cwVar.getClass();
        cpVar.f99461b = cwVar;
        cpVar.f99460a = 2;
        cjVar.copyOnWrite();
        C37462ck ckVar = (C37462ck) cjVar.instance;
        C37467cp cpVar2 = (C37467cp) coVar.build();
        cpVar2.getClass();
        ckVar.f99445b = cpVar2;
        ckVar.f99444a |= 1;
        cVar.f104204a = C58833ax.m90834k((C37462ck) cjVar.build());
        jVar.mo41916b(cVar.mo41880a());
        jVar.f104227b = afVar;
        return brVar.mo41908f(jVar.mo41915a());
    }
}
