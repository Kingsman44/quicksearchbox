package com.google.android.libraries.web.webview.p3492k.p3493a;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3349a.C43238c;
import com.google.android.libraries.web.contrib.fullscreen.internal.C43560b;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3408h.p3409a.p3412b.p3413a.C43785b;
import com.google.android.libraries.web.p3408h.p3414b.C43788b;
import com.google.android.libraries.web.p3408h.p3414b.C43795i;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.C43920i;
import com.google.android.libraries.web.webview.contrib.filechooser.C44366h;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.C44373f;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionCallbacks;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionWindowPlugin$RequestImpl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p3186j$.util.function.BiConsumer;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.k.a.d */
/* compiled from: PG */
public final class C44463d extends WebChromeClient {

    /* renamed from: e */
    private static final C59071e f115564e = C59071e.m91331h();

    /* renamed from: a */
    public final C71342e f115565a = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: b */
    public final C71342e f115566b = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: c */
    public C43238c f115567c;

    /* renamed from: d */
    public C43560b f115568d;

    /* renamed from: f */
    private final C43904a f115569f;

    /* renamed from: g */
    private final C43331ag f115570g;

    /* renamed from: h */
    private final boolean f115571h;

    /* renamed from: i */
    private final C71342e f115572i = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: j */
    private final C69613f f115573j = new C69747m(C44460a.f115561a);

    /* renamed from: k */
    private final C44471l f115574k;

    public C44463d(C43904a aVar, C43331ag agVar, C44471l lVar, C43269t tVar) {
        this.f115569f = aVar;
        this.f115570g = agVar;
        this.f115574k = lVar;
        this.f115571h = tVar.mo46384b().f112975n;
    }

    /* renamed from: a */
    public final C44373f mo47329a() {
        return (C44373f) this.f115565a.f190532a;
    }

    public final Bitmap getDefaultVideoPoster() {
        Object a = this.f115573j.mo5768a();
        C69664n.m101060f(a, "<get-defaultPoster>(...)");
        return (Bitmap) a;
    }

    public final void onCloseWindow(WebView webView) {
        C69664n.m101061g(webView, "view");
        C43920i iVar = this.f115574k.f115609a.f115621f.f115411a.f115421f;
        if (iVar.mo46769c() != null) {
            for (C43949z d : iVar.f114389b) {
                d.mo46531d();
            }
            for (C43949z b : iVar.f114389b) {
                b.mo46529b((C43904a) null);
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        C69664n.m101061g(webView, "view");
        C69664n.m101061g(message, "resultMsg");
        return false;
    }

    public final void onGeolocationPermissionsHidePrompt() {
        GeolocationPermissionWindowPlugin$RequestImpl geolocationPermissionWindowPlugin$RequestImpl;
        C44373f a = mo47329a();
        if (a != null && (geolocationPermissionWindowPlugin$RequestImpl = a.f115369b) != null) {
            geolocationPermissionWindowPlugin$RequestImpl.f115360a = null;
        }
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C69664n.m101061g(str, "origin");
        C69664n.m101061g(callback, "callback");
        C44373f a = mo47329a();
        if (a != null) {
            GeolocationPermissionWindowPlugin$RequestImpl geolocationPermissionWindowPlugin$RequestImpl = new GeolocationPermissionWindowPlugin$RequestImpl(str, callback, a.f115368a);
            a.f115369b = geolocationPermissionWindowPlugin$RequestImpl;
            GeolocationPermissionCallbacks geolocationPermissionCallbacks = a.f115370c;
            if (geolocationPermissionCallbacks != null) {
                geolocationPermissionWindowPlugin$RequestImpl.mo47254b(geolocationPermissionCallbacks);
            }
        }
    }

    public final void onHideCustomView() {
        C43560b bVar = this.f115568d;
        if (bVar != null) {
            bVar.mo46622f(true);
        }
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C69664n.m101061g(webView, "webView");
        C69664n.m101061g(str, "url");
        C69664n.m101061g(str2, "message");
        C69664n.m101061g(jsResult, "result");
        C44470k kVar = (C44470k) this.f115572i.f190532a;
        if (kVar != null) {
            return kVar.mo47358a();
        }
        return false;
    }

    public final void onProgressChanged(WebView webView, int i) {
        C43788b b;
        Object e;
        C69664n.m101061g(webView, "view");
        this.f115570g.mo46457s(i);
        if (this.f115571h) {
            C43891f d = this.f115569f.mo46411d(C43804r.class);
            C69664n.m101060f(d, "getPlugin(T::class.java)");
            C43795i iVar = ((C43804r) ((C43945v) d)).f114216c;
            if (iVar != null && (b = iVar.mo46814b()) != null) {
                C71548cy cyVar = (C71548cy) C43785b.f114171b.mo46879a(b, C43785b.f114170a[0]);
                do {
                    e = cyVar.mo62784e();
                } while (!cyVar.mo62808g(e, Integer.valueOf(Math.max(((Number) e).intValue(), i))));
            }
        }
    }

    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        C69664n.m101061g(webView, "view");
        C43238c cVar = this.f115567c;
        if (cVar != null) {
            String url = webView.getUrl();
            if (url != null) {
                cVar.mo46319b(url, bitmap);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void onReceivedTitle(WebView webView, String str) {
        C69664n.m101061g(webView, "view");
        if (str == null) {
            C59052c cVar = (C59052c) f115564e.mo56226d();
            cVar.mo56379ah(new C59094n(54244));
            cVar.mo56386p("Received null title, ignoring.");
            return;
        }
        this.f115570g.mo46458t(str);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C69664n.m101061g(view, "view");
        C69664n.m101061g(customViewCallback, "internalCallback");
        C43560b bVar = this.f115568d;
        if (bVar != null) {
            bVar.mo46621e(new C44461b(view), new C44462c(customViewCallback));
        }
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C69664n.m101061g(webView, "webView");
        C69664n.m101061g(valueCallback, "filePathCallback");
        C69664n.m101061g(fileChooserParams, "fileChooserParams");
        C44366h hVar = (C44366h) this.f115566b.f190532a;
        if (hVar == null) {
            return false;
        }
        BiConsumer biConsumer = hVar.f115353b;
        if (biConsumer == null) {
            ((C59052c) ((C59052c) C44366h.f115352a.mo56226d()).mo56372aa(54218)).mo56386p("Trying to open file chooser while the fragment is not started, ignoring.");
            return false;
        }
        biConsumer.accept(valueCallback, fileChooserParams);
        return true;
    }
}
