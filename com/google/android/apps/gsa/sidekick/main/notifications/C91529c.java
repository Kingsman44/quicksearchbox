package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.proactive.C84165c;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7874nd;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.c */
/* compiled from: PG */
public final /* synthetic */ class C91529c {
    /* renamed from: a */
    public static int m149709a(C91530d dVar) {
        C7718hj hjVar = (C7718hj) dVar.mo85892r().iterator().next();
        if ((hjVar.f26955a & 1073741824) == 0) {
            return 0;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        return C91502aq.m149663a(new C84165c(ndVar, hjVar));
    }

    /* renamed from: b */
    public static C7874nd m149710b(C91530d dVar) {
        C7874nd ndVar = ((C7718hj) dVar.mo85892r().iterator().next()).f26938J;
        return ndVar == null ? C7874nd.f27577J : ndVar;
    }
}
