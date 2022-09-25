package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127637b;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.impl.MainAssistantTriggeringClientImpl$connect$1", mo61344c = "MainAssistantTriggeringClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {151, 153})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.r */
/* compiled from: PG */
final class C127662r extends C69572j implements C69630p {

    /* renamed from: a */
    int f351472a;

    /* renamed from: b */
    final /* synthetic */ C127643ae f351473b;

    /* renamed from: c */
    final /* synthetic */ C127613a f351474c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127662r(C127643ae aeVar, C127613a aVar, C69577g gVar) {
        super(2, gVar);
        this.f351473b = aeVar;
        this.f351474c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127662r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f351472a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx b = this.f351473b.mo108161b(C127637b.SUBSCRIPTION_RECONNECT_REQUEST, C69496am.f185918a);
            this.f351472a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C127643ae aeVar = this.f351473b;
        if (aeVar.f351395p == null) {
            aeVar.f351395p = C71803m.m105043d(aeVar.f351382c, (C69585o) null, (C71424ay) null, new C127669y(aeVar, (C69577g) null), 3);
        }
        C127643ae aeVar2 = this.f351473b;
        C127613a aVar2 = this.f351474c;
        this.f351472a = 2;
        if (aeVar2.mo108163f(aVar2, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127662r(this.f351473b, this.f351474c, gVar);
    }
}
