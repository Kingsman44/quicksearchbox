package com.google.android.apps.search.podcasts.library.queue.p10583a;

import com.google.android.apps.search.podcasts.p10588n.C140660ai;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.library.queue.a.c */
/* compiled from: PG */
final class C140598c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140599d f381851a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140598c(C140599d dVar) {
        super(1);
        this.f381851a = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C140660ai aiVar = (C140660ai) obj;
        C69664n.m101061g(aiVar, "it");
        if (aiVar.f382037b && this.f381851a.f381852a.get()) {
            C59052c cVar = (C59052c) C140600e.f381854a.mo56226d();
            cVar.mo56379ah(new C59094n(41610));
            cVar.mo56386p("Data has been invalidated, but still contains unfulfilled episodes.");
        }
        if (!aiVar.f382037b || this.f381851a.f381852a.get()) {
            this.f381851a.f381852a.set(false);
            return C46688af.m83205b(new C140597b(C140596a.m228354a(aiVar.f382036a)), 0);
        }
        this.f381851a.f381852a.set(true);
        return C46688af.m83206c(new C140597b(C140596a.m228354a(aiVar.f382036a)));
    }
}
