package androidx.p201w.p202a;

import android.net.Uri;
import android.webkit.WebView;
import androidx.p201w.C4361e;
import androidx.p201w.C4363g;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.postmessage.internal.C43976w;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44415c;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44416d;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44417e;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44424l;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.p5648a.C72563b;

/* renamed from: androidx.w.a.y */
/* compiled from: PG */
public final class C4356y implements WebMessageListenerBoundaryInterface {

    /* renamed from: a */
    private final C44415c f13969a;

    public C4356y(C44415c cVar) {
        this.f13969a = cVar;
    }

    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) C72563b.m107251a(WebMessageBoundaryInterface.class, invocationHandler);
        String data = webMessageBoundaryInterface.getData();
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        C4363g[] gVarArr = new C4363g[ports.length];
        for (int i = 0; i < ports.length; i++) {
            gVarArr[i] = new C4357z(ports[i]);
        }
        C4361e eVar = new C4361e(data, gVarArr);
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C72563b.m107251a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
        C4354w wVar = (C4354w) jsReplyProxyBoundaryInterface.getOrCreatePeer(new C4353v(jsReplyProxyBoundaryInterface));
        C44415c cVar = this.f13969a;
        C44424l lVar = cVar.f115457a;
        C43904a aVar = cVar.f115458b;
        PostMessageConfig postMessageConfig = cVar.f115459c;
        C47538ax c = lVar.f115475e.mo51613c("WebMessageListener#onPostMessage");
        if (!z) {
            try {
                ((C59052c) ((C59052c) C44424l.f115471a.mo56226d()).mo56372aa(54233)).mo56386p("Discarded a WebMessage not coming from main frame.");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            if (lVar.f115476f) {
                ((C43804r) ((C43914c) aVar).mo46411d(C43804r.class)).mo46817a().f114172a.mo46798a(postMessageConfig.mo42598a()).mo46797c(C58837ba.m90858g(eVar.f13972a), new C44416d(lVar, wVar));
            }
            C43976w a = lVar.f115472b.mo46963a(postMessageConfig.mo42598a());
            if (a.mo46969e()) {
                ((C59052c) ((C59052c) C44424l.f115471a.mo56226d()).mo56372aa(54232)).mo56386p("Discarded a WebMessage as channel is not available.");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            if (a.mo46970f()) {
                a.mo46966b(C44417e.f115462a, lVar.mo47299b(wVar));
            }
            a.mo46967c(eVar.f13972a, postMessageConfig);
            if (c != null) {
                c.close();
                return;
            }
            return;
        }
        throw th;
    }
}
