package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9737a.C128581b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.search.p6glow.C39872c;
import com.google.android.libraries.search.p6glow.C39882m;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.k */
/* compiled from: PG */
public final class C128593k {

    /* renamed from: h */
    public static final /* synthetic */ int f353562h = 0;

    /* renamed from: i */
    private static final Duration f353563i = Duration.ofMillis(333);

    /* renamed from: a */
    public final C128586d f353564a;

    /* renamed from: b */
    public final C129024a f353565b;

    /* renamed from: c */
    public C39882m f353566c;

    /* renamed from: d */
    public C147785k f353567d;

    /* renamed from: e */
    public C128581b f353568e;

    /* renamed from: f */
    public boolean f353569f = true;

    /* renamed from: g */
    public final C147783f f353570g;

    /* renamed from: j */
    private final C128582b f353571j;

    /* renamed from: k */
    private boolean f353572k;

    public C128593k(C128586d dVar, C147783f fVar, C128582b bVar, C129024a aVar) {
        this.f353564a = dVar;
        this.f353570g = fVar;
        this.f353571j = bVar;
        this.f353565b = aVar;
    }

    /* renamed from: h */
    public static final void m209860h(LottieAnimationView lottieAnimationView, float f) {
        int i = 4;
        if (!(f == 68.0f || f == 236.0f)) {
            i = 0;
        }
        lottieAnimationView.setVisibility(i);
        lottieAnimationView.f15138d.mo9763g((int) f);
    }

    /* renamed from: i */
    private final void m209861i(float f, float f2) {
        LottieAnimationView a = mo108531a();
        C147783f fVar = this.f353570g;
        C147770c cVar = new C147770c(new C128588f(a));
        C147794t b = C147794t.m240888b(0.0f, 333.0f);
        b.f398763c = new C147790p(f, f2);
        C147779b bVar = new C147779b(fVar, cVar.mo124447a(b));
        bVar.f398748b = new C128589g(this);
        C147785k a2 = bVar.mo124453a();
        this.f353567d = a2;
        if (a2 != null) {
            a2.mo124459a(0.0f, 333.0f, f353563i);
        }
    }

    /* renamed from: j */
    private final boolean m209862j(C128581b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            return ordinal == 4 && !this.f353569f;
        }
        return true;
    }

    /* renamed from: a */
    public final LottieAnimationView mo108531a() {
        View findViewById = this.f353571j.requireView().findViewById(R.id.assistant_p6_glow_mic);
        C69664n.m101060f(findViewById, "fragment.requireView().f…id.assistant_p6_glow_mic)");
        return (LottieAnimationView) findViewById;
    }

    /* renamed from: b */
    public final void mo108532b() {
        m209861i(68.0f, 138.0f);
    }

    /* renamed from: c */
    public final void mo108533c() {
        m209861i(191.0f, 236.0f);
    }

    /* renamed from: d */
    public final void mo108534d(C128581b bVar) {
        C39872c cVar;
        C69664n.m101061g(bVar, "p6GlowState");
        this.f353568e = bVar;
        LottieAnimationView a = mo108531a();
        C147785k kVar = this.f353567d;
        if (kVar == null || !kVar.mo124462d()) {
            if (mo108536f(bVar, a)) {
                mo108533c();
            } else if (mo108535e(bVar, a) && !this.f353572k && this.f353564a.f353554b) {
                mo108532b();
            }
        }
        C39882m mVar = this.f353566c;
        if (mVar != null) {
            C128581b bVar2 = C128581b.GONE;
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                this.f353569f = true;
                cVar = C39872c.GONE;
            } else if (ordinal == 1) {
                this.f353569f = true;
                cVar = C39872c.LISTENING;
            } else if (ordinal == 2) {
                cVar = C39872c.USER_INPUT;
            } else if (ordinal == 3) {
                cVar = C39872c.THINKING;
            } else if (ordinal != 4) {
                throw new C69677g();
            } else if (this.f353569f) {
                cVar = C39872c.THINKING;
            } else {
                cVar = C39872c.GONE;
            }
            mVar.mo42063b(cVar);
        }
        this.f353572k = true;
    }

    /* renamed from: e */
    public final boolean mo108535e(C128581b bVar, LottieAnimationView lottieAnimationView) {
        return bVar != null && m209862j(bVar) && lottieAnimationView.getVisibility() == 4;
    }

    /* renamed from: f */
    public final boolean mo108536f(C128581b bVar, LottieAnimationView lottieAnimationView) {
        return bVar != null && !m209862j(bVar) && lottieAnimationView.getVisibility() == 0;
    }

    /* renamed from: g */
    public final void mo108537g() {
        if (this.f353569f) {
            this.f353569f = false;
            if (this.f353568e == C128581b.EXECUTING) {
                mo108534d(C128581b.EXECUTING);
            }
        }
    }
}
