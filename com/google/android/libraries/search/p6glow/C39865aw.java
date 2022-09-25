package com.google.android.libraries.search.p6glow;

import android.view.animation.LinearInterpolator;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.C147796v;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.common.p4522b.C58714pg;
import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.p6glow.aw */
/* compiled from: PG */
public final class C39865aw {

    /* renamed from: a */
    public static final Duration f104834a = Duration.ofMillis(600);

    /* renamed from: c */
    private static final Duration f104835c = Duration.ofMillis(450);

    /* renamed from: b */
    public final AssistantP6GlowView f104836b;

    /* renamed from: d */
    private final float[] f104837d;

    /* renamed from: e */
    private final float[] f104838e;

    /* renamed from: f */
    private final float[] f104839f;

    /* renamed from: g */
    private final float[] f104840g;

    /* renamed from: h */
    private final float[] f104841h;

    /* renamed from: i */
    private final float[] f104842i;

    /* renamed from: j */
    private final float[] f104843j;

    /* renamed from: k */
    private final float[] f104844k;

    /* renamed from: l */
    private final C147783f f104845l;

    public C39865aw(AssistantP6GlowView assistantP6GlowView, C147783f fVar, float f) {
        C69664n.m101061g(assistantP6GlowView, "view");
        C69664n.m101061g(fVar, "animationFactory");
        this.f104836b = assistantP6GlowView;
        this.f104845l = fVar;
        float f2 = 3.0f * f;
        this.f104837d = C39871bb.m69290e(f, f2, new float[]{0.0f, 1.0f, 0.0f, 0.0f});
        float f3 = 100.0f - f2;
        this.f104838e = C39871bb.m69290e(f3, f, new float[]{1.0f, 0.0f, 0.0f, 0.0f});
        this.f104839f = C39871bb.m69290e(f, f, new float[]{0.85f, 0.15f, 0.0f, 0.0f});
        this.f104840g = C39871bb.m69290e(f2, f, new float[]{0.0f, 0.0f, 1.0f, 0.0f});
        this.f104841h = C39871bb.m69290e(f, f, new float[]{0.0f, 0.0f, 0.15f, 0.85f});
        this.f104842i = C39871bb.m69290e(f, f3, new float[]{0.0f, 0.0f, 0.0f, 1.0f});
        float f4 = 100.0f - f;
        this.f104843j = new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, f4};
        this.f104844k = new float[]{f4, 0.0f, 0.0f, 0.0f, 0.0f, f};
    }

    /* renamed from: a */
    public final C147785k mo42058a(C69615a aVar) {
        float[] o = this.f104836b.mo42038o();
        C147796v b = new C147770c(C39871bb.m69288c(this.f104836b)).mo124448b();
        C147794t tVar = new C147794t(C58714pg.m90504g(Float.valueOf(0.0f), Float.valueOf(1.0f)));
        tVar.f398763c = C39871bb.m69289d(o, this.f104843j);
        LinearInterpolator linearInterpolator = C39845ac.f104795a;
        tVar.mo124468c(C39845ac.f104798d);
        b.f398770a.mo55395g(tVar);
        C147779b bVar = new C147779b(this.f104845l, b.mo124469a());
        bVar.f398748b = new C39862at(aVar);
        C147785k a = bVar.mo124453a();
        a.mo124460b(1.0f, f104835c);
        C69664n.m101060f(a, "thinkingAnimator");
        return a;
    }

    /* renamed from: b */
    public final C147785k mo42059b(C69615a aVar, C69615a aVar2, C69615a aVar3) {
        C69615a aVar4 = aVar3;
        C147796v b = new C147770c(C39871bb.m69288c(this.f104836b)).mo124448b();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.2f);
        C147794t tVar = new C147794t(C58714pg.m90504g(valueOf, valueOf2));
        tVar.f398763c = C39871bb.m69289d(this.f104843j, this.f104837d);
        b.f398770a.mo55395g(tVar);
        Float valueOf3 = Float.valueOf(0.8f);
        C147794t tVar2 = new C147794t(C58714pg.m90506j(valueOf2, valueOf3));
        tVar2.f398763c = C39871bb.m69289d(this.f104837d, this.f104839f);
        b.f398770a.mo55395g(tVar2);
        Float valueOf4 = Float.valueOf(0.95f);
        C147794t tVar3 = new C147794t(C58714pg.m90506j(valueOf3, valueOf4));
        tVar3.f398763c = C39871bb.m69289d(this.f104839f, this.f104838e);
        b.f398770a.mo55395g(tVar3);
        Float valueOf5 = Float.valueOf(1.0f);
        C147794t tVar4 = new C147794t(C58714pg.m90506j(valueOf4, valueOf5));
        tVar4.f398763c = C39871bb.m69289d(this.f104838e, this.f104844k);
        LinearInterpolator linearInterpolator = C39845ac.f104795a;
        tVar4.mo124468c(C39845ac.f104798d);
        b.f398770a.mo55395g(tVar4);
        C147796v b2 = new C147770c(C39871bb.m69288c(this.f104836b)).mo124448b();
        C147794t tVar5 = new C147794t(C58714pg.m90504g(valueOf, valueOf2));
        tVar5.f398763c = C39871bb.m69289d(this.f104844k, this.f104840g);
        b2.f398770a.mo55395g(tVar5);
        C147794t tVar6 = new C147794t(C58714pg.m90506j(valueOf2, valueOf3));
        tVar6.f398763c = C39871bb.m69289d(this.f104840g, this.f104841h);
        b2.f398770a.mo55395g(tVar6);
        C147794t tVar7 = new C147794t(C58714pg.m90506j(valueOf3, valueOf4));
        tVar7.f398763c = C39871bb.m69289d(this.f104841h, this.f104842i);
        b2.f398770a.mo55395g(tVar7);
        C147794t tVar8 = new C147794t(C58714pg.m90506j(valueOf4, valueOf5));
        tVar8.f398763c = C39871bb.m69289d(this.f104842i, this.f104843j);
        tVar8.mo124468c(C39845ac.f104798d);
        b2.f398770a.mo55395g(tVar8);
        C147779b bVar = new C147779b(this.f104845l, b2.mo124469a());
        bVar.f398748b = new C39864av(this, aVar4, aVar);
        C147785k a = bVar.mo124453a();
        C147779b bVar2 = new C147779b(this.f104845l, b.mo124469a());
        bVar2.f398750d = new C39861as(aVar2);
        bVar2.f398748b = new C39863au(this, a, aVar4);
        C147785k a2 = bVar2.mo124453a();
        a2.mo124460b(1.0f, f104834a);
        C69664n.m101060f(a2, "thinkingAnimatorLeftToRight");
        return a2;
    }
}
