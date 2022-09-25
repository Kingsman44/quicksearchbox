package com.google.android.apps.gsa.queryentry;

import android.content.Intent;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38813f;
import com.google.common.p4522b.C58528ij;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.apps.gsa.queryentry.e */
/* compiled from: PG */
public final /* synthetic */ class C84243e implements C38813f {

    /* renamed from: a */
    public static final /* synthetic */ C84243e f229262a = new C84243e();

    private /* synthetic */ C84243e() {
    }

    /* renamed from: a */
    public final C71204an mo41657a(Intent intent) {
        C58528ij ijVar = C84244f.f229263a;
        String action = intent.getAction();
        if ("android.search.action.GLOBAL_SEARCH".equals(action)) {
            return C71204an.TEXT_SEARCH_QEA;
        }
        if (C84244f.f229263a.contains(action)) {
            return C71204an.VOICE_SEARCH_QEA;
        }
        return C71204an.OTHER;
    }
}
