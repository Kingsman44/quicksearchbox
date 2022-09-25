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
import com.google.common.p4575r.C60761r;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67278ai;
import com.google.speech.p5228m.C67347k;
import com.google.speech.p5228m.C67359w;
import com.google.speech.p5228m.C67361y;
import com.google.speech.p5228m.p5229a.C67262k;
import com.google.speech.p5228m.p5229a.C67263l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.am */
/* compiled from: PG */
public final /* synthetic */ class C101132am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C101137ar f282343a;

    /* renamed from: b */
    public final /* synthetic */ c f282344b;

    public /* synthetic */ C101132am(C101137ar arVar, c cVar) {
        this.f282343a = arVar;
        this.f282344b = cVar;
    }

    public final Object apply(Object obj) {
        EkhoDebugReader ekhoDebugReader;
        C101137ar arVar = this.f282343a;
        c cVar = this.f282344b;
        C67270aa aaVar = (C67270aa) obj;
        try {
            ((C59052c) ((C59052c) C101137ar.f282348a.mo56224b()).mo56372aa(19852)).mo56389s("getSheldonSessionsInternal() Params : %s ", aaVar);
            C100761a.m166954a(arVar.f282349b);
            ekhoDebugReader = new EkhoDebugReader();
            ekhoDebugReader.mo24630c(aaVar);
            List<C67347k> b = ekhoDebugReader.mo24629b("Audio", C67347k.f183055c);
            ((C59052c) ((C59052c) C101137ar.f282348a.mo56224b()).mo56372aa(19848)).mo56387q("readSheldonSessionIds() : Audio List count : %d", b.size());
            ArrayList arrayList = new ArrayList();
            for (C67347k kVar : b) {
                int b2 = C67278ai.m97449b(kVar.f183058b);
                if (b2 != 0 && b2 == 6002) {
                    C67361y yVar = kVar.f183057a;
                    if (yVar == null) {
                        yVar = C67361y.f183093c;
                    }
                    arrayList.add(Long.valueOf(yVar.f183095a));
                }
            }
            for (C67359w wVar : ekhoDebugReader.mo24629b("EkhoEvent", C67359w.f183087d)) {
                int b3 = C67278ai.m97449b(wVar.f183090b);
                if (b3 != 0 && b3 == 6001) {
                    C67361y yVar2 = wVar.f183089a;
                    if (yVar2 == null) {
                        yVar2 = C67361y.f183093c;
                    }
                    arrayList.add(Long.valueOf(yVar2.f183095a));
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLongArray("all_sheldon_sessions", C60761r.m92761g(arrayList));
            List<C67359w> a = ekhoDebugReader.mo24628a();
            ArrayList arrayList2 = new ArrayList();
            for (C67359w wVar2 : a) {
                int b4 = C67278ai.m97449b(wVar2.f183090b);
                if (b4 != 0 && b4 == 6003) {
                    arrayList2.add(wVar2);
                }
            }
            C67262k kVar2 = (C67262k) C67263l.f182837d.createBuilder();
            kVar2.mo59782a(arrayList2);
            bundle.putByteArray("sheldon_log_metrics", ((C67263l) kVar2.build()).toByteArray());
            Parcel gA = cVar.mo17260gA();
            C8850c.m23497f(gA, bundle);
            cVar.mo17263hf(6, gA);
            ekhoDebugReader.close();
            return true;
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101137ar.f282348a.mo56225c()).mo56382g(e)).mo56372aa(19847)).mo56386p("Failed to return from getSheldonSessionsInternal()");
            return false;
        } catch (Throwable th) {
            C101129aj.m167328a(th, th);
        }
        throw th;
    }
}
