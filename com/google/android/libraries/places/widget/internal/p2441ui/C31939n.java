package com.google.android.libraries.places.widget.internal.p2441ui;

import android.support.p033v7.p040e.C0425g;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.n */
/* compiled from: PG */
final class C31939n extends C0425g {
    /* renamed from: c */
    public static final boolean m59507c(AutocompletePrediction autocompletePrediction, AutocompletePrediction autocompletePrediction2) {
        try {
            return autocompletePrediction.mo37462c().equals(autocompletePrediction2.mo37462c());
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo1400a(Object obj, Object obj2) {
        return ((AutocompletePrediction) obj).equals((AutocompletePrediction) obj2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo1401b(Object obj, Object obj2) {
        return m59507c((AutocompletePrediction) obj, (AutocompletePrediction) obj2);
    }
}
