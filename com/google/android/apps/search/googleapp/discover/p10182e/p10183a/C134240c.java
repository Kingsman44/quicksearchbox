package com.google.android.apps.search.googleapp.discover.p10182e.p10183a;

import com.google.android.apps.search.googleapp.p10253e.C135375f;
import com.google.android.apps.search.googleapp.p10253e.C135376g;
import com.google.android.apps.search.googleapp.p10253e.C135377h;
import com.google.android.apps.search.googleapp.p10253e.C135378i;
import com.google.android.apps.search.googleapp.p10253e.C135379j;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.io.IOException;
import p3186j$.time.Instant;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.e.a.c */
/* compiled from: PG */
public final class C134240c implements C134238a {

    /* renamed from: a */
    private final C135379j f365711a;

    /* renamed from: b */
    private final boolean f365712b;

    /* renamed from: c */
    private final C39143kr f365713c;

    public C134240c(C135379j jVar, boolean z, C39143kr krVar) {
        C69664n.m101061g(jVar, "protoDataStoreWrapper");
        C69664n.m101061g(krVar, "clientStreamz");
        this.f365711a = jVar;
        this.f365712b = z;
        this.f365713c = krVar;
    }

    /* renamed from: a */
    public final void mo111658a(Instant instant) {
        C60870cx a;
        C69664n.m101061g(instant, "currentTime");
        if (this.f365712b) {
            C135379j jVar = this.f365711a;
            C134239b bVar = new C134239b(instant);
            C69648ae aeVar = new C69648ae();
            synchronized (jVar.f368855h) {
                aeVar.f186027a = C69540x.m100826H(jVar.f368854g);
                a = jVar.f368849b.mo46039a(new C135378i(bVar), jVar.f368850c);
                C69664n.m101060f(a, "protoDataStore.updateDat…nsform, blockingExecutor)");
                jVar.f368856i = a;
            }
            C135375f fVar = new C135375f(jVar, aeVar);
            C60856cj.m92911t(a, C47810es.m84974n(fVar), jVar.f368851d);
        }
    }

    /* renamed from: b */
    public final void mo111659b(long j) {
        C60870cx cxVar;
        if (this.f365712b) {
            C135379j jVar = this.f365711a;
            synchronized (jVar.f368855h) {
                cxVar = jVar.f368856i;
            }
            try {
                Object obj = C47633f.m84733g(cxVar).mo51513e(Exception.class, C135376g.f368845a, jVar.f368851d).mo51516i(new C135377h(jVar), C60826bg.f164896a).get();
                C69664n.m101060f(obj, "{\n      getDataFuture.ge… SharedPreferences.\n    }");
                C63042fg fgVar = ((C134248k) ((MessageLite) obj)).f365724b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                C69664n.m101060f(fgVar, "protoDataStoreWrapper.ge…irstApplicationLaunchTime");
                if (!C69664n.m101066l(Instant.ofEpochMilli(j), C62949a.m95469d(fgVar))) {
                    this.f365713c.mo41721j();
                } else {
                    this.f365713c.mo41713b();
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((C19567d) jVar.f368853f.f102820aD.mo6453a()).mo24822a(1, new Object[0]);
                throw new IOException("Failed to wait for last pending write to complete and get data", e);
            }
        }
    }
}
