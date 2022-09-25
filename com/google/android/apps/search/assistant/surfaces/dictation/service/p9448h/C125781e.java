package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125101cb;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125110ck;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.e */
/* compiled from: PG */
final class C125781e implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C125783g f346655a;

    public C125781e(C125783g gVar) {
        this.f346655a = gVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59052c cVar = (C59052c) C125783g.f346660a.mo56224b();
        C61301b bVar = this.f346655a.f346669j;
        cVar.mo56379ah(new C59094n(36655));
        cVar.mo56389s("%s completed by the client [SD]", bVar);
        C125783g gVar = this.f346655a;
        C71803m.m105043d(gVar.f346667h, (C69585o) null, (C71424ay) null, new C125779c(gVar, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C125783g gVar = this.f346655a;
        C71803m.m105043d(gVar.f346667h, (C69585o) null, (C71424ay) null, new C125780d(gVar, th, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C125110ck ckVar = (C125110ck) obj;
        C69664n.m101061g(ckVar, "keyboardEvent");
        int i = ckVar.f345147a;
        C125101cb cbVar = C125101cb.KEYBOARD_VISIBILITY_EVENT;
        C125774an anVar = this.f346655a.f346663d;
        C46459k.m82829b(anVar.f346627n.mo106898a(C125101cb.m204999a(ckVar.f345147a), new C125764ad(anVar, ckVar)), "Error while handling keyboard event: %s in %s [SD]", C125101cb.m204999a(ckVar.f345147a), this.f346655a);
    }
}
