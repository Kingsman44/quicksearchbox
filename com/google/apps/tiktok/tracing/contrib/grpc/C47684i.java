package com.google.apps.tiktok.tracing.contrib.grpc;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.grpc.MetadataTracePropagation;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70706ek;

/* renamed from: com.google.apps.tiktok.tracing.contrib.grpc.i */
/* compiled from: PG */
public final class C47684i implements C70706ek {

    /* renamed from: a */
    private final C47770dh f123636a;

    public C47684i(C47770dh dhVar) {
        this.f123636a = dhVar;
    }

    /* renamed from: a */
    public final C70703eh mo20008a(C70704ei eiVar, C70334de deVar, C70705ej ejVar) {
        C47573bx bxVar;
        C47558bi s;
        MetadataTracePropagation.TraceReferencingDummyParcelable traceReferencingDummyParcelable = (MetadataTracePropagation.TraceReferencingDummyParcelable) deVar.mo62027b(MetadataTracePropagation.f123628a);
        C47816ey eyVar = traceReferencingDummyParcelable != null ? traceReferencingDummyParcelable.f123629a : null;
        if (eyVar != null) {
            bxVar = eyVar.mo51644a();
        } else {
            bxVar = this.f123636a.mo51617g(eiVar.mo61741c().f187497b, C47562bm.f123426a);
        }
        try {
            s = C47831fm.m85024s(eiVar.mo61741c().f187497b);
            C47680e eVar = new C47680e(ejVar.mo39514a(new C47681f(eiVar, s), deVar), C47816ey.m84988b());
            s.close();
            if (bxVar != null) {
                bxVar.close();
            }
            return eVar;
        } catch (Throwable th) {
            if (bxVar != null) {
                try {
                    bxVar.close();
                } catch (Throwable th2) {
                    C47683h.m84822a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
