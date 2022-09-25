package com.google.android.libraries.web.p3408h.p3414b;

import android.net.Uri;
import com.google.android.libraries.web.lifecycle.C43882c;
import com.google.android.libraries.web.lifecycle.C43889d;
import com.google.android.libraries.web.lifecycle.internal.C43896d;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3408h.p3415c.C43805a;
import com.google.android.libraries.web.p3408h.p3415c.C43806b;
import java.util.List;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.b.d */
/* compiled from: PG */
public final class C43790d implements C43806b, C43796j {

    /* renamed from: a */
    public final C71548cy f114178a;

    /* renamed from: b */
    public final C71571du f114179b;

    /* renamed from: c */
    public final C43896d f114180c = new C43896d();

    /* renamed from: d */
    private final Uri f114181d;

    /* renamed from: e */
    private final C43366k f114182e;

    public C43790d(Uri uri, C43366k kVar) {
        List list;
        C69664n.m101061g(kVar, "triggerType");
        this.f114181d = uri;
        this.f114182e = kVar;
        if (uri == null) {
            list = C69496am.f185918a;
        } else {
            list = C69540x.m100944b(uri);
        }
        C71548cy b = C71574dx.m104480b(new C43791e(list, kVar, false, (C43363h) null));
        this.f114178a = b;
        this.f114179b = b;
    }

    /* renamed from: a */
    public final void mo46804a() {
        mo46808b();
        this.f114180c.mo46902h();
    }

    /* renamed from: b */
    public final void mo46808b() {
        if (C43882c.m77456a(this.f114180c)) {
            throw new IllegalStateException("Cannot modify a navigation that is already destroyed.");
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C43889d mo46410c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo46809d(Uri uri, C43363h hVar) {
        Object e;
        C69664n.m101061g(uri, "url");
        mo46808b();
        if (!C69664n.m101066l(uri, C43805a.m77341a(this).mo46810a())) {
            C43791e eVar = (C43791e) this.f114178a.mo62784e();
            C71548cy cyVar = this.f114178a;
            List X = C69540x.m100842X(eVar.f114183a);
            X.set(C69540x.m100945c(X), uri);
            cyVar.mo62807f(C43791e.m77312b(eVar, C69540x.m100840V(X), true, hVar, 2));
        } else {
            C71548cy cyVar2 = this.f114178a;
            do {
                e = cyVar2.mo62784e();
            } while (!cyVar2.mo62808g(e, C43791e.m77312b((C43791e) e, (List) null, true, hVar, 3)));
        }
        this.f114180c.mo46902h();
    }
}
