package com.google.protos.p4880aq;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.bg */
/* compiled from: PG */
public final class C63745bg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63745bg f172450e;

    /* renamed from: g */
    private static volatile C63010eb f172451g;

    /* renamed from: a */
    public int f172452a = 0;

    /* renamed from: b */
    public Object f172453b;

    /* renamed from: c */
    public C63750g f172454c;

    /* renamed from: d */
    public int f172455d;

    /* renamed from: f */
    private int f172456f;

    static {
        C63745bg bgVar = new C63745bg();
        f172450e = bgVar;
        C62942bv.registerDefaultInstance(C63745bg.class, bgVar);
    }

    private C63745bg() {
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
                return newMessageInfo(f172450e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဉ\u0002\u0003ဌ\u0003\u0005့\u0000", new Object[]{"b", "a", C10662f.f35572a, C63744bf.m96299b(), C45240c.f118157a, "d", C63742bd.m96297b()});
            case 3:
                return new C63745bg();
            case 4:
                return new C63740bb();
            case 5:
                return f172450e;
            case 6:
                C63010eb ebVar = f172451g;
                if (ebVar == null) {
                    synchronized (C63745bg.class) {
                        ebVar = f172451g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172450e);
                            f172451g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
