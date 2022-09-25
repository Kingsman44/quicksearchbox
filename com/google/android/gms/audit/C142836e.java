package com.google.android.gms.audit;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.audit.e */
/* compiled from: PG */
public final class C142836e extends C143847s implements C142830a {

    /* renamed from: a */
    private static final C143840l f387632a;

    /* renamed from: b */
    private static final C143707a f387633b;

    /* renamed from: c */
    private static final C143841m f387634c;

    static {
        C143840l lVar = new C143840l();
        f387632a = lVar;
        C142834c cVar = new C142834c();
        f387633b = cVar;
        f387634c = new C143841m("Audit.API", cVar, lVar);
    }

    public C142836e(Activity activity) {
        super(activity, activity, f387634c, (C143724i) null, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo117761a(LogAuditRecordsRequest logAuditRecordsRequest) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389863d = 6901;
        dcVar.f389860a = new C142833b(logAuditRecordsRequest);
        return super.mo119290u(1, dcVar.mo119260a());
    }

    public C142836e(Context context) {
        super(context, (Activity) null, f387634c, (C143724i) null, C143846r.f389923a);
    }
}
