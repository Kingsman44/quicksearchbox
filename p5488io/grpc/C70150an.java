package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.Status;

/* renamed from: io.grpc.an */
/* compiled from: PG */
public final class C70150an {
    /* renamed from: a */
    public static C70703eh m102152a(C70148al alVar, C70704ei eiVar, C70334de deVar, C70705ej ejVar) {
        C70148al a = alVar.mo61696a();
        try {
            return new C70149am(ejVar.mo39514a(eiVar, deVar), alVar);
        } finally {
            alVar.mo61702f(a);
        }
    }

    /* renamed from: b */
    public static Status m102153b(C70148al alVar) {
        C58838bb.m90866a(alVar, "context must not be null");
        if (!alVar.mo61705i()) {
            return null;
        }
        Throwable c = alVar.mo61698c();
        if (c == null) {
            return Status.f186904b.withDescription("io.grpc.Context was cancelled without error");
        }
        if (c instanceof TimeoutException) {
            return Status.f186907e.withDescription(c.getMessage()).mo61678e(c);
        }
        Status d = Status.m102100d(c);
        if (!Status.Code.UNKNOWN.equals(d.getCode()) || d.f186920q != c) {
            return d.mo61678e(c);
        }
        return Status.f186904b.withDescription("Context cancelled").mo61678e(c);
    }
}
