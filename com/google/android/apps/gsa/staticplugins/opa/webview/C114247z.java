package com.google.android.apps.gsa.staticplugins.opa.webview;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7030bj.C89690c;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.z */
/* compiled from: PG */
public final /* synthetic */ class C114247z implements C89690c {

    /* renamed from: a */
    public final /* synthetic */ C114188ac f316801a;

    public /* synthetic */ C114247z(C114188ac acVar) {
        this.f316801a = acVar;
    }

    /* renamed from: a */
    public final void mo83591a(IOException iOException) {
        C90456c cVar;
        C114188ac acVar = this.f316801a;
        if (iOException instanceof C90456c) {
            cVar = (C90456c) iOException;
        } else {
            cVar = new C90457d((Throwable) iOException, (int) C89885b.WEBVIEW_INPUTSTREAM_NO_RESPONSE_VALUE);
        }
        acVar.mo101246d(cVar);
    }
}
