package com.google.frameworks.client.data.android.server;

import android.content.Context;
import com.google.android.libraries.p3340w.C43210b;
import com.google.common.base.C58838bb;
import p5488io.grpc.C70286co;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.frameworks.client.data.android.server.r */
/* compiled from: PG */
public final class C61570r {

    /* renamed from: a */
    private final Context f166406a;

    /* renamed from: b */
    private final C61569q f166407b;

    public C61570r(Context context, C61569q qVar) {
        this.f166406a = context;
        this.f166407b = qVar;
    }

    /* renamed from: a */
    public final C70286co mo58125a(C70175a aVar, C70235o oVar, C70229i iVar) {
        C58838bb.m90869d(!aVar.f187028a.getComponent().getPackageName().equals(this.f166406a.getPackageName()), "Don't use RemoteEndpoints-created channels to access in-app gRPC services");
        C43210b.m76196a();
        C61569q qVar = this.f166407b;
        return qVar.f166404a.mo58120a(aVar, oVar, iVar, qVar.f166405b);
    }
}
