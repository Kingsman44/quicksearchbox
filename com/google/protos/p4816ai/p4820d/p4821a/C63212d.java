package com.google.protos.p4816ai.p4820d.p4821a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.a.d */
/* compiled from: PG */
public final class C63212d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63212d f170783a;

    /* renamed from: b */
    private static volatile C63010eb f170784b;

    static {
        C63212d dVar = new C63212d();
        f170783a = dVar;
        C62942bv.registerDefaultInstance(C63212d.class, dVar);
    }

    private C63212d() {
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
                return newMessageInfo(f170783a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63212d();
            case 4:
                return new C63211c();
            case 5:
                return f170783a;
            case 6:
                C63010eb ebVar = f170784b;
                if (ebVar == null) {
                    synchronized (C63212d.class) {
                        ebVar = f170784b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170783a);
                            f170784b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
