package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83895ba;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83861u;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83864x;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83933t;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84027v;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109771c;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109772d;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109774f;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.shared.C109859c;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.shared.ConsentHeaderLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50357ub;
import com.google.assistant.p3861at.C50358uc;
import com.google.assistant.p3861at.ado;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4538j.p4539a.C59305c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.p4017at.p4018a.p4019a.p4020a.C53751ai;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.m */
/* compiled from: PG */
public final class C109846m extends C109854u {

    /* renamed from: m */
    public static final /* synthetic */ int f306071m = 0;

    /* renamed from: p */
    private static final C59071e f306072p = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.m");

    /* renamed from: j */
    public C91189au f306073j;

    /* renamed from: k */
    public boolean f306074k;

    /* renamed from: l */
    public C104149a f306075l;

    /* renamed from: q */
    private C109774f f306076q;

    /* renamed from: r */
    private LinearLayout f306077r;

    /* renamed from: q */
    private final C109859c m182935q(ado ado, List list) {
        C58976aa aaVar = C58975e.f156826a;
        C109859c cVar = new C109859c(getActivity(), (AttributeSet) null, 0);
        cVar.mo98210d(ado.f129055d, list);
        cVar.mo77424c(ado.f129054c);
        this.f306073j.mo85421i(ado.f129057f, cVar.mo77422a());
        return cVar;
    }

    /* renamed from: t */
    private final void m182936t(int i, String str) {
        ((TextView) this.f306077r.findViewById(i)).setText(Html.fromHtml(str));
    }

