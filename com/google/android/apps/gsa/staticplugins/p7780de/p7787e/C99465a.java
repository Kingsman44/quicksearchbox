package com.google.android.apps.gsa.staticplugins.p7780de.p7787e;

import android.os.Bundle;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.e.a */
/* compiled from: PG */
public final /* synthetic */ class C99465a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C99466b f278334a;

    public /* synthetic */ C99465a(C99466b bVar) {
        this.f278334a = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C99466b bVar = this.f278334a;
        Bundle applicationRestrictions = bVar.f278336b.getApplicationRestrictions(bVar.f278335a.getPackageName());
        if (applicationRestrictions != null) {
            return Boolean.valueOf(applicationRestrictions.getBoolean("enable_google_search", true));
        }
        return true;
    }
}
