package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.bp */
/* compiled from: PG */
public final class C55479bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55479bp f146361c;

    /* renamed from: d */
    private static volatile C63010eb f146362d;

    /* renamed from: a */
    public int f146363a;

    /* renamed from: b */
    public int f146364b;

    static {
        C55479bp bpVar = new C55479bp();
        f146361c = bpVar;
        C62942bv.registerDefaultInstance(C55479bp.class, bpVar);
    }

    private C55479bp() {
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
                return newMessageInfo(f146361c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C55478bo.f146360a});
            case 3:
                return new C55479bp();
            case 4:
                return new C55477bn();
            case 5:
                return f146361c;
            case 6:
                C63010eb ebVar = f146362d;
                if (ebVar == null) {
                    synchronized (C55479bp.class) {
                        ebVar = f146362d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146361c);
                            f146362d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
