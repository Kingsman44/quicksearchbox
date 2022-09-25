package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.internal.C144918ag;
import com.google.android.gms.location.internal.C144930h;
import com.google.android.gms.location.internal.C144945w;
import com.google.android.gms.tasks.C146010af;
import java.util.List;

/* renamed from: com.google.android.gms.location.ad */
/* compiled from: PG */
public final /* synthetic */ class C144873ad implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ List f391821a;

    public /* synthetic */ C144873ad(List list) {
        this.f391821a = list;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        List list = this.f391821a;
        C144918ag agVar = (C144918ag) obj;
        C144874ae aeVar = new C144874ae((C146010af) obj2);
        C143919bh.m233960c(list != null && !list.isEmpty(), "geofenceRequestIds can't be null nor empty.");
        ((C144930h) agVar.mo119451G()).mo120441l((String[]) list.toArray(new String[0]), new C144945w(aeVar), agVar.f390156t.getPackageName());
    }
}
