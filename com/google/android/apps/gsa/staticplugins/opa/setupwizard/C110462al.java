package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p546a.C10001p;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7311n.C92533a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.al */
/* compiled from: PG */
public final class C110462al extends C83907bm {

    /* renamed from: h */
    private static final C59071e f307946h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.al");

    /* renamed from: b */
    public C86124t f307947b;

    /* renamed from: c */
    public C92486a f307948c;

    /* renamed from: d */
    public C89994f f307949d;

    /* renamed from: e */
    public C10001p f307950e;

    /* renamed from: f */
    public C81006b f307951f;

    /* renamed from: g */
    public C92533a f307952g;

    /* renamed from: i */
    private final Handler f307953i = new Handler(Looper.myLooper());

    /* renamed from: j */
    private View f307954j;

    /* renamed from: k */
    private View f307955k;

    /* renamed from: g */
    private final void m184009g(boolean z) {
        this.f307950e.mo18179e(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo98702e() {
        return this.f307947b.mo79746e(C90062dn.f249206e) && this.f307951f.mo74781g();
    }

    /* renamed from: f */
    public final boolean mo77317f() {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10001) {
            return;
        }
        if (i2 == -1) {
            this.f307952g.mo87307a(1);
            if (mo98702e()) {
                m184009g(true);
            }
            C89949q.m146521e(C28285c.m52882i(this.f307954j, 5, (Integer) null), false);
            mo77318iT().mo77312a();
        } else if (i2 == 1) {
            this.f307952g.mo87307a(2);
            if (mo98702e()) {
                m184009g(false);
            }
            C89949q.m146521e(C28285c.m52882i(this.f307955k, 5, (Integer) null), false);
            mo77318iT().mo77312a();
        } else if (i2 != 0) {
            ((C59052c) ((C59052c) f307946h.mo56225c()).mo56372aa(26410)).mo56387q("Unknown resultCode = %d", i2);
        } else if (getActivity() != null) {
            getActivity().setResult(0);
            getActivity().finish();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C45304a.m80747c(this);
        C45304a.m80746b(this);
        View inflate = layoutInflater.inflate(R.layout.suw_empty_layout, viewGroup, false);
        this.f307954j = inflate.findViewById(R.id.suw_empty_layout_action_button);
        this.f307955k = inflate.findViewById(R.id.suw_empty_layout_cancel_button);
        if (mo98702e()) {
            C28295m.m52919e(inflate, new C28292j(124756));
        } else {
            C28295m.m52919e(inflate, new C28292j(123392));
        }
        View view = this.f307954j;
        C28292j jVar = new C28292j(37143);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        View view2 = this.f307955k;
        C28292j jVar2 = new C28292j(37142);
        jVar2.mo33795i(5);
        C28295m.m52919e(view2, jVar2);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f307953i.removeCallbacksAndMessages((Object) null);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((C59052c) ((C59052c) f307946h.mo56224b()).mo56372aa(26411)).mo56386p("Starting SuwActivity for intro");
        this.f307953i.post(new C110461ak(this));
    }
}
