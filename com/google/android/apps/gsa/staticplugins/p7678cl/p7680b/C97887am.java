package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.am */
/* compiled from: PG */
public final class C97887am extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97887am f273313e;

    /* renamed from: f */
    private static volatile C63010eb f273314f;

    /* renamed from: a */
    public int f273315a;

    /* renamed from: b */
    public C62971cq f273316b = emptyProtobufList();

    /* renamed from: c */
    public long f273317c;

    /* renamed from: d */
    public boolean f273318d;

    static {
        C97887am amVar = new C97887am();
        f273313e = amVar;
        C62942bv.registerDefaultInstance(C97887am.class, amVar);
    }

    private C97887am() {
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
                return newMessageInfo(f273313e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C97920j.class, C45240c.f118157a, "d"});
            case 3:
                return new C97887am();
            case 4:
                return new C97886al();
            case 5:
                return f273313e;
            case 6:
                C63010eb ebVar = f273314f;
                if (ebVar == null) {
                    synchronized (C97887am.class) {
                        ebVar = f273314f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273313e);
                            f273314f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
