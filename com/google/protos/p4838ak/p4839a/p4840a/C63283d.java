package com.google.protos.p4838ak.p4839a.p4840a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ak.a.a.d */
/* compiled from: PG */
public final class C63283d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63283d f171028a;

    /* renamed from: b */
    private static volatile C63010eb f171029b;

    static {
        C63283d dVar = new C63283d();
        f171028a = dVar;
        C62942bv.registerDefaultInstance(C63283d.class, dVar);
    }

    private C63283d() {
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
                return newMessageInfo(f171028a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63283d();
            case 4:
                return new C63282c();
            case 5:
                return f171028a;
            case 6:
                C63010eb ebVar = f171029b;
                if (ebVar == null) {
                    synchronized (C63283d.class) {
                        ebVar = f171029b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171028a);
                            f171029b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
