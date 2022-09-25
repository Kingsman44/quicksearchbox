package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.view.View;
import com.google.android.libraries.animation.C147768a;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147771d;
import com.google.android.libraries.animation.C147772e;
import com.google.android.libraries.animation.C147774g;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.p */
/* compiled from: PG */
final class C82100p {

    /* renamed from: a */
    public static final /* synthetic */ int f224455a = 0;

    /* renamed from: b */
    private static final Duration f224456b = Duration.ofMillis(600);

    /* renamed from: c */
    private static final Duration f224457c = Duration.ofMillis(300);

    /* renamed from: d */
    private final C147785k f224458d;

    /* renamed from: e */
    private final C147785k f224459e;

    /* renamed from: f */
    private final View f224460f;

    /* renamed from: g */
    private final Runnable f224461g;

    /* renamed from: h */
    private C82099o f224462h = C82099o.INACTIVE;

    /* renamed from: i */
    private boolean f224463i;

    /* renamed from: j */
    private C82099o f224464j = C82099o.INACTIVE;

    public C82100p(View view, View view2, View view3, Runnable runnable, C147783f fVar) {
        View view4 = view;
        View view5 = view2;
        View view6 = view3;
        Runnable runnable2 = runnable;
        C147783f fVar2 = fVar;
        this.f224460f = view4;
        this.f224461g = runnable2;
        Objects.requireNonNull(view2);
        C147770c cVar = new C147770c(C147774g.m240858a(new C82092h(view5), new C82095k(view5)));
        C147794t b = C147794t.m240888b(0.5f, 1.0f);
        b.f398763c = new C147790p(0.0f, 1.0f);
        C147768a a = cVar.mo124447a(b);
        Objects.requireNonNull(view);
        C82092h hVar = new C82092h(view4);
        Objects.requireNonNull(view3);
        C147779b bVar = new C147779b(fVar2, new C147771d(a, hVar, new C82092h(view6), new C82096l(view4), new C82097m(view6)));
        bVar.f398748b = runnable2;
        bVar.f398751e = true;
        this.f224458d = bVar.mo124453a();
        Objects.requireNonNull(view2);
        C147770c cVar2 = new C147770c(C147774g.m240858a(new C82092h(view5), new C82098n(view5)));
        C147794t b2 = C147794t.m240888b(0.0f, 1.0f);
        b2.f398763c = new C147790p(0.0f, 1.0f);
        C147768a a2 = cVar2.mo124447a(b2);
        Objects.requireNonNull(view);
        C82092h hVar2 = new C82092h(view4);
        Objects.requireNonNull(view3);
        C147770c cVar3 = new C147770c(new C147772e(hVar2, new C82092h(view6), new C82093i(view4), new C82094j(view6)));
        C147794t b3 = C147794t.m240888b(0.0f, 0.33f);
        b3.f398763c = new C147790p(0.0f, 1.0f);
        C147779b bVar2 = new C147779b(fVar2, C147774g.m240858a(a2, cVar3.mo124447a(b3)));
        bVar2.f398748b = runnable2;
        this.f224459e = bVar2.mo124453a();
    }

    /* renamed from: c */
    private final float m130389c() {
        if (this.f224459e.mo124462d()) {
            return this.f224459e.f398740a;
        }
        if (this.f224458d.mo124462d()) {
            return this.f224458d.f398740a;
        }
        return this.f224460f.getAlpha();
    }

    /* renamed from: d */
    private static Optional m130390d(float f, float f2, Duration duration) {
        if (f == f2) {
            return Optional.empty();
        }
        Duration ofMillis = Duration.ofMillis((long) (Math.abs(f2 - f) * ((float) duration.toMillis())));
        if (ofMillis.isZero()) {
            return Optional.empty();
        }
        return Optional.m71637of(ofMillis);
    }

    /* renamed from: e */
    private final void m130391e(Duration duration) {
        float c = m130389c();
        this.f224459e.mo124464f();
        this.f224458d.mo124464f();
        Optional d = m130390d(c, 1.0f, duration);
        if (d.isPresent()) {
            d.get();
            this.f224459e.mo124459a(c, 1.0f, (Duration) d.get());
            return;
        }
        C147785k kVar = this.f224459e;
        kVar.mo124464f();
        kVar.mo124461c(1.0f);
        this.f224461g.run();
    }

    /* renamed from: f */
    private final void m130392f(Duration duration) {
        float c = m130389c();
        this.f224459e.mo124464f();
        this.f224458d.mo124464f();
        Optional d = m130390d(c, 0.0f, duration);
        if (d.isPresent()) {
            d.get();
            this.f224458d.mo124459a(c, 0.0f, (Duration) d.get());
            return;
        }
        C147785k kVar = this.f224458d;
        kVar.mo124464f();
        kVar.mo124461c(0.0f);
        this.f224461g.run();
    }

    /* renamed from: a */
    public final void mo75511a() {
        if (!this.f224463i) {
            this.f224463i = true;
            mo75512b(this.f224464j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo75512b(C82099o oVar) {
        if (!oVar.equals(this.f224462h)) {
            if (!this.f224463i) {
                this.f224464j = oVar;
                return;
            }
            int ordinal = this.f224462h.ordinal();
            if (ordinal == 0) {
                int ordinal2 = oVar.ordinal();
                if (ordinal2 == 0) {
                    throw new AssertionError("ACTIVE_WITHOUT_CARD should not happen in ACTIVE_WITHOUT_CARD clause");
                } else if (ordinal2 == 1) {
                    m130392f(Duration.ZERO);
                } else if (ordinal2 == 2) {
                    m130392f(f224456b);
                }
            } else if (ordinal == 1) {
                int ordinal3 = oVar.ordinal();
                if (ordinal3 == 0) {
                    m130391e(Duration.ZERO);
                } else if (ordinal3 == 1) {
                    throw new AssertionError("ACTIVE_WITH_CARD should not happen in ACTIVE_WITH_CARD clause");
                } else if (ordinal3 == 2) {
                    m130392f(Duration.ZERO);
                }
            } else if (ordinal == 2) {
                int ordinal4 = oVar.ordinal();
                if (ordinal4 == 0) {
                    m130391e(f224457c);
                } else if (ordinal4 == 1) {
                    m130392f(Duration.ZERO);
                } else if (ordinal4 == 2) {
                    throw new AssertionError("INACTIVE should not happen in INACTIVE clause");
                }
            }
            this.f224462h = oVar;
        }
    }
}
