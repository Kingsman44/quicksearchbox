package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.accountlinking.C147433k;
import com.google.android.libraries.accountlinking.C147434l;
import com.google.android.libraries.accountlinking.C147435m;
import com.google.android.libraries.accountlinking.p10974a.C147362c;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.C147372e;
import com.google.android.libraries.accountlinking.p10974a.p10975a.C147352b;
import com.google.android.libraries.accountlinking.p10974a.p10978d.C147371e;
import com.google.android.libraries.accountlinking.p10980c.C147417b;
import com.google.android.libraries.accountlinking.p10980c.C147418c;
import com.google.android.libraries.accountlinking.p10980c.C147419d;
import com.google.android.libraries.accountlinking.p10981d.C147421a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p3562ao.p3563a.p3567c.C45528f;
import com.google.p3562ao.p3563a.p3568d.C45532ac;
import com.google.p3562ao.p3563a.p3568d.C45549at;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;

/* compiled from: PG */
public class AccountLinkingActivity extends C0167am {

    /* renamed from: j */
    public static final C58974d f397827j = C58974d.m91134h("GAL");

    /* renamed from: k */
    public C147395w f397828k;

    /* renamed from: l */
    public CircularProgressIndicator f397829l;

    /* renamed from: m */
    public C147372e f397830m;

    /* renamed from: n */
    public C147388p f397831n;

    /* renamed from: j */
    public final void mo124141j(Fragment fragment, boolean z) {
        Fragment c = mo545jw().f634a.mo671c("flow_fragment");
        C0154a aVar = new C0154a(mo545jw());
        if (c != null) {
            aVar.mo516m(c);
        }
        if (z) {
            aVar.mo511h(R.id.base_fragment_container_view, fragment, "flow_fragment", 1);
            aVar.mo505b(false);
            return;
        }
        aVar.mo685r(fragment, "flow_fragment");
        aVar.mo505b(false);
    }

