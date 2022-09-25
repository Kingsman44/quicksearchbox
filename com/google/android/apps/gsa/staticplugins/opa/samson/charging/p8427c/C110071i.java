package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPartialPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90023cb;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8444p.C110310b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8444p.C110311c;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110403c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.i */
/* compiled from: PG */
public final class C110071i extends C83907bm implements C2391v {

    /* renamed from: l */
    public static final /* synthetic */ int f306658l = 0;

    /* renamed from: b */
    public Context f306659b;

    /* renamed from: c */
    public C110403c f306660c;

    /* renamed from: d */
    public C83893b f306661d;

    /* renamed from: e */
    public C86124t f306662e;

    /* renamed from: f */
    public u f306663f;

    /* renamed from: g */
    public C110311c f306664g;

    /* renamed from: h */
    SwitchCompat f306665h;

    /* renamed from: i */
    Button f306666i;

    /* renamed from: j */
    C110310b f306667j;

    /* renamed from: k */
    public final C2393x f306668k = new C2393x(this);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo98351e() {
        mo77318iT().mo77313b();
    }

    public final C2384o getLifecycle() {
        return this.f306668k;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f306668k.mo5793e(C2382m.ON_CREATE);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String a;
        C58976aa aaVar = C58975e.f156826a;
        OpaPartialPageLayout opaPartialPageLayout = (OpaPartialPageLayout) layoutInflater.inflate(R.layout.charging_mode_compact_intro, viewGroup, false);
        C28295m.m52919e(opaPartialPageLayout, new C28292j(75812));
        opaPartialPageLayout.mo77372q(R.layout.charging_mode_compact_intro_content);
        ((HeaderLayout) opaPartialPageLayout.findViewById(R.id.opa_header)).f228720c.setVisibility(8);
        opaPartialPageLayout.f228730j.mo77362c(0);
        Button button = (Button) opaPartialPageLayout.findViewById(R.id.charging_intro_done_button);
        this.f306666i = button;
        button.setOnClickListener(new C89943l(new C110068f(this)));
        this.f306665h = (SwitchCompat) opaPartialPageLayout.findViewById(R.id.charging_amb_toggle);
        if (this.f306663f.d() && (a = this.f306663f.a(this.f306659b.getResources().getConfiguration().getLocales().get(0).getISO3Language())) != null) {
            C58833ax a2 = this.f306661d.mo77278a();
            if (a2.mo56113h()) {
                this.f306665h.setChecked(this.f306660c.mo98633d(((Account) a2.mo56107c()).name));
            }
            this.f306665h.setText(a);
            this.f306665h.setVisibility(0);
        }
        C110070h hVar = new C110070h(this);
        BottomSheetBehavior bottomSheetBehavior = opaPartialPageLayout.f228729i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo47506D(hVar);
        }
        C110310b a3 = this.f306664g.mo98561a(this.f306662e.mo79743a(C90023cb.f248129e));
        this.f306667j = a3;
        a3.mo5704e(this, new C110069g(this));
        return opaPartialPageLayout;
    }

    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        this.f306668k.mo5793e(C2382m.ON_DESTROY);
        super.onDestroy();
    }

    public final void onPause() {
        this.f306668k.mo5793e(C2382m.ON_PAUSE);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f306668k.mo5793e(C2382m.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        this.f306668k.mo5793e(C2382m.ON_START);
    }

    public final void onStop() {
        this.f306668k.mo5793e(C2382m.ON_STOP);
        super.onStop();
    }
}
