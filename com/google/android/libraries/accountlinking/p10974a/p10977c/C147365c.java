package com.google.android.libraries.accountlinking.p10974a.p10977c;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.lifecycle.C2368bp;
import com.google.android.libraries.accountlinking.C147435m;
import com.google.android.libraries.accountlinking.activity.C147388p;
import com.google.android.libraries.accountlinking.p10974a.C147362c;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.C147372e;
import com.google.android.libraries.accountlinking.p10980c.C147416a;
import com.google.android.libraries.accountlinking.p10980c.C147419d;
import com.google.android.libraries.accountlinking.p10981d.C147424d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.p3562ao.p3563a.p3569e.C45589a;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;

/* renamed from: com.google.android.libraries.accountlinking.a.c.c */
/* compiled from: PG */
public final class C147365c extends C147362c {

    /* renamed from: e */
    public static final C58974d f397794e = C58974d.m91134h("GAL");

    /* renamed from: i */
    private static final C58528ij f397795i = new C58759qy("https://myaccount.google.com/embedded/accountlinking/create");

    /* renamed from: j */
    private static final C58495hd f397796j = C58495hd.m89904r(C45589a.ERROR_CODE_UNSPECIFIED, 208, C45589a.ERROR_CODE_INVALID_REQUEST, 204, C45589a.ERROR_CODE_RPC_ERROR, 205, C45589a.ERROR_CODE_INTERNAL_ERROR, 206, C45589a.ERROR_CODE_AUTHENTICATION_DENIED_BY_USER, 207);

    /* renamed from: k */
    private static final String f397797k = "4";

    /* renamed from: f */
    public Account f397798f;

    /* renamed from: g */
    public C147372e f397799g;

    /* renamed from: h */
    public WebView f397800h;

    /* renamed from: l */
    private String f397801l;

    /* renamed from: m */
    private C147388p f397802m;

    /* renamed from: n */
    private int f397803n;

    /* renamed from: a */
    public final void mo124126a() {
        this.f397802m.mo124147e(C65879c.EVENT_SYSTEM_ACTION_USER_CANCEL);
        this.f397802m.mo124146c();
        C147372e eVar = this.f397799g;
        eVar.f397826a.mo5706i(C147366d.m240281c(2, 203));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo124127b(String str) {
        ((C58970a) ((C58970a) f397794e.mo56226d()).mo56372aa(42224)).mo56389s("Failed to load streamlined url: %s", str);
        C147372e eVar = this.f397799g;
        eVar.f397826a.mo5706i(C147366d.m240280b(201));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo124128d() {
        C147372e eVar = this.f397799g;
        eVar.f397826a.mo5706i(C147366d.m240280b(201));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        Account account = (Account) arguments.getParcelable("account");
        account.getClass();
        this.f397798f = account;
        String string = arguments.getString("gal_color_scheme");
        string.getClass();
        this.f397803n = C147435m.m240362b(string);
        String string2 = arguments.getString("flow_url");
        string2.getClass();
        this.f397801l = Uri.parse(string2).buildUpon().appendQueryParameter("result_channel", f397797k).build().toString();
        this.f397799g = (C147372e) new C2368bp(getActivity()).mo5770a(C147372e.class);
        C147388p pVar = (C147388p) new C2368bp(getActivity()).mo5770a(C147388p.class);
        this.f397802m = pVar;
        pVar.mo124148f(C65881e.STATE_ACCOUNT_SELECTION);
        C58565jt jtVar = new C58565jt(((C58759qy) f397795i).f156534a);
        while (jtVar.hasNext()) {
            if (this.f397801l.startsWith((String) jtVar.next())) {
                return;
            }
        }
        C147372e eVar = this.f397799g;
        eVar.f397826a.mo5706i(C147366d.m240280b(208));
    }

    @JavascriptInterface
    public void onSuccess(String str) {
        this.f397799g.f397826a.mo5706i(C147366d.m240279a(2, str));
    }

    @JavascriptInterface
    public void onUiEvent(int i) {
        C65879c cVar = C65879c.EVENT_UNKNOWN;
        this.f397802m.mo124147e(C65879c.m96821a(i));
    }

    @JavascriptInterface
    public void onUiStateChange(int i) {
        C65881e eVar = C65881e.STATE_UNKNOWN;
        this.f397802m.mo124148f(C65881e.m96822a(i));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        WebView webView = this.f397789d;
        this.f397800h = webView;
        webView.addJavascriptInterface(this, "GAL");
        int i = this.f397803n;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                str = this.f397801l;
            } else if (i2 == 1) {
                str = m240270c(this.f397801l);
            } else if (i2 != 2) {
                str = this.f397801l;
            } else {
                str = (getResources().getConfiguration().uiMode & 48) == 32 ? m240270c(this.f397801l) : this.f397801l;
            }
            C60856cj.m92911t(((C147416a) ((C147419d) new C2368bp(getActivity()).mo5770a(C147419d.class)).f397945b).f397940b.mo19399b(new C147363a(this, str)), new C147364b(this, str), new C147424d(new Handler(Looper.getMainLooper())));
            return;
        }
        throw null;
    }

    @JavascriptInterface
    public void onError(int i, int i2, String str) {
        C147366d dVar;
        if (i != 2) {
            dVar = C147366d.m240280b(((Integer) f397796j.getOrDefault(C45589a.m81278a(i2), 208)).intValue());
        } else {
            dVar = C147366d.m240281c(2, ((Integer) f397796j.getOrDefault(C45589a.m81278a(i2), 208)).intValue());
        }
        this.f397799g.f397826a.mo5706i(dVar);
    }
}
