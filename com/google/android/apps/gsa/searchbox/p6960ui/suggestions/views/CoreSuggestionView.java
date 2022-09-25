package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.CoreSuggestionView */
/* compiled from: PG */
public class CoreSuggestionView extends C88795af {

    /* renamed from: b */
    public static final /* synthetic */ int f240323b = 0;

    /* renamed from: c */
    private static final C58528ij f240324c = C58528ij.m90012L(0, 8, 1);

    /* renamed from: a */
    public SuggestionIconView[] f240325a;

    /* renamed from: d */
    private final LayoutInflater f240326d;

    /* renamed from: e */
    private View f240327e;

    /* renamed from: f */
    private TextView f240328f;

    /* renamed from: g */
    private TextView f240329g;

    /* renamed from: h */
    private int f240330h = getResources().getDimensionPixelSize(R.dimen.core_suggestion_height);

    /* renamed from: i */
    private SuggestionIconView f240331i;

    public CoreSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240326d = LayoutInflater.from(context);
    }

    /* renamed from: p */
    private void m144035p(TextView textView, Spanned spanned, int i) {
        textView.setText(spanned);
        int i2 = 2;
        if (i == 4) {
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        if (this.f240416m == 35) {
            textView.setSingleLine(false);
            textView.setMaxLines(i == 3 ? 5 : 2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        int i3 = this.f240416m;
        if (i3 == 2 || i3 == 9 || i == 1 || i == 2) {
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

    /* renamed from: x */
    private void m144036x(int i, int i2, int i3) {
        this.f240325a[i].f240381h = new C88828l(i2, i3);
    }

    /* renamed from: y */
    private final void m144037y(int i) {
        if (this.f240330h != i) {
            this.f240330h = i;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f240325a[0].getLayoutParams();
            marginLayoutParams.height = i;
            this.f240325a[0].setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f240325a[1].getLayoutParams();
            marginLayoutParams2.height = i;
            this.f240325a[1].setLayoutParams(marginLayoutParams2);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f240325a[8].getLayoutParams();
            marginLayoutParams3.height = i;
            this.f240325a[8].setLayoutParams(marginLayoutParams3);
            setMinimumHeight(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo82341a() {
        return null;
    }

    /* renamed from: b */
    public boolean mo82342b(int i) {
        if (i == this.f240416m) {
            return true;
        }
        if (i == 1) {
            this.f240416m = 1;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(8);
            m144037y(getResources().getDimensionPixelSize(R.dimen.core_suggestion_height));
            return true;
        } else if (i == 49) {
            this.f240416m = 49;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(8);
            m144037y(getResources().getDimensionPixelSize(R.dimen.denser_core_suggestion_height));
            return true;
        } else if (i == 2) {
            this.f240416m = 2;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(0);
            this.f240329g.setTextAppearance(getContext(), R.style.LineTwoTextAppearance);
            m144037y(getResources().getDimensionPixelSize(R.dimen.core_suggestion_height));
            return true;
        } else if (i == 9) {
            this.f240416m = 9;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextDymAppearance);
            this.f240329g.setVisibility(0);
            this.f240329g.setTextAppearance(getContext(), R.style.LineTwoTextDymAppearance);
            m144037y(getResources().getDimensionPixelSize(R.dimen.core_suggestion_height));
            return true;
        } else if (i == 15) {
            this.f240416m = 15;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(0);
            this.f240329g.setTextAppearance(getContext(), R.style.LineTwoTextCategoricalAppearance);
            m144037y(getResources().getDimensionPixelSize(R.dimen.core_suggestion_height));
            return true;
        } else if (i == 35) {
            this.f240416m = 35;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(0);
            this.f240329g.setTextAppearance(getContext(), R.style.LineTwoTextAppearance);
            m144037y(getResources().getDimensionPixelSize(R.dimen.core_suggestion_height));
            return true;
        } else if (i == 57) {
            this.f240416m = 57;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(8);
            m144037y(getResources().getDimensionPixelSize(R.dimen.tightened_core_suggestion_height));
            return true;
        } else if (i == 58) {
            this.f240416m = 58;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(0);
            this.f240329g.setTextAppearance(getContext(), R.style.LineTwoTextAppearance);
            m144037y(getResources().getDimensionPixelSize(R.dimen.tightened_core_suggestion_height));
            return true;
        } else if (i != 59) {
            return false;
        } else {
            this.f240416m = 59;
            this.f240328f.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240329g.setVisibility(0);
            this.f240329g.setTextAppearance(getContext(), R.style.LineTwoTextAppearance);
            m144037y(getResources().getDimensionPixelSize(R.dimen.tightened_core_suggestion_height));
            return true;
        }
    }

    /* renamed from: c */
    public C88800ak mo82349c(int i) {
        if (f240324c.contains(Integer.valueOf(i))) {
            return this.f240325a[i];
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public void mo82350d(Spanned spanned, int i) {
        m144035p(this.f240328f, spanned, i);
        C91115n.m148882n(this.f240329g, (Drawable) null);
    }

    /* renamed from: f */
    public void mo82537f(C88805ap apVar) {
        View view = this.f240327e;
        int i = 8;
        if (!apVar.mo82593b() && this.f240419p) {
            i = 0;
        }
        view.setVisibility(i);
        super.mo82537f(apVar);
    }

    /* renamed from: g */
    public int mo82544g() {
        ViewParent parent;
        TextView textView = this.f240329g;
        if (textView == null || (parent = textView.getParent()) == null || !(parent instanceof View)) {
            return 0;
        }
        return ((View) parent).getWidth();
    }

    /* renamed from: h */
    public void mo82545h() {
        this.f240325a[0].setPadding(0, 0, 0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public void mo82536hL() {
        C58800sl lA = f240324c.iterator();
        while (lA.hasNext()) {
            SuggestionIconView suggestionIconView = this.f240325a[((Integer) lA.next()).intValue()];
            suggestionIconView.mo82569l();
            suggestionIconView.setVisibility(4);
        }
        SuggestionIconView suggestionIconView2 = this.f240331i;
        if (suggestionIconView2 != null) {
            suggestionIconView2.setVisibility(4);
        }
        C91115n.m148882n(this.f240329g, (Drawable) null);
        C91115n.m148882n(this.f240328f, (Drawable) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f240325a[0].getLayoutParams();
        marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.default_suggestion_left_margin);
        this.f240325a[0].setLayoutParams(marginLayoutParams);
    }

    /* renamed from: i */
    public void mo82546i(Spanned spanned, int i) {
        m144035p(this.f240329g, spanned, i);
        C91115n.m148882n(this.f240329g, (Drawable) null);
    }

    /* renamed from: j */
    public void mo82547j(int i) {
        this.f240329g.setTextColor(i);
    }

    /* renamed from: k */
    public void mo82548k(Drawable drawable) {
        this.f240329g.setCompoundDrawablePadding(getResources().getDimensionPixelOffset(R.dimen.line_two_drawable_padding));
        C91115n.m148882n(this.f240329g, drawable);
    }

    /* renamed from: l */
    public void mo82549l(int i, boolean z) {
        if (i == -1) {
            this.f240329g.setTypeface(Typeface.create(Typeface.DEFAULT, true != z ? 0 : 2));
        } else {
            this.f240329g.setTypeface(Typeface.create(Typeface.DEFAULT, i, z));
        }
    }

    /* renamed from: m */
    public void mo82550m() {
        if (this.f240331i == null) {
            SuggestionIconView suggestionIconView = (SuggestionIconView) this.f240326d.inflate(R.layout.offline_badge_icon, this, false);
            this.f240331i = suggestionIconView;
            addView(suggestionIconView);
        }
        SuggestionIconView suggestionIconView2 = this.f240331i;
        if (suggestionIconView2 != null) {
            suggestionIconView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.suggestion_divider);
        findViewById.getClass();
        this.f240327e = findViewById;
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240328f = textView;
        TextView textView2 = (TextView) findViewById(R.id.text_2);
        textView2.getClass();
        this.f240329g = textView2;
        SuggestionIconView[] suggestionIconViewArr = new SuggestionIconView[9];
        this.f240325a = suggestionIconViewArr;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.label_icon);
        suggestionIconView.getClass();
        suggestionIconViewArr[0] = suggestionIconView;
        SuggestionIconView[] suggestionIconViewArr2 = this.f240325a;
        SuggestionIconView suggestionIconView2 = (SuggestionIconView) findViewById(R.id.inner_icon);
        suggestionIconView2.getClass();
        suggestionIconViewArr2[8] = suggestionIconView2;
        SuggestionIconView[] suggestionIconViewArr3 = this.f240325a;
        SuggestionIconView suggestionIconView3 = (SuggestionIconView) findViewById(R.id.primary_action_icon);
        suggestionIconView3.getClass();
        suggestionIconViewArr3[1] = suggestionIconView3;
        C58800sl lA = f240324c.iterator();
        while (lA.hasNext()) {
            int intValue = ((Integer) lA.next()).intValue();
            this.f240325a[intValue].setOnClickListener(new C88827k(this, intValue));
        }
        m144036x(1, getResources().getDimensionPixelSize(R.dimen.denser_core_suggestion_height), getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_invisible_width));
        m144036x(8, getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width), getResources().getDimensionPixelSize(R.dimen.core_suggestion_inner_action_button_invisible_width));
        this.f240325a[1].setBackground(new RippleDrawable(ColorStateList.valueOf(getResources().getColor(R.color.suggestion_background_pressed)), (Drawable) null, (Drawable) null));
    }
}
