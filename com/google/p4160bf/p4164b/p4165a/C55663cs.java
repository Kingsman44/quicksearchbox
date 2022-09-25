package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.cs */
/* compiled from: PG */
public final class C55663cs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55663cs f146874a;

    /* renamed from: b */
    private static volatile C63010eb f146875b;

    static {
        C55663cs csVar = new C55663cs();
        f146874a = csVar;
        C62942bv.registerDefaultInstance(C55663cs.class, csVar);
    }

    private C55663cs() {
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
                return newMessageInfo(f146874a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55663cs();
            case 4:
                return new C55662cr();
            case 5:
                return f146874a;
            case 6:
                C63010eb ebVar = f146875b;
                if (ebVar == null) {
                    synchronized (C55663cs.class) {
                        ebVar = f146875b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146874a);
                            f146875b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
