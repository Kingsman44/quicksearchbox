package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.et */
/* compiled from: PG */
public final class C51358et extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51358et f133769d;

    /* renamed from: e */
    private static volatile C63010eb f133770e;

    /* renamed from: a */
    public int f133771a;

    /* renamed from: b */
    public int f133772b;

    /* renamed from: c */
    public int f133773c;

    static {
        C51358et etVar = new C51358et();
        f133769d = etVar;
        C62942bv.registerDefaultInstance(C51358et.class, etVar);
    }

    private C51358et() {
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
                return newMessageInfo(f133769d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဌ\u0003", new Object[]{"a", "b", C51357es.m86149b(), C45240c.f118157a, C51355eq.m86147b()});
            case 3:
                return new C51358et();
            case 4:
                return new C51353eo();
            case 5:
                return f133769d;
            case 6:
                C63010eb ebVar = f133770e;
                if (ebVar == null) {
                    synchronized (C51358et.class) {
                        ebVar = f133770e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133769d);
                            f133770e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
