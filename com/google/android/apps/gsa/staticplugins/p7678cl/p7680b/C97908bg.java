package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.bg */
/* compiled from: PG */
public final class C97908bg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97908bg f273364e;

    /* renamed from: f */
    private static volatile C63010eb f273365f;

    /* renamed from: a */
    public int f273366a;

    /* renamed from: b */
    public int f273367b;

    /* renamed from: c */
    public C62971cq f273368c = emptyProtobufList();

    /* renamed from: d */
    public boolean f273369d;

    static {
        C97908bg bgVar = new C97908bg();
        f273364e = bgVar;
        C62942bv.registerDefaultInstance(C97908bg.class, bgVar);
    }

    private C97908bg() {
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
                return newMessageInfo(f273364e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", C97906be.f273363a, C45240c.f118157a, C97920j.class, "d"});
            case 3:
                return new C97908bg();
            case 4:
                return new C97905bd();
            case 5:
                return f273364e;
            case 6:
                C63010eb ebVar = f273365f;
                if (ebVar == null) {
                    synchronized (C97908bg.class) {
                        ebVar = f273365f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273364e);
                            f273365f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
