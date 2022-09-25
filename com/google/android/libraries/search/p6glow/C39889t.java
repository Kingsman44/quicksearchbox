package com.google.android.libraries.search.p6glow;

import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.p6glow.t */
/* compiled from: PG */
final class C39889t extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ AssistantP6GlowView f104899a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39889t(AssistantP6GlowView assistantP6GlowView) {
        super(1);
        this.f104899a = assistantP6GlowView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (floatValue < 0.0f) {
            throw new IllegalStateException("Check failed.");
        } else if (floatValue <= 1.0f) {
            this.f104899a.f104769c = true;
            return C69788q.f186170a;
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }
}
