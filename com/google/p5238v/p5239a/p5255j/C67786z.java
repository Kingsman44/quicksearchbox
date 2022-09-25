package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.z */
/* compiled from: PG */
public final class C67786z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67786z f183899c;

    /* renamed from: d */
    private static volatile C63010eb f183900d;

    /* renamed from: a */
    public C67645ab f183901a;

    /* renamed from: b */
    public int f183902b;

    static {
        C67786z zVar = new C67786z();
        f183899c = zVar;
        C62942bv.registerDefaultInstance(C67786z.class, zVar);
    }

    private C67786z() {
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
                return newMessageInfo(f183899c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "b"});
            case 3:
                return new C67786z();
            case 4:
                return new C67785y();
            case 5:
                return f183899c;
            case 6:
                C63010eb ebVar = f183900d;
                if (ebVar == null) {
                    synchronized (C67786z.class) {
                        ebVar = f183900d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183899c);
                            f183900d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
