package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ajx */
/* compiled from: PG */
public final class ajx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ajx f135248a;

    /* renamed from: b */
    private static volatile C63010eb f135249b;

    static {
        ajx ajx = new ajx();
        f135248a = ajx;
        C62942bv.registerDefaultInstance(ajx.class, ajx);
    }

    private ajx() {
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
                return newMessageInfo(f135248a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ajx();
            case 4:
                return new ajw();
            case 5:
                return f135248a;
            case 6:
                C63010eb ebVar = f135249b;
                if (ebVar == null) {
                    synchronized (ajx.class) {
                        ebVar = f135249b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135248a);
                            f135249b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
