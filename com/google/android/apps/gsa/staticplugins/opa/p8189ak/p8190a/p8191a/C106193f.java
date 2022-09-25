package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8190a.p8191a;

import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89123d;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89125f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C106193f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C106203p f296360a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f296361b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f296362c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f296363d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f296364e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f296365f;

    /* renamed from: g */
    public final /* synthetic */ C60870cx f296366g;

    /* renamed from: h */
    public final /* synthetic */ Locale f296367h;

    public /* synthetic */ C106193f(C106203p pVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5, C60870cx cxVar6, Locale locale) {
        this.f296360a = pVar;
        this.f296361b = cxVar;
        this.f296362c = cxVar2;
        this.f296363d = cxVar3;
        this.f296364e = cxVar4;
        this.f296365f = cxVar5;
        this.f296366g = cxVar6;
        this.f296367h = locale;
    }

    public final Object call() {
        Optional optional;
        String str;
        C106203p pVar = this.f296360a;
        C60870cx cxVar = this.f296361b;
        C60870cx cxVar2 = this.f296362c;
        C60870cx cxVar3 = this.f296363d;
        C60870cx cxVar4 = this.f296364e;
        C60870cx cxVar5 = this.f296365f;
        C60870cx cxVar6 = this.f296366g;
        Locale locale = this.f296367h;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        boolean booleanValue3 = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        boolean booleanValue4 = ((Boolean) C60856cj.m92909r(cxVar4)).booleanValue();
        boolean booleanValue5 = ((Boolean) C60856cj.m92909r(cxVar5)).booleanValue();
        Map map = (Map) C60856cj.m92909r(cxVar6);
        boolean z = booleanValue4 && (!pVar.f296378b.mo79746e(C90037cp.f248588df) || C106203p.m176959f(map, (int) pVar.f296378b.mo79743a(C90037cp.f248507bi), (int) pVar.f296378b.mo79743a(C90037cp.f248502bd)));
        ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_FETCH_START);
        if (pVar.f296378b.mo79746e(C90053de.f248982o)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C113787bc) pVar.f296379c.mo27525b()).mo100626f();
        }
        if (pVar.f296378b.mo79746e(C90037cp.f248599dq)) {
            ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_EMPTY_SUPPRESSED);
            optional = Optional.empty();
        } else {
            if (pVar.f296378b.mo79746e(C90126fx.f251183dx)) {
                C58976aa aaVar2 = C58975e.f156826a;
                ((C113787bc) pVar.f296379c.mo27525b()).mo100632l();
                pVar.f296384h.mo97284a(pVar.f296385i.mo98060a(C106203p.m176958c(false, false)));
            }
            if (pVar.f296380d || ((int) pVar.f296378b.mo79743a(C90014bt.f247689lr)) == 0) {
                ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_EMPTY_DEMO_USER);
                optional = Optional.empty();
            } else if (!((C113787bc) pVar.f296379c.mo27525b()).mo100629i(pVar.f296378b.mo79746e(C90053de.f248952S))) {
                if (booleanValue2 && pVar.mo95442e(map) && pVar.f296378b.mo79746e(C90037cp.f248534cI)) {
                    optional = pVar.mo95441d();
                } else if (booleanValue3) {
                    ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_ASSISTANT_ON_LOCKSCREEN);
                    optional = Optional.m71637of(C89123d.m144979c(C89125f.ASSISTANT_ON_LOCKSCREEN, pVar.f296388l.mo75121a(locale).getString(R.string.opa_persistent_finish_setup_bar_description_aol, new Object[0])));
                } else if (z) {
                    optional = Optional.m71637of(C89123d.m144979c(C89125f.TELL_MY_FAMILY, pVar.f296388l.mo75121a(locale).getString(R.string.opa_persistent_finish_setup_bar_description_tmf, new Object[0])));
                } else {
                    ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_EMPTY_SIGNED_OUT_MODE_USER);
                    optional = Optional.empty();
                }
            } else if (booleanValue && pVar.f296378b.mo79746e(C90037cp.f248527cB) && pVar.f296390n.mo83823l() && !((C92486a) pVar.f296391o.mo27525b()).mo87249w() && pVar.f296390n.mo83879aP()) {
                ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_VOICE_MATCH);
                C89125f fVar = C89125f.VOICE_MATCH;
                C81515c cVar = pVar.f296388l;
                Object[] objArr = new Object[1];
                if (pVar.f296390n.mo83834w()) {
                    str = ((C92486a) pVar.f296391o.mo27525b()).mo87227A(C90584f.OK_HEY_GOOGLE, locale.toString(), 2, 1).replace(' ', 160);
                } else {
                    str = ((C92486a) pVar.f296391o.mo27525b()).mo87230d().replace(' ', 160);
                }
                objArr[0] = str;
                optional = Optional.m71637of(C89123d.m144979c(fVar, cVar.mo75121a(locale).getString(R.string.greeting_voice_match_button_text, objArr)));
            } else if (pVar.f296378b.mo79746e(C90037cp.f248583da) && ((long) pVar.f296386j.getInt("opa_add_shortcut_screen_seen_count", 0)) < pVar.f296378b.mo79743a(C90037cp.f248572cu) && !pVar.f296387k.mo100727a() && !pVar.f296395s.mo101288a()) {
                ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_ENTRY_POINT_OPTIN);
                if (pVar.f296378b.mo79746e(C90037cp.f248547cV)) {
                    optional = Optional.m71637of(C89123d.m144979c(C89125f.ENTRY_POINT, pVar.f296388l.mo75121a(locale).getString(R.string.opa_add_shortcut, new Object[0])));
                } else {
                    optional = Optional.m71637of(C89123d.m144979c(C89125f.ENTRY_POINT, pVar.f296388l.mo75121a(locale).getString(R.string.opa_finish_setup_bar_description_add_shortcut, new Object[0])));
                }
            } else if (booleanValue2 && pVar.mo95442e(map) && !pVar.f296378b.mo79746e(C90037cp.f248534cI)) {
                optional = pVar.mo95441d();
            } else if (booleanValue5) {
                optional = Optional.m71637of(C89123d.m144979c(C89125f.LONG_PRESS_POWER_CONTEXTUAL_EDU, pVar.f296388l.mo75121a(locale).getString(R.string.opa_persistent_finish_setup_bar_description_lpp_contextual_edu, new Object[0])));
            } else {
                ((C89859i) pVar.f296393q.mo27525b()).mo83702b(C89849ae.SETUP_BAR_CONTENT_FETCH_SUCCESS_OOBE);
                optional = Optional.m71637of(C89123d.m144979c(C89125f.OOBE, pVar.f296388l.mo75121a(locale).getString(R.string.opa_persistent_finish_setup_bar_description, new Object[0])));
            }
        }
        return (Set) optional.map(C106196i.f296370a).orElse(C58733pz.f156496a);
    }
}
