package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.o */
/* compiled from: PG */
public final class C97925o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C97925o f273439f;

    /* renamed from: g */
    private static volatile C63010eb f273440g;

    /* renamed from: a */
    public int f273441a;

    /* renamed from: b */
    public C97922l f273442b;

    /* renamed from: c */
    public int f273443c;

    /* renamed from: d */
    public int f273444d;

    /* renamed from: e */
    public boolean f273445e;

    static {
        C97925o oVar = new C97925o();
        f273439f = oVar;
        C62942bv.registerDefaultInstance(C97925o.class, oVar);
    }

    private C97925o() {
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
                return newMessageInfo(f273439f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C97923m.f273438a, "e"});
            case 3:
                return new C97925o();
            case 4:
                return new C97924n();
            case 5:
                return f273439f;
            case 6:
                C63010eb ebVar = f273440g;
                if (ebVar == null) {
                    synchronized (C97925o.class) {
                        ebVar = f273440g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273439f);
                            f273440g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
