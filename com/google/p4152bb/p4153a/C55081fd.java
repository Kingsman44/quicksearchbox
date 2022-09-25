package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.fd */
/* compiled from: PG */
public final class C55081fd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55081fd f144907c;

    /* renamed from: d */
    private static volatile C63010eb f144908d;

    /* renamed from: a */
    public int f144909a;

    /* renamed from: b */
    public int f144910b;

    static {
        C55081fd fdVar = new C55081fd();
        f144907c = fdVar;
        C62942bv.registerDefaultInstance(C55081fd.class, fdVar);
    }

    private C55081fd() {
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
                return newMessageInfo(f144907c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C55080fc.f144906a});
            case 3:
                return new C55081fd();
            case 4:
                return new C55079fb();
            case 5:
                return f144907c;
            case 6:
                C63010eb ebVar = f144908d;
                if (ebVar == null) {
                    synchronized (C55081fd.class) {
                        ebVar = f144908d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144907c);
                            f144908d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
