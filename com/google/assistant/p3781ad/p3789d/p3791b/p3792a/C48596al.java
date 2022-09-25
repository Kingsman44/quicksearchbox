package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.al */
/* compiled from: PG */
public final class C48596al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48596al f125604a;

    /* renamed from: b */
    private static volatile C63010eb f125605b;

    static {
        C48596al alVar = new C48596al();
        f125604a = alVar;
        C62942bv.registerDefaultInstance(C48596al.class, alVar);
    }

    private C48596al() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f125604a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48596al();
            case 4:
                return new C48595ak();
            case 5:
                return f125604a;
            case 6:
                C63010eb ebVar = f125605b;
                if (ebVar == null) {
                    synchronized (C48596al.class) {
                        ebVar = f125605b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125604a);
                            f125605b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
