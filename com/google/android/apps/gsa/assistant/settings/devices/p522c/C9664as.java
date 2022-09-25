package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.google.android.apps.gsa.assistant.settings.features.p553aj.C10098ab;
import com.google.android.apps.gsa.assistant.settings.features.p553aj.C10100ad;
import com.google.android.apps.gsa.assistant.settings.features.p553aj.C10149h;
import com.google.android.apps.gsa.assistant.settings.shared.d.c;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73790r;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.assistant.shared.bp;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.as */
/* compiled from: PG */
public final class C9664as extends C9647ab {

    /* renamed from: o */
    private static final C59071e f33409o = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.c.as");

    /* renamed from: a */
    public h f33410a;

    /* renamed from: b */
    public C68214a f33411b;

    /* renamed from: c */
    public C86124t f33412c;

    /* renamed from: d */
    public C68214a f33413d;

    /* renamed from: e */
    public C68214a f33414e;

    /* renamed from: f */
    public C10149h f33415f;

    /* renamed from: g */
    public C92122r f33416g;

    /* renamed from: h */
    public C83794j f33417h;

    /* renamed from: i */
    public C92125t f33418i;

    /* renamed from: j */
    public String f33419j;

    /* renamed from: k */
    public ItemView f33420k;

    /* renamed from: l */
    public ItemView f33421l;

    /* renamed from: m */
    public ItemView f33422m;

    /* renamed from: n */
    public C110402b f33423n;

    /* renamed from: p */
    private Context f33424p;

    /* renamed from: q */
    private ItemView f33425q;

    /* renamed from: r */
    private ItemView f33426r;

    /* renamed from: s */
    private ItemView f33427s;

    /* renamed from: t */
    private ItemView f33428t;

    /* renamed from: u */
    private ItemView f33429u;

    /* renamed from: e */
    private static void m24384e(ItemView itemView, C10098ab abVar) {
        itemView.t().setChecked(abVar.f34386b);
        itemView.setVisibility(true != abVar.f34387c ? 8 : 0);
    }

