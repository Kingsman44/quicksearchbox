package com.google.android.apps.search.podcasts.p10560d;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.podcasts.p10561e.p10562a.C140200a;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.d.d */
/* compiled from: PG */
public final class C140197d implements GatewayHandler {

    /* renamed from: a */
    public final Context f380895a;

    /* renamed from: b */
    public final boolean f380896b;

    /* renamed from: c */
    public final C140200a f380897c;

    public C140197d(Context context, boolean z, C140200a aVar) {
        C69664n.m101061g(context, "context");
        this.f380895a = context;
        this.f380896b = z;
        this.f380897c = aVar;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        String path;
        Uri data = mVar.f123337a.getData();
        if (!C69664n.m101066l(data != null ? data.getScheme() : null, "https")) {
            return null;
        }
        if (!C69664n.m101066l(data.getHost(), "podcasts.google.com") && (!C69664n.m101066l(data.getHost(), "www.google.com") || (path = data.getPath()) == null || !C69764m.m101234m(path, "/podcasts"))) {
            return null;
        }
        Uri data2 = mVar.f123337a.getData();
        if (data2 == null) {
            data2 = Uri.parse("https://podcasts.google.com/?ep=10");
        }
        return new C140196c(this, C140195b.m227863a(data2), data2);
    }
}
