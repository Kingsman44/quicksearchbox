package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: com.google.android.gms.googlehelp.internal.common.aj */
/* compiled from: PG */
public final class C144304aj {
    /* renamed from: a */
    public static final void m234565a(Context context, C144189a aVar, C144280a aVar2, long j, GoogleHelp googleHelp) {
        if (aVar2 != null) {
            googleHelp.f390738A = true;
            m234567c(new C144308c(context, googleHelp, j), 4);
        }
        if (aVar != null) {
            googleHelp.f390739B = true;
            Context context2 = context;
            GoogleHelp googleHelp2 = googleHelp;
            C144189a aVar3 = aVar;
            long j2 = j;
            m234567c(new C144294a(context2, googleHelp2, aVar3, j2), 4);
            m234567c(new C144307b(context2, googleHelp2, aVar3, j2), 4);
        }
    }

    /* renamed from: b */
    public static final void m234566b(C144280a aVar, C144310e eVar, GoogleHelp googleHelp) {
        if (aVar == null) {
            eVar.mo119850a(googleHelp);
        } else {
            m234567c(new C144311f(googleHelp, aVar, eVar), 10);
        }
    }

    /* renamed from: c */
    private static final void m234567c(Runnable runnable, int i) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(i);
        thread.start();
    }
}
