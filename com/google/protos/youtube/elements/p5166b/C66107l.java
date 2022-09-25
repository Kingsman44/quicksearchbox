package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.l */
/* compiled from: PG */
public final class C66107l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66107l f179767b;

    /* renamed from: d */
    private static volatile C63010eb f179768d;

    /* renamed from: a */
    public boolean f179769a;

    /* renamed from: c */
    private int f179770c;

    static {
        C66107l lVar = new C66107l();
        f179767b = lVar;
        C62942bv.registerDefaultInstance(C66107l.class, lVar);
    }

    private C66107l() {
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
                return newMessageInfo(f179767b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C66107l();
            case 4:
                return new C66106k();
            case 5:
                return f179767b;
            case 6:
                C63010eb ebVar = f179768d;
                if (ebVar == null) {
                    synchronized (C66107l.class) {
                        ebVar = f179768d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179767b);
                            f179768d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
