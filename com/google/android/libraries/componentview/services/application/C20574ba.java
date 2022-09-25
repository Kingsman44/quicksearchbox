package com.google.android.libraries.componentview.services.application;

import android.content.DialogInterface;
import com.google.android.libraries.componentview.components.p1689c.C20193am;

/* renamed from: com.google.android.libraries.componentview.services.application.ba */
/* compiled from: PG */
final class C20574ba implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C20576bc f57752a;

    /* renamed from: b */
    final /* synthetic */ C20193am[] f57753b;

    public C20574ba(C20576bc bcVar, C20193am[] amVarArr) {
        this.f57752a = bcVar;
        this.f57753b = amVarArr;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C20576bc bcVar = this.f57752a;
        bcVar.f57755a = null;
        bcVar.f57756b = null;
        C20193am[] amVarArr = this.f57753b;
        for (int i = 0; i <= 0; i++) {
            C20193am amVar = amVarArr[i];
        }
    }
}
