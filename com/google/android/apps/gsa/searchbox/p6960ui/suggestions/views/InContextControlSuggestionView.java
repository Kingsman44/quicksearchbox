package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.InContextControlSuggestionView */
/* compiled from: PG */
public final class InContextControlSuggestionView extends C88795af {

    /* renamed from: a */
    TextView f240346a;

    public InContextControlSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 65;
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f240346a.setText(spanned);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(16908308);
        textView.getClass();
        this.f240346a = textView;
    }
}
