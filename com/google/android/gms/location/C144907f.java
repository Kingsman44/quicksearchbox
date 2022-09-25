package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.location.f */
/* compiled from: PG */
public final class C144907f extends C143847s {
    public C144907f(Context context) {
        super(context, (Activity) null, C144894ay.f391842a, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo120399a(PendingIntent pendingIntent) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144905d(pendingIntent);
        dcVar.f389863d = 2406;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo120400b(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.f391738e = this.f389932x;
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144904c(activityTransitionRequest, pendingIntent);
        dcVar.f389863d = 2405;
        return super.mo119290u(1, dcVar.mo119260a());
    }
}
