package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.internal.C144918ag;
import com.google.android.gms.location.internal.C144930h;
import com.google.android.gms.location.internal.C144945w;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.location.ab */
/* compiled from: PG */
public final /* synthetic */ class C144871ab implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ GeofencingRequest f391818a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f391819b;

    public /* synthetic */ C144871ab(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f391818a = geofencingRequest;
        this.f391819b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        GeofencingRequest geofencingRequest = this.f391818a;
        PendingIntent pendingIntent = this.f391819b;
        C144874ae aeVar = new C144874ae((C146010af) obj2);
        C143919bh.m233971n(pendingIntent, "PendingIntent must be specified.");
        ((C144930h) ((C144918ag) obj).mo119451G()).mo120436g(geofencingRequest, pendingIntent, new C144945w(aeVar));
    }
}
