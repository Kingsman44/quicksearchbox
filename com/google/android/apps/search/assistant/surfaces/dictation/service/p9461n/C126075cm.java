package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Arrays;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cm */
/* compiled from: PG */
public final /* synthetic */ class C126075cm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347448a;

    /* renamed from: b */
    public final /* synthetic */ C125065at f347449b;

    /* renamed from: c */
    public final /* synthetic */ boolean f347450c;

    public /* synthetic */ C126075cm(C126081cs csVar, C125065at atVar, boolean z) {
        this.f347448a = csVar;
        this.f347449b = atVar;
        this.f347450c = z;
    }

    public final void run() {
        C60870cx cxVar;
        Duration duration;
        C60870cx cxVar2;
        C126081cs csVar = this.f347448a;
        C125065at atVar = this.f347449b;
        boolean z = this.f347450c;
        csVar.mo107316v();
        C126038bc bcVar = csVar.f347470h;
        if (bcVar.f347378x.getAndSet(false)) {
            cxVar = C126309ar.m206525d(Arrays.asList(new C60870cx[]{bcVar.f347369o.mo107388f(C126153q.f347622a), bcVar.f347362h.mo46039a(C125958ap.f347178a, bcVar.f347360f)}));
        } else {
            cxVar = C60866ct.f164955a;
        }
        C46459k.m82829b(cxVar, "Education handling for onUtteranceTextUpdated failed. [SD]", new Object[0]);
        C126106dq dqVar = csVar.f347469g;
        C69664n.m101061g(atVar, "text");
        dqVar.mo107340e(new C126104do(z, atVar));
        if (Collection.EL.stream(((C126087cy) csVar.f347469g.f347530a.get()).f347499j).anyMatch(C126063ca.f347432a)) {
            duration = C126081cs.f347466d;
        } else {
            duration = C126081cs.f347465c;
        }
        csVar.f347474l.mo107362f(csVar.f347467e.mo107381b(csVar.f347469g.mo107338c()), "listening", duration);
        if (csVar.f347469g.mo107337b().f347480a) {
            cxVar2 = C60856cj.m92900i(true);
        } else {
            cxVar2 = csVar.f347470h.f347375u.mo107387e();
        }
        C58817ah c = C47810es.m84963c(new C126059bx(csVar, atVar, z));
        C46459k.m82829b(C60922j.m93044g(cxVar2, C47810es.m84963c(c), csVar.f347473k), "Education handling for emoji suggestions failed. [SD]", new Object[0]);
    }
}
