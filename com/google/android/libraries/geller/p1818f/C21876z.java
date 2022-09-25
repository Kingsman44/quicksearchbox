package com.google.android.libraries.geller.p1818f;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70286co;

/* renamed from: com.google.android.libraries.geller.f.z */
/* compiled from: PG */
final class C21876z implements Closeable {

    /* renamed from: c */
    private static final C59071e f60366c = C59071e.m91332i("com.google.android.libraries.geller.f.z");

    /* renamed from: a */
    public final C70286co f60367a;

    /* renamed from: b */
    public final C62910ar f60368b;

    public C21876z(C70286co coVar, C62910ar arVar) {
        this.f60367a = coVar;
        this.f60368b = arVar;
    }

    public final void close() {
        try {
            this.f60367a.mo61974f();
            this.f60367a.mo61972d(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((C59052c) ((C59052c) ((C59052c) f60366c.mo56226d()).mo56382g(e)).mo56372aa(47987)).mo56386p("Failed to shut down managed channel");
        }
    }
}
