package com.google.lens.p4705i.p4706a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.x */
/* compiled from: PG */
public final class C62393x extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62393x f168428g;

    /* renamed from: h */
    private static volatile C63010eb f168429h;

    /* renamed from: a */
    public C62389t f168430a;

    /* renamed from: b */
    public float f168431b;

    /* renamed from: c */
    public C62392w f168432c;

    /* renamed from: d */
    public int f168433d;

    /* renamed from: e */
    public int f168434e;

    /* renamed from: f */
    public int f168435f;

    static {
        C62393x xVar = new C62393x();
        f168428g = xVar;
        C62942bv.registerDefaultInstance(C62393x.class, xVar);
    }

    private C62393x() {
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
                return newMessageInfo(f168428g, "\u0000\u0006\u0000\u0000\u0001\f\u0006\u0000\u0000\u0000\u0001\t\u0002\u0001\u0003\t\u0007\f\n\f\f\u0004", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, "d", "e"});
            case 3:
                return new C62393x();
            case 4:
                return new C62390u();
            case 5:
                return f168428g;
            case 6:
                C63010eb ebVar = f168429h;
                if (ebVar == null) {
                    synchronized (C62393x.class) {
                        ebVar = f168429h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168428g);
                            f168429h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
