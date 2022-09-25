package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.b.d */
/* compiled from: PG */
public final class C107552d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C107552d f299204d;

    /* renamed from: e */
    private static volatile C63010eb f299205e;

    /* renamed from: a */
    public int f299206a;

    /* renamed from: b */
    public int f299207b;

    /* renamed from: c */
    public C63088z f299208c = C63088z.f170246b;

    static {
        C107552d dVar = new C107552d();
        f299204d = dVar;
        C62942bv.registerDefaultInstance(C107552d.class, dVar);
    }

    private C107552d() {
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
                return newMessageInfo(f299204d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", C107551c.m178397b(), C45240c.f118157a});
            case 3:
                return new C107552d();
            case 4:
                return new C107549a();
            case 5:
                return f299204d;
            case 6:
                C63010eb ebVar = f299205e;
                if (ebVar == null) {
                    synchronized (C107552d.class) {
                        ebVar = f299205e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299204d);
                            f299205e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
