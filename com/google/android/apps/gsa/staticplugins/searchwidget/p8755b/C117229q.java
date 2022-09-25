package com.google.android.apps.gsa.staticplugins.searchwidget.p8755b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.common.p4552o.C60516su;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.b.q */
/* compiled from: PG */
public final class C117229q implements C117226n {

    /* renamed from: a */
    private final C92486a f325415a;

    /* renamed from: b */
    private final C89994f f325416b;

    /* renamed from: c */
    private final C117227o f325417c;

    /* renamed from: d */
    private final C117228p f325418d;

    /* renamed from: e */
    private final C86124t f325419e;

    public C117229q(C92486a aVar, C89994f fVar, C117227o oVar, C117228p pVar, C86124t tVar) {
        this.f325415a = aVar;
        this.f325416b = fVar;
        this.f325417c = oVar;
        this.f325418d = pVar;
        this.f325419e = tVar;
    }

    /* renamed from: f */
    private final boolean m194809f() {
        return this.f325416b.mo83819h() && !this.f325417c.mo103200d() && !this.f325418d.mo103200d();
    }

    /* renamed from: a */
    public final List mo103197a() {
        ArrayList arrayList = new ArrayList();
        if (this.f325416b.mo83855R() == 4) {
            arrayList.add(C60516su.ONBOARDING);
        }
        if (this.f325419e.mo79746e(C90082eg.f250068e)) {
            arrayList.add(C60516su.ALWAYS_RUN_DSP);
        }
        if (this.f325419e.mo79746e(C90082eg.f250069f)) {
            arrayList.add(C60516su.ALWAYS_RUN_SOFTWARE);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo103198b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final boolean mo103199c() {
        return this.f325415a.mo87246t() && !m194809f();
    }

    /* renamed from: d */
    public final boolean mo103200d() {
        return this.f325415a.mo87246t() && m194809f();
    }

    /* renamed from: e */
    public final boolean mo103201e() {
        return !this.f325415a.mo87246t();
    }
}
