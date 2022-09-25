package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143783cd;
import com.google.android.gms.location.C144889at;
import com.google.android.gms.location.C144977y;

/* renamed from: com.google.android.gms.location.internal.ad */
/* compiled from: PG */
final class C144915ad implements C143783cd {

    /* renamed from: a */
    final /* synthetic */ C144916ae f391879a;

    public C144915ad(C144916ae aeVar) {
        this.f391879a = aeVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo118340b(Object obj) {
        C143782cc ccVar;
        C144889at atVar = (C144889at) obj;
        C144946x xVar = this.f391879a.f391880a;
        synchronized (xVar) {
            ((C144977y) xVar).f391947b = false;
            ccVar = ((C144977y) xVar).f391946a.f389806b;
        }
        if (ccVar != null) {
            ((C144977y) xVar).f391948c.mo119292w(ccVar, 2441);
        }
    }

    /* renamed from: c */
    public final void mo118341c() {
    }
}
