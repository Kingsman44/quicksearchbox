package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9835b;

import android.animation.IntEvaluator;
import com.google.android.libraries.animation.C147788n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b.k */
/* compiled from: PG */
public final class C129595k implements C147788n {

    /* renamed from: a */
    final /* synthetic */ int f355696a;

    /* renamed from: b */
    final /* synthetic */ int f355697b;

    /* renamed from: c */
    private final IntEvaluator f355698c = new IntEvaluator();

    public C129595k(int i, int i2) {
        this.f355696a = i;
        this.f355697b = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42061a(float f) {
        Integer evaluate = this.f355698c.evaluate(f, Integer.valueOf(this.f355696a), Integer.valueOf(this.f355697b));
        C69664n.m101060f(evaluate, "typeEvaluator.evaluate(value, from, to)");
        return evaluate;
    }
}
