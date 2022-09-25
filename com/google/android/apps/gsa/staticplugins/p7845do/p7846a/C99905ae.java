package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99938d;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C99905ae implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99906af f279474a;

    /* renamed from: b */
    public final /* synthetic */ int f279475b;

    /* renamed from: c */
    public final /* synthetic */ String f279476c;

    public /* synthetic */ C99905ae(C99906af afVar, int i, String str) {
        this.f279474a = afVar;
        this.f279475b = i;
        this.f279476c = str;
    }

    public final void run() {
        C99906af afVar = this.f279474a;
        int i = this.f279475b;
        String str = this.f279476c;
        C89886e b = ((C89911f) afVar.f279477a.f279493n.mo27525b()).mo83756b(new C90452a(211, C89885b.WEBVIEW.f246280a));
        b.f246283d = "onReceivedError: " + i + " at " + str;
        b.mo83721a();
        afVar.f279477a.f279494o.mo83702b(C89849ae.SILKYTAB_LOAD_FAILURE_WEBVIEW_ERROR_RECEIVED);
        afVar.f279477a.mo91678l(C99938d.WEBVIEW_ERROR);
    }
}
