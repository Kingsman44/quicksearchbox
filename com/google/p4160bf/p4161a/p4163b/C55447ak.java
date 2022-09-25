package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.ak */
/* compiled from: PG */
public final class C55447ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55447ak f146284a;

    /* renamed from: b */
    private static volatile C63010eb f146285b;

    static {
        C55447ak akVar = new C55447ak();
        f146284a = akVar;
        C62942bv.registerDefaultInstance(C55447ak.class, akVar);
    }

    private C55447ak() {
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
                return newMessageInfo(f146284a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55447ak();
            case 4:
                return new C55446aj();
            case 5:
                return f146284a;
            case 6:
                C63010eb ebVar = f146285b;
                if (ebVar == null) {
                    synchronized (C55447ak.class) {
                        ebVar = f146285b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146284a);
                            f146285b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
