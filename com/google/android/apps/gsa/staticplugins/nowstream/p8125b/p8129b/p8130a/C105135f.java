package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8130a;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.b.a.f */
/* compiled from: PG */
public final class C105135f implements C105134e {

    /* renamed from: a */
    private final C23112h f293103a;

    public C105135f(C23112h hVar) {
        this.f293103a = hVar;
    }

    /* renamed from: a */
    public final void mo94582a() {
        this.f293103a.mo28345s("onPullToRefreshEntries", "SecondScreenEventsDispatcher", new Bundle());
    }

    /* renamed from: b */
    public final void mo94583b(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrolledToTarget", Boolean.valueOf(z).booleanValue());
        this.f293103a.mo28345s("onRenderComplete_boolean", "SecondScreenEventsDispatcher", bundle);
    }

    /* renamed from: c */
    public final void mo94584c(int i, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("streamPosition", Integer.valueOf(i).intValue());
        bundle.putInt("streamOffset", Integer.valueOf(i2).intValue());
        bundle.putBoolean("jumpToTop", Boolean.valueOf(z).booleanValue());
        this.f293103a.mo28345s("onScrollPositionUpdated_int_int_boolean", "SecondScreenEventsDispatcher", bundle);
    }

    /* renamed from: d */
    public final void mo94585d(ProtoParcelable protoParcelable, int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("veInfo", new LazyParcelable((Parcelable) protoParcelable));
        bundle.putInt("scrollAmount", Integer.valueOf(i).intValue());
        bundle.putLong("timestamp", Long.valueOf(j).longValue());
        this.f293103a.mo28345s("reportViewHorizontallyScrolled_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_int_long", "SecondScreenEventsDispatcher", bundle);
    }

    /* renamed from: g */
    public final void mo94586g(long j, C58485gu guVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("timestamp", Long.valueOf(j).longValue());
        ImmutableListUtils.m43582f("visualElementBounds", guVar, bundle);
        this.f293103a.mo28345s("reportViews_long_com.google.common.collect.ImmutableList<com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable>", "SecondScreenEventsDispatcher", bundle);
    }

    /* renamed from: je */
    public final void mo94587je(Rect rect, long j) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("bounds", new LazyParcelable((Parcelable) rect));
        bundle.putLong("timestamp", Long.valueOf(j).longValue());
        this.f293103a.mo28345s("reportViewport_android.graphics.Rect_long", "SecondScreenEventsDispatcher", bundle);
    }

    /* renamed from: jf */
    public final void mo94588jf(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("timestamp", Long.valueOf(j).longValue());
        this.f293103a.mo28345s("reportViewportHidden_long", "SecondScreenEventsDispatcher", bundle);
    }
}
