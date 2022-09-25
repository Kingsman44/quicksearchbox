package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.search.shared.p6930h.C87567j;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38813f;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ml */
/* compiled from: PG */
public final /* synthetic */ class C109473ml implements C38813f {

    /* renamed from: a */
    public static final /* synthetic */ C109473ml f304926a = new C109473ml();

    private /* synthetic */ C109473ml() {
    }

    /* renamed from: a */
    public final C71204an mo41657a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return C71204an.OTHER;
        }
        int a = C87567j.m142328a(extras);
        e a2 = C87564g.m142223a(extras);
        if (e.bu.equals(a2)) {
            if (a == 1) {
                return C71204an.OPA_LONG_PRESS_HOME_TEXT_INPUT;
            }
            return C71204an.OPA_LONG_PRESS_HOME_VOICE_INPUT;
        } else if (e.aU.equals(a2)) {
            if (a == 0) {
                return C71204an.OPA_HOTWORD_VOICE_INPUT;
            }
            return C71204an.OPA_OTHER;
        } else if (!e.bB.equals(a2)) {
            return C71204an.OPA_OTHER;
        } else {
            if (a == 1) {
                return C71204an.OPA_SHELL_APP_TEXT_INPUT;
            }
            return C71204an.OPA_SHELL_APP_VOICE_INPUT;
        }
    }
}
