package com.google.protos.p4985f.p4988b.p4990b.p4991a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.a.l */
/* compiled from: PG */
public final class C64733l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64733l f175464b;

    /* renamed from: c */
    private static volatile C63010eb f175465c;

    /* renamed from: a */
    public int f175466a;

    static {
        C64733l lVar = new C64733l();
        f175464b = lVar;
        C62942bv.registerDefaultInstance(C64733l.class, lVar);
    }

    private C64733l() {
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
                return newMessageInfo(f175464b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C64733l();
            case 4:
                return new C64731j();
            case 5:
                return f175464b;
            case 6:
                C63010eb ebVar = f175465c;
                if (ebVar == null) {
                    synchronized (C64733l.class) {
                        ebVar = f175465c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175464b);
                            f175465c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
