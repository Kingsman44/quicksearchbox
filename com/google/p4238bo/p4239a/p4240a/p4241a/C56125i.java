package com.google.p4238bo.p4239a.p4240a.p4241a;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70866e;

/* renamed from: com.google.bo.a.a.a.i */
/* compiled from: PG */
public final class C56125i {

    /* renamed from: a */
    public final Status f149527a;

    /* renamed from: b */
    public final Object f149528b;

    /* renamed from: c */
    public final C70334de f149529c;

    /* renamed from: d */
    public final C70334de f149530d;

    public C56125i(C56124h hVar) {
        this.f149527a = hVar.f149523a;
        this.f149528b = hVar.f149524b;
        this.f149529c = hVar.f149525c;
        this.f149530d = hVar.f149526d;
    }

    /* renamed from: b */
    public static C60870cx m87910b(C70866e eVar, C56123g gVar, Object obj) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        AtomicReference atomicReference3 = new AtomicReference();
        return C60846c.m92878g(C60922j.m93044g((C60870cx) gVar.mo38076a(eVar.mo62576o(new C56122f(atomicReference, atomicReference2, atomicReference3)), obj), new C56117a(atomicReference, atomicReference2, atomicReference3), C60826bg.f164896a), C70761fa.class, new C56118b(atomicReference, atomicReference2, atomicReference3), C60826bg.f164896a);
    }

    /* renamed from: c */
    public static void m87911c(C56124h hVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C70334de deVar = (C70334de) atomicReference.get();
        if (deVar != null) {
            hVar.f149525c = deVar;
        }
        C70334de deVar2 = (C70334de) atomicReference2.get();
        if (deVar2 != null) {
            hVar.f149526d = deVar2;
        }
    }

    /* renamed from: a */
    public final C58485gu mo54327a(C70297cz czVar) {
        czVar.getClass();
        C70334de deVar = this.f149530d;
        if (deVar == null) {
            return C58485gu.m89845m();
        }
        synchronized (deVar) {
            Iterable a = this.f149530d.mo62026a(czVar);
            if (a == null) {
                C58485gu m = C58485gu.m89845m();
                return m;
            }
            C58485gu i = C58485gu.m89841i(a);
            return i;
        }
    }
}
