package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127034w;
import com.google.apps.tiktok.concurrent.C46459k;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69552c;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69639a;
import p5462h.p5473f.p5475b.C69660j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.m */
/* compiled from: PG */
final /* synthetic */ class C127079m implements C71588o, C69660j {

    /* renamed from: a */
    final /* synthetic */ C127081o f349914a;

    public C127079m(C127081o oVar) {
        this.f349914a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C127034w wVar = (C127034w) obj;
        C127081o oVar = this.f349914a;
        C46459k.m82829b(C71663i.m104692e(oVar.f349920d, (C71424ay) null, new C127077k(wVar, oVar, (C69577g) null), 3), "Failed to run onConversationUpdate with state=%s", wVar.mo107901a());
        C69788q qVar = C69788q.f186170a;
        return qVar == C69554a.COROUTINE_SUSPENDED ? qVar : C69788q.f186170a;
    }

    /* renamed from: b */
    public final C69552c mo29011b() {
        return new C69639a(2, this.f349914a, C127081o.class, "onConversationStateUpdate", "onConversationStateUpdate(Lcom/google/android/apps/search/assistant/surfaces/voice/controller/conversation/controller/impl/ConversationControllerState;)V");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C71588o) || !(obj instanceof C69660j)) {
            return false;
        }
        return C69664n.m101066l(mo29011b(), ((C69660j) obj).mo29011b());
    }

    public final int hashCode() {
        return mo29011b().hashCode();
    }
}
