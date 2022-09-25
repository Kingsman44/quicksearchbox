package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9536b;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.b.a */
/* compiled from: PG */
public final class C127130a {

    /* renamed from: a */
    private static final C59071e f350041a = C59071e.m91331h();

    /* renamed from: b */
    private final C46778cv f350042b;

    /* renamed from: c */
    private final AtomicReference f350043c = new AtomicReference(C126988i.f349669h);

    public C127130a(C46778cv cvVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f350042b = cvVar;
    }

    /* renamed from: a */
    public final C126988i mo107955a() {
        C59052c cVar = (C59052c) f350041a.mo56224b();
        C126985f a = C126985f.m207727a(((C126988i) this.f350043c.get()).f349676f);
        if (a == null) {
            a = C126985f.ERROR_UNKNOWN;
        }
        cVar.mo56379ah(new C59094n(37399));
        cVar.mo56389s("Has error =%s", a);
        Object obj = this.f350043c.get();
        C69664n.m101060f(obj, "errorData.get()");
        return (C126988i) obj;
    }

    /* renamed from: b */
    public final void mo107956b(C126988i iVar) {
        C69664n.m101061g(iVar, "error");
        this.f350043c.set(iVar);
        this.f350042b.mo50787a(C60866ct.f164955a, C127120a.f350023e);
    }
}
