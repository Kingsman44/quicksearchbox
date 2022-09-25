package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118335x;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.y */
/* compiled from: PG */
public final /* synthetic */ class C98234y implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274270a;

    /* renamed from: b */
    public final /* synthetic */ C7708h f274271b;

    /* renamed from: c */
    public final /* synthetic */ boolean f274272c;

    public /* synthetic */ C98234y(C98211bl blVar, C7708h hVar, boolean z) {
        this.f274270a = blVar;
        this.f274271b = hVar;
        this.f274272c = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C98211bl blVar = this.f274270a;
        C7708h hVar = this.f274271b;
        boolean z = this.f274272c;
        C118335x g = blVar.f274218h.mo91761g();
        long j = 1;
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274457a, 1));
        C118302a aVar = C98324af.f274458b;
        C7681g a = C7681g.m22802a(hVar.f26897b);
        if (a == null) {
            a = C7681g.INVALID;
        }
        g.f328476c.mo55395g(C118328s.m196511c(aVar, (long) a.f26835cv));
        if (true != z) {
            j = 0;
        }
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274462f, j));
        return blVar.f274225o.mo28209i(blVar.f274218h.mo91763i(g.mo103674a()), "getExecutedUserActionsForAction", C98179ag.f274155a);
    }
}
