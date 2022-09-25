package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.libraries.searchbox.shared.response.Response;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.ac */
/* compiled from: PG */
final class C107643ac implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ Response f299474a;

    /* renamed from: b */
    final /* synthetic */ C107656ap f299475b;

    public C107643ac(C107656ap apVar, Response response) {
        this.f299475b = apVar;
        this.f299474a = response;
    }

    public final boolean onPreDraw() {
        SuggestionGridLayout suggestionGridLayout = this.f299475b.f299495D;
        suggestionGridLayout.getClass();
        suggestionGridLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f299474a.f108861a.length() == 0) {
            ((C107662av) this.f299475b.f299593p.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_ZERO_PREFIX_SUGGESTIONS_SHOWN);
            return true;
        }
        ((C107662av) this.f299475b.f299593p.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_N_PREFIX_SUGGESTIONS_SHOWN);
        return true;
    }
}
