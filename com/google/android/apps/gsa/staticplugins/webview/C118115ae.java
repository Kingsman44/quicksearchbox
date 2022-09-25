package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7030bj.C89690c;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ae */
/* compiled from: PG */
final class C118115ae implements C89690c {

    /* renamed from: a */
    final /* synthetic */ C118119ai f327764a;

    /* renamed from: b */
    private final Query f327765b;

    public C118115ae(C118119ai aiVar, Query query) {
        this.f327764a = aiVar;
        this.f327765b = query;
    }

    /* renamed from: a */
    public final void mo83591a(IOException iOException) {
        C90456c cVar;
        C118119ai aiVar = this.f327764a;
        Query query = this.f327765b;
        C59104x c = C118119ai.f327777a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaWebView");
        ((C59052c) ((C59052c) c).mo56372aa(33806)).mo56389s("Error reported from delegate stream: %s", iOException.getMessage());
        if (iOException instanceof C90456c) {
            cVar = (C90456c) iOException;
        } else {
            cVar = new C90457d(C89885b.WEBVIEW_INPUTSTREAM_NO_RESPONSE_VALUE);
        }
        aiVar.f327836q.mo28212l("report error", new C118112ab(aiVar, cVar, query));
    }
}
