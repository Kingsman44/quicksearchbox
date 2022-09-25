package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b;

import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a.C100444k;
import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a.C100458y;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.b.c */
/* compiled from: PG */
public final class C100462c implements C23113i {

    /* renamed from: a */
    private final C100460a f280849a;

    public C100462c(C100460a aVar) {
        this.f280849a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("TrainingEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onErrorCardRetryButtonClicked")) {
                C100458y yVar = (C100458y) this.f280849a;
                C58833ax axVar = (C58833ax) ((C23251a) yVar.f280811b.mo91915c()).f63720e;
                C58838bb.m90883r(axVar.mo56113h());
                WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
                C58893dc.m90996a(a);
                C22871g gVar = yVar.f280814e;
                Objects.requireNonNull(a);
                gVar.mo28212l("onErrorCardRetryButtonClicked", new C100444k(a));
                ((C23251a) yVar.f280811b.mo91914b()).mo28730f(C58836b.f156633a, false);
            } else if (str.equals("onNavigationButtonClicked")) {
                ((C100458y) this.f280849a).mo91924h();
            }
        }
    }
}
