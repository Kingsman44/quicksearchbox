package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import android.content.Context;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.C145914h;
import com.google.android.gms.search.C145915i;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.aa */
/* compiled from: PG */
public final class C103208aa {

    /* renamed from: a */
    private final C103211ad f287973a;

    /* renamed from: b */
    private final Context f287974b;

    protected C103208aa(Context context, C103211ad adVar) {
        this.f287974b = context;
        this.f287973a = adVar;
    }

    /* renamed from: a */
    public final C60870cx mo93708a(int i, int i2) {
        Context context = this.f287974b;
        C145914h hVar = new C145914h();
        hVar.f394478a = "NGA";
        C145948p a = C145891g.m237665a(context, new C145915i(hVar));
        C103211ad adVar = this.f287973a;
        return C43205e.m76192b(a.mo122337a(adVar.mo93714d(), adVar.mo93713c(), new String[]{adVar.mo93712b()}, i, i2, adVar.mo93711a()));
    }
}
