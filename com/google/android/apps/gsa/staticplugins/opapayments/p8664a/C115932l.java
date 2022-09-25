package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opapayments.p8666ui.ConfirmAddressDialogElement;
import com.google.p4129b.p4130a.p4131a.p4132a.C54683b;
import com.google.p4129b.p4130a.p4131a.p4132a.C54723i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.l */
/* compiled from: PG */
public final /* synthetic */ class C115932l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115937q f321471a;

    /* renamed from: b */
    public final /* synthetic */ C54723i f321472b;

    /* renamed from: c */
    public final /* synthetic */ ConfirmAddressDialogElement f321473c;

    /* renamed from: d */
    public final /* synthetic */ ConfirmAddressDialogElement f321474d;

    public /* synthetic */ C115932l(C115937q qVar, C54723i iVar, ConfirmAddressDialogElement confirmAddressDialogElement, ConfirmAddressDialogElement confirmAddressDialogElement2) {
        this.f321471a = qVar;
        this.f321472b = iVar;
        this.f321473c = confirmAddressDialogElement;
        this.f321474d = confirmAddressDialogElement2;
    }

    public final void onClick(View view) {
        C115937q qVar = this.f321471a;
        C54723i iVar = this.f321472b;
        ConfirmAddressDialogElement confirmAddressDialogElement = this.f321473c;
        ConfirmAddressDialogElement confirmAddressDialogElement2 = this.f321474d;
        C54683b bVar = iVar.f143619a;
        if (bVar == null) {
            bVar = C54683b.f143537c;
        }
        qVar.f321482g = bVar;
        confirmAddressDialogElement.f321503a.setChecked(false);
        confirmAddressDialogElement2.f321503a.setChecked(true);
    }
}
