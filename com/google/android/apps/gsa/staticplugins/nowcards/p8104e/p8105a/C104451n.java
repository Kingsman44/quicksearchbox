package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.n */
/* compiled from: PG */
public final class C104451n implements C104450m {

    /* renamed from: a */
    private final C23112h f290574a;

    public C104451n(C23112h hVar) {
        this.f290574a = hVar;
    }

    /* renamed from: b */
    public final void mo86301b(int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("scrollAmount", Integer.valueOf(i).intValue());
        bundle.putLong("scrollEndTimestamp", Long.valueOf(j).longValue());
        this.f290574a.mo28345s("onScrollEvent_int_long", "CarouselEventsDispatcher", bundle);
    }

    /* renamed from: c */
    public final void mo94182c(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("unlocked", Boolean.valueOf(z).booleanValue());
        this.f290574a.mo28345s("onCarouselLockUpdateEvent_boolean", "CarouselEventsDispatcher", bundle);
    }

    /* renamed from: d */
    public final void mo94183d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("position", Integer.valueOf(i).intValue());
        bundle.putInt("offset", Integer.valueOf(i2).intValue());
        this.f290574a.mo28345s("onCarouselPositionUpdateEvent_int_int", "CarouselEventsDispatcher", bundle);
    }
}
