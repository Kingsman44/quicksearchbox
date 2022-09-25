package com.google.android.apps.search.googleapp.activity;

import android.content.Intent;
import com.google.android.apps.search.googleapp.p10310h.C136126g;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38813f;
import p3186j$.util.Optional;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.apps.search.googleapp.activity.ap */
/* compiled from: PG */
final class C133392ap implements C38813f {
    /* renamed from: a */
    public final C71204an mo41657a(Intent intent) {
        Optional e = C136126g.m221191e(intent);
        if (e.isEmpty() || e.get() == C139779t.HOME_SCREEN) {
            return C71204an.DISCOVER_GOOGLE_APP;
        }
        if (!e.isPresent() || e.get() != C139779t.SEARCH) {
            return C71204an.OTHER;
        }
        Optional c = C136126g.m221189c(intent);
        if (!c.isPresent() || !((C137418g) c.get()).f373776h) {
            return C71204an.TEXT_SEARCH_GOOGLE_APP;
        }
        return C71204an.VOICE_SEARCH_GOOGLE_APP;
    }
}
