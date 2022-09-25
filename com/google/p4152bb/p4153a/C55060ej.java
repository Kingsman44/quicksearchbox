package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ej */
/* compiled from: PG */
public final class C55060ej extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55060ej f144849b;

    /* renamed from: d */
    private static volatile C63010eb f144850d;

    /* renamed from: a */
    public int f144851a;

    /* renamed from: c */
    private int f144852c;

    static {
        C55060ej ejVar = new C55060ej();
        f144849b = ejVar;
        C62942bv.registerDefaultInstance(C55060ej.class, ejVar);
    }

    private C55060ej() {
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
                return newMessageInfo(f144849b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C55058eh.f144848a});
            case 3:
                return new C55060ej();
            case 4:
                return new C55057eg();
            case 5:
                return f144849b;
            case 6:
                C63010eb ebVar = f144850d;
                if (ebVar == null) {
                    synchronized (C55060ej.class) {
                        ebVar = f144850d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144849b);
                            f144850d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
