package com.google.android.apps.gsa.staticplugins.p7441bb;

import p5488io.grpc.C70166ba;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.gsa.staticplugins.bb.f */
/* compiled from: PG */
final class C94489f extends C70166ba {

    /* renamed from: a */
    public final String f264178a;

    /* renamed from: b */
    final /* synthetic */ C94490g f264179b;

    /* renamed from: c */
    private final C70897l f264180c;

    public C94489f(C94490g gVar, C70897l lVar, String str) {
        this.f264179b = gVar;
        this.f264180c = lVar;
        this.f264178a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C70897l mo61736a() {
        return this.f264180c;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        if (status.getCode() == Status.Code.UNAUTHENTICATED) {
            this.f264179b.f264185e.mo28212l("invalidate-auth-token", new C94488e(this));
        }
        this.f264180c.mo27484b(status, deVar);
    }
}
