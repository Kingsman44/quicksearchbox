package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import com.google.android.libraries.search.assistant.p2697j.p2698a.C34747o;
import com.google.android.libraries.search.assistant.p2697j.p2698a.p2699a.C34733h;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71570dt;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.v */
/* compiled from: PG */
public final class C34524v {

    /* renamed from: a */
    public final C32160b f91754a;

    /* renamed from: b */
    public final C46128f f91755b;

    /* renamed from: c */
    public final C46194e f91756c;

    /* renamed from: d */
    public final C71553dc f91757d;

    /* renamed from: e */
    private final C71422aw f91758e;

    public C34524v(C32160b bVar, C46128f fVar, C46194e eVar, C71422aw awVar) {
        C69664n.m101061g(bVar, "accountManager");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91754a = bVar;
        this.f91755b = fVar;
        this.f91756c = eVar;
        this.f91758e = awVar;
        C71587n a = C71471ab.m104286a(C34733h.m63473a("LEGACY_HOTWORD_CONSUMER_ACCOUNT", new C34519q(this, (C69577g) null), new C34522t(this), awVar));
        int i = C71562dl.f190976a;
        this.f91757d = C34747o.m63497a(a, awVar, new C71570dt(5000, 0));
    }
}
