package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.assistant.settings.features.at.a.e;
import com.google.android.apps.gsa.assistant.settings.shared.d.c;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73784g;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73790r;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.assistant.settings.shared.ui.SectionHeaderView;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.y */
/* compiled from: PG */
public final class C10166y extends C10096a {

    /* renamed from: q */
    private static final C59071e f34552q = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.aj.y");

    /* renamed from: a */
    public C86124t f34553a;

    /* renamed from: b */
    public C10149h f34554b;

    /* renamed from: c */
    public o f34555c;

    /* renamed from: d */
    public C69464a f34556d;

    /* renamed from: e */
    public C89656k f34557e;

    /* renamed from: f */
    public C92122r f34558f;

    /* renamed from: g */
    public C83794j f34559g;

    /* renamed from: h */
    public C73784g f34560h;

    /* renamed from: i */
    public ItemView f34561i;

    /* renamed from: j */
    public Context f34562j;

    /* renamed from: k */
    public LinearLayout f34563k;

    /* renamed from: l */
    public LinearLayout f34564l;

    /* renamed from: m */
    public e f34565m;

    /* renamed from: n */
    public e f34566n;

    /* renamed from: o */
    public boolean f34567o;

    /* renamed from: p */
    public boolean f34568p;

    /* renamed from: r */
    private ItemView f34569r;

    /* renamed from: s */
    private ItemView f34570s;

    /* renamed from: t */
    private ItemView f34571t;

    /* renamed from: u */
    private SectionHeaderView f34572u;

    /* renamed from: e */
    public static void m25028e(ItemView itemView, C10098ab abVar) {
        itemView.t().setChecked(abVar.f34386b);
    }

    /* renamed from: d */
    public final void mo18307d() {
        C10100ad a = this.f34554b.mo18289a();
        C58976aa aaVar = C58975e.f156826a;
        C59104x b = f34552q.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PersonalizationFrag");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(1243);
        C10098ab abVar = a.f34391b;
        if (abVar == null) {
            abVar = C10098ab.f34383d;
        }
        cVar.mo56389s("render: PR = %s", Boolean.valueOf(abVar.f34386b));
        ItemView itemView = this.f34561i;
        C10098ab abVar2 = a.f34391b;
        if (abVar2 == null) {
            abVar2 = C10098ab.f34383d;
        }
        m25028e(itemView, abVar2);
        ItemView itemView2 = this.f34569r;
        C10098ab abVar3 = a.f34392c;
        if (abVar3 == null) {
            abVar3 = C10098ab.f34383d;
        }
        m25028e(itemView2, abVar3);
        ItemView itemView3 = this.f34569r;
        C10098ab abVar4 = a.f34391b;
        if (abVar4 == null) {
            abVar4 = C10098ab.f34383d;
        }
        itemView3.setEnabled(abVar4.f34386b);
        ItemView itemView4 = this.f34570s;
        C10098ab abVar5 = a.f34393d;
        if (abVar5 == null) {
            abVar5 = C10098ab.f34383d;
        }
        m25028e(itemView4, abVar5);
        ItemView itemView5 = this.f34570s;
        C10098ab abVar6 = a.f34391b;
        if (abVar6 == null) {
            abVar6 = C10098ab.f34383d;
        }
        itemView5.setEnabled(abVar6.f34386b);
        ItemView itemView6 = this.f34571t;
        C10098ab abVar7 = a.f34394e;
        if (abVar7 == null) {
            abVar7 = C10098ab.f34383d;
        }
        m25028e(itemView6, abVar7);
        ItemView itemView7 = this.f34571t;
        C10098ab abVar8 = a.f34391b;
        if (abVar8 == null) {
            abVar8 = C10098ab.f34383d;
        }
        itemView7.setEnabled(abVar8.f34386b);
    }

