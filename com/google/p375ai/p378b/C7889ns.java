package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ns */
/* compiled from: PG */
public final class C7889ns extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7889ns f27684c;

    /* renamed from: d */
    private static volatile C63010eb f27685d;

    /* renamed from: a */
    public int f27686a;

    /* renamed from: b */
    public C7887nq f27687b;

    static {
        C7889ns nsVar = new C7889ns();
        f27684c = nsVar;
        C62942bv.registerDefaultInstance(C7889ns.class, nsVar);
    }

    private C7889ns() {
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
                return newMessageInfo(f27684c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7889ns();
            case 4:
                return new C7888nr();
            case 5:
                return f27684c;
            case 6:
                C63010eb ebVar = f27685d;
                if (ebVar == null) {
                    synchronized (C7889ns.class) {
                        ebVar = f27685d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27684c);
                            f27685d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
