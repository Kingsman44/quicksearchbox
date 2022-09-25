package com.google.android.libraries.places.widget.internal.p2441ui;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.q */
/* compiled from: PG */
public final class C31942q extends C0673gh {

    /* renamed from: a */
    public final TextView f85913a;

    /* renamed from: b */
    public final TextView f85914b;

    /* renamed from: c */
    public AutocompletePrediction f85915c;

    /* renamed from: d */
    public boolean f85916d;

    public C31942q(C31927b bVar, View view) {
        super(view);
        this.f85913a = (TextView) view.findViewById(R.id.places_autocomplete_prediction_primary_text);
        this.f85914b = (TextView) view.findViewById(R.id.places_autocomplete_prediction_secondary_text);
        this.itemView.setOnClickListener(new C31941p(this, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo37714a(C31927b bVar) {
        AutocompletePrediction autocompletePrediction = this.f85915c;
        if (autocompletePrediction != null) {
            try {
                bVar.f85888a.mo37695a(autocompletePrediction, getBindingAdapterPosition());
            } catch (Error | RuntimeException e) {
                C31775f.m59130a(e);
                throw e;
            }
        }
    }
}
