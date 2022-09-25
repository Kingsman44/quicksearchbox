package com.google.android.apps.gsa.staticplugins.p7841dn.p7843b;

import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.staticplugins.p7841dn.p7842a.C99850ag;
import com.google.android.apps.gsa.staticplugins.p7841dn.p7842a.C99881y;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.b.c */
/* compiled from: PG */
public final class C99885c implements C23113i {

    /* renamed from: a */
    private final C99883a f279425a;

    public C99885c(C99883a aVar) {
        this.f279425a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SilkPaneEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onErrorCardDismissButtonClicked")) {
                ((C99850ag) this.f279425a).mo91631f();
            } else if (str.equals("onErrorCardRetryButtonClicked")) {
                C99850ag agVar = (C99850ag) this.f279425a;
                C58833ax axVar = (C58833ax) ((C23251a) agVar.f279340b.mo91625k()).f63720e;
                C58838bb.m90883r(axVar.mo56113h());
                WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
                C58893dc.m90996a(a);
                C22871g gVar = agVar.f279342d;
                Objects.requireNonNull(a);
                gVar.mo28212l("onErrorCardRetryButtonClicked", new C99881y(a));
                ((C23251a) agVar.f279340b.mo91618d()).mo28730f(C58836b.f156633a, false);
            } else if (str.equals("onNavigationButtonClicked")) {
                ((C99850ag) this.f279425a).mo91634j();
            }
        }
    }
}
