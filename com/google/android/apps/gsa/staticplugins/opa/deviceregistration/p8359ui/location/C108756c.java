package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location.AddressEditFragment;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.c */
/* compiled from: PG */
final class C108756c implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ AddressEditFragment f302462a;

    public C108756c(AddressEditFragment addressEditFragment) {
        this.f302462a = addressEditFragment;
    }

    public final void afterTextChanged(Editable editable) {
        String str;
        AddressEditFragment addressEditFragment = this.f302462a;
        AddressEditFragment.AddressEditConfiguration addressEditConfiguration = addressEditFragment.f302447l;
        if (addressEditConfiguration.f302456a) {
            str = addressEditFragment.f302444i;
        } else {
            str = addressEditFragment.f302446k;
        }
        if (addressEditConfiguration.f302457b || TextUtils.equals(editable, str)) {
            AddressEditFragment addressEditFragment2 = this.f302462a;
            if (addressEditFragment2.f302447l.f302457b) {
                addressEditFragment2.f302444i = editable.toString();
                AddressEditFragment addressEditFragment3 = this.f302462a;
                if (addressEditFragment3.f302447l.f302456a) {
                    addressEditFragment3.f302446k = String.format("%s, %s", new Object[]{addressEditFragment3.f302444i, addressEditFragment3.f302445j});
                    return;
                }
                addressEditFragment3.f302446k = addressEditFragment3.f302444i;
                return;
            }
            return;
        }
        AddressEditFragment addressEditFragment4 = this.f302462a;
        addressEditFragment4.f302444i = null;
        addressEditFragment4.f302446k = null;
        addressEditFragment4.f302443h = null;
        addressEditFragment4.f302442g = null;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
