package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.C45251c;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.template.C45281h;
import com.google.android.setupdesign.p3555d.C45293a;
import com.google.android.setupdesign.p3555d.C45295c;
import com.google.android.setupdesign.p3555d.C45296d;
import com.google.android.setupdesign.p3555d.C45298f;
import com.google.android.setupdesign.p3555d.C45300h;
import com.google.android.setupdesign.p3555d.C45301i;
import com.google.android.setupdesign.p3555d.C45302j;
import com.google.android.setupdesign.p3558f.C45309c;
import com.google.android.setupdesign.p3558f.C45312f;
import com.google.android.setupdesign.p3558f.C45313g;
import com.google.android.setupdesign.p3558f.C45314h;
import com.google.android.setupdesign.view.BottomScrollView;

/* compiled from: PG */
public class GlifLayout extends C45251c {

    /* renamed from: e */
    private ColorStateList f118308e;

    /* renamed from: f */
    private boolean f118309f;

    /* renamed from: g */
    private boolean f118310g;

    /* renamed from: h */
    private ColorStateList f118311h;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    /* renamed from: w */
    private void m80689w(AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C45318g.f118388g, i, 0);
            this.f118310g = mo49121f() && obtainStyledAttributes.getBoolean(4, false);
            mo49131l(C45295c.class, new C45295c(this, attributeSet, i));
            mo49131l(C45293a.class, new C45293a(this, attributeSet, i));
            mo49131l(C45296d.class, new C45296d(this, attributeSet, i));
            mo49131l(C45300h.class, new C45300h(this));
            mo49131l(C45301i.class, new C45301i(this, attributeSet, i));
            mo49131l(C45298f.class, new C45298f(this));
            mo49131l(C45302j.class, new C45302j());
            ScrollView m = mo49190m();
            if (m != null) {
                if (m instanceof BottomScrollView) {
                    BottomScrollView bottomScrollView = (BottomScrollView) m;
                } else {
                    Log.w("ScrollViewDelegate", "Cannot set non-BottomScrollView. Found=".concat(m.toString()));
                }
            }
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
            if (colorStateList != null) {
                this.f118308e = colorStateList;
                mo49203x();
                ((C45301i) mo49129j(C45301i.class)).mo49234b(colorStateList);
            }
            if (mo49200v() && !mo49122g()) {
                getRootView().setBackgroundColor(C45240c.m80574e(getContext()).mo49100b(getContext(), C45238a.CONFIG_LAYOUT_BACKGROUND_COLOR));
            }
            View h = mo49127h(R.id.sud_layout_content);
            if (h != null) {
                if (mo49121f()) {
                    C45309c.m80756a(h);
                }
                if (!(this instanceof C45292d)) {
                    mo49198t(h);
                }
            }
            mo49199u();
            this.f118311h = obtainStyledAttributes.getColorStateList(0);
            mo49203x();
            this.f118309f = obtainStyledAttributes.getBoolean(1, true);
            mo49203x();
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                ViewStub viewStub = (ViewStub) mo49127h(R.id.sud_layout_sticky_header);
                viewStub.setLayoutResource(resourceId);
                viewStub.inflate();
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: x */
    private final void mo49203x() {
        int i;
        Drawable drawable;
        if (mo49127h(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.f118311h;
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.f118308e;
                i = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.f118309f) {
                drawable = new C45287c(i);
            } else {
                drawable = new ColorDrawable(i);
            }
            ((C45281h) mo49129j(C45281h.class)).mo49185a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo49117b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_glif_template;
        }
        return mo49128i(layoutInflater, 2132150212, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ViewGroup mo49118c(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.mo49118c(i);
    }

    /* renamed from: m */
    public final ScrollView mo49190m() {
        View h = mo49127h(R.id.sud_scroll_view);
        if (h instanceof ScrollView) {
            return (ScrollView) h;
        }
        return null;
    }

    /* renamed from: n */
    public final TextView mo49191n() {
        return ((C45293a) mo49129j(C45293a.class)).mo49220a();
    }

    /* renamed from: o */
    public final TextView mo49192o() {
        return ((C45295c) mo49129j(C45295c.class)).mo49224a();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((C45296d) mo49129j(C45296d.class)).mo49232d();
        C45295c cVar = (C45295c) mo49129j(C45295c.class);
        TextView textView = (TextView) cVar.f118340a.mo49127h(R.id.suc_layout_title);
        if (C45312f.m80763c(cVar.f118340a)) {
            View h = cVar.f118340a.mo49127h(R.id.sud_layout_header);
            C45309c.m80756a(h);
            if (textView != null) {
                C45314h.m80764a(textView, new C45313g(C45238a.CONFIG_HEADER_TEXT_COLOR, (C45238a) null, C45238a.CONFIG_HEADER_TEXT_SIZE, C45238a.CONFIG_HEADER_FONT_FAMILY, (C45238a) null, C45238a.CONFIG_HEADER_TEXT_MARGIN_TOP, C45238a.CONFIG_HEADER_TEXT_MARGIN_BOTTOM, C45312f.m80761a(textView.getContext())));
            }
            ViewGroup viewGroup = (ViewGroup) h;
            if (viewGroup != null) {
                Context context = viewGroup.getContext();
                viewGroup.setBackgroundColor(C45240c.m80574e(context).mo49100b(context, C45238a.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
                if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM)) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM, 0.0f));
                        viewGroup.setLayoutParams(layoutParams);
                    }
                }
            }
        }
        cVar.mo49228e();
        if (cVar.f118341b) {
            cVar.mo49225b(textView);
        }
        C45293a aVar = (C45293a) mo49129j(C45293a.class);
        TextView textView2 = (TextView) aVar.f118337a.mo49127h(R.id.sud_layout_subtitle);
        if (textView2 != null && C45312f.m80763c(aVar.f118337a)) {
            C45314h.m80764a(textView2, new C45313g(C45238a.CONFIG_DESCRIPTION_TEXT_COLOR, C45238a.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, C45238a.CONFIG_DESCRIPTION_TEXT_SIZE, C45238a.CONFIG_DESCRIPTION_FONT_FAMILY, C45238a.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, C45238a.CONFIG_DESCRIPTION_TEXT_MARGIN_TOP, C45238a.CONFIG_DESCRIPTION_TEXT_MARGIN_BOTTOM, C45312f.m80761a(textView2.getContext())));
        }
        C45301i iVar = (C45301i) mo49129j(C45301i.class);
        ProgressBar a = iVar.mo49233a();
        if (iVar.f118357b && a != null) {
            TemplateLayout templateLayout = iVar.f118356a;
            if ((templateLayout instanceof GlifLayout) && ((GlifLayout) templateLayout).mo49200v()) {
                Context context2 = a.getContext();
                ViewGroup.LayoutParams layoutParams2 = a.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i = marginLayoutParams2.topMargin;
                    if (C45240c.m80574e(context2).mo49107l(C45238a.CONFIG_PROGRESS_BAR_MARGIN_TOP)) {
                        i = (int) C45240c.m80574e(context2).mo49099a(context2, C45238a.CONFIG_PROGRESS_BAR_MARGIN_TOP, context2.getResources().getDimension(R.dimen.sud_progress_bar_margin_top));
                    }
                    int i2 = marginLayoutParams2.bottomMargin;
                    if (C45240c.m80574e(context2).mo49107l(C45238a.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM)) {
                        i2 = (int) C45240c.m80574e(context2).mo49099a(context2, C45238a.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM, context2.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                    }
                    if (!(i == marginLayoutParams2.topMargin && i2 == marginLayoutParams2.bottomMargin)) {
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, i, marginLayoutParams2.rightMargin, i2);
                    }
                }
            } else {
                Context context3 = a.getContext();
                ViewGroup.LayoutParams layoutParams3 = a.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, (int) context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_top), marginLayoutParams3.rightMargin, (int) context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                }
            }
        }
        C45300h hVar = (C45300h) mo49129j(C45300h.class);
        if (C45312f.m80763c(hVar.f118355a)) {
            ImageView imageView = (ImageView) hVar.f118355a.mo49127h(R.id.sud_account_avatar);
            TextView textView3 = (TextView) hVar.f118355a.mo49127h(R.id.sud_account_name);
            LinearLayout linearLayout = (LinearLayout) hVar.f118355a.mo49127h(R.id.sud_layout_profile);
            C45309c.m80756a(hVar.f118355a.mo49127h(R.id.sud_layout_header));
            if (!(imageView == null || textView3 == null)) {
                Context context4 = imageView.getContext();
                ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, (int) C45240c.m80574e(context4).mo49099a(context4, C45238a.CONFIG_ACCOUNT_AVATAR_MARGIN_END, 0.0f), marginLayoutParams4.bottomMargin);
                }
                imageView.setMaxHeight((int) C45240c.m80574e(context4).mo49099a(context4, C45238a.CONFIG_ACCOUNT_AVATAR_SIZE, context4.getResources().getDimension(R.dimen.sud_account_avatar_max_height)));
                textView3.setTextSize(0, (float) ((int) C45240c.m80574e(context4).mo49099a(context4, C45238a.CONFIG_ACCOUNT_NAME_TEXT_SIZE, context4.getResources().getDimension(R.dimen.sud_account_name_text_size))));
                Typeface create = Typeface.create(C45240c.m80574e(context4).mo49104h(context4, C45238a.CONFIG_ACCOUNT_NAME_FONT_FAMILY), 0);
                if (create != null) {
                    textView3.setTypeface(create);
                }
                linearLayout.setGravity(C45312f.m80761a(linearLayout.getContext()));
            }
        }
        TextView textView4 = (TextView) mo49127h(R.id.sud_layout_description);
        if (textView4 == null) {
            return;
        }
        if (this.f118310g) {
            C45314h.m80764a(textView4, new C45313g(C45238a.CONFIG_DESCRIPTION_TEXT_COLOR, C45238a.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, C45238a.CONFIG_DESCRIPTION_TEXT_SIZE, C45238a.CONFIG_DESCRIPTION_FONT_FAMILY, C45238a.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, (C45238a) null, (C45238a) null, C45312f.m80761a(textView4.getContext())));
        } else if (mo49121f()) {
            C45313g gVar = new C45313g((C45238a) null, (C45238a) null, (C45238a) null, (C45238a) null, (C45238a) null, (C45238a) null, (C45238a) null, C45312f.m80761a(textView4.getContext()));
            C45314h.m80765b(textView4, gVar);
            textView4.setGravity(gVar.f118376h);
        }
    }

    /* renamed from: p */
    public final void mo49194p(int i) {
        C45293a aVar = (C45293a) mo49129j(C45293a.class);
        TextView a = aVar.mo49220a();
        if (a == null || i == 0) {
            Log.w("DescriptionMixin", "Fail to set text due to either invalid resource id or text view not found.");
            return;
        }
        a.setText(i);
        aVar.mo49222c();
    }

    /* renamed from: q */
    public final void mo49195q(CharSequence charSequence) {
        ((C45293a) mo49129j(C45293a.class)).mo49221b(charSequence);
    }

    /* renamed from: r */
    public final void mo49196r(int i) {
        ((C45295c) mo49129j(C45295c.class)).mo49226c(i);
    }

    /* renamed from: s */
    public final void mo49197s(CharSequence charSequence) {
        ((C45295c) mo49129j(C45295c.class)).mo49227d(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo49198t(View view) {
        int a;
        Context context = view.getContext();
        boolean l = C45240c.m80574e(context).mo49107l(C45238a.CONFIG_CONTENT_PADDING_TOP);
        if (mo49121f() && l && (a = (int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_CONTENT_PADDING_TOP, 0.0f)) != view.getPaddingTop()) {
            view.setPadding(view.getPaddingStart(), a, view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo49199u() {
        int i;
        int i2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sud_glif_land_middle_horizontal_spacing);
        if (mo49121f() && C45240c.m80574e(getContext()).mo49107l(C45238a.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING)) {
            dimensionPixelSize = (int) C45240c.m80574e(getContext()).mo49099a(getContext(), C45238a.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING, 0.0f);
        }
        View h = mo49127h(R.id.sud_landscape_header_area);
        int i3 = 0;
        if (h != null) {
            if (!mo49121f() || !C45240c.m80574e(getContext()).mo49107l(C45238a.CONFIG_LAYOUT_MARGIN_END)) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.sudMarginEnd});
                int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize2;
            } else {
                i2 = (int) C45240c.m80574e(getContext()).mo49099a(getContext(), C45238a.CONFIG_LAYOUT_MARGIN_END, 0.0f);
            }
            h.setPadding(h.getPaddingStart(), h.getPaddingTop(), (dimensionPixelSize / 2) - i2, h.getPaddingBottom());
        }
        View h2 = mo49127h(R.id.sud_landscape_content_area);
        if (h2 != null) {
            if (!mo49121f() || !C45240c.m80574e(getContext()).mo49107l(C45238a.CONFIG_LAYOUT_MARGIN_START)) {
                TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{R.attr.sudMarginStart});
                int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
                obtainStyledAttributes2.recycle();
                i = dimensionPixelSize3;
            } else {
                i = (int) C45240c.m80574e(getContext()).mo49099a(getContext(), C45238a.CONFIG_LAYOUT_MARGIN_START, 0.0f);
            }
            if (h != null) {
                i3 = (dimensionPixelSize / 2) - i;
            }
            h2.setPadding(i3, h2.getPaddingTop(), h2.getPaddingEnd(), h2.getPaddingBottom());
        }
    }

    /* renamed from: v */
    public final boolean mo49200v() {
        if (!this.f118310g) {
            return mo49121f() && C45240c.m80578o(getContext());
        }
        return true;
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.f118309f = true;
        this.f118310g = false;
        m80689w((AttributeSet) null, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f118309f = true;
        this.f118310g = false;
        m80689w(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118309f = true;
        this.f118310g = false;
        m80689w(attributeSet, i);
    }
}
