package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.q */
/* compiled from: PG */
public final class C53461q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53461q f140313b;

    /* renamed from: d */
    private static volatile C63010eb f140314d;

    /* renamed from: a */
    public C62971cq f140315a = C62942bv.emptyProtobufList();

    /* renamed from: c */
    private byte f140316c = 2;

    static {
        C53461q qVar = new C53461q();
        f140313b = qVar;
        C62942bv.registerDefaultInstance(C53461q.class, qVar);
    }

    private C53461q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140316c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f140316c = b;
                return null;
            case 2:
                return newMessageInfo(f140313b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C53461q();
            case 4:
                return new C53460p();
            case 5:
                return f140313b;
            case 6:
                C63010eb ebVar = f140314d;
                if (ebVar == null) {
                    synchronized (C53461q.class) {
                        ebVar = f140314d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140313b);
                            f140314d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
