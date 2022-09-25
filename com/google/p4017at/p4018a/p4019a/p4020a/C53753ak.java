package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.ak */
/* compiled from: PG */
public final class C53753ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53753ak f141113c;

    /* renamed from: d */
    private static volatile C63010eb f141114d;

    /* renamed from: a */
    public int f141115a;

    /* renamed from: b */
    public int f141116b;

    static {
        C53753ak akVar = new C53753ak();
        f141113c = akVar;
        C62942bv.registerDefaultInstance(C53753ak.class, akVar);
    }

    private C53753ak() {
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
                return newMessageInfo(f141113c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53750ah.f141112a});
            case 3:
                return new C53753ak();
            case 4:
                return new C53752aj();
            case 5:
                return f141113c;
            case 6:
                C63010eb ebVar = f141114d;
                if (ebVar == null) {
                    synchronized (C53753ak.class) {
                        ebVar = f141114d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141113c);
                            f141114d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
