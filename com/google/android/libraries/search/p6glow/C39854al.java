package com.google.android.libraries.search.p6glow;

import android.view.animation.LinearInterpolator;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.common.p4522b.C58714pg;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.p6glow.al */
/* compiled from: PG */
public final class C39854al {

    /* renamed from: b */
    private static final Duration f104811b = Duration.ofMillis(350);

    /* renamed from: c */
    private static final Duration f104812c = Duration.ofMillis(367);

    /* renamed from: a */
    public final AssistantP6GlowView f104813a;

    /* renamed from: d */
    private final C147783f f104814d;

    public C39854al(AssistantP6GlowView assistantP6GlowView, C147783f fVar) {
        C69664n.m101061g(assistantP6GlowView, "view");
        C69664n.m101061g(fVar, "animationFactory");
        this.f104813a = assistantP6GlowView;
        this.f104814d = fVar;
    }

    /* renamed from: b */
    private final C147785k m69278b(C69615a aVar) {
        float[] o = this.f104813a.mo42038o();
        C147770c cVar = new C147770c(C39871bb.m69288c(this.f104813a));
        C147794t tVar = new C147794t(C58714pg.m90504g(Float.valueOf(0.0f), Float.valueOf(1.0f)));
        LinearInterpolator linearInterpolator = C39845ac.f104795a;
        tVar.mo124468c(C39845ac.f104799e);
        tVar.f398763c = C39871bb.m69289d(o, C39845ac.f104800f);
        C147779b bVar = new C147779b(this.f104814d, cVar.mo124447a(tVar));
        bVar.f398748b = new C39852aj(this, aVar);
        C147785k a = bVar.mo124453a();
        a.mo124460b(1.0f, f104812c);
        C69664n.m101060f(a, "animator");
        return a;
    }

    /* renamed from: a */
    public final C147785k mo42050a(C39872c cVar, C69615a aVar) {
        C69664n.m101061g(cVar, "previousState");
        C39872c cVar2 = C39872c.GONE;
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return this.f104814d.mo124458a(C39853ak.f104810a);
        }
        if (ordinal == 1) {
            return m69278b(aVar);
        }
        if (ordinal == 2) {
            return m69278b(aVar);
        }
        if (ordinal == 3) {
            float alpha = this.f104813a.getAlpha();
            C147770c cVar3 = new C147770c(new C39850ah(this));
            C147794t b = C147794t.m240888b(0.0f, 1.0f);
            LinearInterpolator linearInterpolator = C39845ac.f104795a;
            b.mo124468c(C39845ac.f104798d);
            b.f398763c = new C147790p(0.0f, this.f104813a.getAlpha());
            C147779b bVar = new C147779b(this.f104814d, cVar3.mo124447a(b));
            bVar.f398748b = new C39851ai(this, aVar);
            C147785k a = bVar.mo124453a();
            a.mo124459a(alpha, 0.0f, f104811b);
            C69664n.m101060f(a, "fadeOutAlphaAnimator");
            return a;
        }
        throw new C69677g();
    }
}
