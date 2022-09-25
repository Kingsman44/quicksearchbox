package com.google.apps.tiktok.lifecycle.flow;

import com.google.apps.tiktok.coroutines.p3632a.C46601aj;
import com.google.apps.tiktok.coroutines.p3632a.C46603al;
import com.google.apps.tiktok.coroutines.p3632a.C46604am;
import com.google.apps.tiktok.coroutines.p3632a.C46605an;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.lifecycle.flow.g */
/* compiled from: PG */
public final class C47427g extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C47423c f123181a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f123182b;

    /* renamed from: c */
    final /* synthetic */ C69626l f123183c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47427g(C47423c cVar, C69648ae aeVar, C69626l lVar) {
        super(1);
        this.f123181a = cVar;
        this.f123182b = aeVar;
        this.f123183c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C47423c cVar = this.f123181a;
        C46605an anVar = (C46605an) obj;
        if (anVar instanceof C46603al) {
            C46603al alVar = (C46603al) anVar;
            if (!C69664n.m101066l(this.f123182b.f186027a, alVar.f121792a)) {
                this.f123183c.mo5761a(alVar.f121792a);
                this.f123182b.f186027a = alVar.f121792a;
            }
        } else if (anVar instanceof C46601aj) {
            C46601aj ajVar = (C46601aj) anVar;
            if (!C69664n.m101066l(this.f123182b.f186027a, ajVar.f121790a)) {
                this.f123183c.mo5761a(ajVar.f121790a);
                this.f123182b.f186027a = ajVar.f121790a;
            }
        } else if (anVar instanceof C46604am) {
            C46604am amVar = (C46604am) anVar;
            if (!C69664n.m101066l(this.f123182b.f186027a, amVar.f121794a)) {
                this.f123183c.mo5761a(amVar.f121794a);
                this.f123182b.f186027a = amVar.f121794a;
            }
        }
        cVar.mo51261a(anVar);
        return C69788q.f186170a;
    }
}
