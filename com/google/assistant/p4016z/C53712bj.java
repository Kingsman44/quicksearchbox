package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.bj */
/* compiled from: PG */
public final class C53712bj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53712bj f141006a;

    /* renamed from: b */
    private static volatile C63010eb f141007b;

    static {
        C53712bj bjVar = new C53712bj();
        f141006a = bjVar;
        C62942bv.registerDefaultInstance(C53712bj.class, bjVar);
    }

    private C53712bj() {
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
                return newMessageInfo(f141006a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53712bj();
            case 4:
                return new C53711bi();
            case 5:
                return f141006a;
            case 6:
                C63010eb ebVar = f141007b;
                if (ebVar == null) {
                    synchronized (C53712bj.class) {
                        ebVar = f141007b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141006a);
                            f141007b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
