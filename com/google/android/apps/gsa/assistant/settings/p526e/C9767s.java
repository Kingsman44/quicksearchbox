package com.google.android.apps.gsa.assistant.settings.p526e;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.libraries.p11026am.C147759b;
import com.google.android.libraries.p11026am.C147762e;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.s */
/* compiled from: PG */
final class C9767s extends C147762e {

    /* renamed from: a */
    private static final C59071e f33719a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.e.s");

    /* renamed from: b */
    private final Set f33720b;

    /* renamed from: d */
    private final C147759b f33721d;

    /* renamed from: e */
    private final C91090a f33722e;

    /* renamed from: f */
    private final String f33723f;

    /* renamed from: g */
    private int f33724g = 0;

    /* renamed from: h */
    private final C9758j f33725h;

    public C9767s(C86124t tVar, C91090a aVar, C9758j jVar, String str) {
        super(new C147759b((List) tVar.mo79745c(C90059dk.f249148ce)), new C147759b((List) tVar.mo79745c(C90059dk.f249147cd)));
        this.f33720b = C58528ij.m90006F(tVar.mo79745c(C90059dk.f249146cc));
        this.f33721d = new C147759b((List) tVar.mo79745c(C90059dk.f249145cb));
        this.f33722e = aVar;
        this.f33725h = jVar;
        this.f33723f = str;
    }

    /* renamed from: f */
    private final void m24513f() {
        if (mo18026a()) {
            this.f33724g = 2;
            this.f33725h.f33675a.mo18019a(false);
        }
    }

    /* renamed from: a */
    public final boolean mo18026a() {
        return this.f33724g == 0;
    }

    /* renamed from: b */
    public final boolean mo18027b(String str) {
        C59052c cVar = (C59052c) f33719a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, this.f33723f);
        ((C59052c) cVar.mo56372aa(1648)).mo56389s("onUrlLoadBlocked: url = %s", str);
        Uri parse = Uri.parse(str);
        if (!this.f33720b.contains(parse.getScheme())) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        if (this.f33721d.mo124438c(parse)) {
            intent.setPackage("com.google.android.googlequicksearchbox");
        }
        this.f33722e.mo65090b(intent, new C91095e());
        return true;
    }

    public final void onPageFinished(WebView webView, String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (mo18026a()) {
            this.f33724g = 1;
            this.f33725h.f33675a.mo18019a(true);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C59052c cVar = (C59052c) f33719a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, this.f33723f);
        ((C59052c) cVar.mo56372aa(1644)).mo56359L("onReceiveError: errorCode = %d, desc = %s, url = %s", Integer.valueOf(i), str, str2);
        m24513f();
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C59052c cVar = (C59052c) f33719a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, this.f33723f);
        ((C59052c) cVar.mo56372aa(1646)).mo56395y("onReceivedHttpError: statusCode = %d, reason = %s", webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        m24513f();
    }
}
