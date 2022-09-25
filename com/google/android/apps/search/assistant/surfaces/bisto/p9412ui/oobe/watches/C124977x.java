package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9388c.C124532d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124729a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58844bh;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59405m;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4543n.p4546c.C59415w;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C63088z;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.x */
/* compiled from: PG */
public final class C124977x {

    /* renamed from: a */
    public static final C59071e f344835a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.x");

    /* renamed from: b */
    public static final Duration f344836b = Duration.ofSeconds(1);

    /* renamed from: j */
    private static final Duration f344837j;

    /* renamed from: k */
    private static final C59407o f344838k;

    /* renamed from: c */
    public final C60888db f344839c;

    /* renamed from: d */
    public final C60888db f344840d;

    /* renamed from: e */
    public final C124729a f344841e;

    /* renamed from: f */
    public final boolean f344842f;

    /* renamed from: g */
    public final boolean f344843g;

    /* renamed from: h */
    final C124978y f344844h = ((C124978y) C124979z.f344847e.createBuilder());

    /* renamed from: i */
    public final C124532d f344845i;

    /* renamed from: l */
    private final Duration f344846l;

    static {
        Duration ofSeconds = Duration.ofSeconds(2);
        f344837j = ofSeconds;
        f344838k = new C59405m(new C59401i(C59407o.m92308d(ofSeconds), 2.0d, 5), 0.5d);
    }

    public C124977x(C60888db dbVar, C60888db dbVar2, C124729a aVar, C124532d dVar, long j, boolean z, boolean z2) {
        this.f344839c = dbVar;
        this.f344840d = dbVar2;
        this.f344841e = aVar;
        this.f344845i = dVar;
        C60948g gVar = C60948g.f165068a;
        this.f344846l = Duration.ofMillis(j);
        this.f344842f = z;
        this.f344843g = z2;
    }

    /* renamed from: a */
    public final C60870cx mo106757a(String str, String str2) {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        C124978y yVar = this.f344844h;
        C63088z A = C63088z.m96139A(bArr);
        yVar.copyOnWrite();
        C124979z zVar = (C124979z) yVar.instance;
        C124979z zVar2 = C124979z.f344847e;
        zVar.f344849a |= 1;
        zVar.f344850b = A;
        C58485gu i = C58485gu.m89841i(f344838k.mo56924f(C58889cz.f156731b));
        AtomicReference atomicReference = new AtomicReference();
        Logger logger = C59417y.f157631a;
        return C47633f.m84733g(C60846c.m92878g(C59415w.m92318a(C47810es.m84964d(new C124976w(this, i, atomicReference, str, str2, bArr)), new C124975v(atomicReference, i), C58844bh.ALWAYS_TRUE, C58836b.f156633a, C58833ax.m90834k(this.f344839c), C58889cz.f156731b, C59417y.f157633i), Exception.class, C47810es.m84963c(C124973t.f344822a), this.f344839c)).mo51515h(new C124967n(this), this.f344839c).mo51517j(this.f344846l.toMillis(), TimeUnit.MILLISECONDS, this.f344839c).mo51513e(Exception.class, C124968o.f344815a, C60826bg.f164896a);
    }
}
