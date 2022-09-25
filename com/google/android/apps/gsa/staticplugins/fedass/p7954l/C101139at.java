package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100761a;
import com.google.android.apps.search.fedora.p10099e.C132792aw;
import com.google.android.apps.search.fedora.p10099e.C132793ax;
import com.google.android.libraries.assistant.trainingcache.p1618c.C19445f;
import com.google.android.libraries.assistant.trainingcache.p1618c.C19446g;
import com.google.android.p445a.C8850c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67303bg;
import com.google.speech.p5228m.C67305bi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.at */
/* compiled from: PG */
public final /* synthetic */ class C101139at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101141av f282354a;

    /* renamed from: b */
    public final /* synthetic */ c f282355b;

    public /* synthetic */ C101139at(C101141av avVar, c cVar) {
        this.f282354a = avVar;
        this.f282355b = cVar;
    }

    public final C60870cx apply(Object obj) {
        C101141av avVar = this.f282354a;
        c cVar = this.f282355b;
        C67270aa aaVar = (C67270aa) obj;
        C100761a.m166954a(avVar.f282358b);
        Iterable arrayList = new ArrayList();
        Iterable arrayList2 = new ArrayList();
        try {
            C67303bg bgVar = (C67303bg) C67305bi.f182944f.createBuilder();
            bgVar.copyOnWrite();
            C67305bi biVar = (C67305bi) bgVar.instance;
            biVar.f182950e = 8000;
            biVar.f182946a |= 16;
            bgVar.copyOnWrite();
            C67305bi biVar2 = (C67305bi) bgVar.instance;
            biVar2.f182946a |= 4;
            biVar2.f182949d = false;
            arrayList = C19445f.m37136a(aaVar, (C67305bi) bgVar.build(), 10000);
            C67303bg bgVar2 = (C67303bg) C67305bi.f182944f.createBuilder();
            bgVar2.copyOnWrite();
            C67305bi biVar3 = (C67305bi) bgVar2.instance;
            biVar3.f182950e = 8001;
            biVar3.f182946a |= 16;
            bgVar2.copyOnWrite();
            C67305bi biVar4 = (C67305bi) bgVar2.instance;
            biVar4.f182946a |= 4;
            biVar4.f182949d = false;
            arrayList2 = C19446g.m37137a(aaVar, (C67305bi) bgVar2.build(), 10000);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C101141av.f282357a.mo56225c()).mo56382g(e)).mo56372aa(19860)).mo56386p("Failed to get speech learning results from Ekho!");
        }
        C132792aw awVar = (C132792aw) C132793ax.f362299c.createBuilder();
        awVar.copyOnWrite();
        C132793ax axVar = (C132793ax) awVar.instance;
        C62971cq cqVar = axVar.f362301a;
        if (!cqVar.mo58948c()) {
            axVar.f362301a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(arrayList, (List) axVar.f362301a);
        awVar.copyOnWrite();
        C132793ax axVar2 = (C132793ax) awVar.instance;
        C62971cq cqVar2 = axVar2.f362302b;
        if (!cqVar2.mo58948c()) {
            axVar2.f362302b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll(arrayList2, (List) axVar2.f362302b);
        Bundle bundle = new Bundle();
        bundle.putByteArray("speech_learning_records", ((C132793ax) awVar.build()).toByteArray());
        Parcel gA = cVar.mo17260gA();
        C8850c.m23497f(gA, bundle);
        cVar.mo17263hf(8, gA);
        return C60866ct.f164955a;
    }
}
