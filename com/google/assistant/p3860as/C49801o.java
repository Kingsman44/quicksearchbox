package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58077i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.o */
/* compiled from: PG */
public final class C49801o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49801o f128638d;

    /* renamed from: f */
    private static volatile C63010eb f128639f;

    /* renamed from: a */
    public int f128640a;

    /* renamed from: b */
    public C62971cq f128641b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f128642c = emptyProtobufList();

    /* renamed from: e */
    private int f128643e;

    static {
        C49801o oVar = new C49801o();
        f128638d = oVar;
        C62942bv.registerDefaultInstance(C49801o.class, oVar);
    }

    private C49801o() {
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
                return newMessageInfo(f128638d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b", new Object[]{"e", "a", C58077i.m88833b(), "b", C49804r.class, C45240c.f118157a, C49804r.class});
            case 3:
                return new C49801o();
            case 4:
                return new C49800n();
            case 5:
                return f128638d;
            case 6:
                C63010eb ebVar = f128639f;
                if (ebVar == null) {
                    synchronized (C49801o.class) {
                        ebVar = f128639f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128638d);
                            f128639f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
