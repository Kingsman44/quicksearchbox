package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.rv */
/* compiled from: PG */
public final class C8000rv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8000rv f28111e;

    /* renamed from: g */
    private static volatile C63010eb f28112g;

    /* renamed from: a */
    public int f28113a;

    /* renamed from: b */
    public C62971cq f28114b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f28115c = emptyProtobufList();

    /* renamed from: d */
    public int f28116d;

    /* renamed from: f */
    private byte f28117f = 2;

    static {
        C8000rv rvVar = new C8000rv();
        f28111e = rvVar;
        C62942bv.registerDefaultInstance(C8000rv.class, rvVar);
    }

    private C8000rv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28117f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28117f = b;
                return null;
            case 2:
                return newMessageInfo(f28111e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u001b\u0002Л\u0003င\u0000", new Object[]{"a", "b", C7818lb.class, C45240c.f118157a, C7851mh.class, "d"});
            case 3:
                return new C8000rv();
            case 4:
                return new C7999ru();
            case 5:
                return f28111e;
            case 6:
                C63010eb ebVar = f28112g;
                if (ebVar == null) {
                    synchronized (C8000rv.class) {
                        ebVar = f28112g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28111e);
                            f28112g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
