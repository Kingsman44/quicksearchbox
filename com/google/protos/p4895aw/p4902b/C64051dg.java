package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dg */
/* compiled from: PG */
public final class C64051dg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64051dg f173180e;

    /* renamed from: f */
    private static volatile C63010eb f173181f;

    /* renamed from: a */
    public int f173182a;

    /* renamed from: b */
    public C62971cq f173183b = emptyProtobufList();

    /* renamed from: c */
    public boolean f173184c;

    /* renamed from: d */
    public int f173185d;

    static {
        C64051dg dgVar = new C64051dg();
        f173180e = dgVar;
        C62942bv.registerDefaultInstance(C64051dg.class, dgVar);
    }

    private C64051dg() {
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
                return newMessageInfo(f173180e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003င\u0001", new Object[]{"a", "b", C64049de.class, C45240c.f118157a, "d"});
            case 3:
                return new C64051dg();
            case 4:
                return new C64050df();
            case 5:
                return f173180e;
            case 6:
                C63010eb ebVar = f173181f;
                if (ebVar == null) {
                    synchronized (C64051dg.class) {
                        ebVar = f173181f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173180e);
                            f173181f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
