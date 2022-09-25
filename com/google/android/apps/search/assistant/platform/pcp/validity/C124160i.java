package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.android.apps.search.assistant.platform.pcp.crossprofile.C123687w;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.i */
/* compiled from: PG */
public final /* synthetic */ class C124160i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124166o f342882a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f342883b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f342884c;

    public /* synthetic */ C124160i(C124166o oVar, C58485gu guVar, C58485gu guVar2) {
        this.f342882a = oVar;
        this.f342883b = guVar;
        this.f342884c = guVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124166o oVar = this.f342882a;
        C58485gu guVar = this.f342883b;
        C58485gu guVar2 = this.f342884c;
        oVar.f342895a.mo106055b(guVar, 1, (Instant) null);
        if (!guVar2.isEmpty()) {
            C124100bz bzVar = oVar.f342900f;
            C58801sm G = guVar2.listIterator(0);
            while (G.hasNext()) {
                C39141kp kpVar = bzVar.f342762a;
                int i = ((C53306j) G.next()).f139793X;
                kpVar.mo41704s("WORK_PROFILE_NOTIFICATIONS_TO_CLIENT_TYPE_" + i);
            }
            ((C123687w) oVar.f342899e.mo27525b()).mo106091e(guVar2);
        }
        return C60866ct.f164955a;
    }
}
