package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bz */
/* compiled from: PG */
public final /* synthetic */ class C138451bz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138454cb f376608a;

    public /* synthetic */ C138451bz(C138454cb cbVar) {
        this.f376608a = cbVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        Duration duration = (Duration) obj;
        C138473cu cuVar = this.f376608a.f376617h;
        if (duration.equals(Duration.ofHours(2))) {
            str = "ZERO_PREFIX_CACHE_TWO_HOUR_BUCKET";
        } else if (duration.equals(Duration.ofHours(4))) {
            str = "ZERO_PREFIX_CACHE_FOUR_HOUR_BUCKET";
        } else if (duration.equals(Duration.ofHours(12))) {
            str = "ZERO_PREFIX_CACHE_TWELVE_HOUR_BUCKET";
        } else {
            if (duration.equals(Duration.ofHours(24))) {
                str = "ZERO_PREFIX_CACHE_TWENTYFOUR_HOUR_BUCKET";
            }
            return C60866ct.f164955a;
        }
        cuVar.mo114289a(str);
        return C60866ct.f164955a;
    }
}
