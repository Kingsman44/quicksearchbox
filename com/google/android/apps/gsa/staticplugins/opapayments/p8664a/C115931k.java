package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opapayments.p8666ui.ConfirmAddressDialogElement;
import com.google.p4129b.p4130a.p4131a.p4132a.C54683b;
import com.google.p4129b.p4130a.p4131a.p4132a.C54723i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.k */
/* compiled from: PG */
public final /* synthetic */ class C115931k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115937q f321467a;

    /* renamed from: b */
    public final /* synthetic */ C54723i f321468b;

    /* renamed from: c */
    public final /* synthetic */ ConfirmAddressDialogElement f321469c;

    /* renamed from: d */
    public final /* synthetic */ ConfirmAddressDialogElement f321470d;

    public /* synthetic */ C115931k(C115937q qVar, C54723i iVar, ConfirmAddressDialogElement confirmAddressDialogElement, ConfirmAddressDialogElement confirmAddressDialogElement2) {
        this.f321467a = qVar;
        this.f321468b = iVar;
        this.f321469c = confirmAddressDialogElement;
        this.f321470d = confirmAddressDialogElement2;
    }

    public final void onClick(View view) {
        C115937q qVar = this.f321467a;
        C54723i iVar = this.f321468b;
        ConfirmAddressDialogElement confirmAddressDialogElement = this.f321469c;
        ConfirmAddressDialogElement confirmAddressDialogElement2 = this.f321470d;
        C54683b bVar = iVar.f143620b;
        if (bVar == null) {
            bVar = C54683b.f143537c;
        }
        qVar.f321482g = bVar;
        confirmAddressDialogElement.f321503a.setChecked(false);
        confirmAddressDialogElement2.f321503a.setChecked(true);
    }
}
