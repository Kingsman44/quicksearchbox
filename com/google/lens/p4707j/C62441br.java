package com.google.lens.p4707j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.br */
/* compiled from: PG */
public final class C62441br extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62441br f168608h;

    /* renamed from: i */
    private static volatile C63010eb f168609i;

    /* renamed from: a */
    public int f168610a;

    /* renamed from: b */
    public float f168611b;

    /* renamed from: c */
    public float f168612c;

    /* renamed from: d */
    public float f168613d;

    /* renamed from: e */
    public float f168614e;

    /* renamed from: f */
    public float f168615f;

    /* renamed from: g */
    public int f168616g;

    static {
        C62441br brVar = new C62441br();
        f168608h = brVar;
        C62942bv.registerDefaultInstance(C62441br.class, brVar);
    }

    private C62441br() {
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
                return newMessageInfo(f168608h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C62579m.f168954a});
            case 3:
                return new C62441br();
            case 4:
                return new C62440bq();
            case 5:
                return f168608h;
            case 6:
                C63010eb ebVar = f168609i;
                if (ebVar == null) {
                    synchronized (C62441br.class) {
                        ebVar = f168609i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168608h);
                            f168609i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
