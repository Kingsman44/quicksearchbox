package com.google.protos.p5129p.p5130a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.ag */
/* compiled from: PG */
public final class C65708ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65708ag f178520d;

    /* renamed from: f */
    private static volatile C63010eb f178521f;

    /* renamed from: a */
    public int f178522a;

    /* renamed from: b */
    public C62971cq f178523b = emptyProtobufList();

    /* renamed from: c */
    public boolean f178524c;

    /* renamed from: e */
    private byte f178525e = 2;

    static {
        C65708ag agVar = new C65708ag();
        f178520d = agVar;
        C62942bv.registerDefaultInstance(C65708ag.class, agVar);
    }

    private C65708ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178525e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178525e = b;
                return null;
            case 2:
                return newMessageInfo(f178520d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002Л\u0003ဇ\u0001", new Object[]{"a", "b", C65707af.class, C45240c.f118157a});
            case 3:
                return new C65708ag();
            case 4:
                return new C65705ad();
            case 5:
                return f178520d;
            case 6:
                C63010eb ebVar = f178521f;
                if (ebVar == null) {
                    synchronized (C65708ag.class) {
                        ebVar = f178521f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178520d);
                            f178521f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
