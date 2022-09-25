package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gk */
/* compiled from: PG */
public final class C66975gk extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66975gk f182045f;

    /* renamed from: g */
    private static volatile C63010eb f182046g;

    /* renamed from: a */
    public int f182047a;

    /* renamed from: b */
    public boolean f182048b;

    /* renamed from: c */
    public int f182049c;

    /* renamed from: d */
    public boolean f182050d;

    /* renamed from: e */
    public int f182051e;

    static {
        C66975gk gkVar = new C66975gk();
        f182045f = gkVar;
        C62942bv.registerDefaultInstance(C66975gk.class, gkVar);
    }

    private C66975gk() {
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
                return newMessageInfo(f182045f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0002\u0004င\u0001\u0005င\u0003", new Object[]{"a", "b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C66975gk();
            case 4:
                return new C66974gj();
            case 5:
                return f182045f;
            case 6:
                C63010eb ebVar = f182046g;
                if (ebVar == null) {
                    synchronized (C66975gk.class) {
                        ebVar = f182046g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182045f);
                            f182046g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
