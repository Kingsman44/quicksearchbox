package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.nq */
/* compiled from: PG */
public final class C7887nq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7887nq f27680c;

    /* renamed from: d */
    private static volatile C63010eb f27681d;

    /* renamed from: a */
    public int f27682a;

    /* renamed from: b */
    public int f27683b;

    static {
        C7887nq nqVar = new C7887nq();
        f27680c = nqVar;
        C62942bv.registerDefaultInstance(C7887nq.class, nqVar);
    }

    private C7887nq() {
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
                return newMessageInfo(f27680c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7887nq();
            case 4:
                return new C7885no();
            case 5:
                return f27680c;
            case 6:
                C63010eb ebVar = f27681d;
                if (ebVar == null) {
                    synchronized (C7887nq.class) {
                        ebVar = f27681d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27680c);
                            f27681d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
