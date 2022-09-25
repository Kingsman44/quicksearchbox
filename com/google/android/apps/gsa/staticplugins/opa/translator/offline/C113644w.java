package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.util.SparseArray;
import android.view.translation.TranslationResponse;
import android.view.translation.TranslationResponseValue;
import androidx.p104d.p105a.C2164c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.w */
/* compiled from: PG */
public final /* synthetic */ class C113644w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2164c f314703a;

    public /* synthetic */ C113644w(C2164c cVar) {
        this.f314703a = cVar;
    }

    public final void accept(Object obj) {
        C2164c cVar = this.f314703a;
        TranslationResponse translationResponse = (TranslationResponse) obj;
        if (translationResponse == null) {
            cVar.mo5437b(C58836b.f156633a);
            return;
        }
        SparseArray translationResponseValues = translationResponse.getTranslationResponseValues();
        if (translationResponse.getTranslationStatus() != 0 || translationResponseValues.size() == 0) {
            translationResponse.getTranslationStatus();
            cVar.mo5437b(C58836b.f156633a);
            return;
        }
        cVar.mo5437b(C58833ax.m90833j(String.valueOf(((TranslationResponseValue) translationResponseValues.get(0)).getText())));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
