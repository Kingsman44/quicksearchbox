package com.google.android.apps.search.googleapp.search.srp.error;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.search.googleapp.p10318i.C136213b;
import com.google.android.apps.search.googleapp.p10318i.C136216e;
import com.google.android.apps.search.googleapp.p10318i.C136217f;
import com.google.android.apps.search.googleapp.p10318i.C136219h;
import com.google.android.apps.search.googleapp.p10318i.C136220i;
import com.google.android.apps.search.googleapp.p10318i.C136224m;
import com.google.android.apps.search.googleapp.p10318i.C136225n;
import com.google.android.apps.search.googleapp.search.p10410f.C137440p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.web.contrib.errorpage.C43531s;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.nav.C47493d;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.HashSet;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.j */
/* compiled from: PG */
public final class C137811j {

    /* renamed from: a */
    public static final C58974d f374924a = C58974d.m91136j();

    /* renamed from: b */
    static final ComponentName f374925b = new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity");

    /* renamed from: c */
    public final C136213b f374926c;

    /* renamed from: d */
    public final C137803b f374927d;

    /* renamed from: e */
    public final C43531s f374928e;

    /* renamed from: f */
    public final C137440p f374929f;

    /* renamed from: g */
    public final C28443m f374930g;

    /* renamed from: h */
    public final C47493d f374931h;

    /* renamed from: i */
    public final C136225n f374932i;

    /* renamed from: j */
    public final boolean f374933j;

    /* renamed from: k */
    public C136219h f374934k;

    /* renamed from: l */
    private final C136220i f374935l;

    /* renamed from: m */
    private final C47770dh f374936m;

    /* renamed from: n */
    private final C28306ab f374937n;

    public C137811j(boolean z, C136213b bVar, C137803b bVar2, C136220i iVar, C43531s sVar, C137440p pVar, C28443m mVar, C47493d dVar, C136225n nVar, C47770dh dhVar, C28306ab abVar) {
        this.f374926c = bVar;
        this.f374935l = iVar;
        this.f374928e = sVar;
        this.f374929f = pVar;
        this.f374927d = bVar2;
        this.f374930g = mVar;
        this.f374931h = dVar;
        this.f374933j = z;
        this.f374932i = nVar;
        this.f374936m = dhVar;
        this.f374937n = abVar;
    }

    /* renamed from: a */
    public static C137803b m224036a(AccountId accountId) {
        C137803b bVar = new C137803b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }

