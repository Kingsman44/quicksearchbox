package com.google.speech.p5195a.p5196a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.y */
/* compiled from: PG */
public final class C66445y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66445y f180660b;

    /* renamed from: c */
    private static volatile C63010eb f180661c;

    /* renamed from: a */
    public C62971cq f180662a = emptyProtobufList();

    static {
        C66445y yVar = new C66445y();
        f180660b = yVar;
        C62942bv.registerDefaultInstance(C66445y.class, yVar);
    }

    private C66445y() {
    }

    /* renamed from: a */
    public final void mo59631a() {
        C62971cq cqVar = this.f180662a;
        if (!cqVar.mo58948c()) {
            this.f180662a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f180660b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66443w.class});
            case 3:
                return new C66445y();
            case 4:
                return new C66444x();
            case 5:
                return f180660b;
            case 6:
                C63010eb ebVar = f180661c;
                if (ebVar == null) {
                    synchronized (C66445y.class) {
                        ebVar = f180661c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180660b);
                            f180661c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
