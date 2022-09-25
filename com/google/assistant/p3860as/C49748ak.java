package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.ak */
/* compiled from: PG */
public final class C49748ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49748ak f128464d;

    /* renamed from: e */
    private static volatile C63010eb f128465e;

    /* renamed from: a */
    public int f128466a;

    /* renamed from: b */
    public C49807u f128467b;

    /* renamed from: c */
    public C62971cq f128468c = emptyProtobufList();

    static {
        C49748ak akVar = new C49748ak();
        f128464d = akVar;
        C62942bv.registerDefaultInstance(C49748ak.class, akVar);
    }

    private C49748ak() {
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
                return newMessageInfo(f128464d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C49750am.class});
            case 3:
                return new C49748ak();
            case 4:
                return new C49747aj();
            case 5:
                return f128464d;
            case 6:
                C63010eb ebVar = f128465e;
                if (ebVar == null) {
                    synchronized (C49748ak.class) {
                        ebVar = f128465e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128464d);
                            f128465e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
