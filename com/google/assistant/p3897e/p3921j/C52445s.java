package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.s */
/* compiled from: PG */
public final class C52445s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52445s f137665b;

    /* renamed from: c */
    private static volatile C63010eb f137666c;

    /* renamed from: a */
    public C62971cq f137667a = emptyProtobufList();

    static {
        C52445s sVar = new C52445s();
        f137665b = sVar;
        C62942bv.registerDefaultInstance(C52445s.class, sVar);
    }

    private C52445s() {
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
                return newMessageInfo(f137665b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52337o.class});
            case 3:
                return new C52445s();
            case 4:
                return new C52418r();
            case 5:
                return f137665b;
            case 6:
                C63010eb ebVar = f137666c;
                if (ebVar == null) {
                    synchronized (C52445s.class) {
                        ebVar = f137666c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137665b);
                            f137666c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
