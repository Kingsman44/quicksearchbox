package com.google.android.apps.gsa.staticplugins.webview;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.C87354a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.p6905a.C87355a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.p6905a.C87356b;
import com.google.android.apps.gsa.search.core.webview.C87258d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cq */
/* compiled from: PG */
public final class C118183cq {

    /* renamed from: a */
    private static final C59071e f328093a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.cq");

    /* renamed from: b */
    private final long f328094b;

    /* renamed from: c */
    private final C91097g f328095c;

    /* renamed from: d */
    private final C87258d f328096d;

    /* renamed from: e */
    private final C22871g f328097e;

    /* renamed from: f */
    private final C85923cq f328098f;

    /* renamed from: g */
    private final C84411o f328099g;

    /* renamed from: h */
    private final C89688a f328100h;

    /* renamed from: i */
    private Query f328101i;

    public C118183cq(C87258d dVar, long j, C22871g gVar, C91097g gVar2, C85923cq cqVar, C85454d dVar2, C84411o oVar) {
        this.f328094b = j;
        this.f328095c = gVar2;
        this.f328096d = dVar;
        this.f328097e = gVar;
        this.f328098f = cqVar;
        this.f328099g = oVar;
        this.f328100h = new C118176cl(dVar2, j);
    }

    /* renamed from: c */
    private final synchronized Query m196312c() {
        return this.f328101i;
    }

    /* renamed from: a */
    public final void mo103635a(int i, int i2) {
        Query c = m196312c();
        if (c == null) {
            ((C59052c) ((C59052c) f328093a.mo56226d()).mo56372aa(33870)).mo56386p("Attempting to change header state with null Query");
            int i3 = C90755l.f253831a;
            return;
        }
        this.f328096d.mo80874a(c, i, i2);
    }

    /* renamed from: b */
    public final synchronized void mo103636b(Query query) {
        this.f328101i = query;
    }

    @JavascriptInterface
    public void closeMediaPane() {
        ((C59052c) ((C59052c) f328093a.mo56225c()).mo56372aa(33853)).mo56386p("Called closeMediaPane from SRP.");
        throw new RuntimeException();
    }

    @JavascriptInterface
    public void closeMediaPaneWithPromise(String str, String str2) {
        ((C59052c) ((C59052c) f328093a.mo56225c()).mo56372aa(33854)).mo56386p("Called closeMediaPaneWithPromisefrom SRP.");
        this.f328099g.mo77963a(str, str2, this.f328100h).mo77960b("{\"id\":\"invalid_context\",\"debug_message\":\"A method call has been done in an invalid context.\"}");
    }

    @JavascriptInterface
    public void closeModalPane(String str) {
        ((C59052c) ((C59052c) f328093a.mo56225c()).mo56372aa(33855)).mo56386p("Called closeModalPane from SRP.");
        throw new RuntimeException();
    }

    @JavascriptInterface
    public void closeModalPaneWithPromise(String str, String str2, String str3) {
        ((C59052c) ((C59052c) f328093a.mo56225c()).mo56372aa(33856)).mo56386p("Called closeModalPaneWithPromise from SRP.");
        this.f328099g.mo77963a(str2, str3, this.f328100h).mo77960b("{\"id\":\"invalid_context\",\"debug_message\":\"A method call has been done in an invalid context.\"}");
    }

    @JavascriptInterface
    public void enterImmersivePane() {
        this.f328097e.mo28212l("enterImmersivePane", new C118178cn(this));
    }

    @JavascriptInterface
    public void enterImmersivePaneWithPromise(String str, String str2) {
        this.f328097e.mo28212l("enterImmersivePaneWithPromise", new C118182cp(this));
        this.f328099g.mo77963a(str, str2, this.f328100h).mo77962d("{}");
    }

    @JavascriptInterface
    public void exitImmersivePane() {
        this.f328097e.mo28212l("exitImmersivePane", new C118177cm(this));
    }

    @JavascriptInterface
    public void exitImmersivePaneWithPromise(String str, String str2) {
        this.f328097e.mo28212l("exitImmersivePaneWithPromise", new C118179co(this));
        this.f328099g.mo77963a(str, str2, this.f328100h).mo77962d("{}");
    }

    @JavascriptInterface
    public void openMediaPane(String str) {
        if (this.f328098f.mo79554e(Uri.parse(str), true)) {
            try {
                this.f328095c.mo65089a(C87354a.m141349b(str));
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) f328093a.mo56225c()).mo56382g(th)).mo56372aa(33862)).mo56386p("Uncaught Throwable");
                C58887cx.m90980g(th);
                throw new RuntimeException(th);
            }
        } else {
            ((C59052c) ((C59052c) f328093a.mo56225c()).mo56372aa(33863)).mo56386p("Attempting to use unsupported URL for media pane.");
            throw new RuntimeException();
        }
    }

    @JavascriptInterface
    public void openMediaPaneWithPromise(String str, String str2, String str3) {
        C84410n a = this.f328099g.mo77963a(str2, str3, this.f328100h);
        if (!this.f328098f.mo79554e(Uri.parse(str), true)) {
            ((C59052c) ((C59052c) f328093a.mo56225c()).mo56372aa(33866)).mo56386p("Attempting to use unsupported URL for media pane.");
            a.mo77960b("{\"id\":\"invalid_url\",\"debug_message\":\"The URL passed to the method cannot be used.\"}");
            return;
        }
        try {
            this.f328095c.mo65089a(C87354a.m141349b(str));
            a.mo77962d("{}");
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f328093a.mo56225c()).mo56382g(th)).mo56372aa(33865)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            a.mo77960b("{\"id\":\"general_error\",\"debug_message\":\"General error\"}");
        }
    }

    @JavascriptInterface
    public void openModalPane(String str, String str2, String str3) {
        C84410n a = this.f328099g.mo77963a(str2, str3, this.f328100h);
        if (!this.f328098f.mo79554e(Uri.parse(str), true)) {
            ((C59052c) ((C59052c) f328093a.mo56225c()).mo56372aa(33869)).mo56386p("Attempting to use unsupported URL for modal pane.");
            a.mo77960b("{\"id\":\"invalid_url\",\"debug_message\":\"The URL passed to the method cannot be used.\"}");
            return;
        }
        try {
            C91097g gVar = this.f328095c;
            long j = this.f328094b;
            C87355a aVar = (C87355a) C87356b.f235914g.createBuilder();
            aVar.copyOnWrite();
            C87356b bVar = (C87356b) aVar.instance;
            str.getClass();
            bVar.f235916a = 1 | bVar.f235916a;
            bVar.f235917b = str;
            aVar.copyOnWrite();
            C87356b bVar2 = (C87356b) aVar.instance;
            bVar2.f235916a |= 8;
            bVar2.f235920e = j;
            aVar.copyOnWrite();
            C87356b bVar3 = (C87356b) aVar.instance;
            str2.getClass();
            bVar3.f235916a |= 2;
            bVar3.f235918c = str2;
            aVar.copyOnWrite();
            C87356b bVar4 = (C87356b) aVar.instance;
            str3.getClass();
            bVar4.f235916a |= 4;
            bVar4.f235919d = str3;
            gVar.mo65089a(C87354a.m141348a((C87356b) aVar.build()));
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f328093a.mo56225c()).mo56382g(th)).mo56372aa(33868)).mo56386p("Uncaught Throwable");
            C58887cx.m90980g(th);
            a.mo77960b("{\"id\":\"general_error\",\"debug_message\":\"General error\"}");
        }
    }
}
