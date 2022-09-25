package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.x */
/* compiled from: PG */
public final class C66820x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66820x f181704c;

    /* renamed from: e */
    private static volatile C63010eb f181705e;

    /* renamed from: a */
    public int f181706a;

    /* renamed from: b */
    public double f181707b;

    /* renamed from: d */
    private int f181708d;

    static {
        C66820x xVar = new C66820x();
        f181704c = xVar;
        C62942bv.registerDefaultInstance(C66820x.class, xVar);
    }

    private C66820x() {
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
                return newMessageInfo(f181704c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001", new Object[]{"d", "a", C66809m.f181678a, "b"});
            case 3:
                return new C66820x();
            case 4:
                return new C66819w();
            case 5:
                return f181704c;
            case 6:
                C63010eb ebVar = f181705e;
                if (ebVar == null) {
                    synchronized (C66820x.class) {
                        ebVar = f181705e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181704c);
                            f181705e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
