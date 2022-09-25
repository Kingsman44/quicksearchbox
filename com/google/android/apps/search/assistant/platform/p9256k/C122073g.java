package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.libraries.assistant.p1533o.C18469be;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.k.g */
/* compiled from: PG */
public final class C122073g extends C18469be {

    /* renamed from: a */
    private static final C59071e f338676a = C59071e.m91331h();

    /* renamed from: b */
    public final C70862aj mo23997b(C70862aj ajVar) {
        C69664n.m101061g(ajVar, "responseObserver");
        C59052c cVar = (C59052c) f338676a.mo56226d();
        cVar.mo56379ah(new C59094n(36100));
        cVar.mo56386p("APVS is disabled.");
        ajVar.mo20122b(Status.f186912j.asException());
        return new C122072f();
    }
}
