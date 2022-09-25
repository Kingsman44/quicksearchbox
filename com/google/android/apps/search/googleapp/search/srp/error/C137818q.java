package com.google.android.apps.search.googleapp.search.srp.error;

import com.google.android.apps.search.googleapp.search.srp.p10435e.C137751ab;
import com.google.android.libraries.web.contrib.errorpage.C43507a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43508a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.q */
/* compiled from: PG */
final class C137818q implements C43507a {

    /* renamed from: a */
    public static final C137818q f374947a = new C137818q();

    /* renamed from: a */
    public final C43512b mo46576a(Throwable th) {
        if (!(th instanceof C137751ab)) {
            return null;
        }
        C43508a aVar = (C43508a) C43512b.f113627a.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C62940bt btVar = C137825x.f374971a;
        C69664n.m101060f(btVar, "srpCustomError");
        C137824w wVar = C137824w.ERROR_REQUEST_DATA_UNAVAILABLE;
        C69664n.m101061g(btVar, "extension");
        C69664n.m101061g(wVar, "value");
        aVar.mo58885m(btVar, wVar);
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C43512b) build;
    }
}
