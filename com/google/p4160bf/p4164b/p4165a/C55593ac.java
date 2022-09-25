package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.ac */
/* compiled from: PG */
public final class C55593ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55593ac f146684a;

    /* renamed from: b */
    private static volatile C63010eb f146685b;

    static {
        C55593ac acVar = new C55593ac();
        f146684a = acVar;
        C62942bv.registerDefaultInstance(C55593ac.class, acVar);
    }

    private C55593ac() {
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
                return newMessageInfo(f146684a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55593ac();
            case 4:
                return new C55592ab();
            case 5:
                return f146684a;
            case 6:
                C63010eb ebVar = f146685b;
                if (ebVar == null) {
                    synchronized (C55593ac.class) {
                        ebVar = f146685b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146684a);
                            f146685b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
