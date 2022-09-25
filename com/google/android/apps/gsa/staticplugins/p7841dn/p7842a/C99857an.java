package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.an */
/* compiled from: PG */
public class C99857an {

    /* renamed from: a */
    private static final C59071e f279381a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dn.a.an");

    /* renamed from: b */
    private final C89688a f279382b;

    /* renamed from: c */
    private final C84411o f279383c;

    protected C99857an(C89688a aVar, C84411o oVar) {
        this.f279382b = aVar;
        this.f279383c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C84410n mo91647a(String str, String str2) {
        return this.f279383c.mo77963a(str, str2, this.f279382b);
    }

    @JavascriptInterface
    public void closeMediaPane() {
        ((C59052c) ((C59052c) f279381a.mo56225c()).mo56372aa(32945)).mo56386p("Trying to call closeMediaPane from a modal pane.");
        throw new RuntimeException();
    }

    @JavascriptInterface
    public void closeMediaPaneWithPromise(String str, String str2) {
        ((C59052c) ((C59052c) f279381a.mo56225c()).mo56372aa(32946)).mo56386p("Trying to call closeMediaPane from a modal pane.");
        mo91647a(str, str2).mo77960b("{\"id\":\"invalid_context\",\"debug_message\":\"A method call has been done in an invalid context.\"}");
    }

    @JavascriptInterface
    public void closeModalPane(String str) {
        throw new RuntimeException();
    }

    @JavascriptInterface
    public void closeModalPaneWithPromise(String str, String str2, String str3) {
        mo91647a(str2, str3).mo77960b("{\"id\":\"invalid_context\",\"debug_message\":\"A method call has been done in an invalid context.\"}");
    }

    @JavascriptInterface
    public void enterImmersivePane() {
        ((C59052c) ((C59052c) f279381a.mo56225c()).mo56372aa(32949)).mo56386p("Trying to enter immersive pane from media, or modal, pane.");
        throw new RuntimeException();
    }

    @JavascriptInterface
    public void exitImmersivePane() {
        ((C59052c) ((C59052c) f279381a.mo56225c()).mo56372aa(32951)).mo56386p("Trying to exit immersive pane from media, or modal, pane.");
        throw new RuntimeException();
    }

    @JavascriptInterface
    public void exitImmersivePaneWithPromise(String str, String str2) {
        ((C59052c) ((C59052c) f279381a.mo56225c()).mo56372aa(32952)).mo56386p("Trying to exit immersive pane from media, or modal, pane.");
        mo91647a(str, str2).mo77960b("{\"id\":\"invalid_context\",\"debug_message\":\"A method call has been done in an invalid context.\"}");
    }

    @JavascriptInterface
    public void openMediaPane(String str) {
        ((C59052c) ((C59052c) f279381a.mo56225c()).mo56372aa(32953)).mo56386p("Trying to open a media pane while in the media, or modal, pane.");
        throw new RuntimeException();
    }

    @JavascriptInterface
    public void openMediaPaneWithPromise(String str, String str2, String str3) {
        ((C59052c) ((C59052c) f279381a.mo56225c()).mo56372aa(32954)).mo56386p("Trying to open a media pane while in the media, or modal, pane.");
        mo91647a(str2, str3).mo77960b("{\"id\":\"invalid_context\",\"debug_message\":\"A method call has been done in an invalid context.\"}");
    }

    @JavascriptInterface
    public void openModalPane(String str, String str2, String str3) {
        mo91647a(str2, str3).mo77960b("{\"id\":\"invalid_context\",\"debug_message\":\"A method call has been done in an invalid context.\"}");
    }
}
