package com.google.speech.p5195a.p5196a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.q */
/* compiled from: PG */
public final class C66437q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66437q f180645b;

    /* renamed from: c */
    private static volatile C63010eb f180646c;

    /* renamed from: a */
    public C62971cq f180647a = emptyProtobufList();

    static {
        C66437q qVar = new C66437q();
        f180645b = qVar;
        C62942bv.registerDefaultInstance(C66437q.class, qVar);
    }

    private C66437q() {
    }

    /* renamed from: a */
    public final void mo59629a() {
        C62971cq cqVar = this.f180647a;
        if (!cqVar.mo58948c()) {
            this.f180647a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f180645b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66435o.class});
            case 3:
                return new C66437q();
            case 4:
                return new C66436p();
            case 5:
                return f180645b;
            case 6:
                C63010eb ebVar = f180646c;
                if (ebVar == null) {
                    synchronized (C66437q.class) {
                        ebVar = f180646c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180645b);
                            f180646c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
