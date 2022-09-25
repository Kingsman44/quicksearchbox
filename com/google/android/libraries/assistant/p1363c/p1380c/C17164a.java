package com.google.android.libraries.assistant.p1363c.p1380c;

import androidx.p104d.p105a.C2168g;
import com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.C120260cr;
import com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.C120325es;
import com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.C120342fi;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.a */
/* compiled from: PG */
final class C17164a implements C17192n {

    /* renamed from: a */
    final /* synthetic */ C17192n f49870a;

    public C17164a(C17192n nVar) {
        this.f49870a = nVar;
    }

    /* renamed from: a */
    public final void mo23211a(C17191m mVar, Duration duration) {
        mVar.name();
        duration.toMillis();
        C120325es esVar = (C120325es) this.f49870a;
        if (((C2168g) esVar.f334761d).f6144b.isDone()) {
            C59104x b = C120325es.f334758a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) b).mo56372aa(34697)).mo56353F("#onNoSpeechDetected(%s, %s) ignored", mVar, duration.toMillis());
            return;
        }
        esVar.f334762e.f334569a.mo19974a(C37176a.f96931bw);
        C59104x b2 = C120325es.f334758a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) b2).mo56372aa(34696)).mo56353F("#onNoSpeechDetected(%s, %s)", mVar, duration.toMillis());
        ((C120342fi) esVar.f334759b.mo27525b()).mo104725d(C120510g.NO_SPEECH_DETECTED);
        esVar.f334760c.mo104715b(1);
        esVar.f334763f.mo5437b(true);
    }

    /* renamed from: b */
    public final void mo23212b(C17191m mVar, Duration duration) {
        mVar.name();
        duration.toMillis();
        C120325es esVar = (C120325es) this.f49870a;
        esVar.f334762e.f334569a.mo19974a(C37176a.f96929bu);
        C59104x b = C120325es.f334758a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) b).mo56372aa(34698)).mo56353F("#onSpeechBegin(%s, %s)", mVar, duration.toMillis());
        esVar.f334763f.mo5437b(false);
        esVar.f334760c.f334627c.mo104868a(C120260cr.f334625a);
    }

    /* renamed from: c */
    public final void mo23213c(C17191m mVar, Duration duration) {
        mVar.name();
        duration.toMillis();
        C120325es esVar = (C120325es) this.f49870a;
        esVar.f334762e.f334569a.mo19974a(C37176a.f96930bv);
        C59104x b = C120325es.f334758a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) b).mo56372aa(34699)).mo56353F("#onSpeechEnd(%s, %s)", mVar, duration.toMillis());
        esVar.f334763f.mo5437b(false);
        if (mVar != C17191m.PRIMARY) {
            ((C120342fi) esVar.f334759b.mo27525b()).mo104725d(C120510g.END_OF_SPEECH);
        }
        esVar.f334760c.f334627c.mo104868a(C120260cr.f334626b);
    }
}
