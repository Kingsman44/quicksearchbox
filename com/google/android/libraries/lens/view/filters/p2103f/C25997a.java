package com.google.android.libraries.lens.view.filters.p2103f;

import android.app.Activity;
import android.location.LocationManager;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25983g;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25984h;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.filters.f.a */
/* compiled from: PG */
public final class C25997a extends C25983g {

    /* renamed from: a */
    private final C26005i f70651a;

    public C25997a(Activity activity, C25537t tVar, C25225bd bdVar, C25504aj ajVar, C28310af afVar, C28443m mVar, C28306ab abVar, C47770dh dhVar, C24974a aVar) {
        C26005i iVar = new C26005i();
        this.f70651a = iVar;
        iVar.f70658a = activity;
        iVar.f70659b = tVar;
        iVar.f70660c = bdVar;
        iVar.f70661d = ajVar;
        iVar.f70662e = afVar;
        iVar.f70663f = mVar;
        iVar.f70664g = abVar;
        iVar.f70665h = dhVar;
        iVar.f70666i = aVar;
        iVar.f70667j = (LocationManager) activity.getSystemService("location");
    }

    /* renamed from: a */
    public final C25984h mo31200a() {
        return this.f70651a;
    }
}
