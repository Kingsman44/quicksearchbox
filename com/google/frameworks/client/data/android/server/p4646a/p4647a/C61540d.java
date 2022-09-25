package com.google.frameworks.client.data.android.server.p4646a.p4647a;

import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;
import p5488io.grpc.binder.C70230j;

/* renamed from: com.google.frameworks.client.data.android.server.a.a.d */
/* compiled from: PG */
public final class C61540d {
    /* renamed from: a */
    public static final C61541e m94272a(String str, Parcelable.Creator creator) {
        C69664n.m101061g(creator, "creator");
        String concat = str.concat("-bin");
        return new C61541e(C70230j.m102379a(concat, creator), C70148al.m102133k("REQ-".concat(concat)), C70148al.m102133k("RESH-".concat(concat)), C70148al.m102133k("REST-".concat(concat)));
    }
}
