package com.google.android.gms.pay.p10853b;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.pay.C145606d;
import com.google.android.gms.pay.C145627y;
import com.google.android.gms.pay.GetPassesRequest;
import com.google.android.gms.pay.p10852a.C145579a;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.pay.b.g */
/* compiled from: PG */
public final class C145601g extends C143847s implements C145579a {
    public C145601g(Context context) {
        super(context, (Activity) null, C145627y.f393789e, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo121574a(GetPassesRequest getPassesRequest) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145599e(getPassesRequest);
        dcVar.f389862c = new Feature[]{C145606d.f393763f};
        dcVar.f389861b = false;
        dcVar.f389863d = 7276;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
