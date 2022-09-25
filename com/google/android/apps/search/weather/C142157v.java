package com.google.android.apps.search.weather;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.apps.search.weather.suggestions.C142147f;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.search.weather.v */
/* compiled from: PG */
final class C142157v implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ View f385657a;

    /* renamed from: b */
    final /* synthetic */ C142155u f385658b;

    public C142157v(C142155u uVar, View view) {
        this.f385658b = uVar;
        this.f385657a = view;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        View view = this.f385657a;
        if (view != null) {
            View findViewById = view.findViewById(R.id.weather_zero_suggestion_elements_view);
            this.f385658b.mo117036f();
            C142147f a = this.f385658b.mo117034a();
            a.getClass();
            if (charSequence.length() != 0) {
                C142155u.m230776d(findViewById);
                if (this.f385658b.f385649s) {
                    C142155u.m230778g(a.getView());
                    a.mo17754z().mo117029a(C58833ax.m90834k(charSequence.toString()));
                    return;
                }
                return;
            }
            C142155u.m230778g(findViewById);
            C142155u.m230776d(a.getView());
        }
    }
}
