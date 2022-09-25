package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99938d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.c */
/* compiled from: PG */
public final /* synthetic */ class C99911c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279530a;

    public /* synthetic */ C99911c(C99908ah ahVar) {
        this.f279530a = ahVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99908ah ahVar = this.f279530a;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) C99908ah.f279479a.mo56225c()).mo56372aa(32966)).mo56389s("%s", "Failed to fetch the WebViewContainer with the given id.");
        C89886e b = ((C89911f) ahVar.f279493n.mo27525b()).mo83756b(new C90452a(211, C89885b.WEBVIEW.f246280a));
        b.f246283d = "Failed to fetch the WebViewContainer with the given id.";
        b.mo83721a();
        ahVar.f279494o.mo83702b(C89849ae.SILKYTAB_LOAD_FAILURE_RESTORE_WEBVIEW_EXCEPTION);
        ahVar.mo91678l(C99938d.INTERNAL_ERROR);
    }
}
