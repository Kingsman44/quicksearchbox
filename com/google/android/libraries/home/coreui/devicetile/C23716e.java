package com.google.android.libraries.home.coreui.devicetile;

import android.content.DialogInterface;
import com.google.android.libraries.home.coreui.devicetile.model.C23725a;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.e */
/* compiled from: PG */
final class C23716e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C23656ab f64868a;

    /* renamed from: b */
    final /* synthetic */ C23739n f64869b;

    public C23716e(C23656ab abVar, C23739n nVar) {
        this.f64868a = abVar;
        this.f64869b = nVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f64868a.mo29002b(C23762x.m44262a(this.f64869b, C23725a.f64902a));
        dialogInterface.dismiss();
    }
}
