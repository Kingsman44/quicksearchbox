package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127592f;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127593g;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127615b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127629p;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127630q;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127632s;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.impl.MainAssistantTriggeringClientImpl$subscribeToSettingChanged$1$2", mo61344c = "MainAssistantTriggeringClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {164})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.x */
/* compiled from: PG */
final class C127668x extends C69572j implements C69630p {

    /* renamed from: a */
    int f351498a;

    /* renamed from: b */
    /* synthetic */ Object f351499b;

    /* renamed from: c */
    final /* synthetic */ C127643ae f351500c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127668x(C127643ae aeVar, C69577g gVar) {
        super(2, gVar);
        this.f351500c = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127668x) mo5194c((C127593g) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C127615b bVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351498a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127643ae aeVar = this.f351500c;
            C127629p pVar = (C127629p) C127630q.f351355b.createBuilder();
            C69664n.m101060f(pVar, "newBuilder()");
            C127632s a = C69664n.m101061g(pVar, "builder");
            int a2 = C127592f.m208594a(((C127593g) this.f351499b).f351294a);
            int i = a2 - 1;
            C34043bf bfVar = C34043bf.ENTRYPOINT_UNKNOWN;
            e eVar = e.a;
            if (a2 != 0) {
                if (i == 0) {
                    bVar = C127615b.ASSISTANT_ENABLED_CHANGE_SETTING;
                } else if (i != 1) {
                    C59052c cVar = (C59052c) C127643ae.f351379a.mo56225c();
                    cVar.mo56379ah(new C59094n(37547));
                    cVar.mo56386p("Setting Type not set");
                    bVar = C127615b.UNKNOWN;
                } else {
                    bVar = C127615b.INPUT_MODALITY_CHANGE_SETTING;
                }
                a.mo108157b(bVar);
                C127630q a3 = a.mo108156a();
                this.f351498a = 1;
                if (aeVar.mo108152c(a3, this) == aVar) {
                    return aVar;
                }
            } else {
                throw null;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C127668x xVar = new C127668x(this.f351500c, gVar);
        xVar.f351499b = obj;
        return xVar;
    }
}
