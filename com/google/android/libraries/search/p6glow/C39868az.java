package com.google.android.libraries.search.p6glow;

import com.google.android.libraries.animation.C147768a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.p6glow.az */
/* compiled from: PG */
public final class C39868az implements C147768a {

    /* renamed from: a */
    final /* synthetic */ AssistantP6GlowView f104856a;

    /* renamed from: b */
    private final float[] f104857b;

    public C39868az(AssistantP6GlowView assistantP6GlowView) {
        this.f104856a = assistantP6GlowView;
        this.f104857b = new float[assistantP6GlowView.mo42038o().length];
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42047a(Object obj) {
        Float[] fArr = (Float[]) obj;
        C69664n.m101061g(fArr, "value");
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            this.f104857b[i] = fArr[i].floatValue();
        }
        this.f104856a.mo42035l(this.f104857b);
    }
}
