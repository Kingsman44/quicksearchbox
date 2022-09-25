package com.google.frameworks.client.data.android.server.p4646a.p4647a;

import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.frameworks.client.data.android.server.a.a.c */
/* compiled from: PG */
public final class C61539c {
    /* renamed from: a */
    public static final C70866e m94271a(C70866e eVar, C61541e eVar2, Parcelable parcelable) {
        C69664n.m101061g(eVar2, "keys");
        C69664n.m101061g(parcelable, "value");
        C70334de deVar = new C70334de();
        C61538b.m94270a(eVar2, parcelable, deVar);
        C70866e o = eVar.mo62576o(new C70879r(deVar));
        C69664n.m101060f(o, "withInterceptors(\n    Pa…(keys, value).build()\n  )");
        return o;
    }
}
