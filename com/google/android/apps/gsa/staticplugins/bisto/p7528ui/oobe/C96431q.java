package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142318ax;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.q */
/* compiled from: PG */
public final class C96431q extends C96363kx {

    /* renamed from: b */
    public static final C59071e f269762b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.q");

    /* renamed from: c */
    public C91090a f269763c;

    /* renamed from: d */
    public C96325jm f269764d;

    /* renamed from: e */
    public C86124t f269765e;

    /* renamed from: f */
    public C22871g f269766f;

    /* renamed from: g */
    public C22871g f269767g;

    /* renamed from: h */
    public Set f269768h;

    /* renamed from: i */
    public C68214a f269769i;

    /* renamed from: j */
    public C69464a f269770j;

    /* renamed from: k */
    public C69464a f269771k;

    /* renamed from: l */
    OpaPageLayout f269772l;

    /* renamed from: m */
    FooterLayout f269773m;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        C96331js.m159641e(getActivity(), new C96204f(this), C124719q.GACS_DEVICE, true, this.f269764d.f269538a.f269047b);
        return true;
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "AccountLink";
    }

    /* renamed from: g */
    public final void mo90119g(String[] strArr, String str, String str2) {
        if (strArr.length == 0) {
            C59104x d = f269762b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AccLinkFrag");
            ((C59052c) ((C59052c) d).mo56372aa(16930)).mo56386p("No scopes found in proto; proceeding with empty scope array");
        }
        Account account = (Account) getArguments().getParcelable("account");
        account.getClass();
        this.f269763c.mo65090b(new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.gdi.GdiControlActivity").putExtra("extra_service_id", str).putExtra("extra_account", account).putExtra("extra_supports_app_flip", true).putExtra("extra_scopes", strArr).putExtra("extra_action_mode", 0), new C96339k(this, str2));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58833ax axVar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C58976aa aaVar = C58975e.f156826a;
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        this.f269772l = opaPageLayout;
        opaPageLayout.mo77370b(R.layout.account_linking);
        Bundle arguments = getArguments();
        arguments.getClass();
        String string = arguments.getString("provider-id");
        string.getClass();
        String string2 = arguments.getString("provider-name");
        string2.getClass();
        String string3 = arguments.getString("provider-mid");
        String[] stringArray = arguments.getStringArray("scope-list");
        stringArray.getClass();
        String[] strArr = stringArray;
        C96097ba baVar = this.f269764d.f269538a;
        baVar.getClass();
        HeaderLayout headerLayout = (HeaderLayout) this.f269772l.findViewById(R.id.opa_header);
        C142340bs bsVar = baVar.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142318ax axVar2 = bsVar.f386199v;
        if (axVar2 == null) {
            axVar2 = C142318ax.f386092f;
        }
        C142355cg cgVar = axVar2.f386095b;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        String e = C124525f.m203989e(cgVar);
        boolean h = C58837ba.m90859h(e);
        String str = BuildConfig.FLAVOR;
        if (true == h) {
            e = str;
        }
        C84018m.m133908c(headerLayout.f228718a, e, TextView.BufferType.NORMAL, headerLayout);
        TextView textView = (TextView) this.f269772l.findViewById(R.id.account_linking_message);
        C142340bs bsVar2 = baVar.f269047b.f386119e;
        if (bsVar2 == null) {
            bsVar2 = C142340bs.f386174C;
        }
        C142318ax axVar3 = bsVar2.f386199v;
        if (axVar3 == null) {
            axVar3 = C142318ax.f386092f;
        }
        C142355cg cgVar2 = axVar3.f386096c;
        if (cgVar2 == null) {
            cgVar2 = C142355cg.f386263b;
        }
        String e2 = C124525f.m203989e(cgVar2);
        if (true == C58837ba.m90859h(e2)) {
            e2 = str;
        }
        textView.setText(e2);
        TextView textView2 = (TextView) this.f269772l.findViewById(R.id.account_linking_legal_disclaimer);
        C142340bs bsVar3 = baVar.f269047b.f386119e;
        if (bsVar3 == null) {
            bsVar3 = C142340bs.f386174C;
        }
        C142318ax axVar4 = bsVar3.f386199v;
        if (axVar4 == null) {
            axVar4 = C142318ax.f386092f;
        }
        C142355cg cgVar3 = axVar4.f386097d;
        if (cgVar3 == null) {
            cgVar3 = C142355cg.f386263b;
        }
        String e3 = C124525f.m203989e(cgVar3);
        if (true != C58837ba.m90859h(e3)) {
            str = e3;
        }
        textView2.setText(str);
        C96153dc dcVar = new C96153dc((LegacyOpaStandardPage) null, (C68214a) null, 0);
        C142340bs bsVar4 = baVar.f269047b.f386119e;
        if (bsVar4 == null) {
            bsVar4 = C142340bs.f386174C;
        }
        C142318ax axVar5 = bsVar4.f386199v;
        if (axVar5 == null) {
            axVar5 = C142318ax.f386092f;
        }
        C142328bg bgVar = axVar5.f386098e;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        if (bgVar.f386142b.size() <= 0 || C58837ba.m90859h((String) bgVar.f386142b.get(0))) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k((String) bgVar.f386142b.get(0));
        }
        if (axVar.mo56113h()) {
            this.f269772l.findViewById(R.id.account_linking_image).setBackgroundColor(0);
            dcVar.mo89991a((WebView) this.f269772l.findViewById(R.id.account_linking_image), (String) axVar.mo56107c(), C58836b.f156633a);
        }
        this.f269772l.findViewById(R.id.account_linking_image).setBackgroundColor(0);
        FooterLayout footerLayout = this.f269772l.f228726a;
        this.f269773m = footerLayout;
        footerLayout.mo77362c(2);
        Button a = this.f269773m.mo77360a();
        Button b = this.f269773m.mo77361b();
        a.setText(R.string.sleep_account_linking_action_button_positive);
        b.setText(R.string.bisto_no_thanks_button);
        if (this.f269765e.mo79746e(C90122ft.f250867f)) {
            a.setOnClickListener(new C89943l(new C96258h(this, string2, strArr, string, string3)));
        } else {
            a.setOnClickListener(new C89943l(new C96285i(this, strArr, string, string3)));
        }
        b.setOnClickListener(new C89943l(new C96312j(this)));
        return this.f269772l;
    }
}
