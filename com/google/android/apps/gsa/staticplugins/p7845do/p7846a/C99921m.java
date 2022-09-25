package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.m */
/* compiled from: PG */
public final /* synthetic */ class C99921m implements C89688a {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279543a;

    public /* synthetic */ C99921m(C99908ah ahVar) {
        this.f279543a = ahVar;
    }

    /* renamed from: a */
    public final void mo83590a(String str) {
        C99908ah ahVar = this.f279543a;
        C58833ax axVar = (C58833ax) ((C23251a) ahVar.f279481b.mo91665g()).f63720e;
        if (axVar.mo56113h()) {
            WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
            if (a != null) {
                ahVar.f279484e.mo28212l("SilkyTab Evaluate JS", new C99929u(a, str));
            } else {
                ((C59052c) ((C59052c) C99908ah.f279479a.mo56225c()).mo56372aa(32963)).mo56386p("No WebView found to evaluate JavaScript.");
            }
        } else {
            ((C59052c) ((C59052c) C99908ah.f279479a.mo56225c()).mo56372aa(32962)).mo56386p("No GsaWebViewContainer found when evaluating JavaScript.");
        }
    }
}
