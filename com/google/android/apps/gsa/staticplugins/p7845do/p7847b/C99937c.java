package com.google.android.apps.gsa.staticplugins.p7845do.p7847b;

import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.staticplugins.p7845do.p7846a.C99908ah;
import com.google.android.apps.gsa.staticplugins.p7845do.p7846a.C99922n;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.b.c */
/* compiled from: PG */
public final class C99937c implements C23113i {

    /* renamed from: a */
    private final C99935a f279570a;

    public C99937c(C99935a aVar) {
        this.f279570a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SilkyTabEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onErrorCardDismissButtonClicked")) {
                ((C99908ah) this.f279570a).mo91676j();
            } else if (str.equals("onErrorCardRetryButtonClicked")) {
                C99908ah ahVar = (C99908ah) this.f279570a;
                C58833ax axVar = (C58833ax) ((C23251a) ahVar.f279481b.mo91665g()).f63720e;
                C58838bb.m90883r(axVar.mo56113h());
                WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
                C58893dc.m90996a(a);
                C22871g gVar = ahVar.f279484e;
                Objects.requireNonNull(a);
                gVar.mo28212l("onErrorCardRetryButtonClicked", new C99922n(a));
                ((C23251a) ahVar.f279481b.mo91661c()).mo28730f(C58836b.f156633a, false);
            }
        }
    }
}
