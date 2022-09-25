package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.kk */
/* compiled from: PG */
public final class C51511kk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51511kk f134200c;

    /* renamed from: d */
    private static volatile C63010eb f134201d;

    /* renamed from: a */
    public C62971cq f134202a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f134203b = emptyProtobufList();

    static {
        C51511kk kkVar = new C51511kk();
        f134200c = kkVar;
        C62942bv.registerDefaultInstance(C51511kk.class, kkVar);
    }

    private C51511kk() {
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
                return newMessageInfo(f134200c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C51504kd.class, "b", C51504kd.class});
            case 3:
                return new C51511kk();
            case 4:
                return new C51510kj();
            case 5:
                return f134200c;
            case 6:
                C63010eb ebVar = f134201d;
                if (ebVar == null) {
                    synchronized (C51511kk.class) {
                        ebVar = f134201d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134200c);
                            f134201d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
