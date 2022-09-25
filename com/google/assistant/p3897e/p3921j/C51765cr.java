package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.cr */
/* compiled from: PG */
public final class C51765cr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51765cr f135802g;

    /* renamed from: h */
    private static volatile C63010eb f135803h;

    /* renamed from: a */
    public int f135804a;

    /* renamed from: b */
    public int f135805b;

    /* renamed from: c */
    public int f135806c;

    /* renamed from: d */
    public int f135807d;

    /* renamed from: e */
    public int f135808e;

    /* renamed from: f */
    public int f135809f;

    static {
        C51765cr crVar = new C51765cr();
        f135802g = crVar;
        C62942bv.registerDefaultInstance(C51765cr.class, crVar);
    }

    private C51765cr() {
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
                return newMessageInfo(f135802g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C51765cr();
            case 4:
                return new C51764cq();
            case 5:
                return f135802g;
            case 6:
                C63010eb ebVar = f135803h;
                if (ebVar == null) {
                    synchronized (C51765cr.class) {
                        ebVar = f135803h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135802g);
                            f135803h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
