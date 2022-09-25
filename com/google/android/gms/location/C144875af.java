package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;
import java.util.List;

/* renamed from: com.google.android.gms.location.af */
/* compiled from: PG */
public final class C144875af extends C143847s {
    public C144875af(Context context) {
        super(context, (Activity) null, C144894ay.f391842a, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo120367a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        GeofencingRequest geofencingRequest2 = new GeofencingRequest(geofencingRequest.f391752a, geofencingRequest.f391753b, geofencingRequest.f391754c, this.f389932x);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144871ab(geofencingRequest2, pendingIntent);
        dcVar.f389863d = 2424;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo120368b(PendingIntent pendingIntent) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144872ac(pendingIntent);
        dcVar.f389863d = 2425;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo120369c(List list) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144873ad(list);
        dcVar.f389863d = 2425;
        return super.mo119290u(1, dcVar.mo119260a());
    }
}
