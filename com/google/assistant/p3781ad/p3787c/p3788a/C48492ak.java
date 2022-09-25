package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.ak */
/* compiled from: PG */
public final class C48492ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48492ak f125266c;

    /* renamed from: d */
    private static volatile C63010eb f125267d;

    /* renamed from: a */
    public C62971cq f125268a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f125269b = emptyProtobufList();

    static {
        C48492ak akVar = new C48492ak();
        f125266c = akVar;
        C62942bv.registerDefaultInstance(C48492ak.class, akVar);
    }

    private C48492ak() {
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
                return newMessageInfo(f125266c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C48539s.class, "b", C48535o.class});
            case 3:
                return new C48492ak();
            case 4:
                return new C48491aj();
            case 5:
                return f125266c;
            case 6:
                C63010eb ebVar = f125267d;
                if (ebVar == null) {
                    synchronized (C48492ak.class) {
                        ebVar = f125267d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125266c);
                            f125267d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
