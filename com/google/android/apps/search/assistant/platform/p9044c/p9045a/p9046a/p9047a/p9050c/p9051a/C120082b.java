package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.b */
/* compiled from: PG */
public final class C120082b {
    /* renamed from: a */
    public static final C33514d m199006a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("com.google.voicesearch.VI_INTENT")) {
            return null;
        }
        Intent intent = (Intent) bundle.getParcelable("com.google.voicesearch.VI_INTENT");
        if (intent != null) {
            long longExtra = intent.getLongExtra("APA_SESSION_ID", -1);
            if (longExtra == -1) {
                return null;
            }
            return new C33514d(longExtra);
        }
        throw new IllegalStateException("Voice interaction intent is missing.");
    }
}
