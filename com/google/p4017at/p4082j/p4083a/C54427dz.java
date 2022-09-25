package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.j.a.dz */
/* compiled from: PG */
public final class C54427dz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54427dz f142935d;

    /* renamed from: e */
    private static volatile C63010eb f142936e;

    /* renamed from: a */
    public C63042fg f142937a;

    /* renamed from: b */
    public C62971cq f142938b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f142939c = emptyProtobufList();

    static {
        C54427dz dzVar = new C54427dz();
        f142935d = dzVar;
        C62942bv.registerDefaultInstance(C54427dz.class, dzVar);
    }

    private C54427dz() {
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
                return newMessageInfo(f142935d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\u001b", new Object[]{"a", "b", C54440el.class, C45240c.f118157a, C54432ed.class});
            case 3:
                return new C54427dz();
            case 4:
                return new C54426dy();
            case 5:
                return f142935d;
            case 6:
                C63010eb ebVar = f142936e;
                if (ebVar == null) {
                    synchronized (C54427dz.class) {
                        ebVar = f142936e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142935d);
                            f142936e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
