package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.br */
/* compiled from: PG */
public final class C48710br extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48710br f126019d;

    /* renamed from: e */
    private static volatile C63010eb f126020e;

    /* renamed from: a */
    public C62971cq f126021a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f126022b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f126023c = C62942bv.emptyProtobufList();

    static {
        C48710br brVar = new C48710br();
        f126019d = brVar;
        C62942bv.registerDefaultInstance(C48710br.class, brVar);
    }

    private C48710br() {
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
                return newMessageInfo(f126019d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48710br();
            case 4:
                return new C48709bq();
            case 5:
                return f126019d;
            case 6:
                C63010eb ebVar = f126020e;
                if (ebVar == null) {
                    synchronized (C48710br.class) {
                        ebVar = f126020e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126019d);
                            f126020e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
