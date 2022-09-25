package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95495l;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96448af;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96451ai;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import dagger.C68214a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ef */
/* compiled from: PG */
public final class C96183ef extends C96363kx {

    /* renamed from: b */
    public static final C59071e f269221b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ef");

    /* renamed from: A */
    public C61024c f269222A;

    /* renamed from: B */
    public boolean f269223B = false;

    /* renamed from: C */
    public long f269224C;

    /* renamed from: E */
    private OpaPageLayout f269225E;

    /* renamed from: c */
    public String f269226c;

    /* renamed from: d */
    public String f269227d;

    /* renamed from: e */
    public String f269228e;

    /* renamed from: f */
    public String f269229f;

    /* renamed from: g */
    public byte[] f269230g;

    /* renamed from: h */
    public boolean f269231h;

    /* renamed from: i */
    public C68214a f269232i;

    /* renamed from: j */
    public C22871g f269233j;

    /* renamed from: k */
    public C22871g f269234k;

    /* renamed from: l */
    public C22871g f269235l;

    /* renamed from: m */
    public C68214a f269236m;

    /* renamed from: n */
    public C21370a f269237n;

    /* renamed from: o */
    public C90021c f269238o;

    /* renamed from: p */
    public C68214a f269239p;

    /* renamed from: q */
    public C95495l f269240q;

    /* renamed from: r */
    public boolean f269241r;

    /* renamed from: s */
    HeaderLayout f269242s;

    /* renamed from: t */
    FooterLayout f269243t;

    /* renamed from: u */
    public ProgressBar f269244u;

    /* renamed from: v */
    public ProgressBar f269245v;

    /* renamed from: w */
    public Drawable f269246w;

    /* renamed from: x */
    public long f269247x;

    /* renamed from: y */
    public int f269248y;

    /* renamed from: z */
    public int f269249z;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "PairingWaitingForConnection";
    }

    /* renamed from: g */
    public final void mo89997g() {
        C59104x b = f269221b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsConnectFrag");
        ((C59052c) ((C59052c) b).mo56372aa(16978)).mo56386p("onConnectFailed");
        if (this.f269241r) {
            this.f269246w = this.f269243t.mo77360a().getBackground();
            this.f269248y = this.f269243t.mo77360a().getCurrentTextColor();
            this.f269249z = this.f269242s.f228719b.getCurrentTextColor();
            long b2 = this.f269237n.mo26870b();
            long j = this.f269247x;
            C60103kw kwVar = ((C95299e) this.f269603D.mo27525b()).f266647b;
            kwVar.copyOnWrite();
            C60106kz kzVar = (C60106kz) kwVar.instance;
            C60106kz kzVar2 = C60106kz.f162531p;
            kzVar.f162533a |= 32768;
            kzVar.f162545m = (int) (b2 - j);
            HeaderLayout headerLayout = this.f269242s;
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.gacs_oobe_message_connected_failed_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            this.f269242s.f228718a.setVisibility(0);
            HeaderLayout headerLayout2 = this.f269242s;
            C84018m.m133908c(headerLayout2.f228719b, C84018m.m133906a(R.string.gacs_oobe_message_connected_failed_message, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
            this.f269242s.f228719b.setVisibility(0);
            this.f269243t.mo77360a().setText(R.string.bisto_try_again);
            this.f269243t.mo77360a().setBackgroundColor(0);
            this.f269243t.mo77360a().setTextColor(getResources().getColor(R.color.opa_button_tint));
            this.f269243t.mo77360a().setVisibility(0);
            this.f269243t.mo77360a().setOnClickListener(new C96170dt(this));
            this.f269243t.mo77361b().setText(R.string.bisto_generic_cancel_button);
            this.f269243t.mo77361b().setOnClickListener(new C89943l(new C96171du(this)));
            this.f269243t.mo77361b().setVisibility(0);
            this.f269244u.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final void mo89998h() {
        FooterLayout footerLayout = this.f269225E.f228726a;
        this.f269243t = footerLayout;
        footerLayout.mo77362c(2);
        this.f269243t.mo77360a().setVisibility(8);
        this.f269243t.mo77361b().setVisibility(8);
    }

    /* renamed from: i */
    public final void mo89999i() {
        HeaderLayout headerLayout = (HeaderLayout) this.f269225E.findViewById(R.id.opa_header);
        this.f269242s = headerLayout;
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.bisto_gacs_connecting_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        HeaderLayout headerLayout2 = this.f269242s;
        C84018m.m133908c(headerLayout2.f228719b, C84018m.m133906a(R.string.bisto_gacs_connecting_message, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
    }

    /* renamed from: j */
    public final void mo90000j() {
        ProgressBar progressBar = (ProgressBar) this.f269225E.findViewById(R.id.gacs_connect_progress_bar);
        this.f269244u = progressBar;
        progressBar.setVisibility(0);
        ProgressBar progressBar2 = (ProgressBar) this.f269225E.findViewById(R.id.gacs_connect_progress_bar_determinate);
        this.f269245v = progressBar2;
        progressBar2.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo90001k(long j) {
        C60870cx cxVar;
        this.f269247x = this.f269237n.mo26870b();
        if (this.f269231h) {
            C58976aa aaVar = C58975e.f156826a;
            cxVar = C60866ct.f164955a;
        } else if (this.f269223B) {
            C58976aa aaVar2 = C58975e.f156826a;
            cxVar = C60866ct.f164955a;
        } else if (!this.f269238o.mo79746e(C90122ft.f250863b)) {
            C58976aa aaVar3 = C58975e.f156826a;
            cxVar = C60866ct.f164955a;
        } else if (this.f269222A == null) {
            C58976aa aaVar4 = C58975e.f156826a;
            cxVar = C60856cj.m92899h(new IOException("Parsed JWT was null"));
        } else {
            cxVar = ((C96451ai) this.f269239p.mo27525b()).mo90135a(this.f269222A);
            C90875ai.m148465b(new C96169ds(this), cxVar, this.f269233j, "verifyJwtResult").mo85223a(C96173dw.f269211a);
        }
        this.f269233j.mo28213m("start-connect", j, new C96182ee(this, C90877ak.m148471e(this.f269234k.mo28210j(cxVar, "sendGacsConnect", new C96181ed(this)), this.f269224C, TimeUnit.MILLISECONDS, this.f269235l)));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C61024c a;
        this.f269224C = this.f269238o.mo79743a(C90122ft.f250874m);
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        this.f269225E = opaPageLayout;
        opaPageLayout.mo77370b(R.layout.gacs_connecting);
        mo89999i();
        mo90000j();
        mo89998h();
        this.f269241r = true;
        String str = this.f269229f;
        if (!(str == null || (a = C96448af.m159802a(str)) == null)) {
            this.f269222A = a;
        }
        mo90001k(1000);
        return this.f269225E;
    }

    public final void onDestroyView() {
        C58976aa aaVar = C58975e.f156826a;
        super.onDestroyView();
        this.f269241r = false;
    }
}
