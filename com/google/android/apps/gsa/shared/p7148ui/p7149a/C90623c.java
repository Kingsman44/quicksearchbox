package com.google.android.apps.gsa.shared.p7148ui.p7149a;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.shared.ui.a.c */
/* compiled from: PG */
final class C90623c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Intent f253411a;

    /* renamed from: b */
    final /* synthetic */ C90624d f253412b;

    public C90623c(C90624d dVar, Intent intent) {
        this.f253412b = dVar;
        this.f253411a = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f253411a != null) {
            this.f253412b.getActivity().startActivity(this.f253411a);
        }
        dialogInterface.dismiss();
    }
}
