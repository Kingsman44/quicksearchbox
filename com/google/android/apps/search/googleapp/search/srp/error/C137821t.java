package com.google.android.apps.search.googleapp.search.srp.error;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import com.google.apps.tiktok.nav.C47493d;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.LinkedHashSet;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.t */
/* compiled from: PG */
public final class C137821t {

    /* renamed from: a */
    public static final C58974d f374950a = C58974d.m91136j();

    /* renamed from: k */
    private static final ComponentName f374951k = new ComponentName("com.android.settings", "com.android.settings.Settings$DataUsageSummaryActivity");

    /* renamed from: b */
    public final boolean f374952b;

    /* renamed from: c */
    public final C136213b f374953c;

    /* renamed from: d */
    public final C137813l f374954d;

    /* renamed from: e */
    public final C43531s f374955e;

    /* renamed from: f */
    public final C137440p f374956f;

    /* renamed from: g */
    public final C28443m f374957g;

    /* renamed from: h */
    public final C47493d f374958h;

    /* renamed from: i */
    public final C136225n f374959i;

    /* renamed from: j */
    public C136219h f374960j;

    /* renamed from: l */
    private final C136220i f374961l;

    /* renamed from: m */
    private final C47770dh f374962m;

    /* renamed from: n */
    private final C28306ab f374963n;

    public C137821t(boolean z, C136213b bVar, C137813l lVar, C136220i iVar, C43531s sVar, C137440p pVar, C28443m mVar, C47493d dVar, C136225n nVar, C47770dh dhVar, C28306ab abVar) {
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f374952b = z;
        this.f374953c = bVar;
        this.f374954d = lVar;
        this.f374961l = iVar;
        this.f374955e = sVar;
        this.f374956f = pVar;
        this.f374957g = mVar;
        this.f374958h = dVar;
        this.f374959i = nVar;
        this.f374962m = dhVar;
        this.f374963n = abVar;
    }

