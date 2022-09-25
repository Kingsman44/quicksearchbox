package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.DialogInterface;
import android.support.p033v7.app.C0391l;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.e */
/* compiled from: PG */
final class C73743e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AddressPreference f195018a;

    public C73743e(AddressPreference addressPreference) {
        this.f195018a = addressPreference;
    }

    public final void onClick(View view) {
        C0391l lVar = new C0391l(this.f195018a.f12738j);
        lVar.mo1307l(this.f195018a.f194985b);
        lVar.f1347a.f1326g = this.f195018a.f194986c;
        lVar.setPositiveButton(R.string.common_address_clear_confirm_button, new C73741d(this));
        lVar.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        lVar.create().show();
    }
}
