package com.google.android.libraries.search.assistant.proactive.p2775g;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.assistant.p3803ag.p3809c.C49057ew;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.u */
/* compiled from: PG */
public final class C36300u implements C36297r {

    /* renamed from: a */
    public final C21370a f94794a;

    /* renamed from: b */
    private final Uri f94795b;

    /* renamed from: c */
    private final C42880af f94796c;

    /* renamed from: d */
    private final Executor f94797d;

    public C36300u(Context context, C42880af afVar, C21370a aVar, Executor executor) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("opa");
        a.f111968c = "opa";
        a.mo45821b("NotificationClientTrackingRecords.pb");
        this.f94795b = a.mo45820a();
        this.f94796c = afVar;
        this.f94794a = aVar;
        this.f94797d = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = (java.lang.Integer) r2.get(r3);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m64779d(p3186j$.time.Instant r1, java.util.Map r2, int r3, p3186j$.time.Instant r4) {
        /*
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L_0x0027
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0027
            int r2 = r2.intValue()
            long r2 = (long) r2
            j$.time.Duration r2 = p3186j$.time.Duration.ofHours(r2)
            j$.time.Instant r1 = r1.minus(r2)
            boolean r1 = r1.isBefore(r4)
            if (r1 == 0) goto L_0x0027
            r1 = 1
            return r1
        L_0x0027:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.p2775g.C36300u.m64779d(j$.time.Instant, java.util.Map, int, j$.time.Instant):boolean");
    }

    /* renamed from: e */
    private final C42876ab m64780e() {
        C42880af afVar = this.f94796c;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f94795b);
        i.mo45967d(C49057ew.f126896b);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: a */
    public final C60870cx mo40095a() {
        return m64780e().mo46042d();
    }

    /* renamed from: b */
    public final C60870cx mo40096b(Map map, Map map2, Duration duration) {
        return m64780e().mo46039a(new C36298s(this, map, map2, duration), this.f94797d);
    }

    /* renamed from: c */
    public final C60870cx mo40097c(int i, int i2, int i3, boolean z, int i4) {
        return m64780e().mo46039a(new C36299t(this, i4, i2, i, z, i3), this.f94797d);
    }
}
