package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dz */
/* compiled from: PG */
public final class C64070dz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64070dz f173221a;

    /* renamed from: b */
    private static volatile C63010eb f173222b;

    static {
        C64070dz dzVar = new C64070dz();
        f173221a = dzVar;
        C62942bv.registerDefaultInstance(C64070dz.class, dzVar);
    }

    private C64070dz() {
        emptyProtobufList();
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
                return newMessageInfo(f173221a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64070dz();
            case 4:
                return new C64069dy();
            case 5:
                return f173221a;
            case 6:
                C63010eb ebVar = f173222b;
                if (ebVar == null) {
                    synchronized (C64070dz.class) {
                        ebVar = f173222b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173221a);
                            f173222b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