    /* renamed from: d */
    public final void mo17940d() {
        C10100ad a = this.f33415f.mo18289a();
        C58976aa aaVar = C58975e.f156826a;
        ItemView itemView = this.f33425q;
        C10098ab abVar = a.f34391b;
        if (abVar == null) {
            abVar = C10098ab.f34383d;
        }
        m24384e(itemView, abVar);
        if (!this.f33412c.mo79746e(C90059dk.f249055aR)) {
            ItemView itemView2 = this.f33426r;
            C10098ab abVar2 = a.f34392c;
            if (abVar2 == null) {
                abVar2 = C10098ab.f34383d;
            }
            m24384e(itemView2, abVar2);
        }
        ItemView itemView3 = this.f33427s;
        C10098ab abVar3 = a.f34393d;
        if (abVar3 == null) {
            abVar3 = C10098ab.f34383d;
        }
        m24384e(itemView3, abVar3);
        ItemView itemView4 = this.f33429u;
        C10098ab abVar4 = a.f34394e;
        if (abVar4 == null) {
            abVar4 = C10098ab.f34383d;
        }
        m24384e(itemView4, abVar4);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bp c = C73845bq.m108430c();
        c.b(true);
        String d = c.c().mo65330d();
        d.getClass();
        this.f33419j = d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View.OnClickListener onClickListener;
        this.f33424p = layoutInflater.getContext();
        boolean z = false;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_personalization_section, viewGroup, false);
        int i2 = ItemView.a;
        ItemView findViewById = viewGroup2.findViewById(R.id.settings_nexus_personal_response);
        this.f33425q = findViewById;
        findViewById.o(c.b(this.f33424p, getString(R.string.assistant_settings_personal_response_summary), getString(R.string.personalization_personal_response_learn_more_url)));
        this.f33425q.d().setMovementMethod(LinkMovementMethod.getInstance());
        ItemView findViewById2 = viewGroup2.findViewById(R.id.settings_nexus_lockscreen_personal_response);
        this.f33426r = findViewById2;
        Context context = this.f33424p;
        if (this.f33412c.mo79746e(C90014bt.f247548jI)) {
            i = R.string.hotword_pref_personal_response_summary_for_ambient_mode;
        } else {
            i = this.f33412c.mo79746e(C90014bt.f247797nt) ? R.string.hotword_pref_personal_response_summary_updated : R.string.hotword_pref_personal_response_summary;
        }
        findViewById2.o(c.b(context, getString(i), getString(R.string.personalization_lockscreen_personal_response_learn_more_url)));
        C73790r.m108349a(this.f33426r.d());
        if (this.f33412c.mo79746e(C90059dk.f249055aR)) {
            this.f33426r.setVisibility(8);
        }
        if ((this.f33412c.mo79746e(C90059dk.f249104bN) || this.f33412c.mo79746e(C90059dk.f249105bO)) && this.f33417h.mo77158B()) {
            ItemView findViewById3 = viewGroup2.findViewById(R.id.settings_nexus_smartspace);
            findViewById3.setOnClickListener(new C9658am(this));
            String x = this.f33412c.mo79758x(C90017bw.f247961bW);
            String x2 = this.f33412c.mo79758x(C90017bw.f247962bX);
            if (x.isEmpty()) {
                C59104x c = f33409o.mo56225c();
                c.mo56378ag(C58975e.f156826a, "PersonalizationSecFrag");
                ((C59052c) ((C59052c) c).mo56372aa(466)).mo56386p("The fallback link is empty!");
            } else {
                if (x2.isEmpty()) {
                    onClickListener = new C9663ar(this, x);
                } else {
                    onClickListener = new C9654ai(this, x2, x);
                }
                findViewById3.o(c.a(this.f33424p, getString(R.string.assistant_settings_smartspace_subtitle), onClickListener));
            }
            findViewById3.setVisibility(0);
            C73790r.m108349a(findViewById3.d());
        }
        this.f33427s = viewGroup2.findViewById(R.id.settings_nexus_proactive_personal_response);
        this.f33429u = viewGroup2.findViewById(R.id.settings_nexus_lockscreen_headphone_personal_response);
        if (this.f33412c.mo79746e(C90059dk.f249066ac)) {
            this.f33429u.o(c.b(this.f33424p, getString(R.string.assistant_settings_headphone_personal_response_toggle_summary), getString(R.string.personalization_headphone_personal_response_learn_more_url)));
            C73790r.m108349a(this.f33429u.d());
        } else {
            ItemView itemView = this.f33429u;
            itemView.o(itemView.f(R.string.assistant_settings_headphone_personal_response_toggle_summary));
        }
        this.f33428t = viewGroup2.findViewById(R.id.settings_nexus_ch_amb_toggle);
        this.f33420k = viewGroup2.findViewById(R.id.settings_nexus_ch_amb_dev_integ_toggle);
        this.f33421l = viewGroup2.findViewById(R.id.settings_nexus_ch_amb_photo_frame_toggle);
        this.f33422m = viewGroup2.findViewById(R.id.settings_nexus_ch_amb_photo_albums_setting);
        Account a = this.f33410a.a();
        boolean c2 = a != null ? ((v) this.f33411b.mo27525b()).c(a.name) : false;
        boolean a2 = this.f33423n.mo98629a();
        boolean z2 = true;
        this.f33428t.setVisibility(true != a2 ? 8 : 0);
        this.f33428t.t().setChecked(c2);
        if (!a2 || !this.f33412c.mo79746e(C90014bt.f247235dN)) {
            this.f33421l.setVisibility(8);
            this.f33422m.setVisibility(8);
        } else {
            this.f33421l.setEnabled(c2);
            ItemView itemView2 = this.f33422m;
            if (!c2 || !this.f33421l.t().isChecked()) {
                z2 = false;
            }
            itemView2.setEnabled(z2);
        }
        Switch t = this.f33428t.t();
        t.setOnCheckedChangeListener(new C9656ak(this, t));
        Context context2 = this.f33424p;
        if (!this.f33423n.mo98629a()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f33420k.setVisibility(8);
        } else {
            u uVar = (u) this.f33414e.mo27525b();
            if (uVar.d() || this.f33412c.mo79746e(C90014bt.f247106ar)) {
                Account a3 = this.f33410a.a();
                if (a3 == null) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    this.f33420k.setVisibility(8);
                } else {
                    String a4 = uVar.a(context2.getResources().getConfiguration().getLocales().get(0).getISO3Language());
                    if (a4 == null) {
                        this.f33420k.setVisibility(8);
                        C58976aa aaVar3 = C58975e.f156826a;
                    } else {
                        this.f33420k.setEnabled(((v) this.f33411b.mo27525b()).c(a3.name));
                        this.f33420k.setVisibility(0);
                        this.f33420k.p(a4);
                        v vVar = (v) this.f33411b.mo27525b();
                        this.f33420k.t().setChecked(vVar.d(a3.name));
                        this.f33420k.t().setOnCheckedChangeListener(new C9653ah(vVar, a3));
                    }
                }
            } else {
                C58976aa aaVar4 = C58975e.f156826a;
                this.f33420k.setVisibility(8);
            }
        }
        Account a5 = this.f33410a.a();
        if (a5 != null) {
            z = ((C110361bt) this.f33413d.mo27525b()).mo98594k(a5.name, this.f33419j);
        }
        this.f33421l.t().setChecked(z);
        this.f33422m.setEnabled(z);
        this.f33422m.setOnClickListener(new C9657al(this));
        Switch t2 = this.f33421l.t();
        t2.setOnCheckedChangeListener(new C9655aj(this, t2));
        return viewGroup2;
    }

    public final void onStart() {
        super.onStart();
        C58976aa aaVar = C58975e.f156826a;
        mo17940d();
        this.f33425q.t().setOnCheckedChangeListener(new C9659an(this));
        this.f33426r.t().setOnCheckedChangeListener(new C9660ao(this));
        this.f33427s.t().setOnCheckedChangeListener(new C9661ap(this));
        this.f33429u.t().setOnCheckedChangeListener(new C9662aq(this));
    }

    public final void onStop() {
        super.onStop();
        this.f33425q.t().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f33426r.t().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f33427s.t().setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
    }
}
