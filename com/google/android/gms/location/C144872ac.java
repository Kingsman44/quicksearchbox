package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.internal.C144918ag;
import com.google.android.gms.location.internal.C144930h;
import com.google.android.gms.location.internal.C144945w;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.location.ac */
/* compiled from: PG */
public final /* synthetic */ class C144872ac implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f391820a;

    public /* synthetic */ C144872ac(PendingIntent pendingIntent) {
        this.f391820a = pendingIntent;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.f391820a;
        C144918ag agVar = (C144918ag) obj;
        C144874ae aeVar = new C144874ae((C146010af) obj2);
        C143919bh.m233971n(pendingIntent, "PendingIntent must be specified.");
        ((C144930h) agVar.mo119451G()).mo120440k(pendingIntent, new C144945w(aeVar), agVar.f390156t.getPackageName());
    }
}
