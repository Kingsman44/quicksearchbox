package com.google.android.gms.common.internal.p10783a;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.internal.C143926bo;
import com.google.android.gms.common.internal.C143927bp;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.p10789d.C144098a;

/* renamed from: com.google.android.gms.common.internal.a.d */
/* compiled from: PG */
public final class C143883d extends C143847s implements C143926bo {

    /* renamed from: a */
    public static final /* synthetic */ int f390054a = 0;

    /* renamed from: b */
    private static final C143840l f390055b;

    /* renamed from: c */
    private static final C143707a f390056c;

    /* renamed from: d */
    private static final C143841m f390057d;

    static {
        C143840l lVar = new C143840l();
        f390055b = lVar;
        C143882c cVar = new C143882c();
        f390056c = cVar;
        f390057d = new C143841m("ClientTelemetry.API", cVar, lVar);
    }

    public C143883d(Context context, C143927bp bpVar) {
        super(context, (Activity) null, f390057d, bpVar, C143846r.f389923a);
    }

    /* renamed from: a */
    public final void mo119388a(TelemetryData telemetryData) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C144098a.f390375a};
        dcVar.f389861b = false;
        dcVar.f389860a = new C143881b(telemetryData);
        super.mo119290u(2, dcVar.mo119260a());
    }
}
