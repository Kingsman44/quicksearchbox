package com.google.android.apps.gsa.speech.hotword.p7285c.p7288c;

import com.google.android.apps.gsa.shared.p7045k.C89796ad;
import com.google.android.apps.gsa.shared.p7045k.C89809e;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.c.h */
/* compiled from: PG */
public final class C92370h {
    /* renamed from: a */
    public static String m151688a(C89809e eVar) {
        int i;
        boolean j = eVar.mo83656j();
        StringBuilder sb = new StringBuilder();
        sb.append(true != j ? "http" : "https");
        sb.append(":/");
        sb.append(eVar.mo83652g());
        sb.append(":");
        if (j) {
            i = 8443;
        } else {
            i = C89796ad.m146181a().f243056a ? C89796ad.m146181a().f243057b : 8008;
        }
        sb.append(i);
        sb.append("/setup/assistant/check_ready_status");
        return sb.toString();
    }
}
