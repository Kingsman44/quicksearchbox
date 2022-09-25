package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.km */
/* compiled from: PG */
public final class C67085km extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67085km f182360e;

    /* renamed from: f */
    private static volatile C63010eb f182361f;

    /* renamed from: a */
    public int f182362a;

    /* renamed from: b */
    public boolean f182363b;

    /* renamed from: c */
    public float f182364c;

    /* renamed from: d */
    public int f182365d;

    static {
        C67085km kmVar = new C67085km();
        f182360e = kmVar;
        C62942bv.registerDefaultInstance(C67085km.class, kmVar);
    }

    private C67085km() {
        emptyIntList();
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
                return newMessageInfo(f182360e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ခ\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67085km();
            case 4:
                return new C67084kl();
            case 5:
                return f182360e;
            case 6:
                C63010eb ebVar = f182361f;
                if (ebVar == null) {
                    synchronized (C67085km.class) {
                        ebVar = f182361f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182360e);
                            f182361f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
