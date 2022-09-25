package com.google.android.libraries.mdi.download.p2236d.p2242f;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29669a;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.f.k */
/* compiled from: PG */
public final class C29097k {

    /* renamed from: a */
    public final C29096j f78949a;

    /* renamed from: b */
    public final Map f78950b = new HashMap();

    /* renamed from: c */
    private final C29669a f78951c = new C29669a();

    /* renamed from: d */
    private final Executor f78952d;

    public C29097k(Executor executor, C29096j jVar) {
        this.f78952d = executor;
        this.f78949a = jVar;
    }

    /* renamed from: a */
    public static C29097k m53993a(Executor executor) {
        return new C29097k(executor, new C29095i());
    }

    /* renamed from: b */
    public final C60870cx mo34565b(String str, C60870cx cxVar) {
        C29045l.m53940l("%s: submitting request to add in-progress download future with key: %s", "DownloadFutureMap", str);
        C29669a aVar = this.f78951c;
        return aVar.f80333a.mo51512b(new C29093g(this, str, cxVar), this.f78952d);
    }

    /* renamed from: c */
    public final C60870cx mo34566c(String str) {
        C29045l.m53940l("%s: submitting check for in-progress download future with key: %s", "DownloadFutureMap", str);
        C29669a aVar = this.f78951c;
        return aVar.f80333a.mo51511a(new C29092f(this, str), this.f78952d);
    }

    /* renamed from: d */
    public final C60870cx mo34567d(String str) {
        C29045l.m53940l("%s: submitting request for in-progress download future with key: %s", "DownloadFutureMap", str);
        C29669a aVar = this.f78951c;
        return aVar.f80333a.mo51511a(new C29094h(this, str), this.f78952d);
    }

    /* renamed from: e */
    public final C60870cx mo34568e(String str) {
        C29045l.m53940l("%s: submitting request to remove in-progress download future with key: %s", "DownloadFutureMap", str);
        C29669a aVar = this.f78951c;
        return aVar.f80333a.mo51512b(new C29091e(this, str), this.f78952d);
    }
}
