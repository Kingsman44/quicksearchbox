package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.ba */
/* compiled from: PG */
public final class C66122ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66122ba f179816a;

    /* renamed from: b */
    private static volatile C63010eb f179817b;

    static {
        C66122ba baVar = new C66122ba();
        f179816a = baVar;
        C62942bv.registerDefaultInstance(C66122ba.class, baVar);
    }

    private C66122ba() {
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
                return newMessageInfo(f179816a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66122ba();
            case 4:
                return new C66064az();
            case 5:
                return f179816a;
            case 6:
                C63010eb ebVar = f179817b;
                if (ebVar == null) {
                    synchronized (C66122ba.class) {
                        ebVar = f179817b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179816a);
                            f179817b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
