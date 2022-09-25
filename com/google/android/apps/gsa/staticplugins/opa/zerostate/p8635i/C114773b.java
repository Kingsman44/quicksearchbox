package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8635i;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.i.b */
/* compiled from: PG */
public final class C114773b {

    /* renamed from: a */
    public final Context f318495a;

    /* renamed from: b */
    public ExtendedFloatingActionButton f318496b;

    /* renamed from: c */
    public C114756j f318497c;

    public C114773b(Context context) {
        this.f318495a = context;
    }

    /* renamed from: a */
    public final void mo101589a() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f318496b;
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.mo47890r(extendedFloatingActionButton.f116354p);
        }
    }

    /* renamed from: b */
    public final void mo101590b(Intent intent) {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f318496b;
        if (extendedFloatingActionButton != null && this.f318497c != null) {
            extendedFloatingActionButton.setOnClickListener(new C89943l(new C114772a(this, intent)));
            ExtendedFloatingActionButton extendedFloatingActionButton2 = this.f318496b;
            extendedFloatingActionButton2.mo47890r(extendedFloatingActionButton2.f116353o);
        }
    }
}