    /* renamed from: f */
    public final void mo18308f(boolean z) {
        this.f34554b.mo18292d(z);
        mo18307d();
        this.f34569r.setEnabled(z);
        this.f34570s.setEnabled(z);
        this.f34571t.setEnabled(z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View.OnClickListener onClickListener;
        C58976aa aaVar = C58975e.f156826a;
        this.f34562j = layoutInflater.getContext();
        int i2 = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_personalization, viewGroup, false);
        C73778a.m108339b(this);
        if (((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getBoolean("highlight_pr_then_hpr", false)) {
            this.f34567o = true;
            this.f34568p = true;
        }
        int i3 = ItemView.a;
        ItemView findViewById = viewGroup2.findViewById(R.id.personalization_settings_personal_response);
        this.f34561i = findViewById;
        findViewById.o(c.b(this.f34562j, getString(R.string.assistant_settings_personal_response_summary), getString(R.string.personalization_personal_response_learn_more_url)));
        C73790r.m108349a(this.f34561i.d());
        this.f34565m = new e(this.f34561i);
        ItemView findViewById2 = viewGroup2.findViewById(R.id.personalization_settings_lockscreen_personal_response);
        this.f34569r = findViewById2;
        Context context = this.f34562j;
        if (this.f34553a.mo79746e(C90014bt.f247548jI)) {
            i = R.string.hotword_pref_personal_response_summary_for_ambient_mode;
        } else {
            i = this.f34553a.mo79746e(C90014bt.f247797nt) ? R.string.hotword_pref_personal_response_summary_updated : R.string.hotword_pref_personal_response_summary;
        }
        findViewById2.o(c.b(context, getString(i), getString(R.string.personalization_lockscreen_personal_response_learn_more_url)));
        C73790r.m108349a(this.f34569r.d());
        if (this.f34553a.mo79746e(C90059dk.f249055aR)) {
            this.f34569r.setVisibility(8);
        }
        if ((this.f34553a.mo79746e(C90059dk.f249104bN) || this.f34553a.mo79746e(C90059dk.f249105bO)) && this.f34559g.mo77158B()) {
            ItemView findViewById3 = viewGroup2.findViewById(R.id.settings_nexus_smartspace);
            if (this.f34553a.mo79746e(C90017bw.f248045v)) {
                findViewById3.setOnClickListener(new C10156o(this));
                findViewById3.h(R.drawable.quantum_gm_ic_short_text_vd_theme_24);
            } else {
                findViewById3.setOnClickListener(new C10157p(this));
                findViewById3.h(R.drawable.quantum_ic_smart_button_grey600_24);
            }
            String x = this.f34553a.mo79758x(C90017bw.f247961bW);
            String x2 = this.f34553a.mo79758x(C90017bw.f247962bX);
            if (x.isEmpty()) {
                C59104x c = f34552q.mo56225c();
                c.mo56378ag(C58975e.f156826a, "PersonalizationFrag");
                ((C59052c) ((C59052c) c).mo56372aa(1244)).mo56386p("The fallback link is empty!");
            } else {
                if (x2.isEmpty()) {
                    onClickListener = new C10150i(this, x);
                } else {
                    onClickListener = new C10155n(this, x2, x);
                }
                findViewById3.o(c.a(this.f34562j, getString(R.string.assistant_settings_smartspace_subtitle), onClickListener));
            }
            findViewById3.setVisibility(0);
            C73790r.m108349a(findViewById3.d());
        }
        this.f34570s = viewGroup2.findViewById(R.id.personalization_settings_proactive_personal_response);
        if (this.f34553a.mo79746e(C90059dk.f249030T)) {
            this.f34570s.setVisibility(8);
        }
        ItemView findViewById4 = viewGroup2.findViewById(R.id.personalization_settings_lockscreen_headphone_personal_response);
        this.f34571t = findViewById4;
        if (true != this.f34557e.mo83561p()) {
            i2 = 8;
        }
        findViewById4.setVisibility(i2);
        if (this.f34553a.mo79746e(C90059dk.f249066ac)) {
            this.f34571t.o(c.b(this.f34562j, getString(R.string.personalization_headphone_personal_response_toggle_summary), getString(R.string.personalization_headphone_personal_response_learn_more_url)));
        } else {
            ItemView itemView = this.f34571t;
            itemView.o(itemView.f(R.string.personalization_headphone_personal_response_toggle_summary));
        }
        C73790r.m108349a(this.f34571t.d());
        this.f34566n = new e(this.f34571t);
        this.f34563k = (LinearLayout) viewGroup2.findViewById(R.id.phone_section_container);
        this.f34564l = (LinearLayout) viewGroup2.findViewById(R.id.other_devices_section);
        this.f34572u = viewGroup2.findViewById(R.id.other_devices_section_header);
        return viewGroup2;
    }

    public final void onStart() {
        super.onStart();
        C58976aa aaVar = C58975e.f156826a;
        mo18307d();
        this.f34564l.removeAllViews();
        Collection.EL.stream(this.f34555c.mo65237f(C49875cf.BISTO, (C49893cx) null, (act) null)).filter(new C10163v(this)).forEach(new C10151j(this));
        if (this.f34564l.getChildCount() > 0) {
            this.f34572u.setVisibility(0);
        }
        this.f34561i.t().setOnCheckedChangeListener(new C10159r(this));
        this.f34569r.t().setOnCheckedChangeListener(new C10160s(this));
        this.f34571t.t().setOnCheckedChangeListener(new C10161t(this));
        this.f34570s.t().setOnCheckedChangeListener(new C10162u(this));
        if (this.f34561i.t().isChecked() || !this.f34567o) {
            this.f34567o = false;
            if (this.f34571t.t().isChecked() || !this.f34568p) {
                this.f34568p = false;
            } else {
                this.f34566n.a();
            }
        } else {
            this.f34565m.a();
        }
    }

    public final void onStop() {
        super.onStop();
        C58976aa aaVar = C58975e.f156826a;
        this.f34561i.t().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f34569r.t().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f34570s.t().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.f34553a.mo79746e(C90059dk.f249038aA)) {
            C73784g gVar = this.f34560h;
            gVar.f195075e = new C10152k(this);
            gVar.f195076f = new C10153l(this);
            C0154a aVar = new C0154a(getChildFragmentManager());
            aVar.mo689v(R.id.assistant_bit_card_container, this.f34560h, (String) null);
            aVar.mo509f();
        }
    }
}
