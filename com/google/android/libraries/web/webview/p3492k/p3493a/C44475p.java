package com.google.android.libraries.web.webview.p3492k.p3493a;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebViewClient;
import androidx.p201w.C4365i;
import androidx.p201w.C4366j;
import androidx.p201w.C4370n;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3349a.C43238c;
import com.google.android.libraries.web.base.p3348b.p3349a.C43239d;
import com.google.android.libraries.web.contrib.contextmenu.internal.p3365a.C43456a;
import com.google.android.libraries.web.contrib.fullscreen.internal.C43560b;
import com.google.android.libraries.web.contrib.googlesignin.internal.weblayer.C43608b;
import com.google.android.libraries.web.contrib.p3389i.C43632f;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3416i.C43807a;
import com.google.android.libraries.web.p3423l.C43873a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43906a;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43910e;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.webview.p3474c.p3475a.C44350a;
import com.google.android.libraries.web.webview.p3478d.p3479a.C44397c;
import com.google.android.libraries.web.webview.p3480e.C44407f;
import com.google.android.libraries.web.webview.p3485h.C44425b;
import com.google.android.libraries.web.webview.p3491j.C44449a;
import com.google.android.libraries.web.webview.p3491j.C44454f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3695e.C47606c;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3695e.C47608e;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3695e.C47609f;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3695e.C47611h;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3695e.C47612i;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.function.Predicate;
import p5462h.p5463a.C69502as;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69694b;
import p5462h.p5480j.C69699g;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.libraries.web.webview.k.a.p */
/* compiled from: PG */
public final class C44475p implements C43906a {

    /* renamed from: g */
    private static final C59071e f115615g = C59071e.m91331h();

    /* renamed from: a */
    public final C44454f f115616a;

    /* renamed from: b */
    public final C47770dh f115617b;

    /* renamed from: c */
    public final C44463d f115618c;

    /* renamed from: d */
    public final C44468i f115619d;

    /* renamed from: e */
    public final boolean f115620e;

    /* renamed from: f */
    public final C44397c f115621f;

    /* renamed from: h */
    private final C43331ag f115622h;

    /* renamed from: i */
    private final C43239d f115623i;

    /* renamed from: j */
    private final Set f115624j = new LinkedHashSet();

