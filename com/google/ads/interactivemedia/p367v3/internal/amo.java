package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amo */
/* compiled from: PG */
public final class amo {

    /* renamed from: a */
    private final List f20985a = new ArrayList(1);

    /* renamed from: a */
    public final void mo14972a(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f20985a.add(adErrorListener);
    }

    /* renamed from: b */
    public final void mo14973b(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f20985a.remove(adErrorListener);
    }

    /* renamed from: c */
    public final void mo14974c() {
        this.f20985a.clear();
    }

    /* renamed from: d */
    public final void mo14975d(AdErrorEvent adErrorEvent) {
        for (AdErrorEvent.AdErrorListener onAdError : this.f20985a) {
            onAdError.onAdError(adErrorEvent);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20985a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("ErrorListenerSupport [errorListeners=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
