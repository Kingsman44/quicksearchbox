package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fk */
/* compiled from: PG */
public final class C142440fk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142440fk f386515b;

    /* renamed from: d */
    private static volatile C63010eb f386516d;

    /* renamed from: a */
    public int f386517a = 1;

    /* renamed from: c */
    private int f386518c;

    static {
        C142440fk fkVar = new C142440fk();
        f386515b = fkVar;
        C62942bv.registerDefaultInstance(C142440fk.class, fkVar);
    }

    private C142440fk() {
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
                return newMessageInfo(f386515b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C142441fl.f386519a});
            case 3:
                return new C142440fk();
            case 4:
                return new C142439fj();
            case 5:
                return f386515b;
            case 6:
                C63010eb ebVar = f386516d;
                if (ebVar == null) {
                    synchronized (C142440fk.class) {
                        ebVar = f386516d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386515b);
                            f386516d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
