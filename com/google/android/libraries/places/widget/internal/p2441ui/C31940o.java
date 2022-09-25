package com.google.android.libraries.places.widget.internal.p2441ui;

import android.support.p033v7.p037c.p038a.C0417i;
import android.support.p033v7.widget.C0673gh;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import java.util.List;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.o */
/* compiled from: PG */
public final class C31940o extends C0417i {

    /* renamed from: b */
    private int f85908b;

    /* renamed from: c */
    private boolean f85909c = true;

    /* renamed from: d */
    private final C31927b f85910d;

    public C31940o(C31927b bVar) {
        super(new C31939n());
        this.f85910d = bVar;
    }

    /* renamed from: a */
    public final void onBindViewHolder(C31942q qVar, int i) {
        try {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) this.f1406a.f1404f.get(i);
            boolean z = this.f85909c;
            qVar.f85915c = autocompletePrediction;
            qVar.f85916d = z;
            qVar.f85913a.setText(autocompletePrediction.mo37573j(new ForegroundColorSpan(C1878d.m5128a(qVar.itemView.getContext(), R.color.places_autocomplete_prediction_primary_text_highlight))));
            SpannableString k = autocompletePrediction.mo37574k((CharacterStyle) null);
            qVar.f85914b.setText(k);
            if (k.length() == 0) {
                qVar.f85914b.setVisibility(8);
                qVar.f85913a.setGravity(16);
                return;
            }
            qVar.f85914b.setVisibility(0);
            qVar.f85913a.setGravity(80);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo37711b(List list) {
        try {
            int i = 0;
            this.f85909c = this.f85908b == 0 && list != null && !list.isEmpty();
            if (list != null) {
                i = list.size();
            }
            this.f85908b = i;
            this.f1406a.mo1387a(list);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: c */
    public final C31942q mo37712c(ViewGroup viewGroup) {
        try {
            return new C31942q(this.f85910d, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo37712c(viewGroup);
    }
}