    public C44475p(C43904a aVar, C44454f fVar, C44397c cVar, C47770dh dhVar, C43269t tVar, C44464e eVar, C47609f fVar2, C44469j jVar, C47612i iVar, C44479t tVar2, C69585o oVar) {
        C43904a aVar2 = aVar;
        C44454f fVar3 = fVar;
        C44397c cVar2 = cVar;
        C47770dh dhVar2 = dhVar;
        C44469j jVar2 = jVar;
        C69664n.m101061g(aVar2, "window");
        C69664n.m101061g(cVar2, "host");
        C69664n.m101061g(dhVar2, "traceCreation");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(oVar, "mainImmediateContext");
        this.f115616a = fVar3;
        this.f115621f = cVar2;
        this.f115617b = dhVar2;
        C43891f d = aVar2.mo46411d(C43331ag.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43331ag agVar = (C43331ag) ((C43945v) d);
        this.f115622h = agVar;
        C47606c cVar3 = (C47606c) tVar2.f115628a.mo17428b();
        cVar3.getClass();
        this.f115623i = new C44478s(fVar3, cVar3);
        this.f115620e = tVar.mo46384b().f112974m;
        C44471l lVar = new C44471l(this);
        aVar.getClass();
        agVar.getClass();
        C43269t tVar3 = (C43269t) eVar.f115575a.mo17428b();
        tVar3.getClass();
        C44463d dVar = new C44463d(aVar2, agVar, lVar, tVar3);
        this.f115618c = dVar;
        ArrayList arrayList = new ArrayList();
        C4366j.m12516a("/assets/", new C4365i(fVar.getContext()), arrayList);
        C4370n b = C4366j.m12517b(arrayList);
        aVar.getClass();
        agVar.getClass();
        C44407f fVar4 = (C44407f) jVar2.f115603a.mo17428b();
        fVar4.getClass();
        C43873a aVar3 = (C43873a) jVar2.f115604b.mo17428b();
        aVar3.getClass();
        C44425b bVar = (C44425b) jVar2.f115605c.mo17428b();
        bVar.getClass();
        C44449a aVar4 = (C44449a) jVar2.f115606d.mo17428b();
        aVar4.getClass();
        WebModelProvider webModelProvider = (WebModelProvider) jVar2.f115607e.mo17428b();
        webModelProvider.getClass();
        C43269t tVar4 = (C43269t) jVar2.f115608f.mo17428b();
        tVar4.getClass();
        C44468i iVar2 = new C44468i(aVar2, agVar, b, lVar, fVar4, aVar3, bVar, aVar4, webModelProvider, tVar4);
        this.f115619d = iVar2;
        fVar3.mo47310d(C44082a.f114755a, new C47608e(fVar2, dVar));
        fVar3.mo47311e(C44082a.f114755a, new C47611h(iVar, iVar2));
        C69664n.m101061g(C44082a.f114755a, "restricted");
        C69664n.m101061g(iVar2, "browserInitiatedCallback");
        fVar3.f115546a = iVar2;
    }

    /* renamed from: a */
    public final int mo46926a() {
        Integer num;
        int c = mo46928c();
        if (!this.f115616a.canGoForward()) {
            return c;
        }
        if (!this.f115620e) {
            return c + 1;
        }
        WebBackForwardList copyBackForwardList = this.f115616a.copyBackForwardList();
        C69664n.m101060f(copyBackForwardList, "webView.copyBackForwardList()");
        C69502as a = C69699g.m101122d(c + 1, copyBackForwardList.getSize() - 1).iterator();
        while (true) {
            if (!((C69694b) a).f186062a) {
                num = null;
                break;
            }
            num = Integer.valueOf(a.mo5128a());
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(num.intValue() + 1);
            C69664n.m101058d(itemAtIndex);
            String url = itemAtIndex.getUrl();
            C69664n.m101060f(url, "history.getItemAtIndex(index + 1)!!.url");
            if (!C44350a.m78300a(url)) {
                break;
            }
        }
        return num != null ? num.intValue() : copyBackForwardList.getSize() - 1;
    }

    /* renamed from: b */
    public final int mo46927b(C69626l lVar) {
        Object obj;
        WebBackForwardList copyBackForwardList = this.f115616a.copyBackForwardList();
        C69664n.m101060f(copyBackForwardList, "webView.copyBackForwardList()");
        int currentIndex = copyBackForwardList.getCurrentIndex();
        if (this.f115616a.canGoBack()) {
            Iterator a = C69734n.m101140h(C69540x.m100847ac(C69699g.m101121c(currentIndex - 1, 0)), new C44472m(this, copyBackForwardList)).mo5191a();
            while (true) {
                if (!a.hasNext()) {
                    obj = null;
                    break;
                }
                obj = a.next();
                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(((Number) obj).intValue());
                C69664n.m101058d(itemAtIndex);
                String url = itemAtIndex.getUrl();
                C69664n.m101060f(url, "history.getItemAtIndex(index)!!.url");
                if (((Boolean) lVar.mo5761a(url)).booleanValue()) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                return num.intValue();
            }
        }
        return currentIndex;
    }

    /* renamed from: c */
    public final int mo46928c() {
        return this.f115616a.copyBackForwardList().getCurrentIndex();
    }

    /* renamed from: d */
    public final C43239d mo46916d() {
        return this.f115623i;
    }

    /* renamed from: e */
    public final /* synthetic */ String mo46929e() {
        return C43910e.m77520a(this);
    }

    /* renamed from: f */
    public final String mo46930f(int i) {
        WebBackForwardList copyBackForwardList = this.f115616a.copyBackForwardList();
        C69664n.m101060f(copyBackForwardList, "webView.copyBackForwardList()");
        C58838bb.m90861B(i, copyBackForwardList.getSize(), "Navigation history index");
        WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
        C69664n.m101058d(itemAtIndex);
        String url = itemAtIndex.getUrl();
        C69664n.m101060f(url, "history.getItemAtIndex(index)!!.url");
        return url;
    }

    /* renamed from: g */
    public final Set mo46917g() {
        return this.f115624j;
    }

    /* renamed from: h */
    public final void mo46931h(int i) {
        this.f115616a.goBackOrForward(i - mo46928c());
    }

    /* renamed from: i */
    public final void mo46932i(C43257h hVar) {
        C69664n.m101061g(hVar, "loadUrlParams");
        if (hVar.mo46358h()) {
            this.f115616a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.f115619d.f115586e = hVar.mo46351b();
        if (hVar.mo46353d().isEmpty()) {
            C44454f fVar = this.f115616a;
            C44082a aVar = C44082a.f114755a;
            String f = hVar.mo46356f();
            C69664n.m101060f(f, "loadUrlParams.url()");
            fVar.mo47308b(aVar, f, (Map) null);
            return;
        }
        C44454f fVar2 = this.f115616a;
        C44082a aVar2 = C44082a.f114755a;
        String f2 = hVar.mo46356f();
        C69664n.m101060f(f2, "loadUrlParams.url()");
        fVar2.mo47308b(aVar2, f2, hVar.mo46353d());
    }

    /* renamed from: j */
    public final /* synthetic */ void mo46933j(boolean z) {
    }

    /* renamed from: k */
    public final void mo46934k() {
        this.f115616a.reload();
    }

    /* renamed from: l */
    public final void mo46918l(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f115616a.setOnCreateContextMenuListener(new C44473n(this, onCreateContextMenuListener));
    }

    /* renamed from: m */
    public final /* synthetic */ void mo46919m(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public final void mo46920n(C43238c cVar) {
        this.f115618c.f115567c = cVar;
        this.f115619d.f115583b = cVar;
    }

    /* renamed from: o */
    public final void mo46921o(C43807a aVar) {
        this.f115619d.f115584c = aVar;
    }

    /* renamed from: p */
    public final /* synthetic */ void mo46922p(C43456a aVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public final void mo46923q(C43560b bVar) {
        this.f115618c.f115568d = bVar;
    }

    /* renamed from: r */
    public final /* synthetic */ void mo46924r(C43608b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public final void mo46925s(C43632f fVar) {
        this.f115616a.mo47307a(C44082a.f114755a, new C44474o(fVar));
    }

    /* renamed from: t */
    public final Bundle mo47360t() {
        Bundle bundle = new Bundle();
        mo47362v(bundle);
        return bundle;
    }

    /* renamed from: u */
    public final void mo47361u() {
        this.f115616a.mo47310d(C44082a.f114755a, new WebChromeClient());
        this.f115616a.mo47311e(C44082a.f114755a, new WebViewClient());
        this.f115616a.destroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        p5462h.p5472e.C69598b.m101013a(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        throw r0;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47362v(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "outState"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            com.google.android.libraries.web.webview.j.f r0 = r5.f115616a
            java.lang.String r0 = r0.getUrl()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.libraries.web.webview.j.f r2 = r5.f115616a
            r2.saveState(r1)
            android.os.Parcel r2 = android.os.Parcel.obtain()
            java.lang.String r3 = "obtain()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.lang.String r3 = "Measure web instance state bundle"
            com.google.apps.tiktok.tracing.bi r3 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r3)
            r4 = 0
            r1.writeToParcel(r2, r4)     // Catch:{ all -> 0x006a }
            int r4 = r2.dataSize()     // Catch:{ all -> 0x006a }
            r2.recycle()     // Catch:{ all -> 0x006a }
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r3, r2)
            r2 = 500000(0x7a120, float:7.00649E-40)
            if (r4 <= r2) goto L_0x005d
            com.google.common.f.e r2 = f115615g
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 54262(0xd3f6, float:7.6037E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "WebView state too large, ignoring"
            r2.mo56386p(r3)
            r1.clear()
            com.google.android.libraries.web.webview.j.f r2 = r5.f115616a
            r2.clearHistory()
            com.google.android.libraries.web.webview.j.f r2 = r5.f115616a
            r2.saveState(r1)
        L_0x005d:
            if (r0 == 0) goto L_0x0064
            java.lang.String r2 = "web_view_url"
            r6.putString(r2, r0)
        L_0x0064:
            java.lang.String r0 = "web_view_state"
            r6.putBundle(r0, r1)
            return
        L_0x006a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3492k.p3493a.C44475p.mo47362v(android.os.Bundle):void");
    }
}
