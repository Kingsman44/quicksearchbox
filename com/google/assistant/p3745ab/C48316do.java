package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.do */
/* compiled from: PG */
public final class C48316do extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48316do f124958a;

    /* renamed from: b */
    private static volatile C63010eb f124959b;

    static {
        C48316do doVar = new C48316do();
        f124958a = doVar;
        C62942bv.registerDefaultInstance(C48316do.class, doVar);
    }

    private C48316do() {
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
                return newMessageInfo(f124958a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48316do();
            case 4:
                return new C48315dn();
            case 5:
                return f124958a;
            case 6:
                C63010eb ebVar = f124959b;
                if (ebVar == null) {
                    synchronized (C48316do.class) {
                        ebVar = f124959b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124958a);
                            f124959b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
