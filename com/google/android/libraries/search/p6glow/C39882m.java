package com.google.android.libraries.search.p6glow;

import android.view.animation.LinearInterpolator;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.C147796v;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.p4522b.C58714pg;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.libraries.search.p6glow.m */
/* compiled from: PG */
public final class C39882m {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f104876a;

    /* renamed from: b */
    public final Duration f104877b;

    /* renamed from: c */
    public final Duration f104878c;

    /* renamed from: d */
    public final Duration f104879d;

    /* renamed from: e */
    public C39872c f104880e;

    /* renamed from: f */
    public boolean f104881f;

    /* renamed from: g */
    private final C39869b f104882g;

    /* renamed from: h */
    private final C69684c f104883h;

    /* renamed from: i */
    private final C39854al f104884i;

    /* renamed from: j */
    private final C39859aq f104885j;

    /* renamed from: k */
    private final C39867ay f104886k;

    /* renamed from: l */
    private final C39865aw f104887l;

    /* renamed from: m */
    private final C69684c f104888m;

    /* renamed from: n */
    private C147785k f104889n;

    static {
        Class<C39882m> cls = C39882m.class;
        C69669s sVar = new C69669s(cls, "state", "getState()Lcom/google/android/libraries/search/p6glow/AssistantP6GlowAnimator$State;");
        int i = C69649af.f186028a;
        f104876a = new C69713k[]{sVar, new C69669s(cls, "thinkingAnimationRunning", "getThinkingAnimationRunning()Z")};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C39882m(AssistantP6GlowView assistantP6GlowView, C147783f fVar) {
        this(assistantP6GlowView, fVar, (C39869b) null, 1020);
        C69664n.m101061g(assistantP6GlowView, "view");
        C69664n.m101061g(fVar, "animationFactory");
    }

    public C39882m(AssistantP6GlowView assistantP6GlowView, C147783f fVar, C39869b bVar, float f, float f2, float f3, float f4, Duration duration, Duration duration2, Duration duration3) {
        C69664n.m101061g(assistantP6GlowView, "view");
        C69664n.m101061g(fVar, "animationFactory");
        C69664n.m101061g(bVar, "callbacks");
        C69664n.m101061g(duration, "listeningStateFrameDelay");
        C69664n.m101061g(duration2, "userInputStateFrameDelay");
        C69664n.m101061g(duration3, "thinkingStateFrameDelay");
        this.f104882g = bVar;
        this.f104877b = duration;
        this.f104878c = duration2;
        this.f104879d = duration3;
        this.f104883h = new C39849ag(new C39881l(assistantP6GlowView, this));
        this.f104880e = C39872c.GONE;
        this.f104884i = new C39854al(assistantP6GlowView, fVar);
        this.f104885j = new C39859aq(assistantP6GlowView, fVar, f);
        this.f104886k = new C39867ay(assistantP6GlowView, fVar, f2, f3);
        this.f104887l = new C39865aw(assistantP6GlowView, fVar, f4);
        this.f104888m = new C39874e(false, this);
        if (f < 0.0f || f > 50.0f) {
            throw new IllegalStateException("The LISTENING space size must be within 0% and 50%");
        } else if (f2 < 0.0f || f2 > 50.0f) {
            throw new IllegalStateException("The USER_INPUT space size must be within 0% and 50%");
        } else if (f4 < 0.0f || f4 > 50.0f) {
            throw new IllegalStateException("The THINKING space size must be within 0% and 50%");
        } else {
            LinearInterpolator linearInterpolator = C39845ac.f104795a;
            assistantP6GlowView.mo42035l(C39845ac.f104800f);
        }
    }

    /* renamed from: f */
    private final C147785k m69301f(C39872c cVar, C69615a aVar) {
        C39865aw awVar = this.f104887l;
        C39879j jVar = new C39879j(this);
        C39880k kVar = new C39880k(this);
        C69664n.m101061g(cVar, "previousState");
        awVar.f104836b.setAlpha(1.0f);
        awVar.f104836b.mo42034k(false);
        C39872c cVar2 = C39872c.GONE;
        int ordinal = cVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return awVar.mo42058a(aVar);
            }
            if (ordinal != 3) {
                throw new C69677g();
            }
        }
        return awVar.mo42059b(aVar, jVar, kVar);
    }

    /* renamed from: g */
    private final boolean m69302g() {
        return ((Boolean) this.f104888m.mo42046c(f104876a[1])).booleanValue();
    }

    /* renamed from: a */
    public final C39872c mo42062a() {
        C69684c cVar = this.f104883h;
        C69713k kVar = f104876a[0];
        C69664n.m101061g(kVar, "property");
        C39848af afVar = ((C39849ag) cVar).f104803a;
        if (afVar instanceof C39847ae) {
            String c = kVar.mo61373c();
            throw new IllegalStateException("Value for " + c + " has not been initialized.");
        } else if (afVar instanceof C39846ad) {
            return (C39872c) ((C39846ad) afVar).f104801a;
        } else {
            throw new C69677g();
        }
    }

    /* renamed from: b */
    public final void mo42063b(C39872c cVar) {
        C69664n.m101061g(cVar, "<set-?>");
        C69684c cVar2 = this.f104883h;
        C69664n.m101061g(f104876a[0], "property");
        C39846ad adVar = new C39846ad(cVar);
        C39849ag agVar = (C39849ag) cVar2;
        if (!C69664n.m101066l(adVar, agVar.f104803a)) {
            agVar.f104803a = adVar;
            agVar.f104804b.mo5761a(cVar);
        }
    }

    /* renamed from: c */
    public final void mo42064c(boolean z) {
        this.f104888m.mo42045b(f104876a[1], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo42065d(C39872c cVar, C39872c cVar2) {
        C147785k kVar;
        C147785k kVar2;
        C39872c cVar3 = cVar;
        C19559g.m37304c();
        C39873d dVar = new C39873d(this, cVar2);
        if (cVar3 == C39872c.THINKING) {
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                kVar2 = this.f104884i.mo42050a(C39872c.THINKING, new C39876g(this.f104882g));
            } else if (ordinal == 1) {
                kVar2 = this.f104884i.mo42050a(C39872c.THINKING, new C39877h(this));
            } else if (ordinal == 2) {
                kVar2 = this.f104884i.mo42050a(C39872c.THINKING, new C39878i(this));
            } else if (ordinal == 3) {
                kVar2 = m69301f(C39872c.THINKING, dVar);
            } else {
                throw new C69677g();
            }
            this.f104889n = kVar2;
        } else if (m69302g()) {
            this.f104881f = true;
        } else {
            C147785k kVar3 = this.f104889n;
            if (kVar3 != null) {
                kVar3.mo124464f();
            }
            int ordinal2 = cVar2.ordinal();
            if (ordinal2 == 0) {
                kVar = this.f104884i.mo42050a(cVar3, new C39875f(this.f104882g));
            } else if (ordinal2 == 1) {
                C39859aq aqVar = this.f104885j;
                C69664n.m101061g(cVar3, "previousState");
                aqVar.f104822d.setAlpha(1.0f);
                aqVar.f104822d.mo42034k(false);
                int ordinal3 = cVar.ordinal();
                if (ordinal3 == 0) {
                    float[] o = aqVar.f104822d.mo42038o();
                    float[] f = C39871bb.m69290e(aqVar.f104823e * 0.88f, aqVar.f104823e * 0.88f, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
                    float[] f2 = C39871bb.m69290e(aqVar.f104823e, aqVar.f104823e, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
                    C147796v b = new C147770c(C39871bb.m69288c(aqVar.f104822d)).mo124448b();
                    Float valueOf = Float.valueOf(0.0f);
                    Float valueOf2 = Float.valueOf(0.23f);
                    C147794t tVar = new C147794t(C58714pg.m90504g(valueOf, valueOf2));
                    tVar.f398763c = C39871bb.m69289d(o, f);
                    LinearInterpolator linearInterpolator = C39845ac.f104795a;
                    tVar.mo124468c(C39845ac.f104796b);
                    b.f398770a.mo55395g(tVar);
                    Float valueOf3 = Float.valueOf(0.44f);
                    C147794t tVar2 = new C147794t(C58714pg.m90506j(valueOf2, valueOf3));
                    tVar2.f398763c = C39871bb.m69289d(f, f);
                    tVar2.mo124468c(C39845ac.f104795a);
                    b.f398770a.mo55395g(tVar2);
                    C147794t tVar3 = new C147794t(C58714pg.m90506j(valueOf3, Float.valueOf(1.0f)));
                    tVar3.f398763c = C39871bb.m69289d(f, f2);
                    tVar3.mo124468c(C39845ac.f104797c);
                    b.f398770a.mo55395g(tVar3);
                    C147779b bVar = new C147779b(aqVar.f104824f, b.mo124469a());
                    bVar.f398748b = new C39856an(dVar);
                    kVar = bVar.mo124453a();
                    kVar.mo124460b(1.0f, C39859aq.f104820b);
                    C69664n.m101060f(kVar, "listeningAnimator");
                } else if (ordinal3 == 1) {
                    float[] o2 = aqVar.f104822d.mo42038o();
                    float[] f3 = C39871bb.m69290e(aqVar.f104823e * 0.8f, aqVar.f104823e * 0.8f, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
                    float[] f4 = C39871bb.m69290e(aqVar.f104823e, aqVar.f104823e, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
                    C147796v b2 = new C147770c(C39871bb.m69288c(aqVar.f104822d)).mo124448b();
                    Float valueOf4 = Float.valueOf(0.0f);
                    Float valueOf5 = Float.valueOf(1.0f);
                    C147794t tVar4 = new C147794t(C58714pg.m90504g(valueOf4, valueOf5));
                    tVar4.f398763c = C39871bb.m69289d(o2, f3);
                    LinearInterpolator linearInterpolator2 = C39845ac.f104795a;
                    tVar4.mo124468c(C39845ac.f104795a);
                    b2.f398770a.mo55395g(tVar4);
                    C147794t tVar5 = new C147794t(C58714pg.m90506j(valueOf5, Float.valueOf(2.0f)));
                    tVar5.f398763c = C39871bb.m69289d(f3, f4);
                    tVar5.mo124468c(C39845ac.f104795a);
                    b2.f398770a.mo55395g(tVar5);
                    C147779b bVar2 = new C147779b(aqVar.f104824f, b2.mo124469a());
                    bVar2.f398748b = new C39855am(dVar);
                    C147785k a = bVar2.mo124453a();
                    a.mo124460b(2.0f, C39859aq.f104821c);
                    C69664n.m101060f(a, "listeningAnimator");
                    kVar = a;
                } else if (ordinal3 == 2) {
                    float[] o3 = aqVar.f104822d.mo42038o();
                    float[] f5 = C39871bb.m69290e(aqVar.f104823e, aqVar.f104823e, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
                    C147796v b3 = new C147770c(C39871bb.m69288c(aqVar.f104822d)).mo124448b();
                    C147794t tVar6 = new C147794t(C58714pg.m90504g(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                    tVar6.f398763c = C39871bb.m69289d(o3, f5);
                    LinearInterpolator linearInterpolator3 = C39845ac.f104795a;
                    tVar6.mo124468c(C39845ac.f104795a);
                    b3.f398770a.mo55395g(tVar6);
                    C147779b bVar3 = new C147779b(aqVar.f104824f, b3.mo124469a());
                    bVar3.f398748b = new C39857ao(dVar);
                    kVar = bVar3.mo124453a();
                    kVar.mo124460b(1.0f, C39859aq.f104819a);
                    C69664n.m101060f(kVar, "listeningAnimator");
                } else if (ordinal3 == 3) {
                    kVar = aqVar.f104824f.mo124458a(C39858ap.f104818a);
                } else {
                    throw new C69677g();
                }
            } else if (ordinal2 == 2) {
                C39867ay ayVar = this.f104886k;
                ayVar.f104850d.setAlpha(1.0f);
                ayVar.f104850d.mo42034k(true);
                int abs = (Math.abs(ayVar.f104852f.nextInt()) % 3) + 1;
                C147796v b4 = new C147770c(C39871bb.m69288c(ayVar.f104850d)).mo124448b();
                float[] o4 = ayVar.f104850d.mo42038o();
                Float valueOf6 = Float.valueOf(0.0f);
                C147794t tVar7 = new C147794t(C58714pg.m90504g(valueOf6, valueOf6));
                tVar7.f398763c = C39871bb.m69289d(o4, o4);
                tVar7.mo124468c(C39867ay.f104847a);
                b4.f398770a.mo55395g(tVar7);
                for (int i = 0; i < abs; i++) {
                    int nextInt = ayVar.f104852f.nextInt() % 4;
                    int i2 = nextInt + ((((nextInt ^ 4) & ((-nextInt) | nextInt)) >> 31) & 4);
                    int i3 = 0;
                    while (i3 < 4) {
                        ayVar.f104853g[i3] = i3 == i2 ? 3.0f : 1.0f;
                        i3++;
                    }
                    float f6 = ayVar.f104851e;
                    float[] e = C39871bb.m69290e(f6, f6, ayVar.f104853g);
                    float f7 = (float) i;
                    C147794t tVar8 = new C147794t(C58714pg.m90506j(Float.valueOf(f7), Float.valueOf(f7 + 1.0f)));
                    tVar8.f398763c = C39871bb.m69289d(o4, e, ayVar.f104854h);
                    tVar8.mo124468c(C39867ay.f104847a);
                    b4.f398770a.mo55395g(tVar8);
                    o4 = ayVar.f104854h;
                }
                C147779b bVar4 = new C147779b(ayVar.f104855i, b4.mo124469a());
                bVar4.f398748b = new C39866ax(dVar);
                kVar = bVar4.mo124453a();
                kVar.mo124460b((float) abs, C39867ay.f104848b.multipliedBy((long) abs).plus(C39867ay.f104849c));
                C69664n.m101060f(kVar, "inputAnimator");
            } else if (ordinal2 == 3) {
                kVar = m69301f(cVar3, dVar);
            } else {
                throw new C69677g();
            }
            this.f104889n = kVar;
        }
    }

    /* renamed from: e */
    public final void mo42066e(C39872c cVar) {
        if (m69302g()) {
            this.f104881f = true;
        } else {
            mo42065d(C39872c.GONE, cVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39882m(com.google.android.libraries.search.p6glow.AssistantP6GlowView r12, com.google.android.libraries.animation.impl.C147783f r13, com.google.android.libraries.search.p6glow.C39869b r14, int r15) {
        /*
            r11 = this;
            r15 = r15 & 4
            if (r15 == 0) goto L_0x0009
            com.google.android.libraries.search.p6glow.a r14 = new com.google.android.libraries.search.p6glow.a
            r14.<init>()
        L_0x0009:
            r3 = r14
            r14 = 14
            j$.time.Duration r8 = p3186j$.time.Duration.ofMillis(r14)
            java.lang.String r14 = "ofMillis(14)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r14)
            r14 = 12
            j$.time.Duration r9 = p3186j$.time.Duration.ofMillis(r14)
            java.lang.String r14 = "ofMillis(12)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)
            r14 = 8
            j$.time.Duration r10 = p3186j$.time.Duration.ofMillis(r14)
            java.lang.String r14 = "ofMillis(8)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r14)
            r4 = 1099956224(0x41900000, float:18.0)
            r5 = 1096810496(0x41600000, float:14.0)
            r6 = 1090519040(0x41000000, float:8.0)
            r7 = 1084227584(0x40a00000, float:5.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p6glow.C39882m.<init>(com.google.android.libraries.search.p6glow.AssistantP6GlowView, com.google.android.libraries.animation.impl.f, com.google.android.libraries.search.p6glow.b, int):void");
    }
}
