package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37361az;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.android.libraries.search.p2904c.p2982x.C38250i;
import com.google.android.libraries.search.p2904c.p2982x.C38251j;
import com.google.android.libraries.search.p2904c.p2982x.C38255n;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

/* renamed from: com.google.android.libraries.search.c.x.a.p */
/* compiled from: PG */
public final class C38207p implements C37361az {

    /* renamed from: a */
    public static final C59071e f101265a = C59071e.m91331h();

    /* renamed from: b */
    public final C37966b f101266b;

    /* renamed from: c */
    private final C38251j f101267c;

    /* renamed from: d */
    private final C71422aw f101268d;

    /* renamed from: e */
    private final AtomicBoolean f101269e = new AtomicBoolean(false);

    public C38207p(C38251j jVar, C37966b bVar, C71422aw awVar) {
        C69664n.m101061g(jVar, "audioServiceStub");
        C69664n.m101061g(bVar, "monitoringLogger");
        C69664n.m101061g(awVar, "blockingScope");
        this.f101267c = jVar;
        this.f101266b = bVar;
        this.f101268d = awVar;
    }

    /* renamed from: a */
    public final void mo40899a() {
        if (this.f101269e.compareAndSet(false, true)) {
            C38251j jVar = this.f101267c;
            C38255n nVar = C38255n.f101362a;
            C69664n.m101060f(nVar, "getDefaultInstance()");
            C70334de deVar = new C70334de();
            C69664n.m101061g(nVar, "request");
            C71594u.m104517d(C71486aq.m104308b(C71536cm.m104384b(C70748n.m103449b(jVar.f189039a, C38250i.m67534b(), nVar, jVar.f189040b, deVar), new C38205n(this, (C69577g) null)), new C38206o(this, (C69577g) null)), this.f101268d);
        }
    }
}
