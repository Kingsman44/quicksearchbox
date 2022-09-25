package com.google.android.libraries.accountlinking.p10974a.p10976b;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.lifecycle.C2368bp;
import com.google.android.gms.auth.C142923w;
import com.google.android.libraries.accountlinking.C147435m;
import com.google.android.libraries.accountlinking.activity.C147388p;
import com.google.android.libraries.accountlinking.p10974a.C147362c;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.C147372e;
import com.google.android.libraries.accountlinking.p10980c.C147416a;
import com.google.android.libraries.accountlinking.p10980c.C147419d;
import com.google.android.libraries.accountlinking.p10981d.C147424d;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.p3562ao.p3563a.p3569e.C45589a;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.accountlinking.a.b.h */
/* compiled from: PG */
public final class C147361h extends C147362c {

    /* renamed from: e */
    public static final C58528ij f397773e = C58528ij.m90011K("https://myaccount.google.com/embedded/accountlinking/info", "https://myaccount.google.com/embedded/accountlinking/usagenotice");

    /* renamed from: f */
    public static final String f397774f = "4";

    /* renamed from: k */
    private static final C58495hd f397775k = C58495hd.m89904r(C45589a.ERROR_CODE_UNSPECIFIED, 408, C45589a.ERROR_CODE_INVALID_REQUEST, 404, C45589a.ERROR_CODE_RPC_ERROR, 405, C45589a.ERROR_CODE_INTERNAL_ERROR, 406, C45589a.ERROR_CODE_AUTHENTICATION_DENIED_BY_USER, 407);

    /* renamed from: l */
    private static final C58495hd f397776l = C58495hd.m89901o(C65881e.STATE_LINKING_INFO, 0, C65881e.STATE_USAGE_NOTICE, 1);

    /* renamed from: g */
    public Account f397777g;

    /* renamed from: h */
    public C147372e f397778h;

    /* renamed from: i */
    public WebView f397779i;

    /* renamed from: j */
    public C142923w f397780j;

    /* renamed from: m */
    private C147388p f397781m;

    /* renamed from: n */
    private C60887da f397782n;

    /* renamed from: o */
    private final List f397783o = new ArrayList();

    /* renamed from: p */
    private int f397784p;

    /* renamed from: q */
    private int f397785q;

    static {
        C58974d.m91134h("GAL");
    }

    /* renamed from: f */
    private final void m240266f(String str) {
        C60856cj.m92911t(this.f397782n.mo19399b(new C147355b(this, str)), new C147360g(this, str), new C147424d(new Handler(Looper.getMainLooper())));
    }

    /* renamed from: a */
    public final void mo124126a() {
        this.f397781m.mo124147e(C65879c.EVENT_SYSTEM_ACTION_USER_CANCEL);
        this.f397781m.mo124146c();
        C147372e eVar = this.f397778h;
        eVar.f397826a.mo5706i(C147366d.m240281c(1, 403));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo124127b(String str) {
        C147372e eVar = this.f397778h;
        eVar.f397826a.mo5706i(C147366d.m240281c(1, 401));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo124128d() {
        C147372e eVar = this.f397778h;
        eVar.f397826a.mo5706i(C147366d.m240281c(1, 401));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f397784p = 0;
        Bundle arguments = getArguments();
        arguments.getClass();
        Account account = (Account) arguments.getParcelable("account");
        account.getClass();
        this.f397777g = account;
        String string = arguments.getString("gal_color_scheme");
        string.getClass();
        this.f397785q = C147435m.m240362b(string);
        String[] stringArray = arguments.getStringArray("data_usage_notice_urls");
        stringArray.getClass();
        C58431eu.m89654f(Arrays.asList(stringArray)).mo55247g(C147359f.f397770a).mo55249i(this.f397783o);
        this.f397778h = (C147372e) new C2368bp(getActivity()).mo5770a(C147372e.class);
        this.f397781m = (C147388p) new C2368bp(getActivity()).mo5770a(C147388p.class);
        C58431eu f = C58431eu.m89654f(this.f397783o);
        if (!C58557jl.m90137r(f.mo55248h(), C147354a.f397766a)) {
            C147372e eVar = this.f397778h;
            eVar.f397826a.mo5706i(C147366d.m240281c(1, 408));
        }
        this.f397782n = ((C147416a) ((C147419d) new C2368bp(getActivity()).mo5770a(C147419d.class)).f397945b).f397940b;
        this.f397780j = new C142923w(getContext());
    }

    @JavascriptInterface
    public void onError(int i, int i2, String str) {
        C147372e eVar = this.f397778h;
        eVar.f397826a.mo5706i(C147366d.m240281c(1, ((Integer) f397775k.getOrDefault(C45589a.m81278a(i2), 408)).intValue()));
    }

    @JavascriptInterface
    public void onUiEvent(int i) {
        C65879c cVar = C65879c.EVENT_UNKNOWN;
        this.f397781m.mo124147e(C65879c.m96821a(i));
    }

    @JavascriptInterface
    public void onUiStateChange(int i) {
        C65881e eVar = C65881e.STATE_UNKNOWN;
        this.f397781m.mo124148f(C65881e.m96822a(i));
        if (this.f397783o.size() > 1) {
            Integer num = (Integer) f397776l.get(C65881e.m96822a(i));
            num.getClass();
            this.f397784p = num.intValue();
        }
    }

    @JavascriptInterface
    public void onUserCancelLinking() {
        C147372e eVar = this.f397778h;
        eVar.f397826a.mo5706i(C147366d.m240281c(1, 407));
    }

    @JavascriptInterface
    public void onUserConsent(String str) {
        C147372e eVar = this.f397778h;
        eVar.f397826a.mo5706i(C147366d.m240279a(1, str));
    }

    @JavascriptInterface
    public void onUserContinueLinking() {
        if (this.f397783o.size() > 1) {
            this.f397784p++;
            m240266f((String) m240265e().get(this.f397784p));
            return;
        }
        this.f397778h.f397826a.mo5706i(C147366d.m240279a(1, "continue_linking"));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        WebView webView = this.f397789d;
        this.f397779i = webView;
        webView.addJavascriptInterface(this, "GAL");
        m240266f((String) m240265e().get(this.f397784p));
    }

    /* renamed from: e */
    private final List m240265e() {
        int i = this.f397785q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return this.f397783o;
        } else {
            if (i2 == 1) {
                return C58485gu.m89841i(C58431eu.m89654f(this.f397783o).mo55247g(new C147357d()).mo55248h());
            }
            if (i2 != 2) {
                return this.f397783o;
            }
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                return C58485gu.m89841i(C58431eu.m89654f(this.f397783o).mo55247g(new C147358e()).mo55248h());
            }
            return this.f397783o;
        }
    }
}
