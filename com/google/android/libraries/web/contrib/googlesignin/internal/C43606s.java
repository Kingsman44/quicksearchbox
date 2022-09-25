package com.google.android.libraries.web.contrib.googlesignin.internal;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeatureContract;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3354a.C43317a;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44040c;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44041d;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44042e;
import com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44005ar;
import com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44006as;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.web.contrib.googlesignin.internal.s */
/* compiled from: PG */
public final class C43606s implements C43317a {

    /* renamed from: a */
    public static final C59071e f113817a = C59071e.m91332i("com.google.android.libraries.web.contrib.googlesignin.internal.s");

    /* renamed from: b */
    private final C44041d f113818b;

    /* renamed from: c */
    private final C44042e f113819c;

    public C43606s(C44040c cVar, C43269t tVar, C44084b bVar) {
        this.f113818b = cVar.mo47007a(tVar.mo46386d());
        this.f113819c = (C44042e) bVar.mo47055a(GoogleSignInFeatureContract.class, C44042e.class).orElseGet(new C43603p());
    }

    /* renamed from: a */
    public final void mo46415a(C43376u uVar) {
        C43369n a = C43369n.m76519a(uVar.f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        if (a.equals(C43369n.SUCCESS)) {
            C44041d dVar = this.f113818b;
            C44006as asVar = (C44006as) dVar;
            C60870cx e = C71663i.m104692e(asVar.f114550a, C71424ay.UNDISPATCHED, new C44005ar(asVar, this.f113819c, (C69577g) null), 1);
            C43605r rVar = new C43605r();
            C60856cj.m92911t(e, C47810es.m84974n(rVar), C60826bg.f164896a);
        }
    }
}