    /* renamed from: a */
    public final void mo113982a(C136219h hVar) {
        LayoutInflater from = LayoutInflater.from(this.f374954d.getContext());
        View findViewById = this.f374954d.requireView().findViewById(R.id.googleapp_error_card_container);
        C69664n.m101059e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        viewGroup.removeAllViews();
        View inflate = from.inflate(R.layout.googleapp_error_card_inner_view, viewGroup, false);
        viewGroup.addView(inflate);
        View findViewById2 = inflate.findViewById(R.id.googleapp_error_card_title);
        C69664n.m101060f(findViewById2, "errorView.findViewById(R…ogleapp_error_card_title)");
        View findViewById3 = inflate.findViewById(R.id.googleapp_error_card_explanation);
        C69664n.m101060f(findViewById3, "errorView.findViewById(R…p_error_card_explanation)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.googleapp_error_card_buttons);
        C69664n.m101060f(findViewById4, "errorView.findViewById(R…leapp_error_card_buttons)");
        LinearLayout linearLayout = (LinearLayout) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.googleapp_error_card_header);
        C69664n.m101060f(findViewById5, "errorView.findViewById(R…gleapp_error_card_header)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.googleapp_error_card_feedback_link);
        C69664n.m101060f(findViewById6, "errorView.findViewById(R…error_card_feedback_link)");
        TextView textView2 = (TextView) findViewById6;
        C28306ab abVar = this.f374963n;
        abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(hVar.f370986h)));
        C28306ab abVar2 = this.f374963n;
        abVar2.mo33801b(textView2, abVar2.f76990a.mo33805a(C28427h.m53115a(92751)));
        ((TextView) findViewById2).setText(hVar.f370981c);
        if ((hVar.f370979a & 4) != 0) {
            textView.setText(hVar.f370982d);
        } else {
            ViewParent parent = textView.getParent();
            C69664n.m101059e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(textView);
        }
        int i = hVar.f370979a;
        if ((i & 16) != 0) {
            View inflate2 = LayoutInflater.from(this.f374954d.getContext()).inflate(R.layout.googleapp_error_card_puffy_icon, linearLayout2, false);
            C69664n.m101059e(inflate2, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate2;
            C28306ab abVar3 = this.f374963n;
            abVar3.mo33801b(lottieAnimationView, abVar3.f76990a.mo33805a(C28427h.m53115a(92752)));
            lottieAnimationView.setOnClickListener(new C47591co(this.f374962m, "Puffy icon", new C137814m(this)));
            String str = hVar.f370985g;
            C69664n.m101060f(str, "cardArgs.puffyAnimation");
            C136224m b = C136224m.m221358b(str);
            lottieAnimationView.mo9700j(b.f371000h);
            lottieAnimationView.f15138d.f15342b.setRepeatCount(-1);
            if (b.mo112850a() != null) {
                C69664n.m101058d(b.mo112850a());
                lottieAnimationView.mo9689a(new C137815n(lottieAnimationView));
                lottieAnimationView.f15138d.mo9769i(0.0f, 377.0f);
                lottieAnimationView.f15138d.mo9773j(0.0f);
                lottieAnimationView.mo9695f();
            }
            linearLayout2.addView(lottieAnimationView, 0);
        } else if ((i & 8) != 0) {
            View inflate3 = LayoutInflater.from(this.f374954d.getContext()).inflate(R.layout.googleapp_error_card_icon_tinted, linearLayout2, false);
            C69664n.m101059e(inflate3, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) inflate3;
            imageView.setImageResource(hVar.f370983e);
            Context context = this.f374954d.getContext();
            imageView.setContentDescription(context != null ? context.getString(hVar.f370981c) : null);
            linearLayout2.addView(imageView, 0);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : hVar.f370984f) {
            C69664n.m101060f(next, "cardArgs.buttonList");
            C136217f fVar = (C136217f) next;
            C136216e a = C136216e.m221349a(fVar.f370973b);
            if (a == null) {
                a = C136216e.GRANT_MIC_PERMISSION;
            }
            C69664n.m101060f(a, "buttonArgs.buttonType");
            if (!linkedHashSet.contains(a) && a != C136216e.UNKNOWN) {
                linkedHashSet.add(a);
                View inflate4 = from.inflate(R.layout.googleapp_error_card_button, linearLayout, false);
                C69664n.m101060f(inflate4, "button");
                C136216e a2 = C136216e.m221349a(fVar.f370973b);
                if (a2 == null) {
                    a2 = C136216e.GRANT_MIC_PERMISSION;
                }
                inflate4.setTag(R.id.googleapp_button_type, a2);
                C28306ab abVar4 = this.f374963n;
                abVar4.mo33801b(inflate4, abVar4.f76990a.mo33805a(C28427h.m53115a(fVar.f370976e)));
                View findViewById7 = inflate4.findViewById(R.id.googleapp_error_card_button_text);
                C69664n.m101060f(findViewById7, "button.findViewById(R.id…p_error_card_button_text)");
                TextView textView3 = (TextView) findViewById7;
                if ((fVar.f370972a & 2) != 0) {
                    textView3.setText(fVar.f370974c);
                }
                if ((fVar.f370972a & 4) != 0) {
                    textView3.setCompoundDrawablesWithIntrinsicBounds(fVar.f370975d, 0, 0, 0);
                }
                inflate4.setOnClickListener(new C47591co(this.f374962m, "Retry from error ui", new C137817p(this, fVar)));
                linearLayout.addView(inflate4);
            }
        }
        textView2.setOnClickListener(new C47591co(this.f374962m, "Error card feedback link", new C137816o(this)));
    }

    /* renamed from: b */
    public final void mo113983b(C43363h hVar, boolean z) {
        C136219h a = this.f374953c.mo112846a(this.f374961l.mo112849a(hVar), this.f374952b, z);
        if (!a.equals(this.f374960j)) {
            C69664n.m101060f(a, "cardArgs");
            mo113982a(a);
            this.f374960j = a;
        }
        this.f374954d.requireView().setVisibility(0);
    }

    /* renamed from: c */
    public final void mo113984c() {
        Intent component = new Intent().setComponent(f374951k);
        C69664n.m101060f(component, "Intent().setComponent(DA…MMARY_ACTIVITY_COMPONENT)");
        try {
            this.f374958h.mo51345a(component);
        } catch (ActivityNotFoundException e) {
            ((C58970a) ((C58970a) f374950a.mo56225c()).mo56382g(e)).mo56386p("Mobile data settings activity not found");
            View requireView = this.f374954d.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            Snackbar.m79660p(requireView, R.string.googleapp_error_card_turn_on_mobile_data_failure_error_message, -1).mo48343h();
        }
    }
}
