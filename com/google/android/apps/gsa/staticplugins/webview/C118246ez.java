package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.WebResourceResponse;
import com.google.android.apps.gsa.p6484r.C84250e;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ez */
/* compiled from: PG */
final class C118246ez extends C84250e {

    /* renamed from: b */
    final /* synthetic */ C118248fa f328271b;

    public C118246ez(C118248fa faVar) {
        this.f328271b = faVar;
    }

    /* renamed from: c */
    public final Reader mo77732c() {
        WebResourceResponse a;
        C87504b bVar = this.f328271b.f328282k;
        if (bVar == null || (a = bVar.mo81511a()) == null) {
            return null;
        }
        try {
            return new InputStreamReader(a.getData(), a.getEncoding());
        } catch (UnsupportedEncodingException e) {
            C59104x c = C87504b.f236336a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Velvet.WebPage");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(9590)).mo56386p("Unsupported charset");
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo77734e() {
        return true;
    }
}