    /* renamed from: k */
    public final void mo124142k() {
        if (isTaskRoot()) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    public final void onBackPressed() {
        Fragment c = mo545jw().f634a.mo671c("flow_fragment");
        if (c instanceof C147362c) {
            ((C147362c) c).mo124126a();
        } else {
            this.f2707h.mo3340c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("linking_arguments");
        } else {
            bundle2 = getIntent().getExtras();
        }
        if (bundle2 != null) {
            try {
                C58838bb.m90868c(bundle2.containsKey("session_id"));
                C58838bb.m90868c(bundle2.containsKey("scopes"));
                C58838bb.m90868c(bundle2.containsKey("capabilities"));
                C147394v vVar = new C147394v();
                vVar.f397874a = C58528ij.m90006F(C58528ij.m90006F(bundle2.getStringArrayList("scopes")));
                vVar.f397875b = C58528ij.m90006F(C58528ij.m90006F(bundle2.getStringArrayList("capabilities")));
                vVar.f397876c = (Account) bundle2.getParcelable("account");
                if (bundle2.getBoolean("using_custom_dependency_supplier")) {
                    vVar.f397877d = true;
                }
                vVar.f397878e = bundle2.getInt("session_id");
                vVar.f397879f = bundle2.getString("bucket");
                vVar.f397880g = bundle2.getString("service_host");
                vVar.f397881h = bundle2.getInt("service_port");
                vVar.f397882i = bundle2.getString("service_id");
                vVar.f397883j = C58485gu.m89842j(C58485gu.m89841i(C58431eu.m89654f(bundle2.getStringArrayList("flows")).mo55247g(C147392t.f397872a).mo55248h()));
                vVar.f397884k = (C45549at) C62942bv.parseFrom((C62942bv) C45549at.f119037g, bundle2.getByteArray("linking_session"));
                vVar.f397885l = C58528ij.m90006F(C58528ij.m90006F(bundle2.getStringArrayList("google_scopes")));
                vVar.f397886m = bundle2.getBoolean("two_way_account_linking");
                vVar.f397887n = bundle2.getInt("account_linking_entry_point", 0);
                vVar.f397888o = C58485gu.m89842j(C58485gu.m89841i(C58431eu.m89654f(bundle2.getStringArrayList("data_usage_notices")).mo55247g(C147393u.f397873a).mo55248h()));
                vVar.f397889p = bundle2.getString("consent_language_keys");
                vVar.f397890q = C58485gu.m89842j(bundle2.getStringArrayList("experiment_server_tokens"));
                vVar.f397891r = C147435m.m240362b(bundle2.getString("gal_color_scheme"));
                this.f397828k = new C147395w(vVar);
                C147417b bVar = ((C147419d) new C2368bp(getViewModelStore(), (C2363bk) new C147418c(getApplication(), this.f397828k)).mo5770a(C147419d.class)).f397945b;
                if (bVar == null) {
                    super.onCreate((Bundle) null);
                    ((C58970a) ((C58970a) f397827j.mo56226d()).mo56372aa(42172)).mo56386p("Unable to create ManagedDependencySupplier. Shutting down AccountLinkingActivity.");
                    C147389q a = C147381i.m240294a(1, "Unable to create ManagedDependencySupplier.");
                    setResult(a.f397868a, a.f397869b);
                    mo124142k();
                    return;
                }
                setContentView((int) R.layout.account_linking_client);
                this.f397829l = (CircularProgressIndicator) findViewById(R.id.Progress);
                super.onCreate(bundle);
                this.f397831n = (C147388p) new C2368bp((C2371bs) this, (C2363bk) new C147387o(this, bundle, getApplication(), this.f397828k, bVar)).mo5770a(C147388p.class);
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("account_linking_view_model_bundle");
                    if (bundle3 != null) {
                        C147388p pVar = this.f397831n;
                        pVar.f397862k = bundle3.getInt("current_flow_index");
                        pVar.f397861j = bundle3.getBoolean("is_streamlined_first_flow");
                        if (bundle3.containsKey("consent_language_key")) {
                            pVar.f397864m = bundle3.getString("consent_language_key");
                        }
                        pVar.f397860i = C65881e.m96822a(bundle3.getInt("current_client_state"));
                    } else {
                        ((C58970a) ((C58970a) f397827j.mo56226d()).mo56372aa(42171)).mo56386p("accountLinkingViewModelBundle cannot be null when restoring AccountLinkingActivity.");
                        C147389q a2 = C147381i.m240294a(1, "accountLinkingViewModelBundle cannot be null when restoring AccountLinkingActivity");
                        setResult(a2.f397868a, a2.f397869b);
                        mo124142k();
                        return;
                    }
                }
                this.f397831n.f397855d.mo5704e(this, new C147376d(this));
                this.f397831n.f397856e.mo5704e(this, new C147377e(this));
                this.f397831n.f397857f.mo5704e(this, new C147378f(this));
                this.f397831n.f397858g.mo5704e(this, new C147379g(this));
                C147372e eVar = (C147372e) new C2368bp(this).mo5770a(C147372e.class);
                this.f397830m = eVar;
                eVar.f397826a.mo5704e(this, new C147380h(this));
                if (bundle == null) {
                    C147388p pVar2 = this.f397831n;
                    if (pVar2.f397855d.mo3842a() == null) {
                        if (!pVar2.f397854c.f397905n.isEmpty() && pVar2.f397856e.mo3842a() != null) {
                            return;
                        }
                        if (pVar2.f397854c.f397900i.isEmpty()) {
                            ((C58970a) ((C58970a) C147388p.f397851b.mo56226d()).mo56372aa(42191)).mo56386p("No account linking flow is enabled by server");
                            pVar2.mo124150h(C147381i.m240294a(1, "Linking failed; No account linking flow is enabled by server"));
                            return;
                        }
                        C147434l lVar = (C147434l) pVar2.f397854c.f397900i.get(0);
                        if (lVar == C147434l.APP_FLIP) {
                            PackageManager packageManager = pVar2.f6558a.getPackageManager();
                            C45532ac acVar = pVar2.f397854c.f397901j.f119043e;
                            if (acVar == null) {
                                acVar = C45532ac.f119011d;
                            }
                            C45528f fVar = acVar.f119013a;
                            if (fVar == null) {
                                fVar = C45528f.f119003b;
                            }
                            C62971cq cqVar = fVar.f119005a;
                            C58485gu u = pVar2.f397854c.f397892a.mo55229u();
                            C45532ac acVar2 = pVar2.f397854c.f397901j.f119043e;
                            if (acVar2 == null) {
                                acVar2 = C45532ac.f119011d;
                            }
                            if (!C147421a.m240339a(packageManager, cqVar, u, acVar2.f119014b).mo56113h()) {
                                pVar2.f397863l = true;
                                if (pVar2.f397854c.f397905n.isEmpty()) {
                                    pVar2.mo124148f(C65881e.STATE_APP_FLIP);
                                    pVar2.mo124147e(C65879c.EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED);
                                }
                                int i = pVar2.f397862k + 1;
                                pVar2.f397862k = i;
                                if (i >= pVar2.f397854c.f397900i.size()) {
                                    pVar2.mo124150h(C147381i.m240294a(1, "Linking failed; All account linking flows were attempted"));
                                    return;
                                }
                                lVar = (C147434l) pVar2.f397854c.f397900i.get(pVar2.f397862k);
                            }
                        }
                        if (lVar == C147434l.STREAMLINED_LINK_ACCOUNT) {
                            pVar2.f397861j = true;
                        }
                        if ((lVar == C147434l.APP_FLIP || lVar == C147434l.WEB_OAUTH) && !pVar2.f397854c.f397905n.isEmpty()) {
                            pVar2.f397856e.mo5706i(pVar2.f397854c.f397905n);
                        } else if (lVar != C147434l.STREAMLINED_LINK_ACCOUNT || !pVar2.f397854c.f397905n.contains(C147433k.LINKING_INFO)) {
                            pVar2.f397855d.mo5706i(lVar);
                        } else {
                            pVar2.f397856e.mo5706i(C58485gu.m89846n(C147433k.LINKING_INFO));
                        }
                    }
                }
            } catch (Exception unused) {
                super.onCreate((Bundle) null);
                ((C58970a) ((C58970a) f397827j.mo56226d()).mo56372aa(42173)).mo56386p("Unable to parse arguments from bundle.");
                C147389q a3 = C147381i.m240294a(1, "Unable to parse arguments from bundle.");
                setResult(a3.f397868a, a3.f397869b);
                mo124142k();
            }
        } else {
            super.onCreate((Bundle) null);
            ((C58970a) ((C58970a) f397827j.mo56226d()).mo56372aa(42174)).mo56386p("linkingArgumentsBundle cannot be null.");
            C147389q a4 = C147381i.m240294a(1, "linkingArgumentsBundle cannot be null.");
            setResult(a4.f397868a, a4.f397869b);
            mo124142k();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C147366d dVar;
        C147366d dVar2;
        C147366d dVar3;
        super.onNewIntent(intent);
        this.f397831n.mo124147e(C65879c.EVENT_APP_AUTH_RECEIVE_NEW_INTENT);
        Fragment c = mo545jw().f634a.mo671c("flow_fragment");
        if (c instanceof C147371e) {
            C147371e eVar = (C147371e) c;
            eVar.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_FRAGMENT_HANDLE_INTENT);
            intent.getClass();
            eVar.f397822g = true;
            Uri data = intent.getData();
            if (data == null) {
                dVar2 = C147371e.f397816b;
                eVar.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_NULL_RESPONSE_URI);
            } else if (data.getQueryParameterNames().contains("error")) {
                String queryParameter = data.getQueryParameter("error");
                if (C147371e.f397817c.containsKey(queryParameter)) {
                    dVar3 = (C147366d) C147371e.f397817c.get(queryParameter);
                } else {
                    dVar3 = C147371e.f397815a;
                }
                eVar.f397821f.mo124147e((C65879c) C147371e.f397818d.getOrDefault(queryParameter, C65879c.EVENT_APP_AUTH_OTHER));
                dVar2 = dVar3;
            } else {
                String queryParameter2 = data.getQueryParameter("redirect_state");
                TextUtils.isEmpty(queryParameter2);
                if (TextUtils.isEmpty(queryParameter2)) {
                    dVar2 = C147371e.f397815a;
                    eVar.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_NO_REDIRECT_STATE);
                } else {
                    dVar2 = C147366d.m240279a(2, queryParameter2);
                    eVar.f397821f.mo124147e(C65879c.EVENT_APP_AUTH_SUCCESS);
                }
            }
            eVar.f397820e.f397826a.mo5706i(dVar2);
        } else if (c instanceof C147352b) {
            C147352b bVar = (C147352b) c;
            intent.getClass();
            bVar.f397761f = true;
            Uri data2 = intent.getData();
            if (data2 == null) {
                bVar.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_NULL_RESPONSE_URI);
                bVar.f397759d.mo124151i(4, 0, 0, (String) null, (String) null);
                dVar = C147366d.m240280b(14);
            } else if (data2.getQueryParameterNames().contains("error")) {
                String queryParameter3 = data2.getQueryParameter("error");
                C147366d dVar4 = (C147366d) C147352b.f397756a.getOrDefault(queryParameter3, C147366d.m240281c(2, 15));
                bVar.f397759d.mo124147e((C65879c) C147352b.f397757b.getOrDefault(queryParameter3, C65879c.EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE));
                bVar.f397759d.mo124151i(5, dVar4.f397808e == 2 ? 3 : 4, 0, queryParameter3, data2.toString());
                dVar = dVar4;
            } else if (!data2.getQueryParameterNames().contains("code")) {
                bVar.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                bVar.f397759d.mo124151i(5, 6, 0, (String) null, data2.toString());
                dVar = C147366d.m240280b(15);
            } else if (!data2.getQueryParameterNames().contains("code") || !data2.getQueryParameterNames().contains("state")) {
                bVar.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_NO_REDIRECT_STATE);
                bVar.f397759d.mo124151i(5, 6, 0, (String) null, data2.toString());
                dVar = C147366d.m240280b(15);
            } else {
                String queryParameter4 = data2.getQueryParameter("state");
                if (queryParameter4 == null || !queryParameter4.equals(bVar.f397760e)) {
                    bVar.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                    bVar.f397759d.mo124151i(5, 6, 0, (String) null, data2.toString());
                    dVar = C147366d.m240280b(15);
                } else {
                    String queryParameter5 = data2.getQueryParameter("code");
                    if (queryParameter5 == null) {
                        bVar.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                        bVar.f397759d.mo124151i(5, 6, 0, (String) null, data2.toString());
                        dVar = C147366d.m240280b(15);
                    } else {
                        bVar.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_FLOW_SUCCESS);
                        bVar.f397759d.mo124151i(3, 0, 0, (String) null, data2.toString());
                        dVar = C147366d.m240279a(2, queryParameter5);
                    }
                }
            }
            bVar.f397758c.f397826a.mo5706i(dVar);
        } else {
            ((C58970a) ((C58970a) f397827j.mo56226d()).mo56372aa(42176)).mo56386p("Illegal state: there is no WebOAuthFragment when onNewIntent() is called");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("linking_arguments", this.f397828k.mo124153a());
        C147388p pVar = this.f397831n;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("current_flow_index", pVar.f397862k);
        bundle2.putBoolean("is_streamlined_first_flow", pVar.f397861j);
        bundle2.putInt("current_client_state", pVar.f397860i.getNumber());
        String str = pVar.f397864m;
        if (str != null) {
            bundle2.putString("consent_language_key", str);
        }
        bundle.putBundle("account_linking_view_model_bundle", bundle2);
    }
}
