package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109802av;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109805ay;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109855b;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109856c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.u */
/* compiled from: PG */
public abstract class C109854u extends C109856c {

    /* renamed from: n */
    public static final C59071e f306089n = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.u");

    /* renamed from: j */
    private OpaPageLayout f306090j;

    /* renamed from: k */
    private Button f306091k;

    /* renamed from: o */
    public Button f306092o;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo98201i() {
        mo98204s();
        AlertDialog create = new AlertDialog.Builder(getActivity()).setMessage(R.string.opa_error_consent_retry_message_conn_error).setPositiveButton(R.string.opa_error_consent_retry_positive, new C109852s(this)).setNegativeButton(R.string.opa_error_consent_retry_negative, new C109853t(this)).setCancelable(true).create();
        create.show();
        TextView textView = (TextView) create.findViewById(16908299);
        C28295m.m52919e(textView, new C28292j(46429));
        C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(textView), getView()), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract View mo98188j(LayoutInflater layoutInflater);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C28292j mo98189k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract String mo98190l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo98191m() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo98192n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo98193o() {
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        this.f306090j = opaPageLayout;
        C28295m.m52919e(opaPageLayout, mo98189k());
        this.f306090j.mo77371c(mo98188j(layoutInflater));
        C83983ah.m133841a(this.f306090j, new C109851r(this)).mo77412a();
        return this.f306090j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo98194p() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo98203r() {
        C60870cx cxVar;
        C59104x b = f306089n.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaUdcFragment");
        ((C59052c) ((C59052c) b).mo56372aa(25298)).mo56386p("#acceptConsent");
        C89949q.m146521e(C28285c.m52882i(this.f306091k, 5, (Integer) null), false);
        this.f306090j.mo77369a().mo77475d(3);
        C22871g gVar = this.f306097e;
        C109805ay ayVar = this.f306098f;
        C109778j g = mo98187g();
        if ((g.f305891a & 2) != 0) {
            cxVar = ayVar.f305972g.mo28207g("Commit opt-in", new C109802av(ayVar, g));
        } else {
            cxVar = C60866ct.f164955a;
        }
        gVar.mo28211k(cxVar, "CommitOptIn", new C109855b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo98204s() {
        this.f306091k = this.f306090j.f228726a.mo77360a();
        this.f306092o = this.f306090j.f228726a.mo77361b();
        String l = mo98190l();
        String m = mo98191m();
        C84012g a = this.f306090j.mo77369a();
        a.mo77475d(m == null ? 1 : 2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(l);
        ((C83958a) e).f228734b = new C89943l(new C109849p(this));
        a.mo77472a(e.mo77373a());
        if (m != null) {
            C84010e e2 = C84011f.m133882e();
            C83958a aVar = (C83958a) e2;
            aVar.f228733a = m;
            aVar.f228734b = new C89943l(new C109850q(this));
            e2.mo77374b(mo98194p());
            a.mo77473b(e2.mo77373a());
        }
    }
}