    /* renamed from: b */
    public final void mo113973b(C136219h hVar) {
        LayoutInflater from = LayoutInflater.from(this.f374927d.getContext());
        View findViewById = this.f374927d.getView().findViewById(R.id.googleapp_error_card_container);
        findViewById.getClass();
        ViewGroup viewGroup = (ViewGroup) findViewById;
        viewGroup.removeAllViews();
        View inflate = from.inflate(R.layout.googleapp_error_card_inner_view, viewGroup, false);
        inflate.getClass();
        viewGroup.addView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.googleapp_error_card_explanation);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.googleapp_error_card_buttons);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.googleapp_error_card_header);
        TextView textView2 = (TextView) inflate.findViewById(R.id.googleapp_error_card_feedback_link);
        C28306ab abVar = this.f374937n;
        abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(hVar.f370986h)));
        C28306ab abVar2 = this.f374937n;
        abVar2.mo33801b(textView2, abVar2.f76990a.mo33805a(C28427h.m53115a(92751)));
        ((TextView) inflate.findViewById(R.id.googleapp_error_card_title)).setText(hVar.f370981c);
        if ((hVar.f370979a & 4) != 0) {
            textView.setText(hVar.f370982d);
        } else {
            ((ViewGroup) textView.getParent()).removeView(textView);
        }
        int i = hVar.f370979a;
        if ((i & 16) != 0) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) LayoutInflater.from(this.f374927d.getContext()).inflate(R.layout.googleapp_error_card_puffy_icon, linearLayout2, false);
            C28306ab abVar3 = this.f374937n;
            abVar3.mo33801b(lottieAnimationView, abVar3.f76990a.mo33805a(C28427h.m53115a(92752)));
            lottieAnimationView.setOnClickListener(new C47591co(this.f374936m, "Puffy icon", new C137809h(this)));
            C136224m b = C136224m.m221358b(hVar.f370985g);
            lottieAnimationView.mo9700j(b.f371000h);
            lottieAnimationView.mo9693d(true);
            if (b.mo112850a() != null) {
                b.mo112850a().getClass();
                lottieAnimationView.mo9689a(new C137810i(lottieAnimationView));
                lottieAnimationView.f15138d.mo9769i(0.0f, 377.0f);
                lottieAnimationView.f15138d.mo9773j(0.0f);
                lottieAnimationView.mo9695f();
            }
            linearLayout2.addView(lottieAnimationView, 0);
        } else if ((i & 8) != 0) {
            ImageView imageView = (ImageView) LayoutInflater.from(this.f374927d.getContext()).inflate(R.layout.googleapp_error_card_icon_tinted, linearLayout2, false);
            imageView.setImageResource(hVar.f370983e);
            imageView.setContentDescription(this.f374927d.getContext().getString(hVar.f370981c));
            linearLayout2.addView(imageView, 0);
        }
        HashSet hashSet = new HashSet();
        for (C136217f fVar : hVar.f370984f) {
            C136216e a = C136216e.m221349a(fVar.f370973b);
            if (a == null) {
                a = C136216e.GRANT_MIC_PERMISSION;
            }
            if (!hashSet.contains(a) && a != C136216e.UNKNOWN) {
                hashSet.add(a);
                View inflate2 = from.inflate(R.layout.googleapp_error_card_button, linearLayout, false);
                C136216e a2 = C136216e.m221349a(fVar.f370973b);
                if (a2 == null) {
                    a2 = C136216e.GRANT_MIC_PERMISSION;
                }
                inflate2.setTag(R.id.googleapp_button_type, a2);
                C28306ab abVar4 = this.f374937n;
                abVar4.mo33801b(inflate2, abVar4.f76990a.mo33805a(C28427h.m53115a(fVar.f370976e)));
                TextView textView3 = (TextView) inflate2.findViewById(R.id.googleapp_error_card_button_text);
                if ((fVar.f370972a & 2) != 0) {
                    textView3.setText(fVar.f370974c);
                }
                if ((fVar.f370972a & 4) != 0) {
                    textView3.setCompoundDrawablesWithIntrinsicBounds(fVar.f370975d, 0, 0, 0);
                }
                inflate2.setOnClickListener(new C47591co(this.f374936m, "Retry from error ui", new C137804c(this, fVar)));
                linearLayout.addView(inflate2);
            }
        }
        textView2.setOnClickListener(new C47591co(this.f374936m, "Error card feedback link", new C137808g(this)));
    }

    /* renamed from: c */
    public final void mo113974c(Optional optional, boolean z) {
        C136219h a = this.f374926c.mo112846a(this.f374935l.mo112849a((C43363h) optional.orElse(null)), this.f374933j, z);
        if (!a.equals(this.f374934k)) {
            mo113973b(a);
            this.f374934k = a;
        }
        View view = this.f374927d.getView();
        view.getClass();
        view.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo113975d() {
        Intent intent = new Intent();
        intent.setComponent(f374925b);
        try {
            this.f374931h.mo51345a(intent);
        } catch (ActivityNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) f374924a.mo56225c()).mo56382g(e)).mo56372aa(41042)).mo56386p("Mobile data settings activity not found");
            View view = this.f374927d.getView();
            view.getClass();
            Snackbar.m79660p(view, R.string.googleapp_error_card_turn_on_mobile_data_failure_error_message, -1).mo48343h();
        }
    }
}
