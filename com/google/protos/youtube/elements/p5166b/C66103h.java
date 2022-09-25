package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.h */
/* compiled from: PG */
public final class C66103h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66103h f179752f;

    /* renamed from: g */
    private static volatile C63010eb f179753g;

    /* renamed from: a */
    public int f179754a;

    /* renamed from: b */
    public float f179755b;

    /* renamed from: c */
    public float f179756c;

    /* renamed from: d */
    public float f179757d;

    /* renamed from: e */
    public float f179758e;

    static {
        C66103h hVar = new C66103h();
        f179752f = hVar;
        C62942bv.registerDefaultInstance(C66103h.class, hVar);
    }

    private C66103h() {
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
                return newMessageInfo(f179752f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ခ\u0000\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66103h();
            case 4:
                return new C66102g();
            case 5:
                return f179752f;
            case 6:
                C63010eb ebVar = f179753g;
                if (ebVar == null) {
                    synchronized (C66103h.class) {
                        ebVar = f179753g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179752f);
                            f179753g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
