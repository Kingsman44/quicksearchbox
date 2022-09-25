package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.JSCommandResolver;
import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.e.a.k */
/* compiled from: PG */
public final class C20979k extends JSCommandResolver {

    /* renamed from: a */
    private final C21313t f58803a;

    /* renamed from: b */
    private final C21311r f58804b;

    public C20979k(C21313t tVar, C21311r rVar) {
        this.f58803a = tVar;
        this.f58804b = rVar;
    }

    public final Status resolve(byte[] bArr) {
        AtomicReference atomicReference = new AtomicReference(Status.f186902OK);
        try {
            this.f58803a.mo26125b((CommandOuterClass$Command) C62942bv.parseFrom((C62942bv) CommandOuterClass$Command.f179510a, bArr, C62921ba.m95368a()), this.f58804b, 1).mo42459a(new C20977i(atomicReference));
            return (Status) atomicReference.get();
        } catch (C62974ct e) {
            throw new C21260bc("Failed to parse command.", e);
        }
    }

    public final Status resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver) {
        if (jSPromiseResolver != null) {
            try {
                this.f58803a.mo26125b((CommandOuterClass$Command) C62942bv.parseFrom((C62942bv) CommandOuterClass$Command.f179510a, bArr, C62921ba.m95368a()), this.f58804b, 1).mo42459a(new C20978j(jSPromiseResolver));
                return Status.f186902OK;
            } catch (C62974ct e) {
                throw new C21260bc("Failed to parse command.", e);
            }
        } else {
            throw new C21260bc("Failed to resolve command due to null JSPromiseResolver.");
        }
    }
}
