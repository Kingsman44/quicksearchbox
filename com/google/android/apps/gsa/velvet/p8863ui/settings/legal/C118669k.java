package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.social.licenses.License;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.k */
/* compiled from: PG */
public final class C118669k {

    /* renamed from: a */
    public static final C59071e f331044a = C59071e.m91332i("com.google.android.apps.gsa.velvet.ui.settings.legal.k");

    /* renamed from: b */
    public final Context f331045b;

    /* renamed from: c */
    public final C22871g f331046c;

    /* renamed from: d */
    public final C22871g f331047d;

    /* renamed from: e */
    public final C118659a f331048e;

    /* renamed from: f */
    public final HashMap f331049f = new HashMap();

    /* renamed from: g */
    public C60870cx f331050g;

    public C118669k(Context context, C22871g gVar, C22871g gVar2, C118659a aVar) {
        this.f331045b = context;
        this.f331046c = gVar;
        this.f331047d = gVar2;
        this.f331048e = aVar;
    }

    /* renamed from: a */
    public final void mo103850a(License license, C118668j jVar) {
        C60870cx cxVar = (C60870cx) this.f331049f.get(license);
        if (cxVar == null) {
            cxVar = this.f331046c.mo28201a("LoadLicenseTextTask", new C118665g(this, license));
            this.f331049f.put(license, cxVar);
        }
        this.f331047d.mo28211k(cxVar, "LoadLicenseTextCallback", new C118667i(jVar, license));
    }
}
