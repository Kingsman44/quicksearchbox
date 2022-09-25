package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.content.Context;
import android.content.Intent;
import com.google.android.enterprise.connectedapps.C142563c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.al */
/* compiled from: PG */
public final class C101730al implements C101725ag {

    /* renamed from: a */
    private final C101722ad f283827a;

    public C101730al(C101722ad adVar) {
        this.f283827a = adVar;
    }

    /* renamed from: a */
    public final C60870cx mo92529a(Intent intent, String str) {
        C101756w wVar;
        C101722ad adVar = this.f283827a;
        if (adVar.f283820a.mo117178i().mo117185a().mo117171a()) {
            Context context = ((C142563c) adVar.f283820a).f386843a;
            C101754u uVar = C101754u.f283846a;
            wVar = new C101751r(C101754u.m168366a(((C142563c) adVar.f283820a).f386843a));
        } else {
            wVar = new C101755v(adVar.f283820a);
        }
        return wVar.mo92538a(intent);
    }
}
