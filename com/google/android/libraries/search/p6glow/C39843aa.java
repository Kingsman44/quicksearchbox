package com.google.android.libraries.search.p6glow;

import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.p6glow.aa */
/* compiled from: PG */
final class C39843aa extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ AssistantP6GlowView f104793a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39843aa(AssistantP6GlowView assistantP6GlowView) {
        super(1);
        this.f104793a = assistantP6GlowView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        if (((Number) obj).floatValue() >= 0.0f) {
            this.f104793a.f104769c = true;
            return C69788q.f186170a;
        }
        throw new IllegalStateException("Check failed.");
    }
}
