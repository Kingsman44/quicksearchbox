package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.cb */
/* compiled from: PG */
public final class C67325cb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C67325cb f182991f;

    /* renamed from: g */
    private static volatile C63010eb f182992g;

    /* renamed from: a */
    public int f182993a;

    /* renamed from: b */
    public float f182994b;

    /* renamed from: c */
    public float f182995c;

    /* renamed from: d */
    public float f182996d;

    /* renamed from: e */
    public float f182997e;

    static {
        C67325cb cbVar = new C67325cb();
        f182991f = cbVar;
        C62942bv.registerDefaultInstance(C67325cb.class, cbVar);
    }

    private C67325cb() {
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
                return newMessageInfo(f182991f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C67325cb();
            case 4:
                return new C67324ca();
            case 5:
                return f182991f;
            case 6:
                C63010eb ebVar = f182992g;
                if (ebVar == null) {
                    synchronized (C67325cb.class) {
                        ebVar = f182992g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182991f);
                            f182992g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
