package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.api.internal.C143819h;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.location.reporting.d */
/* compiled from: PG */
public final class C144966d extends C143847s {
    public C144966d(Context context) {
        super(context, C144969g.f391936a, C143724i.f389627f, new C143819h());
    }

    /* renamed from: a */
    public final C146006ab mo120471a(Account account) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C144965c(account);
        dcVar.f389863d = 2427;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
