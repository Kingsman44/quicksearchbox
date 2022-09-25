package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.z */
/* compiled from: PG */
public final class C48883z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48883z f126498c;

    /* renamed from: d */
    private static volatile C63010eb f126499d;

    /* renamed from: a */
    public C62971cq f126500a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f126501b = emptyProtobufList();

    static {
        C48883z zVar = new C48883z();
        f126498c = zVar;
        C62942bv.registerDefaultInstance(C48883z.class, zVar);
    }

    private C48883z() {
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
                return newMessageInfo(f126498c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C48882y.class, "b", C48880w.class});
            case 3:
                return new C48883z();
            case 4:
                return new C48878u();
            case 5:
                return f126498c;
            case 6:
                C63010eb ebVar = f126499d;
                if (ebVar == null) {
                    synchronized (C48883z.class) {
                        ebVar = f126499d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126498c);
                            f126499d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
