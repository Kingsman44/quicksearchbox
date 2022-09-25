package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.gx */
/* compiled from: PG */
public final class C53249gx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53249gx f139584a;

    /* renamed from: b */
    private static volatile C63010eb f139585b;

    static {
        C53249gx gxVar = new C53249gx();
        f139584a = gxVar;
        C62942bv.registerDefaultInstance(C53249gx.class, gxVar);
    }

    private C53249gx() {
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
                return newMessageInfo(f139584a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53249gx();
            case 4:
                return new C53248gw();
            case 5:
                return f139584a;
            case 6:
                C63010eb ebVar = f139585b;
                if (ebVar == null) {
                    synchronized (C53249gx.class) {
                        ebVar = f139585b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139584a);
                            f139585b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
