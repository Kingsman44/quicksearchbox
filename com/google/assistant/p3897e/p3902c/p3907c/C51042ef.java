package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ef */
/* compiled from: PG */
public final class C51042ef extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51042ef f132900c;

    /* renamed from: f */
    private static volatile C63010eb f132901f;

    /* renamed from: a */
    public C51012dc f132902a;

    /* renamed from: b */
    public C62971cq f132903b = emptyProtobufList();

    /* renamed from: d */
    private int f132904d;

    /* renamed from: e */
    private byte f132905e = 2;

    static {
        C51042ef efVar = new C51042ef();
        f132900c = efVar;
        C62942bv.registerDefaultInstance(C51042ef.class, efVar);
    }

    private C51042ef() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132905e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132905e = b;
                return null;
            case 2:
                return newMessageInfo(f132900c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C51049em.class});
            case 3:
                return new C51042ef();
            case 4:
                return new C51041ee();
            case 5:
                return f132900c;
            case 6:
                C63010eb ebVar = f132901f;
                if (ebVar == null) {
                    synchronized (C51042ef.class) {
                        ebVar = f132901f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132900c);
                            f132901f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
