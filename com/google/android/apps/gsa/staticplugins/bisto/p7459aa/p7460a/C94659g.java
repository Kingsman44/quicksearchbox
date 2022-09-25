package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import android.util.Pair;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94798s;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94800u;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1852f.C22587n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.g */
/* compiled from: PG */
public final /* synthetic */ class C94659g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94660h f264749a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f264750b;

    public /* synthetic */ C94659g(C94660h hVar, C51809dy dyVar) {
        this.f264749a = hVar;
        this.f264750b = dyVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94660h hVar = this.f264749a;
        C51809dy dyVar = this.f264750b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C59104x b = C94660h.f264751a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsTtsPerf");
            ((C59052c) ((C59052c) b).mo56372aa(16825)).mo56386p("Sending TTS");
            if (hVar.f264754d.mo79746e(C90122ft.f250869h)) {
                C94800u uVar = hVar.f264753c;
                byte[] N = ((C22587n) axVar.mo56107c()).mo27672b().mo59174N();
                Pair a = C94800u.m156368a(dyVar);
                uVar.f265093d.mo28212l("gacs", new C94798s(uVar, N, a));
                C59104x b2 = C94800u.f265090a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "GacsClientOpDispatcher");
                ((C59052c) ((C59052c) b2).mo56372aa(16815)).mo56389s("Dispatched OP_GACS_TTS_OUTPUT ClientOp: (%s)", a.first);
                return (C60870cx) a.second;
            }
            hVar.f264752b.mo88617k(((C22587n) axVar.mo56107c()).mo27672b().mo59174N(), (String) null);
        }
        return C60856cj.m92900i(C22402a.f61894b);
    }
}
