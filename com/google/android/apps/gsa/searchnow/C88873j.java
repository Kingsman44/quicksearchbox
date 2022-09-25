package com.google.android.apps.gsa.searchnow;

import android.content.Intent;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38813f;
import com.google.common.p4522b.C58528ij;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.apps.gsa.searchnow.j */
/* compiled from: PG */
public final /* synthetic */ class C88873j implements C38813f {

    /* renamed from: a */
    public static final /* synthetic */ C88873j f240650a = new C88873j();

    private /* synthetic */ C88873j() {
    }

    /* renamed from: a */
    public final C71204an mo41657a(Intent intent) {
        C58528ij ijVar = C88874k.f240651a;
        String action = intent.getAction();
        if ("android.intent.action.MAIN".equals(action)) {
            String stringExtra = intent.getStringExtra("source");
            if (!intent.hasExtra("commit-query") || stringExtra == null || !stringExtra.startsWith("and.now.n")) {
                return C71204an.INTERESTS_TAB_SNA;
            }
            return C71204an.NOTIFICATION_SEARCH_SNA;
        } else if ("android.search.action.GLOBAL_SEARCH".equals(action)) {
            return C71204an.TEXT_SEARCH_SNA;
        } else {
            if (C88874k.f240651a.contains(action)) {
                return C71204an.VOICE_SEARCH_SNA;
            }
            return C71204an.OTHER;
        }
    }
}
