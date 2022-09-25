package com.google.android.gms.cast.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.cast.C143610s;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.cast.internal.j */
/* compiled from: PG */
public final class C143584j extends C143847s {

    /* renamed from: a */
    private static final C143840l f389315a;

    /* renamed from: b */
    private static final C143707a f389316b;

    /* renamed from: c */
    private static final C143841m f389317c;

    static {
        C143840l lVar = new C143840l();
        f389315a = lVar;
        C143580f fVar = new C143580f();
        f389316b = fVar;
        f389317c = new C143841m("CastApi.API", fVar, lVar);
    }

    public C143584j(Context context) {
        super(context, (Activity) null, f389317c, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo118913a(String[] strArr) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143578d(strArr);
        dcVar.f389862c = new Feature[]{C143610s.f389368d};
        dcVar.f389861b = false;
        dcVar.f389863d = 8425;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo118914b(String[] strArr) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143579e(strArr);
        dcVar.f389862c = new Feature[]{C143610s.f389372h};
        dcVar.f389861b = false;
        dcVar.f389863d = 8427;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo118915c(String[] strArr) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143577c(strArr);
        dcVar.f389862c = new Feature[]{C143610s.f389371g};
        dcVar.f389861b = false;
        dcVar.f389863d = 8426;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
