package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30225y;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.C30649e;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30493f;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.owners.C31016r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.common.base.C58832aw;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.j.a.a.a.q */
/* compiled from: PG */
public final class C23939q extends LinearLayout {

    /* renamed from: a */
    public static final C59071e f65444a = C59071e.m91332i("com.google.android.libraries.j.a.a.a.q");

    /* renamed from: A */
    private final MaterialButton f65445A;

    /* renamed from: B */
    private final MaterialButton f65446B;

    /* renamed from: C */
    private final MaterialButton f65447C;

    /* renamed from: D */
    private final MaterialButton f65448D;

    /* renamed from: E */
    private final MaterialButton f65449E;

    /* renamed from: F */
    private final MaterialButton f65450F;

    /* renamed from: G */
    private final MaterialButton f65451G;

    /* renamed from: H */
    private String f65452H;

    /* renamed from: I */
    private String f65453I;

    /* renamed from: b */
    public final LinearLayout f65454b;

    /* renamed from: c */
    public final RelativeLayout f65455c;

    /* renamed from: d */
    public final TextView f65456d;

    /* renamed from: e */
    public final ViewGroup f65457e;

    /* renamed from: f */
    public final MaterialButton f65458f;

    /* renamed from: g */
    public final MaterialButton f65459g;

    /* renamed from: h */
    public final MaterialButton f65460h;

    /* renamed from: i */
    public final MaterialCardView f65461i;

    /* renamed from: j */
    public final ImageView f65462j;

    /* renamed from: k */
    public final TextView f65463k;

    /* renamed from: l */
    public final C31012n f65464l;

    /* renamed from: m */
    public List f65465m;

    /* renamed from: n */
    public C23938p f65466n;

    /* renamed from: o */
    public View.OnClickListener f65467o = new C23931i(this);

    /* renamed from: p */
    private final View f65468p;

    /* renamed from: q */
    private final View f65469q;

    /* renamed from: r */
    private final View f65470r;

    /* renamed from: s */
    private final AccountParticleDisc f65471s;

    /* renamed from: t */
    private final TextView f65472t;

    /* renamed from: u */
    private final TextView f65473u;

    /* renamed from: v */
    private final View f65474v;

    /* renamed from: w */
    private final ViewGroup f65475w;

    /* renamed from: x */
    private final LinearLayout f65476x;

    /* renamed from: y */
    private final LinearLayout f65477y;

    /* renamed from: z */
    private final MaterialButton f65478z;

    public C23939q(Context context) {
        super(context);
        inflate(context, R.layout.single_setting_view_material, this);
        this.f65468p = findViewById(R.id.consent_ui);
        this.f65469q = findViewById(R.id.loading_ui);
        this.f65470r = findViewById(R.id.loading_failed_ui);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
        this.f65471s = accountParticleDisc;
        C31016r rVar = new C31016r();
        rVar.f83519a = context.getApplicationContext();
        C31012n a = rVar.mo36683a();
        this.f65464l = a;
        C30493f fVar = new C30493f();
        accountParticleDisc.mo35600r(new C30225y(Executors.newSingleThreadExecutor(), C30225y.m56157b(context, fVar, new C30649e(context, a, false)), fVar), fVar);
        this.f65472t = (TextView) findViewById(R.id.account_display_name);
        this.f65473u = (TextView) findViewById(R.id.account_name);
        this.f65454b = (LinearLayout) findViewById(R.id.account_particle_container);
        this.f65474v = findViewById(R.id.write_consent_progress_bar);
        this.f65455c = (RelativeLayout) findViewById(R.id.write_consent_progress_bar_container);
        ImageView imageView = (ImageView) findViewById(R.id.header_image);
        this.f65456d = (TextView) findViewById(R.id.title);
        this.f65475w = (ViewGroup) findViewById(R.id.description_paragraphs_container);
        this.f65457e = (ViewGroup) findViewById(R.id.footer_paragraph_container);
        this.f65476x = (LinearLayout) findViewById(R.id.action_container);
        this.f65477y = (LinearLayout) findViewById(R.id.action_container_vertical);
        this.f65478z = (MaterialButton) findViewById(R.id.positive_button);
        this.f65445A = (MaterialButton) findViewById(R.id.negative_button);
        this.f65446B = (MaterialButton) findViewById(R.id.positive_hairline_button);
        this.f65447C = (MaterialButton) findViewById(R.id.negative_hairline_button);
        this.f65458f = (MaterialButton) findViewById(R.id.retry_loading_button);
        TextView textView = (TextView) findViewById(R.id.something_went_wrong_text);
        this.f65448D = (MaterialButton) findViewById(R.id.positive_hairline_button_vertical);
        this.f65449E = (MaterialButton) findViewById(R.id.positive_rounded_button_vertical);
        this.f65459g = (MaterialButton) findViewById(R.id.temporary_positive_hairline_button_vertical);
        this.f65460h = (MaterialButton) findViewById(R.id.temporary_positive_rounded_button_vertical);
        this.f65450F = (MaterialButton) findViewById(R.id.negative_hairline_button_vertical);
        this.f65451G = (MaterialButton) findViewById(R.id.negative_rounded_button_vertical);
        this.f65461i = (MaterialCardView) findViewById(R.id.bsn_card);
        this.f65462j = (ImageView) findViewById(R.id.bsn_image);
        this.f65463k = (TextView) findViewById(R.id.bsn_content);
        mo29352h(C23938p.CONSENT_DATA_LOADING);
    }

