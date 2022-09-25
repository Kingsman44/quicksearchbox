package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import androidx.core.p098j.C2050bp;
import com.facebook.litho.widget.C6474cf;
import com.facebook.litho.widget.C6552q;
import com.facebook.litho.widget.DiscoverStaggeredGridLayoutInfo;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134465c;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.performance.primes.metrics.p2409d.C31399t;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.g */
/* compiled from: PG */
public final class C134898g {

    /* renamed from: a */
    public static final C59071e f367233a = C59071e.m91331h();

    /* renamed from: b */
    public final DiscoverRecyclerView f367234b;

    /* renamed from: c */
    public final boolean f367235c;

    /* renamed from: d */
    public final C134465c f367236d;

    /* renamed from: e */
    public final C31399t f367237e;

    /* renamed from: f */
    public final C134766q f367238f;

    /* renamed from: g */
    public final C6474cf f367239g;

    /* renamed from: h */
    public final C134846bf f367240h;

    /* renamed from: i */
    public Duration f367241i = Duration.ofMillis(250);

    /* renamed from: j */
    public Duration f367242j = Duration.ofMillis(250);

    /* renamed from: k */
    public boolean f367243k;

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f367244l = new C134896e(this);

    public C134898g(DiscoverRecyclerView discoverRecyclerView, boolean z, C134465c cVar, C31399t tVar, C134766q qVar, C6474cf cfVar, C134846bf bfVar) {
        C69664n.m101061g(cVar, "viewLoggingItemAnimator");
        C69664n.m101061g(tVar, "jankMetricService");
        C69664n.m101061g(qVar, "tngDiscoverSurface");
        C69664n.m101061g(cfVar, "recyclerBinder");
        C69664n.m101061g(bfVar, "recyclerBinderManager");
        this.f367234b = discoverRecyclerView;
        this.f367235c = z;
        this.f367236d = cVar;
        this.f367237e = tVar;
        this.f367238f = qVar;
        this.f367239g = cfVar;
        this.f367240h = bfVar;
    }

    /* renamed from: a */
    public final View mo112049a(int i) {
        C0653fo foVar = this.f367234b.mLayout;
        if (foVar != null) {
            return foVar.findViewByPosition(i);
        }
        return null;
    }

    /* renamed from: b */
    public final Integer mo112050b() {
        int i;
        C0653fo foVar = this.f367234b.mLayout;
        if (foVar == null) {
            return null;
        }
        if (this.f367235c) {
            i = C6552q.m17847b(((DiscoverStaggeredGridLayoutInfo.DiscoverLithoStaggeredGridLayoutManager) foVar).mo8517o((int[]) null));
        } else {
            i = ((LinearLayoutManager) foVar).findFirstVisibleItemPosition();
        }
        if (i != -1) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: c */
    public final Integer mo112051c() {
        int i;
        C0653fo foVar = this.f367234b.mLayout;
        if (foVar == null) {
            return null;
        }
        if (this.f367235c) {
            i = C6552q.m17846a(((DiscoverStaggeredGridLayoutInfo.DiscoverLithoStaggeredGridLayoutManager) foVar).mo8520r());
        } else {
            i = ((LinearLayoutManager) foVar).findLastVisibleItemPosition();
        }
        if (i != -1) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: d */
    public final C69731k mo112052d() {
        C69731k h = C69734n.m101140h(C2050bp.m5609a(this.f367234b), C134897f.f367232a);
        C69664n.m101059e(h, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return h;
    }

    /* renamed from: e */
    public final void mo112053e(Duration duration, Duration duration2) {
        C0646fh fhVar = this.f367234b.mItemAnimator;
        if (fhVar != null) {
            fhVar.f2411k = duration.toMillis();
        }
        C0646fh fhVar2 = this.f367234b.mItemAnimator;
        if (fhVar2 != null) {
            fhVar2.f2410j = duration2.toMillis();
        }
    }
}
