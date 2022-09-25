package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cv */
/* compiled from: PG */
public final class C48294cv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48294cv f124908a;

    /* renamed from: b */
    private static volatile C63010eb f124909b;

    static {
        C48294cv cvVar = new C48294cv();
        f124908a = cvVar;
        C62942bv.registerDefaultInstance(C48294cv.class, cvVar);
    }

    private C48294cv() {
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f124908a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48294cv();
            case 4:
                return new C48293cu();
            case 5:
                return f124908a;
            case 6:
                C63010eb ebVar = f124909b;
                if (ebVar == null) {
                    synchronized (C48294cv.class) {
                        ebVar = f124909b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124908a);
                            f124909b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
