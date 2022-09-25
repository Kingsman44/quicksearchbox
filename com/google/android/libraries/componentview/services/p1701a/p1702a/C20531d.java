package com.google.android.libraries.componentview.services.p1701a.p1702a;

import android.net.Uri;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20579bf;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.util.concurrent.C60856cj;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.services.a.a.d */
/* compiled from: PG */
final class C20531d implements C5930e {

    /* renamed from: a */
    private final String f57675a;

    /* renamed from: b */
    private final C20579bf f57676b;

    /* renamed from: c */
    private final ExecutorService f57677c;

    /* renamed from: d */
    private final C20601ca f57678d;

    public C20531d(C20532e eVar) {
        this.f57675a = eVar.f57679b;
        this.f57676b = eVar.f57681d;
        this.f57677c = eVar.f57682e;
        this.f57678d = eVar.f57683f;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.REMOTE;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        C20530c cVar = new C20530c(dVar);
        try {
            String str = this.f57675a;
            C20520h.m38497b(3, "ImageDataFetcher", (Throwable) null, "Using componentview fetcher " + str, new Object[0]);
            C60856cj.m92911t(this.f57676b.mo25518c(Uri.parse(this.f57675a), (Map) null, true), cVar, this.f57677c);
        } catch (Exception e) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.IMAGE_MALFORMED_URL);
            eVar.f57822b = "Malformed URL ".concat(String.valueOf(this.f57675a));
            eVar.f57821a = e;
            C20520h.m38498c("ImageDataFetcher", eVar.mo25531a(), this.f57678d, new Object[0]);
            dVar.mo12183f((Object) null);
        }
    }
}
