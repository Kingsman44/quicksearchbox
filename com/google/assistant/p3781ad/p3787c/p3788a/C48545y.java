package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.y */
/* compiled from: PG */
public final class C48545y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48545y f125417c;

    /* renamed from: e */
    private static volatile C63010eb f125418e;

    /* renamed from: a */
    public int f125419a = 1;

    /* renamed from: b */
    public C62971cq f125420b = emptyProtobufList();

    /* renamed from: d */
    private int f125421d;

    static {
        C48545y yVar = new C48545y();
        f125417c = yVar;
        C62942bv.registerDefaultInstance(C48545y.class, yVar);
    }

    private C48545y() {
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
                return newMessageInfo(f125417c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", C48543w.f125416a, "b", C48482aa.class});
            case 3:
                return new C48545y();
            case 4:
                return new C48542v();
            case 5:
                return f125417c;
            case 6:
                C63010eb ebVar = f125418e;
                if (ebVar == null) {
                    synchronized (C48545y.class) {
                        ebVar = f125418e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125417c);
                            f125418e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
