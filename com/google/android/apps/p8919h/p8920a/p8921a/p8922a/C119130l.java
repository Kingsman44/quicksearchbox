package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.google.common.base.C58827ar;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p5285d.p5290b.p5291a.p5292a.C68154aq;
import p5285d.p5290b.p5291a.p5292a.C68155ar;
import p5285d.p5290b.p5291a.p5292a.C68200m;
import p5285d.p5290b.p5291a.p5292a.C68207t;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.p5533i.C70877p;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.h.a.a.a.l */
/* compiled from: PG */
public final class C119130l implements C119127i {

    /* renamed from: a */
    protected final C68155ar f332276a;

    /* renamed from: b */
    private final C68154aq f332277b;

    public C119130l(C68155ar arVar, C68154aq aqVar) {
        this.f332276a = arVar;
        this.f332277b = aqVar;
    }

    /* renamed from: c */
    public static C70761fa m197844c(C70761fa faVar, Object obj) {
        return new C70761fa(faVar.f188571a.mo61677b(obj.toString()), faVar.f188572b, true);
    }

    /* renamed from: a */
    public final C60870cx mo104195a(C68207t tVar) {
        return C60846c.m92879h(((C68154aq) this.f332277b.mo62575n(10, TimeUnit.SECONDS)).mo60279b(tVar), C70761fa.class, new C119128j(tVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo104196b(C68200m mVar, C70877p pVar, String... strArr) {
        C68155ar arVar = this.f332276a;
        C70334de deVar = new C70334de();
        deVar.mo62033h(new C70290cs("X-Goog-FieldMask", C70334de.f187481c), C58827ar.m90818c(',').mo56097d(Arrays.asList(strArr)));
        ((C68155ar) ((C68155ar) arVar.mo62576o(new C70879r(deVar))).mo62575n(120, TimeUnit.SECONDS)).mo60280b(mVar, new C119129k(pVar, mVar));
    }
}
