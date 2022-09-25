package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.ba */
/* compiled from: PG */
public final class C110478ba extends C83907bm {

    /* renamed from: f */
    private static final C59071e f307992f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.ba");

    /* renamed from: b */
    public C92486a f307993b;

    /* renamed from: c */
    public C86124t f307994c;

    /* renamed from: d */
    public C89994f f307995d;

    /* renamed from: e */
    public C68214a f307996e;

    /* renamed from: g */
    private final Handler f307997g = new Handler(Looper.myLooper());

    /* renamed from: h */
    private View f307998h;

    /* renamed from: i */
    private View f307999i;

    /* renamed from: e */
    private final void m184040e(boolean z) {
        if (((C58833ax) this.f307996e.mo27525b()).mo56113h()) {
            ((C9799ae) ((C58833ax) this.f307996e.mo27525b()).mo56107c()).mo18047g(z ? C9855w.ENABLED : C9855w.DISABLED);
        }
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
            m184040e(true);
            C89949q.m146521e(C28285c.m52882i(this.f307998h, 5, (Integer) null), false);
            mo77318iT().mo77312a();
        } else if (i2 == 1) {
            m184040e(false);
            C89949q.m146521e(C28285c.m52882i(this.f307999i, 5, (Integer) null), false);
            mo77318iT().mo77312a();
        } else if (i2 != 0) {
            ((C59052c) ((C59052c) f307992f.mo56225c()).mo56372aa(26422)).mo56387q("Unknown resultCode = %d", i2);
        } else if (getActivity() != null) {
            getActivity().setResult(0);
            getActivity().finish();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C45304a.m80747c(this);
        C45304a.m80746b(this);
        View inflate = layoutInflater.inflate(R.layout.suw_empty_layout, viewGroup, false);
        this.f307998h = inflate.findViewById(R.id.suw_empty_layout_action_button);
        this.f307999i = inflate.findViewById(R.id.suw_empty_layout_cancel_button);
        C28295m.m52919e(inflate, new C28292j(123393));
        View view = this.f307998h;
        C28292j jVar = new C28292j(37143);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        View view2 = this.f307999i;
        C28292j jVar2 = new C28292j(37142);
        jVar2.mo33795i(5);
        C28295m.m52919e(view2, jVar2);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f307997g.removeCallbacksAndMessages((Object) null);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((C59052c) ((C59052c) f307992f.mo56224b()).mo56372aa(26423)).mo56386p("Starting SuwActivity for settings");
        this.f307997g.post(new C110476az(this));
    }
}
