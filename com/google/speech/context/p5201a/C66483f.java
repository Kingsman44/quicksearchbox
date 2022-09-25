package com.google.speech.context.p5201a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.context.a.f */
/* compiled from: PG */
public final class C66483f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66483f f180776e;

    /* renamed from: f */
    private static volatile C63010eb f180777f;

    /* renamed from: a */
    public int f180778a;

    /* renamed from: b */
    public C62971cq f180779b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f180780c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C66487j f180781d;

    static {
        C66483f fVar = new C66483f();
        f180776e = fVar;
        C62942bv.registerDefaultInstance(C66483f.class, fVar);
    }

    private C66483f() {
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
                return newMessageInfo(f180776e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66483f();
            case 4:
                return new C66482e();
            case 5:
                return f180776e;
            case 6:
                C63010eb ebVar = f180777f;
                if (ebVar == null) {
                    synchronized (C66483f.class) {
                        ebVar = f180777f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180776e);
                            f180777f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
