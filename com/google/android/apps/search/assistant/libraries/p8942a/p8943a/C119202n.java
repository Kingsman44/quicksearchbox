package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import android.content.Context;
import android.os.Build;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;
import com.google.android.apps.search.assistant.libraries.p8942a.C119206c;
import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.android.apps.search.assistant.libraries.p8942a.p8944b.p8945a.C119205a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.MessageLite;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.StringJoiner;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.n */
/* compiled from: PG */
public final class C119202n implements C119206c {

    /* renamed from: a */
    public static final C59071e f332431a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.a.a.n");

    /* renamed from: b */
    public static final C58528ij f332432b = new C58759qy(C119207d.FAILED_CONTENT_CAPTURE_MANAGER_IS_NULL);

    /* renamed from: c */
    public static final Duration f332433c = Duration.ofSeconds(10);

    /* renamed from: d */
    static final Duration f332434d = Duration.ofMinutes(30);

    /* renamed from: e */
    static final C59407o f332435e;

    /* renamed from: n */
    private static final Duration f332436n;

    /* renamed from: f */
    public final Context f332437f;

    /* renamed from: g */
    public final C60888db f332438g;

    /* renamed from: h */
    public final C60950i f332439h;

    /* renamed from: i */
    public final boolean f332440i;

    /* renamed from: j */
    public final ConcurrentHashMap f332441j = new ConcurrentHashMap();

    /* renamed from: k */
    public final Set f332442k = new CopyOnWriteArraySet();

    /* renamed from: l */
    public ContentCaptureManager f332443l;

    /* renamed from: m */
    public final C119205a f332444m;

    /* renamed from: o */
    private final AtomicInteger f332445o = new AtomicInteger();

    /* renamed from: p */
    private final C47632e f332446p;

    /* renamed from: q */
    private final C58889cz f332447q;

    static {
        Duration ofSeconds = Duration.ofSeconds(30);
        f332436n = ofSeconds;
        f332435e = new C59401i(C59407o.m92308d(ofSeconds), 2.0d, 3);
    }

    public C119202n(Context context, C119205a aVar, C60888db dbVar, C60950i iVar, C58889cz czVar, boolean z) {
        this.f332437f = context;
        this.f332444m = aVar;
        this.f332438g = dbVar;
        this.f332446p = new C47632e();
        this.f332439h = iVar;
        this.f332447q = czVar;
        this.f332440i = z;
    }

    /* renamed from: a */
    public final C60870cx mo104239a(DataShareRequest dataShareRequest, MessageLite messageLite) {
        if (dataShareRequest.getLocusId() == null) {
            return C60856cj.m92899h(new RuntimeException("LocusId is required for data share requests"));
        }
        StringJoiner add = new StringJoiner("_").add("shareData").add(dataShareRequest.getPackageName());
        if (dataShareRequest.getLocusId() != null) {
            add.add(dataShareRequest.getLocusId().getId());
        }
        String stringJoiner = add.toString();
        mo104241c(stringJoiner);
        return mo104240b(stringJoiner, this.f332439h.mo57444a(), dataShareRequest, messageLite, 0);
    }

    /* renamed from: b */
    public final C60870cx mo104240b(String str, Instant instant, DataShareRequest dataShareRequest, MessageLite messageLite, int i) {
        int andIncrement = this.f332445o.getAndIncrement();
        ((C59052c) ((C59052c) f332431a.mo56224b()).mo56372aa(34346)).mo56352E("#shareData for %s with pending task count: %d", dataShareRequest.getLocusId().getId(), andIncrement);
        C119205a aVar = this.f332444m;
        aVar.f332448a.mo41689d(Build.VERSION.SDK_INT, aVar.f332449b, aVar.mo104244b(), aVar.mo104243a(), dataShareRequest.getLocusId().getId(), andIncrement, i, "TOTAL");
        C58872ci d = C58872ci.m90947d(this.f332447q);
        MessageLite messageLite2 = messageLite;
        C47633f g = C47633f.m84733g(this.f332446p.mo51512b(new C119195g(this, dataShareRequest, messageLite2), this.f332438g));
        AtomicInteger atomicInteger = this.f332445o;
        Objects.requireNonNull(atomicInteger);
        g.mo4106b(new C119193e(atomicInteger), this.f332438g);
        String str2 = str;
        int i2 = andIncrement;
        C119201m mVar = new C119201m(this, str2, String.format("#shareData for %s", new Object[]{dataShareRequest.getLocusId().getId()}), i, instant, new C119196h(this, str2, instant, dataShareRequest, messageLite2, i));
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(mVar), this.f332438g);
        return g.mo51515h(new C119190b(this, dataShareRequest, i2, d, i), this.f332438g);
    }

    /* renamed from: c */
    public final void mo104241c(String str) {
        Optional.ofNullable((C60870cx) this.f332441j.remove(str)).ifPresent(C119194f.f332402a);
    }
}
