package com.google.speech.p5218j.p5220b.p5221a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.aj */
/* compiled from: PG */
public final class C66797aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66797aj f181653d;

    /* renamed from: e */
    private static volatile C63010eb f181654e;

    /* renamed from: a */
    public int f181655a;

    /* renamed from: b */
    public C62971cq f181656b = emptyProtobufList();

    /* renamed from: c */
    public C66808l f181657c;

    static {
        C66797aj ajVar = new C66797aj();
        f181653d = ajVar;
        C62942bv.registerDefaultInstance(C66797aj.class, ajVar);
    }

    private C66797aj() {
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
                return newMessageInfo(f181653d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0000", new Object[]{"a", "b", C66795ah.class, C45240c.f118157a});
            case 3:
                return new C66797aj();
            case 4:
                return new C66796ai();
            case 5:
                return f181653d;
            case 6:
                C63010eb ebVar = f181654e;
                if (ebVar == null) {
                    synchronized (C66797aj.class) {
                        ebVar = f181654e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181653d);
                            f181654e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
