package com.google.android.gms.gmscompliance.p10807b;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.gmscompliance.C144225a;
import com.google.android.gms.gmscompliance.C144266b;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.gmscompliance.b.f */
/* compiled from: PG */
public final class C144272f extends C143847s implements C144266b {

    /* renamed from: a */
    private static final C143840l f390721a;

    /* renamed from: b */
    private static final C143707a f390722b;

    /* renamed from: c */
    private static final C143841m f390723c;

    static {
        C143840l lVar = new C143840l();
        f390721a = lVar;
        C144269c cVar = new C144269c();
        f390722b = cVar;
        f390723c = new C143841m("GmsDeviceComplianceService.API", cVar, lVar);
    }

    public C144272f(Context context) {
        super(context, (Activity) null, f390723c, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo119796a() {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144268b();
        dcVar.f389862c = new Feature[]{C144225a.f390660a};
        dcVar.f389861b = false;
        dcVar.f389863d = 13801;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
