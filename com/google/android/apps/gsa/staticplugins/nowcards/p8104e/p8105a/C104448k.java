package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.k */
/* compiled from: PG */
public final class C104448k implements C104447j {

    /* renamed from: a */
    private final C23112h f290572a;

    public C104448k(C23112h hVar) {
        this.f290572a = hVar;
    }

    /* renamed from: f */
    public final void mo94181f(String str, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("durationMs", Integer.valueOf(i).intValue());
        bundle.putInt("index", Integer.valueOf(i2).intValue());
        this.f290572a.mo28345s("reportAdView_java.lang.String_int_int", "CardEventsDispatcher", bundle);
    }
}
