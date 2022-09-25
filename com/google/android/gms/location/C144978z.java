package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146004a;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146013ai;

/* renamed from: com.google.android.gms.location.z */
/* compiled from: PG */
public final class C144978z extends C143847s {
    public C144978z(Context context) {
        super(context, (Activity) null, C144894ay.f391842a, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo120475a(CurrentLocationRequest currentLocationRequest, C146004a aVar) {
        if (aVar != null) {
            C143919bh.m233960c(!aVar.mo122480a(), "cancellationToken may not be already canceled");
        }
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144957r(currentLocationRequest, aVar);
        dcVar.f389863d = 2415;
        C146006ab u = super.mo119290u(0, dcVar.mo119260a());
        if (aVar == null) {
            return u;
        }
        C146010af afVar = new C146010af(aVar);
        u.mo122482a(C146013ai.f394700a, new C144971s(afVar));
        return afVar.f394698a;
    }

    /* renamed from: b */
    public final C146006ab mo120476b() {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = C144973u.f391941a;
        dcVar.f389863d = 2414;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo120477c() {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = C144975w.f391944a;
        dcVar.f389863d = 2416;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: d */
    public final C146006ab mo120478d(C144889at atVar) {
        return mo119292w(C143785cf.m233679a(atVar, C144889at.class.getSimpleName()), 2418).mo122482a(C144976x.f391945a, C144972t.f391940a);
    }

    /* renamed from: e */
    public final C146006ab mo120479e(LocationRequest locationRequest, C144889at atVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C143919bh.m233971n(looper, "invalid null looper");
        }
        C143784ce b = C143785cf.m233680b(atVar, looper, C144889at.class.getSimpleName());
        C144977y yVar = new C144977y(this, b);
        C144974v vVar = new C144974v(yVar, locationRequest);
        C143796cq cqVar = new C143796cq();
        cqVar.f389831a = vVar;
        cqVar.f389832b = yVar;
        cqVar.f389833c = b;
        cqVar.f389836f = 2435;
        return mo119291v(cqVar.mo119255a());
    }
}
