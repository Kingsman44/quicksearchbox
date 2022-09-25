package com.google.android.apps.gsa.assistant.settings.shared.phone;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.phone.m */
/* compiled from: PG */
public final /* synthetic */ class C73763m implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ PhoneNumberPreference f195040a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f195041b;

    public /* synthetic */ C73763m(PhoneNumberPreference phoneNumberPreference, C0392m mVar) {
        this.f195040a = phoneNumberPreference;
        this.f195041b = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        PhoneNumberPreference phoneNumberPreference = this.f195040a;
        C0392m mVar = this.f195041b;
        mVar.f1349a.f1110j.setTextColor(phoneNumberPreference.f12738j.getResources().getColor(R.color.quantum_googblue700));
        mVar.f1349a.f1113m.setTextColor(phoneNumberPreference.f12738j.getResources().getColor(R.color.quantum_googblue700));
    }
}
