package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.la */
/* compiled from: PG */
public final class C51528la extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51528la f134281a;

    /* renamed from: b */
    private static volatile C63010eb f134282b;

    static {
        C51528la laVar = new C51528la();
        f134281a = laVar;
        C62942bv.registerDefaultInstance(C51528la.class, laVar);
    }

    private C51528la() {
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
                return newMessageInfo(f134281a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51528la();
            case 4:
                return new C51526kz();
            case 5:
                return f134281a;
            case 6:
                C63010eb ebVar = f134282b;
                if (ebVar == null) {
                    synchronized (C51528la.class) {
                        ebVar = f134282b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134281a);
                            f134282b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
