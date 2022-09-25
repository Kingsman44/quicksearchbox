package com.google.android.libraries.lens.p1995c.p1996a;

import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24072c;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24073d;

/* renamed from: com.google.android.libraries.lens.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C24089q implements C24069a {

    /* renamed from: a */
    public final /* synthetic */ C24091s f65790a;

    public /* synthetic */ C24089q(C24091s sVar) {
        this.f65790a = sVar;
    }

    /* renamed from: a */
    public final void mo29464a(C24073d dVar) {
        C24091s sVar = this.f65790a;
        int i = dVar.f65758d;
        int b = C24072c.m44703b(i);
        if (b != 0 && b == 2) {
            Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            intent.setPackage("com.google.android.googlequicksearchbox");
            try {
                if (!sVar.f65793b.bindService(intent, sVar, 65)) {
                    Log.e("LensServiceConnImpl", "Unable to bind Lens service.");
                    sVar.f65801j = 11;
                    sVar.mo29493i(7);
                    return;
                }
                sVar.mo29493i(3);
            } catch (SecurityException e) {
                Log.e("LensServiceConnImpl", "Unable to bind Lens service due to security exception.", e);
                sVar.f65801j = 11;
                sVar.mo29493i(7);
            }
        } else {
            int b2 = C24072c.m44703b(i);
            if (b2 == 0) {
                b2 = 1;
            }
            sVar.f65801j = b2;
            sVar.mo29493i(6);
        }
    }
}
