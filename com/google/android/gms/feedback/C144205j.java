package com.google.android.gms.feedback;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143768bp;

/* renamed from: com.google.android.gms.feedback.j */
/* compiled from: PG */
public final class C144205j {

    /* renamed from: a */
    public static final Status f390618a = new Status(1, 13, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: b */
    public static final C143841m f390619b;

    /* renamed from: c */
    private static final C143840l f390620c;

    /* renamed from: d */
    private static final C143707a f390621d;

    static {
        C143840l lVar = new C143840l();
        f390620c = lVar;
        C144199d dVar = new C144199d();
        f390621d = dVar;
        f390619b = new C143841m("Feedback.API", dVar, lVar);
    }

    /* renamed from: a */
    public static C143854z m234444a(C143851w wVar, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        C144203h hVar = new C144203h(wVar, feedbackOptions, bundle, j);
        wVar.mo119159d(hVar);
        return hVar;
    }

    /* renamed from: b */
    public static C143854z m234445b(C143851w wVar, Bundle bundle, long j) {
        C144202g gVar = new C144202g(wVar, bundle, j);
        wVar.mo119159d(gVar);
        return gVar;
    }

    @Deprecated
    /* renamed from: c */
    static C143854z m234446c(C143851w wVar, FeedbackOptions feedbackOptions) {
        C144201f fVar = new C144201f(wVar, feedbackOptions);
        wVar.mo119159d(fVar);
        return fVar;
    }

    @Deprecated
    /* renamed from: d */
    public static C143854z m234447d(C143851w wVar, FeedbackOptions feedbackOptions) {
        C143851w wVar2 = wVar;
        FeedbackOptions feedbackOptions2 = feedbackOptions;
        C144200e eVar = new C144200e(wVar2, feedbackOptions2, ((C143768bp) wVar).f389789b.f389931w, System.nanoTime());
        wVar.mo119159d(eVar);
        return eVar;
    }

    /* renamed from: e */
    public static C144206k m234448e(Context context) {
        return new C144206k(context);
    }
}
