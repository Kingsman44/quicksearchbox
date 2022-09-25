package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32774c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.f */
/* compiled from: PG */
public final class C32310f implements C32774c {

    /* renamed from: a */
    public final C32849cq f86548a;

    /* renamed from: b */
    public final AtomicBoolean f86549b;

    /* renamed from: c */
    final /* synthetic */ C32313i f86550c;

    public C32310f(C32313i iVar, C32849cq cqVar, boolean z) {
        C69664n.m101061g(cqVar, "sessionToken");
        this.f86550c = iVar;
        this.f86548a = cqVar;
        this.f86549b = new AtomicBoolean(z);
    }

    /* renamed from: a */
    public final void mo38033a(C32796ar arVar) {
        C69664n.m101061g(arVar, "contextKey");
        if (this.f86549b.get() && this.f86550c.f86569e.contains(arVar)) {
            C59052c cVar = (C59052c) C32313i.f86565a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            String b = C32602g.m60429b(arVar);
            String b2 = C32941s.m60951b(this.f86548a);
            cVar.mo56379ah(new C59094n(52545));
            cVar.mo56354G("Invalidated ContextKey: %s. SessionToken: %s.", b, b2);
            C32313i iVar = this.f86550c;
            C71803m.m105042c(iVar.f86566b, (C69585o) null, (C71424ay) null, new C32307c(iVar, this, arVar, (C69577g) null), 3).mo62873s(new C32306b(arVar, this));
        }
    }

    /* renamed from: b */
    public final void mo38034b(Throwable th) {
        if (th == null) {
            C59052c cVar = (C59052c) C32313i.f86565a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            String b = C32941s.m60951b(this.f86548a);
            cVar.mo56379ah(new C59094n(52547));
            cVar.mo56389s("Client disconnected from Context API successfully. SessionToken: %s.", b);
        } else {
            C59052c cVar2 = (C59052c) C32313i.f86565a.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "Sbcp");
            String message = th.getMessage();
            String b2 = C32941s.m60951b(this.f86548a);
            cVar2.mo56379ah(new C59094n(52546));
            cVar2.mo56354G("Client is disconnected from Context API due to Error: %s. SessionToken: %s.", message, b2);
        }
        C32313i iVar = this.f86550c;
        C71803m.m105042c(iVar.f86566b, (C69585o) null, (C71424ay) null, new C32309e(iVar, this, (C69577g) null), 3).mo62873s(new C32308d(this));
    }
}
