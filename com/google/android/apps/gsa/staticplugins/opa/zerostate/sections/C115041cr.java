package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73909r;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.updatescenter.UpdatesCenterIconView;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114822bs;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114832cb;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3921j.C52353op;
import com.google.assistant.p3897e.p3921j.p3926e.C52013hl;
import com.google.assistant.p3994s.p3995a.C53362lb;
import com.google.assistant.p3994s.p3995a.C53363lc;
import com.google.assistant.p3994s.p3995a.C53372ll;
import com.google.assistant.p3994s.p3995a.C53418nd;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63204j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cr */
/* compiled from: PG */
public final class C115041cr extends C114989at {

    /* renamed from: h */
    public static final C59071e f319320h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cr");

    /* renamed from: i */
    public final C86124t f319321i;

    /* renamed from: j */
    public final C113954b f319322j;

    /* renamed from: k */
    private final Activity f319323k;

    /* renamed from: l */
    private final C114994ay f319324l;

    /* renamed from: m */
    private final SharedPreferences f319325m;

    /* renamed from: n */
    private final C109790aj f319326n;

    /* renamed from: o */
    private final C86054o f319327o;

    /* renamed from: p */
    private final C22871g f319328p;

    /* renamed from: q */
    private final C114839ci f319329q;

    /* renamed from: r */
    private final C68214a f319330r;

    /* renamed from: s */
    private final boolean f319331s;

    /* renamed from: t */
    private final C73909r f319332t;

    /* renamed from: u */
    private final AnimatorListenerAdapter f319333u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115041cr(Context context, Activity activity, C114822bs bsVar, SharedPreferences sharedPreferences, C109790aj ajVar, C86054o oVar, C58833ax axVar, C22871g gVar, C86124t tVar, C113954b bVar, C114839ci ciVar, C68214a aVar, C73909r rVar, C114994ay ayVar, C91097g gVar2, boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        super(context, bsVar, gVar2, axVar);
        Context context2 = context;
        C114822bs bsVar2 = bsVar;
        C58833ax axVar2 = axVar;
        this.f319323k = activity;
        this.f319325m = sharedPreferences;
        this.f319326n = ajVar;
        this.f319327o = oVar;
        this.f319328p = gVar;
        this.f319321i = tVar;
        this.f319322j = bVar;
        this.f319329q = ciVar;
        this.f319330r = aVar;
        this.f319324l = ayVar;
        this.f319331s = z;
        this.f319333u = animatorListenerAdapter;
        this.f319332t = rVar;
    }

