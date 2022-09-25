package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.media.AudioFormat;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p3055n.C39262al;
import com.google.android.libraries.search.p3055n.C39264an;
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

/* renamed from: com.google.android.libraries.search.n.c.a.au */
/* compiled from: PG */
public final /* synthetic */ class C39405au implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39406av f103744a;

    /* renamed from: b */
    public final /* synthetic */ C39264an f103745b;

    /* renamed from: c */
    public final /* synthetic */ C39390af f103746c;

    public /* synthetic */ C39405au(C39406av avVar, C39264an anVar, C39390af afVar) {
        this.f103744a = avVar;
        this.f103745b = anVar;
        this.f103746c = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39406av avVar = this.f103744a;
        C39264an anVar = this.f103745b;
        C39390af afVar = this.f103746c;
        C59104x b = C39406av.f103747a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordDetectorManager");
        ((C59052c) ((C59052c) b).mo56372aa(53526)).mo56386p("#startHotwordVerification");
        C39262al alVar = anVar.f103430b;
        if (alVar == null) {
            alVar = C39262al.f103422d;
        }
        C37360ay ayVar = alVar.f103426c;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(ayVar.f99229d).setEncoding(ayVar.f99230e).setSampleRate(ayVar.f99228c).build();
        C39587f fVar = new C39587f();
        fVar.mo41934b(build.getChannelCount());
        fVar.mo41935c(true);
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
        cVar.mo41881b(C39635q.m69089a(build, ayVar.f99236k));
        C39262al alVar2 = anVar.f103430b;
        if (alVar2 == null) {
            alVar2 = C39262al.f103422d;
        }
        C37462ck ckVar = alVar2.f103425b;
        if (ckVar == null) {
            ckVar = C37462ck.f99442c;
        }
        cVar.f104204a = C58833ax.m90834k(ckVar);
        jVar.mo41916b(cVar.mo41880a());
        jVar.f104227b = afVar;
        jVar.f104228c = C58833ax.m90834k(true);
        return brVar.mo41908f(jVar.mo41915a());
    }
}
