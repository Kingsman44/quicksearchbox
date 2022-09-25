package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.f */
/* compiled from: PG */
public final class C105398f implements C105397e {

    /* renamed from: a */
    private final C23112h f294021a;

    public C105398f(C23112h hVar) {
        this.f294021a = hVar;
    }

    /* renamed from: t */
    public final void mo94689t(long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("firstVisibleContentIdHash", Long.valueOf(j).longValue());
        bundle.putLong("lastVisibleContentIdHash", Long.valueOf(j2).longValue());
        this.f294021a.mo28345s("onScrollingInfiniteFeedUpdate_long_long", "InfiniteFeedEventsDispatcher", bundle);
    }
}
