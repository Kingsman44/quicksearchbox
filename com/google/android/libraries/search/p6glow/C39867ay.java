package com.google.android.libraries.search.p6glow;

import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.animation.impl.C147783f;
import java.util.Random;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.p6glow.ay */
/* compiled from: PG */
public final class C39867ay {

    /* renamed from: a */
    public static final DecelerateInterpolator f104847a = new DecelerateInterpolator();

    /* renamed from: b */
    public static final Duration f104848b = Duration.ofMillis(300);

    /* renamed from: c */
    public static final Duration f104849c = Duration.ofMillis(100);

    /* renamed from: d */
    public final AssistantP6GlowView f104850d;

    /* renamed from: e */
    public final float f104851e;

    /* renamed from: f */
    public final Random f104852f = new Random();

    /* renamed from: g */
    public final float[] f104853g = new float[4];

    /* renamed from: h */
    public final float[] f104854h;

    /* renamed from: i */
    public final C147783f f104855i;

    public C39867ay(AssistantP6GlowView assistantP6GlowView, C147783f fVar, float f, float f2) {
        C69664n.m101061g(assistantP6GlowView, "view");
        C69664n.m101061g(fVar, "animationFactory");
        this.f104850d = assistantP6GlowView;
        this.f104855i = fVar;
        this.f104851e = f2;
        this.f104854h = C39871bb.m69290e(f, f, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
    }
}
