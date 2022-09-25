package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120752d;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120753e;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120754f;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120755g;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.speech.p5218j.C66776aq;
import com.google.speech.p5218j.C67020ib;
import com.google.speech.p5218j.C67035iq;
import com.google.speech.p5218j.C67037is;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.g */
/* compiled from: PG */
final class C120718g implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71422aw f335749a;

    /* renamed from: b */
    final /* synthetic */ C120723l f335750b;

    /* renamed from: c */
    final /* synthetic */ C120816a f335751c;

    public C120718g(C71422aw awVar, C120723l lVar, C120816a aVar) {
        this.f335749a = awVar;
        this.f335750b = lVar;
        this.f335751c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C120755g gVar2 = (C120755g) obj;
        if (gVar2 instanceof C120753e) {
            C71803m.m105043d(this.f335749a, (C69585o) null, (C71424ay) null, new C120716e(this.f335750b, gVar2, (C69577g) null), 3);
        } else if (gVar2 instanceof C120754f) {
            C120723l lVar = this.f335750b;
            if (lVar.f335771f) {
                C71803m.m105043d(this.f335749a, (C69585o) null, (C71424ay) null, new C120717f(lVar, gVar2, (C69577g) null), 3);
            }
        } else if (gVar2 instanceof C120752d) {
            C120816a aVar = this.f335751c;
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            C69664n.m101060f(knVar, "newBuilder()");
            C67020ib a = C69664n.m101061g(knVar, "builder");
            C67035iq iqVar = (C67035iq) C67038it.f182220d.createBuilder();
            C69664n.m101060f(iqVar, "newBuilder()");
            C66776aq a2 = C69664n.m101061g(iqVar, "builder");
            a2.mo59740b(C67037is.START_OF_SPEECH);
            a.mo59763b(a2.mo59739a());
            aVar.mo104868a(a.mo59762a());
        }
        return C69788q.f186170a;
    }
}
