package com.google.p4463ce.p4464a.p4465a.p4466a.p4467a.p4468a;

import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import com.google.android.libraries.componentview.components.base.C20081f;
import p5652p.p5653a.p5654a.p5655a.p5678l.p5679a.C72740f;

/* renamed from: com.google.ce.a.a.a.a.a.a */
/* compiled from: PG */
public final class C58051a extends Filter {

    /* renamed from: a */
    final /* synthetic */ C58052b f155189a;

    public C58051a(C58052b bVar) {
        this.f155189a = bVar;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.count = 1;
        C58052b bVar = this.f155189a;
        C72740f fVar = bVar.f155191b;
        AutoCompleteTextView autoCompleteTextView = bVar.f155190a;
        C20081f.m37970b(fVar.f193404a.f56306q, "_bind_text", autoCompleteTextView, autoCompleteTextView.getText().toString());
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
    }
}
