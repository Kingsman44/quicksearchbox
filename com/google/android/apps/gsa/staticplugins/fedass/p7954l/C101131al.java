package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100761a;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoDebugReader;
import com.google.android.p445a.C8850c;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67307bk;
import com.google.speech.p5228m.C67347k;
import com.google.speech.p5228m.C67359w;
import com.google.speech.p5228m.C67361y;
import com.google.speech.p5228m.p5229a.C67262k;
import com.google.speech.p5228m.p5229a.C67263l;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.al */
/* compiled from: PG */
public final /* synthetic */ class C101131al implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C101137ar f282340a;

    /* renamed from: b */
    public final /* synthetic */ Optional f282341b;

    /* renamed from: c */
    public final /* synthetic */ c f282342c;

    public /* synthetic */ C101131al(C101137ar arVar, Optional optional, c cVar) {
        this.f282340a = arVar;
        this.f282341b = optional;
        this.f282342c = cVar;
    }

    public final Object apply(Object obj) {
        C101137ar arVar = this.f282340a;
        Optional optional = this.f282341b;
        c cVar = this.f282342c;
        C67270aa aaVar = (C67270aa) obj;
        ((C59052c) ((C59052c) C101137ar.f282348a.mo56224b()).mo56372aa(19853)).mo56386p("getSheldonSessionDataInternal()");
        C100761a.m166954a(arVar.f282349b);
        EkhoDebugReader ekhoDebugReader = new EkhoDebugReader();
        try {
            ekhoDebugReader.mo24630c(aaVar);
            List<C67347k> b = ekhoDebugReader.mo24629b("Audio", C67347k.f183055c);
            ArrayList arrayList = new ArrayList();
            for (C67347k kVar : b) {
                if (!optional.isEmpty()) {
                    C67361y yVar = kVar.f183057a;
                    if (yVar == null) {
                        yVar = C67361y.f183093c;
                    }
                    if (yVar.f183095a != ((Long) optional.get()).longValue()) {
                    }
                }
                arrayList.add(kVar);
            }
            List<C67307bk> b2 = ekhoDebugReader.mo24629b("RecognitionInfo", C67307bk.f182951b);
            ArrayList arrayList2 = new ArrayList();
            for (C67307bk bkVar : b2) {
                if (!optional.isEmpty()) {
                    C67361y yVar2 = bkVar.f182953a;
                    if (yVar2 == null) {
                        yVar2 = C67361y.f183093c;
                    }
                    if (yVar2.f183095a != ((Long) optional.get()).longValue()) {
                    }
                }
                arrayList2.add(bkVar);
            }
            List<C67359w> a = ekhoDebugReader.mo24628a();
            ArrayList arrayList3 = new ArrayList();
            for (C67359w wVar : a) {
                if (!optional.isEmpty()) {
                    C67361y yVar3 = wVar.f183089a;
                    if (yVar3 == null) {
                        yVar3 = C67361y.f183093c;
                    }
                    if (yVar3.f183095a != ((Long) optional.get()).longValue()) {
                    }
                }
                arrayList3.add(wVar);
            }
            Bundle bundle = new Bundle();
            C67262k kVar2 = (C67262k) C67263l.f182837d.createBuilder();
            kVar2.copyOnWrite();
            C67263l lVar = (C67263l) kVar2.instance;
            C62971cq cqVar = lVar.f182839a;
            if (!cqVar.mo58948c()) {
                lVar.f182839a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) lVar.f182839a);
            kVar2.copyOnWrite();
            C67263l lVar2 = (C67263l) kVar2.instance;
            C62971cq cqVar2 = lVar2.f182840b;
            if (!cqVar2.mo58948c()) {
                lVar2.f182840b = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) arrayList2, (List) lVar2.f182840b);
            kVar2.mo59782a(arrayList3);
            bundle.putByteArray("sheldon_cache_data", ((C67263l) kVar2.build()).toByteArray());
            Parcel gA = cVar.mo17260gA();
            C8850c.m23497f(gA, bundle);
            cVar.mo17263hf(7, gA);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101137ar.f282348a.mo56225c()).mo56382g(e)).mo56372aa(19854)).mo56386p("onSheldonSessionData() Callback: failue");
        } catch (Throwable th) {
            try {
                ekhoDebugReader.close();
            } catch (Throwable th2) {
                C101129aj.m167328a(th, th2);
            }
            throw th;
        }
        ekhoDebugReader.close();
        return true;
    }
}
