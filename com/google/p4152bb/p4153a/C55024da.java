package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.da */
/* compiled from: PG */
public final class C55024da extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55024da f144759c;

    /* renamed from: e */
    private static volatile C63010eb f144760e;

    /* renamed from: a */
    public int f144761a;

    /* renamed from: b */
    public int f144762b;

    /* renamed from: d */
    private int f144763d;

    static {
        C55024da daVar = new C55024da();
        f144759c = daVar;
        C62942bv.registerDefaultInstance(C55024da.class, daVar);
    }

    private C55024da() {
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
                return newMessageInfo(f144759c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C55024da();
            case 4:
                return new C55022cz();
            case 5:
                return f144759c;
            case 6:
                C63010eb ebVar = f144760e;
                if (ebVar == null) {
                    synchronized (C55024da.class) {
                        ebVar = f144760e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144759c);
                            f144760e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
