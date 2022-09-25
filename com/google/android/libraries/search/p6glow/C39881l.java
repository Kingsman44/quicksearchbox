package com.google.android.libraries.search.p6glow;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.p6glow.l */
/* compiled from: PG */
final class C39881l extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ AssistantP6GlowView f104874a;

    /* renamed from: b */
    final /* synthetic */ C39882m f104875b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39881l(AssistantP6GlowView assistantP6GlowView, C39882m mVar) {
        super(1);
        this.f104874a = assistantP6GlowView;
        this.f104875b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Duration duration;
        C39872c cVar = (C39872c) obj;
        C69664n.m101061g(cVar, "it");
        C19559g.m37304c();
        AssistantP6GlowView assistantP6GlowView = this.f104874a;
        C39882m mVar = this.f104875b;
        C39872c cVar2 = C39872c.GONE;
        int ordinal = cVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            duration = mVar.f104877b;
        } else if (ordinal == 2) {
            duration = mVar.f104878c;
        } else if (ordinal == 3) {
            duration = mVar.f104879d;
        } else {
            throw new C69677g();
        }
        C69664n.m101061g(duration, "<set-?>");
        assistantP6GlowView.f104770d = duration;
        C39882m mVar2 = this.f104875b;
        mVar2.mo42065d(mVar2.f104880e, cVar);
        this.f104875b.f104880e = cVar;
        return C69788q.f186170a;
    }
}
