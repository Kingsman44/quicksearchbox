package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.PromoSuggestionView */
/* compiled from: PG */
class PromoSuggestionView extends C88795af {

    /* renamed from: a */
    private View f240352a;

    /* renamed from: b */
    private TextView f240353b;

    /* renamed from: c */
    private SuggestionIconView f240354c;

    public PromoSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        if (i == this.f240416m) {
            return true;
        }
        if (i == 5) {
            this.f240416m = 5;
            this.f240353b.setTextAppearance(getContext(), R.style.LineOnePromoTextAppearance);
            return true;
        } else if (i != 6) {
            return false;
        } else {
            this.f240416m = 6;
            this.f240353b.setTextAppearance(getContext(), R.style.LineOneDismisablePromoTextAppearance);
            return true;
        }
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (i == 1) {
            return this.f240354c;
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f240353b.setText(spanned);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        this.f240354c.setVisibility(4);
    }

    /* renamed from: hQ */
    public final void mo82553hQ(C88805ap apVar) {
        this.f240352a.setVisibility(true != apVar.mo82593b() ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.suggestion_divider);
        findViewById.getClass();
        this.f240352a = findViewById;
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240353b = textView;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.primary_action_icon);
        suggestionIconView.getClass();
        this.f240354c = suggestionIconView;
        suggestionIconView.setOnClickListener(new C88791ab(this));
        this.f240354c.setBackground(new RippleDrawable(ColorStateList.valueOf(getResources().getColor(R.color.suggestion_background_pressed)), (Drawable) null, (Drawable) null));
    }
}
