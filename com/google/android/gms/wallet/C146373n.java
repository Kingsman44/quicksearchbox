package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.wallet.n */
/* compiled from: PG */
public final class C146373n extends C143847s {
    public C146373n(Context context, C146378s sVar) {
        super(context, (Activity) null, C146383t.f395414a, sVar, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo122977a(IsReadyToPayRequest isReadyToPayRequest) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389863d = 23705;
        dcVar.f389860a = new C146372m(isReadyToPayRequest);
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
