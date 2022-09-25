package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import com.google.android.libraries.web.profile.C43977a;
import java.util.Set;
import org.chromium.weblayer.C72621j;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.f.b.d */
/* compiled from: PG */
final class C44251d implements C72621j {

    /* renamed from: a */
    final /* synthetic */ C69577g f115089a;

    /* renamed from: b */
    final /* synthetic */ Set f115090b;

    public C44251d(C69577g gVar, Set set) {
        this.f115089a = gVar;
        this.f115090b = set;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo46626a(Object obj) {
        Boolean bool = (Boolean) obj;
        C69664n.m101060f(bool, "result");
        if (bool.booleanValue()) {
            this.f115089a.mo61338mb(C69788q.f186170a);
            return;
        }
        C69577g gVar = this.f115089a;
        Set set = this.f115090b;
        new StringBuilder("Could not remove persistence IDs: ").append(set);
        gVar.mo61338mb(C69714l.m101133a(new C43977a("Could not remove persistence IDs: ".concat(String.valueOf(set)))));
    }
}
