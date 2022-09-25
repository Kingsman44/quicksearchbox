package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.mm */
/* compiled from: PG */
public final class C52296mm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52296mm f137279b;

    /* renamed from: c */
    private static volatile C63010eb f137280c;

    /* renamed from: a */
    public C62971cq f137281a = emptyProtobufList();

    static {
        C52296mm mmVar = new C52296mm();
        f137279b = mmVar;
        C62942bv.registerDefaultInstance(C52296mm.class, mmVar);
    }

    private C52296mm() {
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
                return newMessageInfo(f137279b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52295ml.class});
            case 3:
                return new C52296mm();
            case 4:
                return new C52293mj();
            case 5:
                return f137279b;
            case 6:
                C63010eb ebVar = f137280c;
                if (ebVar == null) {
                    synchronized (C52296mm.class) {
                        ebVar = f137280c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137279b);
                            f137280c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
