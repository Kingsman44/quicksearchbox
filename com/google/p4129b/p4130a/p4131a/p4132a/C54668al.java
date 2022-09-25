package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.al */
/* compiled from: PG */
public final class C54668al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54668al f143508b;

    /* renamed from: c */
    private static volatile C63010eb f143509c;

    /* renamed from: a */
    public C54740z f143510a;

    static {
        C54668al alVar = new C54668al();
        f143508b = alVar;
        C62942bv.registerDefaultInstance(C54668al.class, alVar);
    }

    private C54668al() {
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
                return newMessageInfo(f143508b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54668al();
            case 4:
                return new C54667ak();
            case 5:
                return f143508b;
            case 6:
                C63010eb ebVar = f143509c;
                if (ebVar == null) {
                    synchronized (C54668al.class) {
                        ebVar = f143509c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143508b);
                            f143509c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
