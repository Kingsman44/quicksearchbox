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
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4932ax.p4933a.C64269i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.EnhancementSuggestionView */
/* compiled from: PG */
public class EnhancementSuggestionView extends CoreSuggestionView {

    /* renamed from: c */
    public static final /* synthetic */ int f240332c = 0;

    /* renamed from: d */
    private static final C58528ij f240333d = C58528ij.m90012L(0, 8, 1);

    /* renamed from: e */
    private final LayoutInflater f240334e;

    /* renamed from: f */
    private View f240335f;

    /* renamed from: g */
    private TextView f240336g;

    /* renamed from: h */
    private TextView f240337h;

    /* renamed from: i */
    private SuggestionIconView[] f240338i;

    /* renamed from: j */
    private SuggestionIconView f240339j;

    /* renamed from: k */
    private HorizontalScrollView f240340k;

    /* renamed from: q */
    private LinearLayout f240341q;

    /* renamed from: r */
    private final List f240342r = new ArrayList();

    public EnhancementSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240334e = LayoutInflater.from(context);
    }

    /* renamed from: p */
    private final void m144051p(TextView textView, Spanned spanned, int i) {
        textView.setText(spanned);
        int i2 = 2;
        if (i == 4) {
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else if (this.f240416m == 67 || i == 1 || i == 2) {
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
    private final void m144052x(int i, int i2, int i3) {
        this.f240338i[i].f240381h = new C88832p(i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo82341a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        if (i == this.f240416m) {
            return true;
        }
        if (i == 66) {
            this.f240416m = 66;
            this.f240336g.setSingleLine(false);
            this.f240336g.setMaxLines(2);
            this.f240336g.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240337h.setVisibility(8);
            return true;
        } else if (i != 67) {
            return false;
        } else {
            this.f240416m = 67;
            this.f240336g.setSingleLine(true);
            this.f240336g.setMaxLines(1);
            this.f240336g.setTextAppearance(getContext(), R.style.LineOneTextAppearance);
            this.f240337h.setVisibility(0);
            this.f240337h.setTextAppearance(getContext(), R.style.LineTwoTextAppearance);
            return true;
        }
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        if (f240333d.contains(Integer.valueOf(i))) {
            return this.f240338i[i];
        }
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        m144051p(this.f240336g, spanned, i);
        C91115n.m148882n(this.f240337h, (Drawable) null);
    }

    /* renamed from: f */
    public final void mo82537f(C88805ap apVar) {
        View view = this.f240335f;
        int i = 8;
        if (!apVar.mo82593b() && this.f240419p) {
            i = 0;
        }
        view.setVisibility(i);
        super.mo82537f(apVar);
    }

    /* renamed from: g */
    public final int mo82544g() {
        ViewParent parent;
        TextView textView = this.f240337h;
        if (textView == null || (parent = textView.getParent()) == null || !(parent instanceof View)) {
            return 0;
        }
        return ((View) parent).getWidth();
    }

    /* renamed from: h */
    public final void mo82545h() {
        this.f240338i[0].setPadding(0, 0, 0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        C58800sl lA = f240333d.iterator();
        while (lA.hasNext()) {
            SuggestionIconView suggestionIconView = this.f240338i[((Integer) lA.next()).intValue()];
            suggestionIconView.mo82569l();
            suggestionIconView.setVisibility(4);
        }
        SuggestionIconView suggestionIconView2 = this.f240339j;
        if (suggestionIconView2 != null) {
            suggestionIconView2.setVisibility(4);
        }
        C91115n.m148882n(this.f240337h, (Drawable) null);
        C91115n.m148882n(this.f240336g, (Drawable) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f240338i[0].getLayoutParams();
        marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.default_suggestion_left_margin);
        this.f240338i[0].setLayoutParams(marginLayoutParams);
        HorizontalScrollView horizontalScrollView = this.f240340k;
        if (horizontalScrollView != null) {
            horizontalScrollView.scrollTo(0, 0);
        }
        for (MaterialButton visibility : this.f240342r) {
            visibility.setVisibility(8);
        }
    }

    /* renamed from: i */
    public final void mo82546i(Spanned spanned, int i) {
        m144051p(this.f240337h, spanned, i);
        C91115n.m148882n(this.f240337h, (Drawable) null);
    }

    /* renamed from: j */
    public final void mo82547j(int i) {
        this.f240337h.setTextColor(i);
    }

    /* renamed from: k */
    public final void mo82548k(Drawable drawable) {
        this.f240337h.setCompoundDrawablePadding(getResources().getDimensionPixelOffset(R.dimen.line_two_drawable_padding));
        C91115n.m148882n(this.f240337h, drawable);
    }

    /* renamed from: l */
    public final void mo82549l(int i, boolean z) {
        if (i == -1) {
            this.f240337h.setTypeface(Typeface.create(Typeface.DEFAULT, true != z ? 0 : 2));
        } else {
            this.f240337h.setTypeface(Typeface.create(Typeface.DEFAULT, i, z));
        }
    }

    /* renamed from: m */
    public final void mo82550m() {
        if (this.f240339j == null) {
            SuggestionIconView suggestionIconView = (SuggestionIconView) this.f240334e.inflate(R.layout.offline_badge_icon, this, false);
            this.f240339j = suggestionIconView;
            addView(suggestionIconView);
        }
        SuggestionIconView suggestionIconView2 = this.f240339j;
        if (suggestionIconView2 != null) {
            suggestionIconView2.setVisibility(0);
        }
    }

    /* renamed from: n */
    public final void mo82551n(List list) {
        C58976aa aaVar = C58975e.f156826a;
        for (int i = 0; i < list.size(); i++) {
            C64269i iVar = (C64269i) list.get(i);
            if (i >= this.f240342r.size()) {
                MaterialButton materialButton = (MaterialButton) this.f240334e.inflate(R.layout.enhancement_chip_view, this.f240341q, false);
                this.f240342r.add(materialButton);
                LinearLayout linearLayout = this.f240341q;
                linearLayout.getClass();
                linearLayout.addView(materialButton);
            }
            List list2 = this.f240342r;
            MaterialButton materialButton2 = (MaterialButton) list2.get(Math.min(i, list2.size() - 1));
            materialButton2.setOnClickListener(new C88830n(this, iVar));
            materialButton2.setVisibility(0);
            materialButton2.setText(((C64269i) list.get(i)).f173766b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.suggestion_divider);
        findViewById.getClass();
        this.f240335f = findViewById;
        TextView textView = (TextView) findViewById(R.id.text_1);
        textView.getClass();
        this.f240336g = textView;
        TextView textView2 = (TextView) findViewById(R.id.text_2);
        textView2.getClass();
        this.f240337h = textView2;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(R.id.enhancement_scroll_view);
        horizontalScrollView.getClass();
        this.f240340k = horizontalScrollView;
        LinearLayout linearLayout = (LinearLayout) horizontalScrollView.findViewById(R.id.enhancement_carousel_container);
        linearLayout.getClass();
        this.f240341q = linearLayout;
        SuggestionIconView[] suggestionIconViewArr = new SuggestionIconView[9];
        this.f240338i = suggestionIconViewArr;
        SuggestionIconView suggestionIconView = (SuggestionIconView) findViewById(R.id.label_icon);
        suggestionIconView.getClass();
        suggestionIconViewArr[0] = suggestionIconView;
        SuggestionIconView[] suggestionIconViewArr2 = this.f240338i;
        SuggestionIconView suggestionIconView2 = (SuggestionIconView) findViewById(R.id.inner_icon);
        suggestionIconView2.getClass();
        suggestionIconViewArr2[8] = suggestionIconView2;
        SuggestionIconView[] suggestionIconViewArr3 = this.f240338i;
        SuggestionIconView suggestionIconView3 = (SuggestionIconView) findViewById(R.id.primary_action_icon);
        suggestionIconView3.getClass();
        suggestionIconViewArr3[1] = suggestionIconView3;
        C58800sl lA = f240333d.iterator();
        while (lA.hasNext()) {
            int intValue = ((Integer) lA.next()).intValue();
            this.f240338i[intValue].setOnClickListener(new C88831o(this, intValue));
        }
        m144052x(1, getResources().getDimensionPixelSize(R.dimen.denser_core_suggestion_height), getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_invisible_width));
        m144052x(8, getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width), getResources().getDimensionPixelSize(R.dimen.core_suggestion_inner_action_button_invisible_width));
        this.f240338i[1].setBackground(new RippleDrawable(ColorStateList.valueOf(getResources().getColor(R.color.suggestion_background_pressed)), (Drawable) null, (Drawable) null));
    }
}
