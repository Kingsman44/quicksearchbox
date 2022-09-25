package com.google.android.libraries.lens.view.session;

import android.location.Location;
import com.google.android.gms.location.C144889at;
import com.google.android.libraries.lens.view.main.C27304au;

/* renamed from: com.google.android.libraries.lens.view.session.ac */
/* compiled from: PG */
public final /* synthetic */ class C27740ac implements C144889at {

    /* renamed from: a */
    public final /* synthetic */ C27747aj f75727a;

    public /* synthetic */ C27740ac(C27747aj ajVar) {
        this.f75727a = ajVar;
    }

    /* renamed from: a */
    public final void mo21006a(Location location) {
        C27304au auVar;
        C27747aj ajVar = this.f75727a;
        ajVar.f75740h = location;
        ajVar.f75741i = location;
        synchronized (ajVar.f75739g) {
            auVar = ajVar.f75742j;
            if (auVar != null) {
                ajVar.f75742j = null;
            } else {
                auVar = null;
            }
        }
        if (auVar != null) {
            auVar.f74717a.mo32886r();
        }
    }
}
