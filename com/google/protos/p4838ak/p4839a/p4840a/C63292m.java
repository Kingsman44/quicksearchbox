package com.google.protos.p4838ak.p4839a.p4840a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ak.a.a.m */
/* compiled from: PG */
public final class C63292m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63292m f171051a;

    /* renamed from: b */
    private static volatile C63010eb f171052b;

    static {
        C63292m mVar = new C63292m();
        f171051a = mVar;
        C62942bv.registerDefaultInstance(C63292m.class, mVar);
    }

    private C63292m() {
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
                return newMessageInfo(f171051a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63292m();
            case 4:
                return new C63291l();
            case 5:
                return f171051a;
            case 6:
                C63010eb ebVar = f171052b;
                if (ebVar == null) {
                    synchronized (C63292m.class) {
                        ebVar = f171052b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171051a);
                            f171052b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
