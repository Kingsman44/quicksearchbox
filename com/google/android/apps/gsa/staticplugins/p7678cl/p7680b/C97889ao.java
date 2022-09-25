package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ao */
/* compiled from: PG */
public final class C97889ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C97889ao f273319d;

    /* renamed from: e */
    private static volatile C63010eb f273320e;

    /* renamed from: a */
    public C62971cq f273321a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f273322b;

    /* renamed from: c */
    public C62971cq f273323c;

    static {
        C97889ao aoVar = new C97889ao();
        f273319d = aoVar;
        C62942bv.registerDefaultInstance(C97889ao.class, aoVar);
    }

    private C97889ao() {
        emptyProtobufList();
        this.f273322b = emptyProtobufList();
        this.f273323c = emptyProtobufList();
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
                return newMessageInfo(f273319d, "\u0001\u0003\u0000\u0000\u0003\u0007\u0003\u0000\u0003\u0000\u0003\u001b\u0006\u001b\u0007\u001b", new Object[]{"a", C97929s.class, "b", C97927q.class, C45240c.f118157a, C97897aw.class});
            case 3:
                return new C97889ao();
            case 4:
                return new C97888an();
            case 5:
                return f273319d;
            case 6:
                C63010eb ebVar = f273320e;
                if (ebVar == null) {
                    synchronized (C97889ao.class) {
                        ebVar = f273320e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273319d);
                            f273320e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