    /* renamed from: l */
    private final void m44510l() {
        if (C58879cp.m90962d(this.f65452H) || C58832aw.m90831a(this.f65453I, this.f65452H)) {
            this.f65472t.setText(this.f65453I);
            this.f65473u.setVisibility(8);
            return;
        }
        this.f65472t.setText(this.f65452H);
        this.f65473u.setText(this.f65453I);
        this.f65473u.setVisibility(0);
    }

    /* renamed from: a */
    public final TextView mo29345a(Spanned spanned) {
        TextView textView = (TextView) inflate(getContext(), R.layout.single_setting_view_material_description_paragraph, (ViewGroup) null);
        textView.setLinksClickable(false);
        textView.setText(spanned);
        return textView;
    }

    /* renamed from: b */
    public final void mo29346b(List list, int i) {
        this.f65475w.removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Spanned spanned = (Spanned) list.get(i2);
            if (i2 == i) {
                String string = getContext().getResources().getString(R.string.end_of_sentence);
                if (!spanned.toString().trim().endsWith(string)) {
                    spanned = new SpannableStringBuilder(spanned).append(string);
                }
                String replaceAll = getContext().getResources().getString(R.string.learn_more_link_text).replaceAll("\\s", "\\ ");
                SpannableStringBuilder append = new SpannableStringBuilder(spanned).append(" ").append(replaceAll);
                append.setSpan(new C23936n(this), append.length() - replaceAll.length(), append.length(), 17);
                TextView a = mo29345a(append);
                a.setMovementMethod(LinkMovementMethod.getInstance());
                a.setAccessibilityDelegate(new C23935m(this));
                this.f65475w.addView(a);
            } else {
                this.f65475w.addView(mo29345a(spanned));
            }
        }
    }

    /* renamed from: c */
    public final void mo29347c(C30492e eVar) {
        this.f65471s.mo35592j(eVar);
        String c = eVar.mo36116c();
        if (!C58832aw.m90831a(this.f65452H, c)) {
            this.f65452H = c;
            m44510l();
        }
        String a = eVar.mo36114a();
        if (!C58832aw.m90831a(this.f65453I, a)) {
            this.f65453I = a;
            m44510l();
        }
    }

    /* renamed from: d */
    public final void mo29348d(View.OnClickListener onClickListener) {
        this.f65445A.setOnClickListener(new C23930h(this, onClickListener));
        this.f65447C.setOnClickListener(new C23930h(this, onClickListener));
        this.f65450F.setOnClickListener(new C23930h(this, onClickListener));
        this.f65451G.setOnClickListener(new C23930h(this, onClickListener));
    }

    /* renamed from: e */
    public final void mo29349e(String str) {
        this.f65447C.setText(str);
        this.f65445A.setText(str);
        this.f65451G.setText(str);
        this.f65450F.setText(str);
    }

    /* renamed from: f */
    public final void mo29350f(View.OnClickListener onClickListener) {
        this.f65446B.setOnClickListener(new C23930h(this, onClickListener));
        this.f65478z.setOnClickListener(new C23930h(this, onClickListener));
        this.f65448D.setOnClickListener(new C23930h(this, onClickListener));
        this.f65449E.setOnClickListener(new C23930h(this, onClickListener));
    }

    /* renamed from: g */
    public final void mo29351g(String str) {
        this.f65478z.setText(str);
        this.f65446B.setText(str);
        this.f65448D.setText(str);
        this.f65449E.setText(str);
    }

    /* renamed from: h */
    public final void mo29352h(C23938p pVar) {
        this.f65466n = pVar;
        C23938p pVar2 = C23938p.CONSENT_DATA_LOADING;
        int ordinal = pVar.ordinal();
        if (ordinal == 0) {
            this.f65468p.setVisibility(8);
            this.f65469q.setVisibility(0);
            this.f65470r.setVisibility(8);
        } else if (ordinal == 1) {
            this.f65468p.setVisibility(8);
            this.f65469q.setVisibility(8);
            this.f65470r.setVisibility(0);
        } else if (ordinal == 2) {
            this.f65468p.setVisibility(0);
            this.f65469q.setVisibility(8);
            this.f65470r.setVisibility(8);
            this.f65474v.setVisibility(8);
        } else if (ordinal == 3) {
            this.f65468p.setVisibility(0);
            this.f65469q.setVisibility(8);
            this.f65470r.setVisibility(8);
            this.f65474v.setVisibility(0);
        }
    }

    /* renamed from: i */
    public final void mo29353i() {
        C0154a aVar = new C0154a(((C0167am) getContext()).mo545jw());
        List list = this.f65465m;
        C23924b bVar = new C23924b();
        Bundle bundle = new Bundle();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list == null || list.isEmpty()) {
            ((C59052c) ((C59052c) C23924b.f65421a.mo56225c()).mo56372aa(47943)).mo56386p("No additionalInfoParagraphs provided; showing empty Learn more dialog");
        } else {
            for (int i = 0; i < list.size(); i++) {
                spannableStringBuilder.append((CharSequence) list.get(i));
                if (i < list.size() - 1) {
                    spannableStringBuilder.append(System.lineSeparator());
                }
            }
        }
        bundle.putCharSequence("AdditionalInfoParagraphs", spannableStringBuilder);
        bVar.setArguments(bundle);
        aVar.mo685r(bVar, "learn_more_dialog_fragment");
        aVar.mo509f();
    }

    /* renamed from: j */
    public final void mo29354j(boolean z) {
        findViewById(R.id.scroll_handle).setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: k */
    public final void mo29355k(int i) {
        C23938p pVar = C23938p.CONSENT_DATA_LOADING;
        int i2 = i - 1;
        if (i2 == 0) {
            this.f65476x.setVisibility(0);
            this.f65476x.setGravity(8388613);
            this.f65477y.setVisibility(8);
            this.f65478z.setVisibility(0);
            this.f65445A.setVisibility(0);
            this.f65446B.setVisibility(8);
            this.f65447C.setVisibility(8);
        } else if (i2 == 1) {
            this.f65476x.setVisibility(0);
            this.f65476x.setGravity(7);
            this.f65477y.setVisibility(8);
            this.f65478z.setVisibility(8);
            this.f65445A.setVisibility(8);
            this.f65446B.setVisibility(0);
            this.f65447C.setVisibility(0);
        } else if (i2 != 2) {
            this.f65476x.setVisibility(8);
            this.f65476x.setGravity(7);
            this.f65477y.setVisibility(0);
            this.f65449E.setVisibility(8);
            this.f65460h.setVisibility(8);
            this.f65451G.setVisibility(8);
            this.f65448D.setVisibility(0);
            this.f65459g.setVisibility(0);
            this.f65450F.setVisibility(0);
        } else {
            this.f65476x.setVisibility(8);
            this.f65476x.setGravity(7);
            this.f65477y.setVisibility(0);
            this.f65449E.setVisibility(0);
            this.f65460h.setVisibility(0);
            this.f65451G.setVisibility(0);
            this.f65448D.setVisibility(8);
            this.f65459g.setVisibility(8);
            this.f65450F.setVisibility(8);
        }
    }
}
