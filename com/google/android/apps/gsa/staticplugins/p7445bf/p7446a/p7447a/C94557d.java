package com.google.android.apps.gsa.staticplugins.p7445bf.p7446a.p7447a;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83843c;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83845e;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83848h;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.a.a.d */
/* compiled from: PG */
public final class C94557d extends C83907bm {

    /* renamed from: b */
    public static final C59071e f264493b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bf.a.a.d");

    /* renamed from: c */
    public C83893b f264494c;

    /* renamed from: d */
    public l f264495d;

    /* renamed from: e */
    public C58833ax f264496e;

    /* renamed from: f */
    private String f264497f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo88502e(boolean z) {
        Activity activity = getActivity();
        if (activity != null) {
            C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
            String str = ((Account) this.f264494c.mo77278a().mo56107c()).name;
            aeVar.copyOnWrite();
            C83825af afVar = (C83825af) aeVar.instance;
            str.getClass();
            afVar.f228449a |= 1;
            afVar.f228450b = str;
            C83825af afVar2 = (C83825af) aeVar.build();
            C83845e eVar = (C83845e) C83848h.f228485e.createBuilder();
            String str2 = this.f264497f;
            eVar.copyOnWrite();
            C83848h hVar = (C83848h) eVar.instance;
            str2.getClass();
            C62971cq cqVar = hVar.f228488b;
            if (!cqVar.mo58948c()) {
                hVar.f228488b = C62942bv.mutableCopy(cqVar);
            }
            hVar.f228488b.add(str2);
            eVar.copyOnWrite();
            C83848h hVar2 = (C83848h) eVar.instance;
            hVar2.f228489c = 1;
            hVar2.f228487a |= 1;
            eVar.copyOnWrite();
            C83848h hVar3 = (C83848h) eVar.instance;
            hVar3.f228487a |= 2;
            hVar3.f228490d = z;
            C83848h hVar4 = (C83848h) eVar.build();
            C83843c cVar = (C83843c) C83841av.f228478e.createBuilder();
            cVar.copyOnWrite();
            C83841av avVar = (C83841av) cVar.instance;
            afVar2.getClass();
            avVar.f228481b = afVar2;
            avVar.f228480a = 1;
            cVar.copyOnWrite();
            C83841av avVar2 = (C83841av) cVar.instance;
            hVar4.getClass();
            avVar2.f228483d = hVar4;
            avVar2.f228482c = 8;
            ((C83819a) this.f264496e.mo56107c()).mo77204a(activity, (C83841av) cVar.build());
        }
    }

    /* renamed from: g */
    public final void mo88503g(int i) {
        C49875cf cfVar = C49875cf.ANDROID_TV;
        acw acw = (acw) acx.f128971H.createBuilder();
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
        String str = this.f264497f;
        dfVar.copyOnWrite();
        C49903dg dgVar = (C49903dg) dfVar.instance;
        str.getClass();
        dgVar.f129714a |= 1;
        dgVar.f129715b = str;
        C49875cf cfVar2 = C49875cf.ANDROID_TV;
        dfVar.copyOnWrite();
        C49903dg dgVar2 = (C49903dg) dfVar.instance;
        dgVar2.f129716c = cfVar2.f129621v;
        dgVar2.f129714a |= 2;
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        cvVar.f129658I = i - 1;
        cvVar.f129664b |= C89885b.HTTP_VALUE;
        cnVar.copyOnWrite();
        C49891cv cvVar2 = (C49891cv) cnVar.instance;
        cvVar2.f129659J = 7;
        cvVar2.f129664b |= 524288;
        dfVar.copyOnWrite();
        C49903dg dgVar3 = (C49903dg) dfVar.instance;
        C49891cv cvVar3 = (C49891cv) cnVar.build();
        cvVar3.getClass();
        dgVar3.f129719f = cvVar3;
        dgVar3.f129714a |= 32;
        daVar.mo53371b(dfVar);
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        this.f264495d.l((Account) this.f264494c.mo77278a().mo56111f(), cfVar, (acx) acw.build(), new C94556c(this), getClass().getSimpleName());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getArguments().getString("opa-dsc-device-id-param", BuildConfig.FLAVOR);
        this.f264497f = string;
        if (TextUtils.isEmpty(string)) {
            C59104x c = f264493b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DSCFragment");
            ((C59052c) ((C59052c) c).mo56372aa(20181)).mo56386p("deviceId is empty.");
            mo77318iT().mo77312a();
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        getActivity().getWindow().setStatusBarColor(C1878d.m5128a(getActivity(), R.color.light_navigation_bar_color));
        getActivity().getWindow().setNavigationBarColor(C1878d.m5128a(getActivity(), R.color.light_navigation_bar_color));
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.data_sharing_page, viewGroup, false);
        TextView textView = (TextView) opaPageLayout.f228728c.findViewById(R.id.data_sharing_learn_more);
        textView.setText(Html.fromHtml(getString(R.string.data_sharing_learn_more_text)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(2);
        Button a = footerLayout.mo77360a();
        a.setText(getString(R.string.data_sharing_action_button));
        a.setOnClickListener(new C94554a(this));
        Button b = footerLayout.mo77361b();
        b.setText(getString(R.string.data_sharing_cancel_button));
        b.setOnClickListener(new C94555b(this));
        return opaPageLayout;
    }
}
