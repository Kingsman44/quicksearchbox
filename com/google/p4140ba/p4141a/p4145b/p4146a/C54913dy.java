package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.dy */
/* compiled from: PG */
public final class C54913dy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54913dy f144335d;

    /* renamed from: e */
    private static volatile C63010eb f144336e;

    /* renamed from: a */
    public int f144337a;

    /* renamed from: b */
    public C54872ck f144338b;

    /* renamed from: c */
    public C62971cq f144339c = emptyProtobufList();

    static {
        C54913dy dyVar = new C54913dy();
        f144335d = dyVar;
        C62942bv.registerDefaultInstance(C54913dy.class, dyVar);
    }

    private C54913dy() {
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
                return newMessageInfo(f144335d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C54897di.class});
            case 3:
                return new C54913dy();
            case 4:
                return new C54912dx();
            case 5:
                return f144335d;
            case 6:
                C63010eb ebVar = f144336e;
                if (ebVar == null) {
                    synchronized (C54913dy.class) {
                        ebVar = f144336e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144335d);
                            f144336e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
