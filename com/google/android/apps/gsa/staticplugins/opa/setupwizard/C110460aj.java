package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.aj */
/* compiled from: PG */
public final class C110460aj extends C83907bm {

    /* renamed from: b */
    private static final C59071e f307942b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.aj");

    /* renamed from: c */
    private final Handler f307943c = new Handler(Looper.myLooper());

    /* renamed from: d */
    private View f307944d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo77317f() {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10002) {
            return;
        }
        if (i2 == -1) {
            C89949q.m146521e(C28285c.m52882i(this.f307944d, 5, (Integer) null), false);
            mo77318iT().mo77312a();
        } else if (i2 != 0) {
            ((C59052c) ((C59052c) f307942b.mo56225c()).mo56372aa(26408)).mo56387q("Unknown resultCode = %d", i2);
        } else if (getActivity() != null) {
            getActivity().setResult(0);
            getActivity().finish();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C45304a.m80747c(this);
        C45304a.m80746b(this);
        View inflate = layoutInflater.inflate(R.layout.suw_empty_layout, viewGroup, false);
        this.f307944d = inflate.findViewById(R.id.suw_empty_layout_action_button);
        C28295m.m52919e(inflate, new C28292j(126736));
        View view = this.f307944d;
        C28292j jVar = new C28292j(37143);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f307943c.removeCallbacksAndMessages((Object) null);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((C59052c) ((C59052c) f307942b.mo56224b()).mo56372aa(26409)).mo56386p("Starting SuwActivity for intro");
        this.f307943c.post(new C110459ai(this));
    }
}
