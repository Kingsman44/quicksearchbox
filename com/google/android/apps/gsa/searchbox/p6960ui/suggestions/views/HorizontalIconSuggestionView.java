package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.HorizontalIconSuggestionView */
/* compiled from: PG */
public class HorizontalIconSuggestionView extends C88795af {

    /* renamed from: a */
    private final int f240343a;

    /* renamed from: b */
    private TextView f240344b;

    /* renamed from: c */
    private SuggestionIconView f240345c;

    public HorizontalIconSuggestionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 4;
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (i == 0) {
            return this.f240345c;
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f240344b.setText(spanned);
        if (i == 1) {
            this.f240344b.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i == 2) {
            this.f240344b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else {
            this.f240344b.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        this.f240345c.setVisibility(4);
        setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hP */
    public final Shape mo82552hP(boolean z, boolean z2) {
        float f = 0.0f;
        float f2 = z ? this.f240415l : 0.0f;
        if (z2) {
            f = this.f240415l;
        }
        return new RoundRectShape(new float[]{f2, f2, f, f, f, f, f2, f2}, (RectF) null, (float[]) null);
    }

    /* renamed from: hQ */
    public final void mo82553hQ(C88805ap apVar) {
        setPadding((apVar.f240431b & 4) != 0 ? this.f240343a : 0, 0, apVar.mo82593b() ? this.f240343a : 0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240344b = textView;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.label_icon);
        suggestionIconView.getClass();
        this.f240345c = suggestionIconView;
        suggestionIconView.setOnClickListener(new C88834r(this));
    }

    public HorizontalIconSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240416m = 4;
        this.f240343a = getResources().getDimensionPixelOffset(R.dimen.horizontal_icon_suggestion_side_padding);
    }
}
