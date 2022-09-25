package com.google.android.apps.gsa.staticplugins.p7932f.p7934b;

import android.util.Log;
import com.google.android.libraries.assistant.ampactions.AmpWebView;
import com.google.android.libraries.assistant.ampactions.C11029b;
import com.google.android.libraries.assistant.ampactions.C11031d;
import com.google.android.libraries.assistant.ampactions.C11047t;
import com.google.android.libraries.assistant.ampactions.C11049v;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.b.k */
/* compiled from: PG */
public final /* synthetic */ class C100683k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100686n f281519a;

    public /* synthetic */ C100683k(C100686n nVar) {
        this.f281519a = nVar;
    }

    public final void run() {
        C60870cx cxVar;
        C100686n nVar = this.f281519a;
        C11031d dVar = nVar.f281524b;
        acy acy = nVar.f281529g;
        Log.d("AmpActions", "GetWebView");
        String str = acy.f134863b;
        dVar.f36243a.mo19516b(C58833ax.m90834k(str));
        C11049v vVar = dVar.f36243a;
        AmpWebView ampWebView = (AmpWebView) vVar.f36289b.get(str);
        if (ampWebView != null) {
            cxVar = C60922j.m93044g(vVar.f36288a.mo19513b(str), new C11047t(vVar, ampWebView, str), C60826bg.f164896a);
        } else {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        }
        nVar.f281526d.mo28212l("Updating webview", new C100673a(nVar, C60922j.m93045h(cxVar, new C11029b(dVar, str, acy), C60826bg.f164896a)));
    }
}
