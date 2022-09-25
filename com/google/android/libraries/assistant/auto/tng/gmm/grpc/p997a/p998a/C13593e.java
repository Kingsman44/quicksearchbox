package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a;

import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13608j;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13609k;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.a.e */
/* compiled from: PG */
final class C13593e implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C13594f f41606a;

    public C13593e(C13594f fVar) {
        this.f41606a = fVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f41606a.f41609c.mo21182b();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C13595g.f41610a.mo56226d()).mo56382g(th)).mo56372aa(45126)).mo56386p("GmmConversationService error, disconnecting.");
        this.f41606a.f41609c.mo21182b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C13595g gVar = this.f41606a.f41609c;
        int a = C13608j.m29878a(((C13609k) obj).f41637a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 4 || i == 5 || i == 6) {
            gVar.f41614e.mo20326b();
        }
    }
}
