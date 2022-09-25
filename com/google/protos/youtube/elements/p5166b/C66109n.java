package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.n */
/* compiled from: PG */
public final class C66109n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66109n f179771f;

    /* renamed from: g */
    private static volatile C63010eb f179772g;

    /* renamed from: a */
    public int f179773a;

    /* renamed from: b */
    public float f179774b;

    /* renamed from: c */
    public float f179775c;

    /* renamed from: d */
    public float f179776d;

    /* renamed from: e */
    public float f179777e;

    static {
        C66109n nVar = new C66109n();
        f179771f = nVar;
        C62942bv.registerDefaultInstance(C66109n.class, nVar);
    }

    private C66109n() {
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
                return newMessageInfo(f179771f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66109n();
            case 4:
                return new C66108m();
            case 5:
                return f179771f;
            case 6:
                C63010eb ebVar = f179772g;
                if (ebVar == null) {
                    synchronized (C66109n.class) {
                        ebVar = f179772g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179771f);
                            f179772g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
