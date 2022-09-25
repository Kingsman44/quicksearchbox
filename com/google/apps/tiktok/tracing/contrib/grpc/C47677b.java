package com.google.apps.tiktok.tracing.contrib.grpc;

import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47571bv;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70298d;

/* renamed from: com.google.apps.tiktok.tracing.contrib.grpc.b */
/* compiled from: PG */
public final /* synthetic */ class C47677b implements C69464a {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123630a;

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f123631b;

    public /* synthetic */ C47677b(C47770dh dhVar, Map.Entry entry) {
        this.f123630a = dhVar;
        this.f123631b = entry;
    }

    /* renamed from: b */
    public final Object mo17428b() {
        C47770dh dhVar = this.f123630a;
        Map.Entry entry = this.f123631b;
        C47571bv g = dhVar.mo51617g("Create gRPC Service Impl ".concat(String.valueOf((String) entry.getKey())), C47562bm.f123426a);
        try {
            C70298d dVar = (C70298d) ((C69464a) entry.getValue()).mo17428b();
            if (g != null) {
                g.close();
            }
            return dVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
