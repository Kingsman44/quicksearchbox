package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.youtube.elements.b.aj */
/* compiled from: PG */
public final class C66076aj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66076aj f179680e;

    /* renamed from: f */
    private static volatile C63010eb f179681f;

    /* renamed from: a */
    public int f179682a;

    /* renamed from: b */
    public C62971cq f179683b = emptyProtobufList();

    /* renamed from: c */
    public boolean f179684c;

    /* renamed from: d */
    public C63042fg f179685d;

    static {
        C66076aj ajVar = new C66076aj();
        f179680e = ajVar;
        C62942bv.registerDefaultInstance(C66076aj.class, ajVar);
    }

    private C66076aj() {
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
                return newMessageInfo(f179680e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C66074ah.class, C45240c.f118157a, "d"});
            case 3:
                return new C66076aj();
            case 4:
                return new C66075ai();
            case 5:
                return f179680e;
            case 6:
                C63010eb ebVar = f179681f;
                if (ebVar == null) {
                    synchronized (C66076aj.class) {
                        ebVar = f179681f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179680e);
                            f179681f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
