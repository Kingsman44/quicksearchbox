package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.af */
/* compiled from: PG */
public final class C6786af extends C6782ac {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f20496a;

    /* renamed from: b */
    private Long f20497b = null;

    /* renamed from: c */
    private final Map f20498c;

    /* renamed from: d */
    private final String f20499d;

    public C6786af(Map map, String str) {
        this.f20498c = map;
        this.f20499d = null;
    }

    /* renamed from: a */
    public final void mo14414a() {
        WebView webView = new WebView(C7298t.m21774a().mo16511b());
        this.f20496a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo14416c(this.f20496a);
        C7352v.m22064a().mo16605h(this.f20496a, (String) null);
        Iterator it = this.f20498c.keySet().iterator();
        if (!it.hasNext()) {
            this.f20497b = Long.valueOf(System.nanoTime());
            return;
        }
        C6904ek ekVar = (C6904ek) this.f20498c.get((String) it.next());
        throw null;
    }

    /* renamed from: b */
    public final void mo14415b() {
        long j;
        super.mo14415b();
        if (this.f20497b == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f20497b.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new C6785ae(this), Math.max(4000 - j, 2000));
        this.f20496a = null;
    }

    /* renamed from: h */
    public final void mo14421h(C7001i iVar, C6947g gVar) {
        JSONObject jSONObject = new JSONObject();
        Map d = gVar.mo15864d();
        for (String str : d.keySet()) {
            C6789ah.m18702d(jSONObject, str, (C6904ek) d.get(str));
        }
        mo14422i(iVar, gVar, jSONObject);
    }
}
