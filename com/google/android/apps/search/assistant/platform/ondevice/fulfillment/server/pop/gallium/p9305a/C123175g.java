package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.p9305a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9311f.C123223d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9311f.C123224e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9311f.C123225f;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9311f.C123227h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5030q.C65095bp;
import com.google.protos.p4985f.p5030q.C65096bq;
import com.google.protos.p4985f.p5030q.C65099bt;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.a.g */
/* compiled from: PG */
public final class C123175g implements C65099bt {

    /* renamed from: a */
    public static final /* synthetic */ int f340858a = 0;

    /* renamed from: c */
    private final Supplier f340859c;

    /* renamed from: d */
    private final Supplier f340860d;

    /* renamed from: e */
    private final Supplier f340861e;

    public C123175g(Supplier supplier, Supplier supplier2, Supplier supplier3) {
        this.f340859c = supplier;
        this.f340860d = supplier2;
        this.f340861e = supplier3;
    }

    /* renamed from: a */
    public final C60870cx mo59338a() {
        C60870cx d = C123227h.m202563d(((C123223d) this.f340859c).f340929a);
        C123173e eVar = C123173e.f340856a;
        return C60922j.m93044g(d, C47810es.m84963c(eVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo59339b() {
        C60870cx f = C123227h.m202565f(((C123225f) this.f340861e).f340931a);
        C123172d dVar = C123172d.f340855a;
        return C60922j.m93044g(f, C47810es.m84963c(dVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo59340c() {
        C60870cx e = C123227h.m202564e(((C123224e) this.f340860d).f340930a);
        C123174f fVar = C123174f.f340857a;
        return C60922j.m93044g(e, C47810es.m84963c(fVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo59341d(C65096bq bqVar) {
        C60870cx cxVar;
        int a = C65095bp.m96532a(bqVar.f176251a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            cxVar = C60922j.m93044g(C123227h.m202563d(((C123223d) this.f340859c).f340929a), C47810es.m84963c(C123169a.f340852a), C60826bg.f164896a);
        } else if (i != 2) {
            cxVar = C60856cj.m92899h(new Exception("Invalid feaute requested"));
        } else {
            cxVar = C60922j.m93044g(C123227h.m202564e(((C123224e) this.f340860d).f340930a), C47810es.m84963c(C123170b.f340853a), C60826bg.f164896a);
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(C123171c.f340854a), C60826bg.f164896a);
    }
}
