package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32774c;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32917b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.p */
/* compiled from: PG */
final class C32763p {

    /* renamed from: a */
    public final C32774c f87908a;

    /* renamed from: b */
    private final C32917b f87909b;

    public C32763p(C32774c cVar, C32917b bVar) {
        this.f87908a = cVar;
        this.f87909b = bVar;
    }

    /* renamed from: a */
    public final void mo38288a(List list, Throwable th) {
        C69664n.m101061g(list, "tags");
        try {
            this.f87908a.mo38034b(th);
            if (th != null) {
                this.f87909b.mo38347b(th, (C62722b) null);
            } else {
                this.f87909b.mo38347b((Throwable) null, (C62722b) null);
            }
        } catch (Throwable th2) {
            C59052c cVar = (C59052c) C32607ac.f87310a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "Context.Consumer");
            C69664n.m101060f(cVar, "logger.atWarning()");
            C59052c cVar2 = (C59052c) C32692dg.m60595a(cVar, list).mo56382g(th2);
            cVar2.mo56379ah(new C59094n(50569));
            cVar2.mo56386p("onSessionDisconnected failed; ignoring");
            this.f87909b.mo38347b(th2, (C62722b) null);
        }
    }
}
