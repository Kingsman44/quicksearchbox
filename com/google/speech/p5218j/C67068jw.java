package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jw */
/* compiled from: PG */
public final class C67068jw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67068jw f182311b;

    /* renamed from: d */
    private static volatile C63010eb f182312d;

    /* renamed from: a */
    public boolean f182313a;

    /* renamed from: c */
    private int f182314c;

    static {
        C67068jw jwVar = new C67068jw();
        f182311b = jwVar;
        C62942bv.registerDefaultInstance(C67068jw.class, jwVar);
    }

    private C67068jw() {
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
                return newMessageInfo(f182311b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67068jw();
            case 4:
                return new C67067jv();
            case 5:
                return f182311b;
            case 6:
                C63010eb ebVar = f182312d;
                if (ebVar == null) {
                    synchronized (C67068jw.class) {
                        ebVar = f182312d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182311b);
                            f182312d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
