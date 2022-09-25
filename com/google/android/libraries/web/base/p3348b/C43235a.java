package com.google.android.libraries.web.base.p3348b;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3420k.C43863i;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.b.a */
/* compiled from: PG */
final class C43235a implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C43251d f112989a;

    /* renamed from: b */
    final /* synthetic */ C43257h f112990b;

    public C43235a(C43251d dVar, C43257h hVar) {
        this.f112989a = dVar;
        this.f112990b = hVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C69664n.m101061g((Fragment) obj, "it");
        C43863i iVar = C43756o.m77265a(this.f112989a.f113024a).f114099h;
        C69664n.m101058d(iVar);
        C43257h hVar = this.f112990b;
        C69664n.m101061g(hVar, "loadUrlParams");
        if (!iVar.mo46872a()) {
            C43309u.m76408a(iVar.f114310a.f114326h.mo46855b()).mo46405d(hVar, C43366k.BROWSER_INITIATED_NEW_PAGE);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
