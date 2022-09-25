package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.api.internal.C143803cx;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.internal.C144918ag;
import com.google.android.gms.location.internal.C144930h;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.location.c */
/* compiled from: PG */
public final /* synthetic */ class C144904c implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ ActivityTransitionRequest f391848a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f391849b;

    public /* synthetic */ C144904c(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.f391848a = activityTransitionRequest;
        this.f391849b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        ActivityTransitionRequest activityTransitionRequest = this.f391848a;
        PendingIntent pendingIntent = this.f391849b;
        C144906e eVar = new C144906e((C146010af) obj2);
        C143919bh.m233971n(pendingIntent, "PendingIntent must be specified.");
        ((C144930h) ((C144918ag) obj).mo119451G()).mo120442m(activityTransitionRequest, pendingIntent, new C143803cx(eVar));
    }
}
