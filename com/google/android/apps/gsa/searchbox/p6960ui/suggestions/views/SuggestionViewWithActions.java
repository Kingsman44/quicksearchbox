package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.animation.LayoutTransition;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionViewWithActions */
/* compiled from: PG */
public class SuggestionViewWithActions extends C88795af {

    /* renamed from: e */
    private static final TimeInterpolator f240391e = C91107f.f254406b;

    /* renamed from: a */
    public SuggestionIconView f240392a;

    /* renamed from: b */
    public HorizontalScrollView f240393b;

    /* renamed from: c */
    public boolean f240394c = false;

    /* renamed from: d */
    public boolean f240395d = false;

    /* renamed from: f */
    private View f240396f;

    /* renamed from: g */
    private ViewGroup f240397g;

    /* renamed from: h */
    private TextView f240398h;

    /* renamed from: i */
    private TextView f240399i;

    /* renamed from: j */
    private ViewStub f240400j;

    /* renamed from: k */
    private SuggestionIconView f240401k;

    /* renamed from: q */
    private LinearLayout f240402q;

    /* renamed from: r */
    private boolean f240403r;

    /* renamed from: s */
    private List f240404s;

    /* renamed from: t */
    private LayoutInflater f240405t;

    public SuggestionViewWithActions(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240405t = LayoutInflater.from(context);
    }

    /* renamed from: z */
    private final void m144113z(TextView textView, Spanned spanned, int i) {
        textView.setText(spanned);
        int i2 = 2;
        if (i == 4) {
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else if (this.f240416m == 13 || i == 1 || i == 2) {
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
        if (i == this.f240416m) {
            return true;
        }
        if (i == 12) {
            this.f240416m = 12;
            this.f240398h.setSingleLine(false);
            this.f240398h.setMaxLines(2);
            this.f240398h.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240399i.setVisibility(8);
            return true;
        } else if (i != 13) {
            return false;
        } else {
            this.f240416m = 13;
            this.f240398h.setSingleLine(true);
            this.f240398h.setMaxLines(1);
            this.f240398h.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240399i.setVisibility(0);
            this.f240399i.setTextAppearance(getContext(), R.style.LineTwoTextAppearance);
            return true;
        }
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (i == 0) {
            return this.f240401k;
        }
        if (i == 1 || i == -1) {
            return this.f240392a;
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        m144113z(this.f240398h, spanned, i);
    }

    /* renamed from: f */
    public final void mo82537f(C88805ap apVar) {
        View view = this.f240396f;
        int i = 8;
        if (!apVar.mo82593b() && this.f240419p) {
            i = 0;
        }
        view.setVisibility(i);
        super.mo82537f(apVar);
    }

    /* renamed from: g */
    public final int mo82544g() {
        TextView textView = this.f240399i;
        if (textView == null) {
            return 0;
        }
        ViewParent parent = textView.getParent();
        if (parent instanceof View) {
            return ((View) parent).getWidth();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        if (!this.f240403r) {
            if (this.f240395d) {
                HorizontalScrollView horizontalScrollView = this.f240393b;
                if (horizontalScrollView != null) {
                    horizontalScrollView.setVisibility(8);
                }
                this.f240395d = false;
            }
            this.f240392a.setScaleY(1.0f);
            HorizontalScrollView horizontalScrollView2 = this.f240393b;
            if (horizontalScrollView2 != null) {
                horizontalScrollView2.scrollTo(0, 0);
            }
            for (SuggestionActionView suggestionActionView : this.f240404s) {
                suggestionActionView.f240372b.setVisibility(8);
                suggestionActionView.f240373c.setVisibility(0);
                suggestionActionView.setVisibility(8);
            }
            this.f240394c = false;
            this.f240392a.setVisibility(4);
        }
        C91115n.m148882n(this.f240399i, (Drawable) null);
    }

    /* renamed from: i */
    public final void mo82546i(Spanned spanned, int i) {
        m144113z(this.f240399i, spanned, i);
        C91115n.m148882n(this.f240399i, (Drawable) null);
    }

    /* renamed from: k */
    public final void mo82548k(Drawable drawable) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.line_two_drawable_padding);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.app_result_app_icon_size);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.f240399i.setCompoundDrawablePadding(dimensionPixelOffset);
        C91115n.m148880l(this.f240399i, drawable, this.f240399i.getCompoundDrawablesRelative()[2]);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.suggestion_divider);
        findViewById.getClass();
        this.f240396f = findViewById;
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240398h = textView;
        TextView textView2 = (TextView) findViewById(R.id.text_2);
        textView2.getClass();
        this.f240399i = textView2;
        ViewStub viewStub = (ViewStub) findViewById(R.id.suggestion_actions_carousel_stub);
        viewStub.getClass();
        this.f240400j = viewStub;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.suggestion_expand_icon);
        suggestionIconView.getClass();
        this.f240392a = suggestionIconView;
        suggestionIconView.setOnClickListener(new C88806aq(this));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.text_frame);
        this.f240397g = viewGroup;
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.setDuration(100);
            layoutTransition.setStartDelay(2, 0);
            layoutTransition.setStartDelay(1, 0);
            TimeInterpolator timeInterpolator = f240391e;
            layoutTransition.setInterpolator(2, timeInterpolator);
            layoutTransition.setInterpolator(0, timeInterpolator);
            layoutTransition.setInterpolator(1, timeInterpolator);
            layoutTransition.setInterpolator(4, timeInterpolator);
            layoutTransition.setInterpolator(3, timeInterpolator);
            layoutTransition.setAnimateParentHierarchy(false);
        }
        SuggestionIconView suggestionIconView2 = (SuggestionIconView) findViewById(R.id.label_icon);
        suggestionIconView2.getClass();
        this.f240401k = suggestionIconView2;
        this.f240404s = new ArrayList();
    }

    /* renamed from: p */
    public final SuggestionActionView mo82573p(int i, String str) {
        if (i >= this.f240404s.size()) {
            SuggestionActionView suggestionActionView = (SuggestionActionView) this.f240405t.inflate(R.layout.suggestion_action_view, this.f240402q, false);
            this.f240404s.add(i, suggestionActionView);
            this.f240402q.addView(suggestionActionView, i);
        }
        SuggestionActionView suggestionActionView2 = (SuggestionActionView) this.f240404s.get(i);
        suggestionActionView2.setOnClickListener(new C88807ar(this, i, str));
        suggestionActionView2.setVisibility(0);
        return suggestionActionView2;
    }

    /* renamed from: u */
    public final void mo82574u(Suggestion suggestion, C88728ak akVar) {
        this.f240403r = false;
        if (suggestion.equals(this.f240417n)) {
            this.f240403r = C88728ak.m143730u(suggestion);
        }
        super.mo82574u(suggestion, akVar);
    }

    /* renamed from: x */
    public final void mo82575x(boolean z) {
        if (!this.f240395d) {
            this.f240394c = true;
            this.f240395d = true;
            C88819c.m144205b(getContext(), this.f240392a, this.f240393b, z);
        }
    }

    /* renamed from: y */
    public final void mo82576y() {
        if (this.f240393b == null) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f240400j.inflate();
            horizontalScrollView.getClass();
            this.f240393b = horizontalScrollView;
            LinearLayout linearLayout = (LinearLayout) horizontalScrollView.findViewById(R.id.suggestion_actions_carousel_container);
            linearLayout.getClass();
            this.f240402q = linearLayout;
        }
    }
}
