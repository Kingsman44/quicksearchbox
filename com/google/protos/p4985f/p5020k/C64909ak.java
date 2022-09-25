package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.ak */
/* compiled from: PG */
public final class C64909ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64909ak f175819a;

    /* renamed from: b */
    private static volatile C63010eb f175820b;

    static {
        C64909ak akVar = new C64909ak();
        f175819a = akVar;
        C62942bv.registerDefaultInstance(C64909ak.class, akVar);
    }

    private C64909ak() {
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
                return newMessageInfo(f175819a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64909ak();
            case 4:
                return new C64908aj();
            case 5:
                return f175819a;
            case 6:
                C63010eb ebVar = f175820b;
                if (ebVar == null) {
                    synchronized (C64909ak.class) {
                        ebVar = f175820b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175819a);
                            f175820b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
