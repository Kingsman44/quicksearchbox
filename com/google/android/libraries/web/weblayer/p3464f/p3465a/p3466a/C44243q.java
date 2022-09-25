package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import com.google.android.libraries.web.profile.p3431a.C44060h;
import org.chromium.weblayer.C72621j;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.q */
/* compiled from: PG */
final class C44243q implements C72621j {

    /* renamed from: a */
    final /* synthetic */ C69577g f115066a;

    public C44243q(C69577g gVar) {
        this.f115066a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo46626a(Object obj) {
        Boolean bool = (Boolean) obj;
        C69664n.m101060f(bool, "success");
        if (bool.booleanValue()) {
            this.f115066a.mo61338mb(C69788q.f186170a);
        } else {
            this.f115066a.mo61338mb(C69714l.m101133a(new C44060h("Cookie failed to be set", (Throwable) null)));
        }
    }
}
