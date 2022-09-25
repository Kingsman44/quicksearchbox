package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126291d;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.interaction.Interaction$KeyboardEventStreamObserver$onError$1", mo61344c = "Interaction.kt", mo61345d = "invokeSuspend", mo61346e = {117})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.d */
/* compiled from: PG */
final class C125780d extends C69572j implements C69630p {

    /* renamed from: a */
    int f346652a;

    /* renamed from: b */
    final /* synthetic */ C125783g f346653b;

    /* renamed from: c */
    final /* synthetic */ Throwable f346654c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125780d(C125783g gVar, Throwable th, C69577g gVar2) {
        super(2, gVar2);
        this.f346653b = gVar;
        this.f346654c = th;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125780d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346652a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125783g gVar = this.f346653b;
            this.f346652a = 1;
            obj = gVar.mo107115a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C125774an anVar = this.f346653b.f346663d;
            C47558bi a = C47831fm.m85006a("SD.HandleKbDisconnected");
            try {
                C60870cx a2 = anVar.f346627n.mo106898a("#handleKeyboardDisconnected", new C125798v(anVar));
                a.mo51417a(a2);
                a.close();
                C46459k.m82829b(a2, "Error while handling keyboard disconnection in %s [SD]", this.f346653b);
                C59052c cVar = (C59052c) C125783g.f346660a.mo56225c();
                cVar.mo56378ag(C38505d.f101863a, new Integer(C89885b.ASSISTANT_DICTATION_KEYBOARD_DISCONNECTED_VALUE));
                C59052c cVar2 = (C59052c) cVar.mo56382g(this.f346654c);
                C125783g gVar2 = this.f346653b;
                C61301b a3 = C126291d.m206499a(this.f346654c);
                cVar2.mo56379ah(new C59094n(36654));
                cVar2.mo56354G("%s closed because of an error[%s] from the client [SD]", gVar2, a3);
            } catch (Throwable th) {
                C125796t.m205761a(th, th);
            }
        } else {
            C59052c cVar3 = (C59052c) ((C59052c) C125783g.f346660a.mo56224b()).mo56382g(this.f346654c);
            C61301b bVar = this.f346653b.f346669j;
            cVar3.mo56379ah(new C59094n(36653));
            cVar3.mo56389s("%s was already closed when an error was received [SD]", bVar);
        }
        return C69788q.f186170a;
        throw th;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125780d(this.f346653b, this.f346654c, gVar);
    }
}
