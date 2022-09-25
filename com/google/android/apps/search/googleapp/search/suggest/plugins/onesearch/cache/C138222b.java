package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import android.content.Context;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138396ar;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2476a.C32237k;
import com.google.android.libraries.search.p2476a.C32239m;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b */
/* compiled from: PG */
public final class C138222b implements C32237k {

    /* renamed from: a */
    public static final C59071e f376072a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f376073b;

    /* renamed from: c */
    public final C32239m f376074c;

    /* renamed from: d */
    private final C71422aw f376075d;

    /* renamed from: e */
    private final C47770dh f376076e;

    /* renamed from: f */
    private final boolean f376077f;

    /* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b$a */
    /* compiled from: PG */
    public interface C138223a {
        /* renamed from: cE */
        C138227f mo114204cE();

        /* renamed from: cI */
        C138396ar mo114205cI();
    }

    public C138222b(Context context, C32239m mVar, C21370a aVar, C71422aw awVar, C47770dh dhVar, boolean z) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f376073b = context;
        this.f376074c = mVar;
        this.f376075d = awVar;
        this.f376076e = dhVar;
        this.f376077f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38011a() {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.dh r0 = r3.f376076e
            java.lang.String r1 = "onPrimaryAccountChanged"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            r3.mo114203b()     // Catch:{ all -> 0x0010 }
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138222b.mo38011a():void");
    }

    /* renamed from: b */
    public final void mo114203b() {
        if (this.f376077f && C138221a.m224578a()) {
            C71803m.m105043d(this.f376075d, (C69585o) null, (C71424ay) null, new C138224c(this, (C69577g) null), 3);
        }
    }
}
