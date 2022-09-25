package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ChipSuggestionView */
/* compiled from: PG */
public class ChipSuggestionView extends C88795af {

    /* renamed from: a */
    private TextView f240313a;

    /* renamed from: b */
    private SuggestionIconView f240314b;

    public ChipSuggestionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 64;
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (i == 0) {
            return this.f240314b;
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f240313a.setText(spanned.toString());
        this.f240313a.setTextColor(C1878d.m5128a(getContext(), R.color.agsa_color_on_background));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        SuggestionIconView suggestionIconView = this.f240314b;
        suggestionIconView.mo82569l();
        suggestionIconView.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240313a = textView;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.label_icon);
        suggestionIconView.getClass();
        this.f240314b = suggestionIconView;
    }

    public ChipSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240416m = 64;
    }
}
