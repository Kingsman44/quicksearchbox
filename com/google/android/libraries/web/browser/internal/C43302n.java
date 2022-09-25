package com.google.android.libraries.web.browser.internal;

import android.net.Uri;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.browser.internal.n */
/* compiled from: PG */
final class C43302n implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C43904a f113135a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f113136b;

    /* renamed from: c */
    final /* synthetic */ Object f113137c;

    /* renamed from: d */
    final /* synthetic */ C43366k f113138d;

    /* renamed from: e */
    final /* synthetic */ C43257h f113139e;

    public C43302n(C43904a aVar, C60870cx cxVar, Object obj, C43366k kVar, C43257h hVar) {
        this.f113135a = aVar;
        this.f113136b = cxVar;
        this.f113137c = obj;
        this.f113138d = kVar;
        this.f113139e = hVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Uri uri = (Uri) obj;
        C43891f d = this.f113135a.mo46411d(C43804r.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43804r rVar = (C43804r) ((C43945v) d);
        C60870cx cxVar = this.f113136b;
        if (cxVar != null) {
            C69664n.m101060f(uri, "url");
            rVar.mo46825i(cxVar, uri);
            rVar.mo46818b(this.f113136b, this.f113137c);
            return;
        }
        Object obj2 = this.f113137c;
        C69664n.m101060f(uri, "url");
        rVar.mo46824h(obj2, uri, this.f113138d, new C43301m(this.f113139e));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
