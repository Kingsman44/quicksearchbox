package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mb */
/* compiled from: PG */
public final class C51556mb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51556mb f134373b;

    /* renamed from: c */
    private static volatile C63010eb f134374c;

    /* renamed from: a */
    public C62971cq f134375a = emptyProtobufList();

    static {
        C51556mb mbVar = new C51556mb();
        f134373b = mbVar;
        C62942bv.registerDefaultInstance(C51556mb.class, mbVar);
    }

    private C51556mb() {
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
                return newMessageInfo(f134373b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51555ma.class});
            case 3:
                return new C51556mb();
            case 4:
                return new C51552ly();
            case 5:
                return f134373b;
            case 6:
                C63010eb ebVar = f134374c;
                if (ebVar == null) {
                    synchronized (C51556mb.class) {
                        ebVar = f134374c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134373b);
                            f134374c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
