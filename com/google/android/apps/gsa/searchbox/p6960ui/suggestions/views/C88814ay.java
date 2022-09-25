package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al;
import com.google.android.apps.gsa.shared.p7195y.C91201bf;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ay */
/* compiled from: PG */
public final class C88814ay extends C88795af {

    /* renamed from: a */
    public static final int f240447a = Color.rgb(66, 133, 244);

    /* renamed from: b */
    public final Resources f240448b = getResources();

    /* renamed from: c */
    public RelativeLayout f240449c;

    /* renamed from: d */
    public View f240450d;

    /* renamed from: e */
    public C88821e f240451e;

    /* renamed from: f */
    public ImageView f240452f;

    /* renamed from: g */
    public C88821e f240453g;

    /* renamed from: h */
    public ImageView f240454h;

    /* renamed from: i */
    public LinearLayout f240455i;

    /* renamed from: j */
    public TextView f240456j;

    /* renamed from: k */
    public String f240457k;

    /* renamed from: q */
    public String f240458q;

    /* renamed from: r */
    public HorizontalScrollView f240459r;

    /* renamed from: s */
    public LinearLayout f240460s;

    /* renamed from: t */
    public boolean f240461t;

    /* renamed from: u */
    public boolean f240462u;

    /* renamed from: v */
    public List f240463v;

    /* renamed from: w */
    public boolean f240464w;

    /* renamed from: x */
    private final C91201bf f240465x;

    /* renamed from: y */
    private boolean f240466y;

    public C88814ay(Context context, C91201bf bfVar) {
        super(context, (AttributeSet) null);
        this.f240465x = bfVar;
        this.f240416m = 3;
        mo82582o();
    }

    /* renamed from: D */
    private static void m144190D(TextView textView, int i) {
        if (i > 0) {
            textView.setSingleLine(false);
            textView.setMaxLines(i);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: x */
    public static C88821e m144191x(ImageView imageView) {
        return new C88821e(imageView, new C88812aw(imageView));
    }

    /* renamed from: A */
    public final void mo82601A(ImageView imageView, boolean z) {
        int dimensionPixelSize = this.f240448b.getDimensionPixelSize(R.dimen.universal_suggestion_icon_size);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.addRule(true != z ? 21 : 20);
        layoutParams.addRule(15);
        if (z) {
            imageView.setId(View.generateViewId());
            C91115n.m148873e(layoutParams, 0, 0, this.f240448b.getDimensionPixelSize(R.dimen.universal_suggestion_icon_margin_width), 0);
        } else {
            imageView.setId(R.id.universal_suggestion_action_icon);
            imageView.setDuplicateParentStateEnabled(false);
        }
        imageView.setLayoutParams(layoutParams);
    }

    /* renamed from: B */
    public final void mo82602B(C88705f fVar, ImageView imageView, String str) {
        fVar.mo82427a().mo85428r(fVar.mo82428b(this.f240465x.mo85474b(str)), "sb.u.UniSugView.ImageCallback", new C88813ax(imageView));
    }

    /* renamed from: C */
    public final void mo82603C() {
        if (!this.f240461t) {
            this.f240461t = true;
            C88819c.m144205b(getContext(), this.f240454h, this.f240459r, true);
        }
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 3;
    }

    /* renamed from: c */
    public final C88800ak mo82349c(int i) {
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: f */
    public final void mo82537f(C88805ap apVar) {
        View view = this.f240450d;
        int i = 8;
        if (!apVar.mo82593b() && this.f240419p) {
            i = 0;
        }
        view.setVisibility(i);
        super.mo82537f(apVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo82582o() {
        super.mo82582o();
        this.f240466y = true;
        this.f240455i = new LinearLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        this.f240452f = imageView;
        addView(imageView);
        addView(this.f240455i);
        ImageView imageView2 = this.f240452f;
        this.f240451e = m144191x(imageView2);
        mo82601A(imageView2, true);
        this.f240450d = new View(getContext());
        int dimensionPixelSize = this.f240448b.getDimensionPixelSize(R.dimen.suggestion_divider_height);
        int dimensionPixelSize2 = this.f240448b.getDimensionPixelSize(R.dimen.suggestion_divider_margin_start);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, dimensionPixelSize);
        C91115n.m148873e(layoutParams, dimensionPixelSize2, 0, 0, 0);
        layoutParams.addRule(12);
        this.f240450d.setId(View.generateViewId());
        this.f240450d.setBackgroundColor(this.f240448b.getColor(R.color.searchbox_suggestion_divider_background));
        this.f240450d.setLayoutParams(layoutParams);
        addView(this.f240450d);
        this.f240455i.setId(R.id.universal_suggestion_container);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.alignWithParent = true;
        layoutParams2.addRule(17, this.f240452f.getId());
        layoutParams2.addRule(15);
        int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R.dimen.universal_suggestion_default_padding);
        this.f240455i.setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.universal_suggestion_left_padding), dimensionPixelSize3, getContext().getResources().getDimensionPixelSize(R.dimen.universal_suggestion_right_padding), dimensionPixelSize3);
        this.f240455i.setLayoutParams(layoutParams2);
        this.f240455i.setOrientation(1);
        this.f240455i.setDuplicateParentStateEnabled(true);
    }

    /* renamed from: p */
    public final TextView mo82604p(List list) {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(C88767al.m143943e(list, getContext(), this.f240448b, this.f240464w));
        m144190D(textView, C88767al.m143941c(list));
        if (this.f240466y) {
            m144190D(textView, 2);
            this.f240466y = false;
        }
        return textView;
    }

    /* renamed from: y */
    public final void mo82605y(boolean z) {
        C88819c.m144204a(getContext(), this.f240454h, this.f240459r, z);
        this.f240461t = false;
        this.f240462u = false;
    }

    /* renamed from: z */
    public final void mo82606z() {
        this.f240452f.setRotationY(0.0f);
        this.f240452f.setContentDescription((CharSequence) null);
        this.f240452f.setClickable(false);
    }
}
