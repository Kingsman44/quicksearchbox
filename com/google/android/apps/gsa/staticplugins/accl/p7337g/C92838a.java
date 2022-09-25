package com.google.android.apps.gsa.staticplugins.accl.p7337g;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90605m;
import com.google.android.libraries.gsa.conversation.p1852f.C22587n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.g.a */
/* compiled from: PG */
public final /* synthetic */ class C92838a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92842e f259034a;

    public /* synthetic */ C92838a(C92842e eVar) {
        this.f259034a = eVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Query query;
        C92842e eVar = this.f259034a;
        C58833ax axVar = (C58833ax) obj;
        C84349ah ahVar = eVar.f259043f;
        if (ahVar instanceof C84349ah) {
            query = ahVar.f229566a;
        } else {
            query = eVar.f259040c.mo87473b();
        }
        if (axVar.mo56113h()) {
            C84352a aVar = eVar.f259041d;
            C22587n nVar = (C22587n) axVar.mo56107c();
            C90605m mVar = new C90605m();
            mVar.mo84746b(nVar.mo27672b());
            if (nVar.mo27671a().mo56113h()) {
                C58485gu guVar = (C58485gu) nVar.mo27671a().mo56107c();
                int size = guVar.size();
                for (int i = 0; i < size; i++) {
                    mVar.mo84747c((C67194al) guVar.get(i));
                }
            }
            return aVar.mo77889c(query, mVar.mo84745a(), new C92841d(eVar));
        }
        TtsRequest ttsRequest = eVar.f259039b;
        if (ttsRequest != null) {
            return eVar.f259041d.mo77888b(query, ttsRequest, new C92841d(eVar));
        }
        return C118826c.f331423b;
    }
}