    /* renamed from: u */
    private final boolean m182937u() {
        int a = C83933t.m133682a(this.f306076q.f305877m);
        return a != 0 && a == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C83864x mo98186e() {
        C83861u uVar = (C83861u) C83864x.f228509f.createBuilder();
        int a = C53751ai.m86897a(this.f306076q.f305871g);
        if (a == 0) {
            a = 1;
        }
        uVar.copyOnWrite();
        C83864x xVar = (C83864x) uVar.instance;
        xVar.f228513c = a - 1;
        xVar.f228511a |= 2;
        C50358uc ucVar = this.f306076q.f305867c;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        C63088z zVar = ucVar.f131071d;
        uVar.copyOnWrite();
        C83864x xVar2 = (C83864x) uVar.instance;
        zVar.getClass();
        xVar2.f228511a |= 4;
        xVar2.f228514d = zVar;
        uVar.copyOnWrite();
        C83864x xVar3 = (C83864x) uVar.instance;
        xVar3.f228512b = 1;
        xVar3.f228511a = 1 | xVar3.f228511a;
        C63088z zVar2 = this.f306076q.f305875k;
        uVar.copyOnWrite();
        C83864x xVar4 = (C83864x) uVar.instance;
        zVar2.getClass();
        xVar4.f228511a |= 8;
        xVar4.f228515e = zVar2;
        return (C83864x) uVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C109778j mo98187g() {
        C109778j jVar = this.f306076q.f305874j;
        return jVar == null ? C109778j.f305889e : jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final View mo98188j(LayoutInflater layoutInflater) {
        C109772d dVar;
        LayoutInflater from = LayoutInflater.from(C84027v.m133919a(this.f306075l, layoutInflater.getContext(), this.f306074k));
        this.f306077r = (LinearLayout) View.inflate(from.getContext(), R.layout.omniconsent_content, (ViewGroup) null);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        this.f306077r.setLayoutTransition(layoutTransition);
        if (m182937u()) {
            C109771c cVar = (C109771c) C109772d.f305859c.createBuilder();
            String string = getString(R.string.atv_udc_title_text);
            cVar.copyOnWrite();
            C109772d dVar2 = (C109772d) cVar.instance;
            string.getClass();
            dVar2.f305861a = 2;
            dVar2.f305862b = string;
            dVar = (C109772d) cVar.build();
        } else {
            dVar = this.f306076q.f305866b;
            if (dVar == null) {
                dVar = C109772d.f305859c;
            }
        }
        ConsentHeaderLayout consentHeaderLayout = (ConsentHeaderLayout) from.inflate(R.layout.consent_header, (ViewGroup) null, false);
        consentHeaderLayout.mo98207a(dVar);
        consentHeaderLayout.setId(R.id.udc_header_layout);
        this.f306077r.addView(consentHeaderLayout);
        C50358uc ucVar = this.f306076q.f305867c;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        if (this.f306076q.f305879o) {
            String join = TextUtils.join("<p>", ucVar.f131073f);
            from.inflate(R.layout.intro_text, this.f306077r, true);
            m182936t(R.id.opa_consent_intro_text, join);
            from.inflate(R.layout.identity_text, this.f306077r, true);
            m182936t(R.id.opa_consent_identity, ucVar.f131074g);
            this.f306077r.findViewById(R.id.opa_consent_intro_divider_up).setVisibility(8);
            this.f306077r.findViewById(R.id.opa_consent_intro_space_up).setVisibility(0);
            this.f306077r.findViewById(R.id.opa_consent_identity_space_down).setVisibility(8);
            this.f306077r.findViewById(R.id.opa_consent_identity_divider_down).setVisibility(0);
            if (ucVar.f131078k.size() == 0) {
                C59104x d = f306072p.mo56226d();
                d.mo56378ag(C58975e.f156826a, "UdcAskForConsentFrag");
                ((C59052c) ((C59052c) d).mo56372aa(25292)).mo56386p("setting_zippy empty");
            } else {
                ado ado = (ado) ucVar.f131078k.get(0);
                C58480gp e = C58485gu.m89837e();
                C50357ub ubVar = ucVar.f131077j;
                if (ubVar == null) {
                    ubVar = C50357ub.f131060d;
                }
                for (C59308f fVar : ubVar.f131063b) {
                    e.mo55395g(new C59305c(fVar.f157474a).f157465a);
                }
                C109859c q = m182935q(ado, e.mo55394f());
                C28295m.m52919e(q, new C28292j(46422));
                this.f306077r.addView(q);
                from.inflate(R.layout.element_divider, this.f306077r, true);
                from.inflate(R.layout.footer_section, this.f306077r, true);
                ((TextView) this.f306077r.findViewById(R.id.opa_consent_footer_paragraph)).setText(Html.fromHtml(TextUtils.join("<p>", ado.f129056e)));
            }
        } else {
            if (m182937u() || dVar.f305861a != 2) {
                String join2 = TextUtils.join("<p>", ucVar.f131073f);
                from.inflate(R.layout.intro_text, this.f306077r, true);
                m182936t(R.id.opa_consent_intro_text, join2);
            }
            from.inflate(R.layout.identity_text, this.f306077r, true);
            m182936t(R.id.opa_consent_identity, ucVar.f131074g);
            if (m182937u()) {
                this.f306077r.findViewById(R.id.opa_consent_intro_divider_up).setVisibility(8);
                this.f306077r.findViewById(R.id.opa_consent_intro_space_up).setVisibility(0);
                this.f306077r.findViewById(R.id.opa_consent_identity_space_down).setVisibility(8);
                this.f306077r.findViewById(R.id.opa_consent_identity_divider_down).setVisibility(0);
            }
            int i = 0;
            while (i < ucVar.f131078k.size()) {
                C109859c q2 = m182935q((ado) ucVar.f131078k.get(i), ((ado) ucVar.f131078k.get(i)).f129056e);
                if (i == 0) {
                    C28295m.m52919e(q2, new C28292j(46422));
                    i = 0;
                }
                this.f306077r.addView(q2);
                if (i < ucVar.f131078k.size() - 1) {
                    from.inflate(R.layout.consent_element_spacing, this.f306077r, true);
                }
                i++;
            }
            from.inflate(R.layout.element_divider, this.f306077r, true);
            from.inflate(R.layout.footer_section, this.f306077r, true);
            ((TextView) this.f306077r.findViewById(R.id.opa_consent_footer_paragraph)).setText(Html.fromHtml(TextUtils.join("<p>", ucVar.f131079l)));
        }
        return this.f306077r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C28292j mo98189k() {
        C109774f fVar = this.f306076q;
        if (!fVar.f305879o) {
            return new C28292j(46419);
        }
        C50358uc ucVar = fVar.f305867c;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        if (ucVar.f131078k.size() != 0) {
            C56002b a = C56002b.m87880a(((ado) ucVar.f131078k.get(0)).f129053b);
            if (a == null) {
                a = C56002b.UNKNOWN_SETTING_SET_ID;
            }
            if (a == C56002b.DA) {
                return new C28292j(133701);
            }
            if (a == C56002b.DC) {
                return new C28292j(133702);
            }
            if (a == C56002b.WAA) {
                return new C28292j(133703);
            }
            return new C28292j(46419);
        }
        C59104x d = f306072p.mo56226d();
        d.mo56378ag(C58975e.f156826a, "UdcAskForConsentFrag");
        ((C59052c) ((C59052c) d).mo56372aa(25291)).mo56386p("#onCreateOpaPageLayoutVe: setting_zippy empty");
        return new C28292j(46419);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo98190l() {
        return this.f306076q.f305868d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo98191m() {
        return this.f306076q.f305869e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo98192n() {
        mo98203r();
    }

    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getClass();
        C109774f fVar = (C109774f) C90734ar.m148199b(arguments, "udc_ask_for_consent_args", C109774f.f305863p.getParserForType());
        C58838bb.m90867b(fVar, "Must supply UdcAskForConsentArgs under key %s", "udc_ask_for_consent_args");
        this.f306076q = fVar;
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo98194p() {
        return this.f306076q.f305878n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo98193o() {
        if ((this.f306076q.f305865a & 64) != 0) {
            Activity activity = getActivity();
            C83915b bVar = this.f306076q.f305872h;
            if (bVar == null) {
                bVar = C83915b.f228541j;
            }
            C83895ba.m133621a(activity, bVar, new C109844k(this), C109845l.f306070a).mo77277a();
            return;
        }
        C59104x b = C109854u.f306089n.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaUdcFragment");
        ((C59052c) ((C59052c) b).mo56372aa(25299)).mo56386p("#rejectConsent");
        C89949q.m146521e(C28285c.m52882i(this.f306092o, 5, (Integer) null), false);
        this.f306100h = 3;
        mo77318iT().mo77312a();
    }
}
