package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.s */
/* compiled from: PG */
public final class C8509s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8509s f29522b;

    /* renamed from: c */
    private static volatile C63010eb f29523c;

    /* renamed from: a */
    public C62971cq f29524a = emptyProtobufList();

    static {
        C8509s sVar = new C8509s();
        f29522b = sVar;
        C62942bv.registerDefaultInstance(C8509s.class, sVar);
    }

    private C8509s() {
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
                return newMessageInfo(f29522b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C8506p.class});
            case 3:
                return new C8509s();
            case 4:
                return new C8504n();
            case 5:
                return f29522b;
            case 6:
                C63010eb ebVar = f29523c;
                if (ebVar == null) {
                    synchronized (C8509s.class) {
                        ebVar = f29523c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29522b);
                            f29523c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