    /* renamed from: k */
    private final void m190726k(ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(R.id.tos_and_pp_text);
        textView.setText(Html.fromHtml(((C73841bf) this.f319330r.mo27525b()).mo65322a().getString(R.string.tos_and_pp_string)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        viewGroup.setVisibility(0);
    }

    /* renamed from: a */
    public final View mo101577a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        String str;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319154f == null) {
            this.f319154f = LayoutInflater.from(this.f319323k).inflate(R.layout.contextual_greeting_section_view, (ViewGroup) null);
            if (this.f319321i.mo79746e(C90014bt.f247289eO)) {
                int dimensionPixelSize = this.f319149a.getResources().getDimensionPixelSize(R.dimen.zero_state_contextual_greeting_section_padding_left_v2);
                int dimensionPixelSize2 = this.f319149a.getResources().getDimensionPixelSize(R.dimen.zero_state_contextual_greeting_section_padding_top_v2);
                int dimensionPixelSize3 = this.f319149a.getResources().getDimensionPixelSize(R.dimen.zero_state_contextual_greeting_section_padding_right_v2);
                int dimensionPixelSize4 = this.f319149a.getResources().getDimensionPixelSize(R.dimen.zero_state_contextual_greeting_section_padding_bottom_v2);
                View view = this.f319154f;
                view.getClass();
                view.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
            }
            View view2 = this.f319154f;
            view2.getClass();
            TextView textView = (TextView) view2.findViewById(R.id.contextual_greeting_message);
            View view3 = this.f319154f;
            view3.getClass();
            ImageView imageView = (ImageView) view3.findViewById(R.id.contextual_greeting_customization_icon);
            View view4 = this.f319154f;
            view4.getClass();
            UpdatesCenterIconView updatesCenterIconView = (UpdatesCenterIconView) view4.findViewById(R.id.contextual_greeting_updates_center_entrypoint);
            View view5 = this.f319154f;
            view5.getClass();
            ImageView imageView2 = (ImageView) view5.findViewById(R.id.contextual_greeting_profile_icon);
            View view6 = this.f319154f;
            view6.getClass();
            ImageView imageView3 = (ImageView) view6.findViewById(R.id.contextual_greeting_opa_logo);
            View view7 = this.f319154f;
            view7.getClass();
            ViewGroup viewGroup4 = (ViewGroup) view7.findViewById(R.id.contextual_greeting_weather_widget);
            View view8 = this.f319154f;
            view8.getClass();
            ViewGroup viewGroup5 = (ViewGroup) view8.findViewById(R.id.tos_and_pp_container);
            View view9 = this.f319154f;
            view9.getClass();
            ViewGroup viewGroup6 = (ViewGroup) view9.findViewById(R.id.contextual_greeting_air_quality_container);
            if (!this.f319321i.mo79746e(C90014bt.f247315eo) || !this.f319331s) {
                viewGroup = viewGroup4;
                viewGroup2 = viewGroup5;
                viewGroup3 = viewGroup6;
            } else {
                ImageView imageView4 = (ImageView) LayoutInflater.from(this.f319149a).inflate(R.layout.snapshot_assistant_logo, (ViewGroup) null);
                if (C90962a.m148577a(this.f319149a)) {
                    imageView4.setImageResource(R.drawable.google_assistant_logo_white);
                }
                View view10 = this.f319154f;
                view10.getClass();
                ((ViewGroup) view10.findViewById(R.id.contextual_greeting_container)).addView(imageView4, 0);
                View view11 = this.f319154f;
                view11.getClass();
                ViewGroup viewGroup7 = (ViewGroup) view11.findViewById(R.id.contextual_greeting);
                C114839ci ciVar = this.f319329q;
                AnimatorListenerAdapter animatorListenerAdapter = this.f319333u;
                viewGroup7.setAlpha(0.0f);
                int dimensionPixelSize5 = ciVar.f318615b.getResources().getDimensionPixelSize(R.dimen.snapshot_logo_animation_y);
                AnimatorSet animatorSet = new AnimatorSet();
                viewGroup3 = viewGroup6;
                viewGroup2 = viewGroup5;
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(imageView4, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(imageView4, "translationY", new float[]{0.0f, (float) (-dimensionPixelSize5)})});
                animatorSet.setDuration(800);
                animatorSet.setInterpolator(C91107f.m148858a(0.4f, 0.8f));
                animatorSet.addListener(new C114832cb(imageView4));
                AnimatorSet animatorSet2 = new AnimatorSet();
                viewGroup = viewGroup4;
                animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup7, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(viewGroup7, "translationY", new float[]{(float) dimensionPixelSize5, 0.0f})});
                animatorSet2.setDuration(934);
                animatorSet2.setStartDelay(266);
                animatorSet2.setInterpolator(C91107f.m148858a(0.0f, 0.8f));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(new Animator[]{animatorSet, animatorSet2});
                animatorSet3.setStartDelay(1200);
                if (animatorListenerAdapter != null) {
                    animatorSet3.addListener(animatorListenerAdapter);
                }
                animatorSet3.start();
            }
            if (!this.f319324l.mo101805c().mo56113h() || ((C53372ll) this.f319324l.mo101805c().mo56107c()).f140055b.isEmpty()) {
                C59104x d = f319320h.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RegContextualGreetingSC");
                ((C59052c) ((C59052c) d).mo56372aa(29510)).mo56386p("#setGreetingMessage(): missing greeting message.");
            } else {
                textView.setText(((C53372ll) this.f319324l.mo101805c().mo56107c()).f140055b);
                if (this.f319321i.mo79746e(C90014bt.f247289eO)) {
                    textView.setGravity(8388627);
                    textView.setPadding(0, 0, 0, 0);
                    textView.setPadding(0, this.f319149a.getResources().getDimensionPixelSize(R.dimen.contextual_greeting_item_padding_top), 0, 0);
                    textView.setTextAppearance(R.style.ZeroStateContextualGreetingTextV2);
                    textView.setHyphenationFrequency(1);
                    textView.setLineHeight(this.f319149a.getResources().getDimensionPixelSize(R.dimen.zero_state_contextual_greeting_text_line_height));
                }
            }
            if (!this.f319321i.mo79746e(C90059dk.f249162cs) || this.f319321i.mo79746e(C90059dk.f249163ct)) {
                imageView.setVisibility(8);
            } else {
                C28292j jVar = new C28292j(104335);
                jVar.mo33795i(5);
                this.f319152d.add(C28293k.m52908e(jVar, new C28293k[0]));
                imageView.getClass();
                C28295m.m52919e(imageView, jVar);
                imageView.setOnClickListener(new C89943l(new C115037cn(this)));
            }
            this.f319328p.mo28211k(this.f319332t.mo65443a(), "Verfiies if user is eligible for Updates Center.", new C115039cp(this, updatesCenterIconView));
            if (!this.f319321i.mo79746e(C90014bt.f247289eO) || (this.f319153e.mo56113h() && ((C106171l) this.f319153e.mo56107c()).f296304b.f230023b.isDeviceLocked())) {
                imageView2.setVisibility(8);
            } else {
                C114034q.m188819o(imageView2, this.f319322j);
                imageView2.setOnClickListener(new C115036cm(this, imageView2));
            }
            if (this.f319321i.mo79746e(C90014bt.f247313em)) {
                imageView3.setVisibility(0);
            }
            if (!this.f319324l.mo101806d().mo56113h() || (((C53418nd) this.f319324l.mo101806d().mo56107c()).f140161a & 1) == 0) {
                viewGroup.setVisibility(8);
            } else {
                C52013hl hlVar = ((C53418nd) this.f319324l.mo101806d().mo56107c()).f140162b;
                if (hlVar == null) {
                    hlVar = C52013hl.f136508e;
                }
                ViewGroup viewGroup8 = viewGroup;
                TextView textView2 = (TextView) viewGroup8.findViewById(R.id.contextual_greeting_weather_description);
                this.f319151c.mo101628a(hlVar, (ImageView) viewGroup8.findViewById(R.id.contextual_greeting_weather_icon));
                if (hlVar.f136511b.isEmpty()) {
                    ((C59052c) ((C59052c) C114822bs.f318591a.mo56226d()).mo56372aa(29572)).mo56386p("#setWeatherDescription(): missing full weather description.");
                } else {
                    textView2.setText(hlVar.f136511b);
                }
                C28292j jVar2 = new C28292j(50834);
                jVar2.mo33795i(5);
                if ((((C53418nd) this.f319324l.mo101806d().mo56107c()).f140161a & 2) != 0) {
                    C63204j jVar3 = ((C53418nd) this.f319324l.mo101806d().mo56107c()).f140163c;
                    if (jVar3 == null) {
                        jVar3 = C63204j.f170749e;
                    }
                    jVar2.mo33792f(jVar3);
                }
                this.f319152d.add(C28293k.m52908e(jVar2, new C28293k[0]));
                viewGroup8.getClass();
                C28295m.m52919e(viewGroup8, jVar2);
                mo101802h(viewGroup8);
            }
            Account a = this.f319327o.mo79668a();
            if (a == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = a.name;
            }
            if (this.f319325m.getBoolean("opa_is_in_try_before_you_buy_updated".concat(String.valueOf(str)), false)) {
                if (a == null || this.f319326n.mo98131m(a)) {
                    ViewGroup viewGroup9 = viewGroup2;
                    if (a == null && !this.f319325m.getBoolean("opa_has_shown_tos_and_pp", false)) {
                        m190726k(viewGroup9);
                        this.f319325m.edit().putBoolean("opa_has_shown_tos_and_pp", true).apply();
                    }
                } else {
                    m190726k(viewGroup2);
                    this.f319326n.mo98129k(a, 3);
                }
            }
            if (this.f319324l.mo101804a().mo56113h() && !((C53363lc) this.f319324l.mo101804a().mo56107c()).f140019a.isEmpty()) {
                ViewGroup viewGroup10 = viewGroup3;
                viewGroup10.setVisibility(0);
                C62971cq cqVar = ((C53363lc) this.f319324l.mo101804a().mo56107c()).f140019a;
                TextView textView3 = (TextView) viewGroup10.findViewById(R.id.contextual_greeting_air_quality);
                textView3.setText(((C53362lb) cqVar.get(0)).f140015b);
                if ((((C53362lb) cqVar.get(0)).f140014a & 2) != 0) {
                    C52353op opVar = ((C53362lb) cqVar.get(0)).f140016c;
                    if (opVar == null) {
                        opVar = C52353op.f137398e;
                    }
                    textView3.setTextColor(Color.argb((int) (opVar.f137403d * 255.0f), (int) (opVar.f137400a * 255.0f), (int) (opVar.f137401b * 255.0f), (int) (opVar.f137402c * 255.0f)));
                }
                C28292j jVar4 = new C28292j(57266);
                jVar4.mo33795i(5);
                this.f319152d.add(C28293k.m52908e(jVar4, new C28293k[0]));
                viewGroup10.getClass();
                C28295m.m52919e(viewGroup10, jVar4);
            }
        }
        mo101803j();
        View view12 = this.f319154f;
        view12.getClass();
        return view12;
    }
}
