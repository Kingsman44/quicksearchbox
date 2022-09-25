package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bx */
/* compiled from: PG */
public final class C8672bx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8672bx f29984b;

    /* renamed from: c */
    private static volatile C63010eb f29985c;

    /* renamed from: a */
    public C8662bn f29986a;

    static {
        C8672bx bxVar = new C8672bx();
        f29984b = bxVar;
        C62942bv.registerDefaultInstance(C8672bx.class, bxVar);
    }

    private C8672bx() {
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
                return newMessageInfo(f29984b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C8672bx();
            case 4:
                return new C8671bw();
            case 5:
                return f29984b;
            case 6:
                C63010eb ebVar = f29985c;
                if (ebVar == null) {
                    synchronized (C8672bx.class) {
                        ebVar = f29985c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29984b);
                            f29985c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
