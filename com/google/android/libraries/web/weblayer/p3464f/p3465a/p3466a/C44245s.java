package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.weblayer.p3448b.C44129e;
import com.google.android.libraries.web.weblayer.p3464f.p3467b.C44268u;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72621j;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.s */
/* compiled from: PG */
final class C44245s implements C72621j {

    /* renamed from: a */
    final /* synthetic */ C69577g f115072a;

    /* renamed from: b */
    final /* synthetic */ Profile f115073b;

    public C44245s(C69577g gVar, Profile profile) {
        this.f115072a = gVar;
        this.f115073b = profile;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46626a(Object obj) {
        if (obj == null) {
            this.f115072a.mo61338mb(C69714l.m101133a(new C44129e("Failed to load weblayer", (Throwable) null)));
            return;
        }
        C69577g gVar = this.f115072a;
        C72587aw a = C44268u.m78127a((C72611bt) obj, this.f115073b);
        C72604bm.m107399a();
        gVar.mo61338mb(a.f193123e);
    }
}
