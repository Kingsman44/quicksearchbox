package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.eb */
/* compiled from: PG */
public final class C64073eb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64073eb f173224a;

    /* renamed from: b */
    private static volatile C63010eb f173225b;

    static {
        C64073eb ebVar = new C64073eb();
        f173224a = ebVar;
        C62942bv.registerDefaultInstance(C64073eb.class, ebVar);
    }

    private C64073eb() {
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
                return newMessageInfo(f173224a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64073eb();
            case 4:
                return new C64072ea();
            case 5:
                return f173224a;
            case 6:
                C63010eb ebVar = f173225b;
                if (ebVar == null) {
                    synchronized (C64073eb.class) {
                        ebVar = f173225b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173224a);
                            f173225b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
