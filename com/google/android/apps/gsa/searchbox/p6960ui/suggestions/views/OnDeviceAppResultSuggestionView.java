package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.OnDeviceAppResultSuggestionView */
/* compiled from: PG */
public class OnDeviceAppResultSuggestionView extends C88795af {

    /* renamed from: a */
    private View f240347a;

    /* renamed from: b */
    private TextView f240348b;

    /* renamed from: c */
    private TextView f240349c;

    /* renamed from: d */
    private TextView f240350d;

    /* renamed from: e */
    private SuggestionIconView[] f240351e;

    public OnDeviceAppResultSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: p */
    private final void m144075p(TextView textView, Spanned spanned, int i) {
        textView.setText(spanned);
        int i2 = 2;
        if (this.f240416m == 39 || i == 1 || i == 2) {
            textView.setSingleLine(true);
            textView.setMaxLines(1);
            if (i == 1) {
                textView.setEllipsize(TextUtils.TruncateAt.START);
            } else if (i == 2) {
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            } else {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            textView.setSingleLine(false);
            if (i == 3) {
                i2 = 5;
            }
            textView.setMaxLines(i2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        if (i == 38) {
            this.f240416m = 38;
            this.f240348b.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240349c.setVisibility(8);
            return true;
        } else if (i != 39) {
            return false;
        } else {
            this.f240416m = 39;
            this.f240348b.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240349c.setVisibility(0);
            this.f240349c.setTextAppearance(getContext(), R.style.LineTwoTextAppearance);
            return true;
        }
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (i == 0) {
            return this.f240351e[0];
        }
        if (i == 1) {
            return this.f240351e[1];
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        m144075p(this.f240348b, spanned, i);
        C91115n.m148882n(this.f240349c, (Drawable) null);
    }

    /* renamed from: f */
    public final void mo82537f(C88805ap apVar) {
        View view = this.f240347a;
        int i = 8;
        if (!apVar.mo82593b() && this.f240419p) {
            i = 0;
        }
        view.setVisibility(i);
        super.mo82537f(apVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        this.f240351e[0].setVisibility(4);
        this.f240351e[1].setVisibility(8);
        this.f240350d.setVisibility(8);
        C91115n.m148882n(this.f240349c, (Drawable) null);
        C91115n.m148882n(this.f240348b, (Drawable) null);
    }

    /* renamed from: hR */
    public final void mo82554hR(Spanned spanned) {
        this.f240350d.setText(spanned);
        this.f240350d.setVisibility(0);
    }

    /* renamed from: i */
    public final void mo82546i(Spanned spanned, int i) {
        m144075p(this.f240349c, spanned, i);
        C91115n.m148882n(this.f240349c, (Drawable) null);
    }

    /* renamed from: k */
    public final void mo82548k(Drawable drawable) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.line_two_drawable_padding);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.app_result_app_icon_size);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.f240349c.setCompoundDrawablePadding(dimensionPixelOffset);
        C91115n.m148880l(this.f240349c, drawable, (Drawable) null);
    }

    /* renamed from: m */
    public final void mo82550m() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.suggestion_divider);
        findViewById.getClass();
        this.f240347a = findViewById;
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240348b = textView;
        TextView textView2 = (TextView) findViewById(R.id.text_2);
        textView2.getClass();
        this.f240349c = textView2;
        TextView textView3 = (TextView) findViewById(R.id.right_gutter_text);
        textView3.getClass();
        this.f240350d = textView3;
        SuggestionIconView[] suggestionIconViewArr = new SuggestionIconView[2];
        this.f240351e = suggestionIconViewArr;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.label_icon);
        suggestionIconView.getClass();
        suggestionIconViewArr[0] = suggestionIconView;
        SuggestionIconView[] suggestionIconViewArr2 = this.f240351e;
        SuggestionIconView suggestionIconView2 = (SuggestionIconView) findViewById(R.id.primary_action_icon);
        suggestionIconView2.getClass();
        suggestionIconViewArr2[1] = suggestionIconView2;
        SuggestionIconView suggestionIconView3 = this.f240351e[1];
        suggestionIconView3.f240381h = new C88841y(this);
        suggestionIconView3.setOnClickListener(new C88842z(this));
        this.f240351e[1].setBackground(new RippleDrawable(ColorStateList.valueOf(getResources().getColor(R.color.suggestion_background_pressed)), (Drawable) null, (Drawable) null));
    }
}
