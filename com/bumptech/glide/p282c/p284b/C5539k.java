package com.bumptech.glide.p282c.p284b;

import android.util.Log;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.load.p297b.C5750ab;
import com.google.apps.tiktok.media.contrib.cronet.C47447b;
import com.google.common.util.concurrent.C60826bg;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* renamed from: com.bumptech.glide.c.b.k */
/* compiled from: PG */
final class C5539k implements C5930e {

    /* renamed from: a */
    public final C5530b f16778a;

    /* renamed from: b */
    public C5929d f16779b;

    /* renamed from: c */
    private final C5538j f16780c;

    /* renamed from: d */
    private final C5750ab f16781d;

    public C5539k(C5538j jVar, C5530b bVar, C5750ab abVar) {
        this.f16780c = jVar;
        this.f16778a = bVar;
        this.f16781d = abVar;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.REMOTE;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return this.f16778a.mo11907a();
    }

    /* renamed from: c */
    public final void mo11923c() {
        C5535g gVar;
        UrlRequest urlRequest;
        C5538j jVar = this.f16780c;
        C5750ab abVar = this.f16781d;
        synchronized (jVar) {
            gVar = (C5535g) jVar.f16776d.get(abVar);
        }
        if (gVar != null) {
            synchronized (gVar.f16769h) {
                gVar.f16762a.remove(this);
                if (gVar.f16762a.isEmpty()) {
                    gVar.f16767f = true;
                    gVar.f16769h.f16776d.remove(gVar.f16763b);
                }
            }
            if (gVar.f16767f && (urlRequest = gVar.f16766e) != null) {
                urlRequest.cancel();
            }
        }
    }

    /* renamed from: d */
    public final void mo11924d() {
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        C5535g gVar;
        boolean z;
        this.f16779b = dVar;
        C5538j jVar = this.f16780c;
        C5750ab abVar = this.f16781d;
        synchronized (jVar) {
            gVar = (C5535g) jVar.f16776d.get(abVar);
            if (gVar == null) {
                gVar = jVar.f16775c.mo11919a(abVar);
                jVar.f16776d.put(abVar, gVar);
                z = true;
            } else {
                z = false;
            }
            synchronized (gVar.f16769h) {
                gVar.f16762a.add(this);
            }
        }
        if (z) {
            if (Log.isLoggable("ChromiumSerializer", 2)) {
                Log.v("ChromiumSerializer", "Fetching image url using cronet url: ".concat(String.valueOf(String.valueOf(abVar))));
            }
            gVar.f16764c = pVar;
            C47447b bVar = jVar.f16777e;
            String c = abVar.mo12250c();
            int intValue = ((Integer) C5538j.f16773a.get(pVar)).intValue();
            Map d = abVar.mo12251d();
            UrlRequest.Builder newUrlRequestBuilder = ((CronetEngine) bVar.f123216a.mo27525b()).newUrlRequestBuilder(c, gVar, C60826bg.f164896a);
            newUrlRequestBuilder.allowDirectExecutor();
            for (Map.Entry entry : d.entrySet()) {
                String str = (String) entry.getKey();
                if (!"Accept-Encoding".equalsIgnoreCase(str) && !"User-Agent".equalsIgnoreCase(str)) {
                    newUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
                }
            }
            newUrlRequestBuilder.setPriority(intValue);
            gVar.f16766e = newUrlRequestBuilder.build();
            gVar.f16766e.start();
            if (gVar.f16767f) {
                gVar.f16766e.cancel();
            }
        }
    }
}
