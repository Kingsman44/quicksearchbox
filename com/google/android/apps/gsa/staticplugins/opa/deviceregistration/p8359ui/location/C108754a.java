package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108654e;
import com.google.android.libraries.places.api.p2437b.C31855k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.a */
/* compiled from: PG */
final class C108754a implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AddressEditFragment f302460a;

    public C108754a(AddressEditFragment addressEditFragment) {
        this.f302460a = addressEditFragment;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C108759f a = this.f302460a.f302448m.getItem(i);
        String str = a.f302467d;
        this.f302460a.f302444i = a.f302464a.toString();
        this.f302460a.f302445j = a.f302465b.toString();
        AddressEditFragment addressEditFragment = this.f302460a;
        addressEditFragment.f302446k = a.f302466c;
        C108758e eVar = addressEditFragment.f302451p;
        if (eVar != null) {
            ((C108654e) eVar).f302205g.setVisibility(8);
        }
        if (str != null) {
            this.f302460a.f302440e.mo96986a().mo37395a(C31855k.m59240e(str, AddressEditFragment.f302438c).mo37447c()).mo122497p(this.f302460a.f302452q);
        }
        ((InputMethodManager) this.f302460a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f302460a.f302449n.getWindowToken(), 0);
    }
}
