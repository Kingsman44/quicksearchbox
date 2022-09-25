package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.search.Query;

/* renamed from: com.google.android.apps.gsa.speech.audio.r */
/* compiled from: PG */
public final class C92207r {
    /* renamed from: a */
    public static boolean m151409a(Query query, C90021c cVar) {
        boolean bw = query.mo84363bw("android.speech.extra.BEEP_SUPPRESSED");
        boolean bw2 = query.mo84363bw("android.speech.extra.TALKBACK_ENABLED");
        boolean z = !bw && ((cVar.mo79746e(C90082eg.f250044da) && query.mo84447db()) || query.mo84326bK());
        if (bw2 || query.mo84412cs() || query.mo84319bD() || (query.mo84447db() && !z)) {
            return false;
        }
        return true;
    }
}
