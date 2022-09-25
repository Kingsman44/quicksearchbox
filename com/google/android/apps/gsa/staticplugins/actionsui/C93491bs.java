package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.C1586a;
import androidx.cardview.widget.C1587b;
import androidx.cardview.widget.C1588c;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.contacts.example.ExampleContact;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7187ui.C91103b;
import com.google.android.apps.gsa.shared.util.p7187ui.C91104c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bs */
/* compiled from: PG */
public final class C93491bs extends CardView implements C93492bt {

    /* renamed from: A */
    private View f260914A;

    /* renamed from: g */
    public final TextView f260915g;

    /* renamed from: h */
    WebImageView f260916h;

    /* renamed from: i */
    public final LinearLayout f260917i;

    /* renamed from: j */
    Drawable f260918j;

    /* renamed from: k */
    public C91189au f260919k;

    /* renamed from: l */
    private final View f260920l;

    /* renamed from: m */
    private final TextView f260921m;

    /* renamed from: n */
    private WebImageView f260922n;

    /* renamed from: o */
    private final View f260923o;

    /* renamed from: p */
    private final View f260924p;

    /* renamed from: q */
    private final View f260925q;

    /* renamed from: r */
    private final View f260926r;

    /* renamed from: s */
    private final TextView f260927s;

    /* renamed from: t */
    private final TextView f260928t;

    /* renamed from: u */
    private final TextView f260929u;

    /* renamed from: v */
    private final View f260930v;

    /* renamed from: w */
    private final TextView f260931w;

    /* renamed from: x */
    private final TextView f260932x;

    /* renamed from: y */
    private final TextView f260933y;

    /* renamed from: z */
    private final View f260934z;

    public C93491bs(Context context) {
        super(context);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        mo4475e(0.0f);
        this.f4345f.f4347b.setElevation(0.0f);
        mo4473c(getResources().getColor(17170445));
        if (this.f4342b) {
            this.f4342b = false;
            C1586a aVar = this.f4345f;
            C1587b.m4206b(aVar, ((C1588c) aVar.f4346a).f4349b);
        }
        mo4476f();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.card_view_vertical_margin);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.card_view_horizontal_margin);
        layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setLayoutParams(layoutParams);
        View inflate = layoutInflater.inflate(R.layout.help_card, this, false);
        this.f260920l = inflate;
        this.f260915g = (TextView) inflate.findViewById(R.id.help_card_headline);
        this.f260921m = (TextView) inflate.findViewById(R.id.help_card_example);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.help_card_refresh_example);
        this.f260917i = linearLayout;
        C89941l.m146512c(linearLayout, 7470);
        this.f260925q = inflate.findViewById(R.id.help_card_previews);
        this.f260916h = (WebImageView) inflate.findViewById(R.id.help_card_image_preview_1);
        this.f260922n = (WebImageView) inflate.findViewById(R.id.help_card_image_preview_2);
        this.f260926r = inflate.findViewById(R.id.help_card_date_preview);
        this.f260928t = (TextView) inflate.findViewById(R.id.help_card_date_preview_day);
        this.f260929u = (TextView) inflate.findViewById(R.id.help_card_date_preview_month);
        this.f260927s = (TextView) inflate.findViewById(R.id.help_card_date_preview_day_of_week);
        this.f260930v = inflate.findViewById(R.id.help_card_time_preview);
        this.f260931w = (TextView) inflate.findViewById(R.id.help_card_time_preview_hour);
        this.f260932x = (TextView) inflate.findViewById(R.id.help_card_time_preview_separator);
        this.f260933y = (TextView) inflate.findViewById(R.id.help_card_time_preview_minute);
        this.f260923o = inflate.findViewById(R.id.divider);
        this.f260934z = inflate.findViewById(R.id.divider_title);
        this.f260924p = inflate.findViewById(R.id.blank_space);
        addView(inflate);
    }

    /* renamed from: h */
    private final void m153953h(View view) {
        View view2 = this.f260914A;
        if (view2 != view) {
            if (view2 != null) {
                C91104c.m148853b(view2).alpha(0.0f).setListener(new C91103b(view2)).setDuration(500);
                C91104c.m148854c(view).setDuration(500);
            } else {
                view.setVisibility(0);
            }
            this.f260914A = view;
        }
    }

    /* renamed from: A */
    public final void mo87754A(int i) {
        mo87801g();
        this.f260916h.setImageDrawable(getResources().getDrawable(i));
        this.f260916h.mo76736g();
    }

    /* renamed from: B */
    public final void mo87755B(String str, String str2) {
        if (this.f260914A == this.f260930v) {
            TextView textView = this.f260932x;
            C91104c.m148855d(C91104c.m148852a(this.f260931w, str, 0.75f), C91104c.m148852a(textView, textView.getText(), 0.75f), C91104c.m148852a(this.f260933y, str2, 0.75f));
        } else {
            this.f260931w.setText(str);
            this.f260933y.setText(str2);
        }
        m153953h(this.f260930v);
    }

    /* renamed from: C */
    public final void mo87756C(String str) {
        mo87801g();
        C91189au auVar = this.f260919k;
        auVar.getClass();
        this.f260916h.mo76738i(str, auVar);
    }

    /* renamed from: a */
    public final void mo87757a(String str) {
        String string = getContext().getString(R.string.help_quoted_example_query, new Object[]{str});
        if (TextUtils.isEmpty(this.f260921m.getText())) {
            this.f260921m.setText(string);
        } else {
            C91104c.m148852a(this.f260921m, string, 1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo87801g() {
        WebImageView webImageView = this.f260922n;
        this.f260922n = this.f260916h;
        this.f260916h = webImageView;
        webImageView.setVisibility(4);
        m153953h(this.f260916h);
    }

    /* renamed from: v */
    public final void mo87758v(String str) {
        this.f260915g.setText(str);
    }

    /* renamed from: w */
    public final void mo87759w(String str, String str2) {
        this.f260915g.setText(str);
        this.f260921m.setText(str2);
        this.f260923o.setVisibility(8);
        this.f260917i.setVisibility(8);
        this.f260925q.setVisibility(8);
        this.f260934z.setVisibility(0);
        this.f260924p.setVisibility(0);
    }

    /* renamed from: x */
    public final void mo87760x(String str) {
        mo87801g();
        try {
            this.f260916h.setImageDrawable(getContext().getPackageManager().getApplicationIcon(str));
            this.f260916h.mo76736g();
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: y */
    public final void mo87761y(ExampleContact exampleContact) {
        new C93490br(this).execute(new Long[]{Long.valueOf(exampleContact.a)});
    }

    /* renamed from: z */
    public final void mo87762z(String str, String str2, String str3) {
        if (this.f260914A == this.f260926r) {
            C91104c.m148855d(C91104c.m148852a(this.f260927s, str, 0.75f), C91104c.m148852a(this.f260928t, str2, 0.75f), C91104c.m148852a(this.f260929u, str3, 0.75f));
        } else {
            this.f260927s.setText(str);
            this.f260928t.setText(str2);
            this.f260929u.setText(str3);
        }
        m153953h(this.f260926r);
    }
}
