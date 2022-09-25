package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.n */
/* compiled from: PG */
public final class C81056n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81056n f222166c;

    /* renamed from: d */
    private static volatile C63010eb f222167d;

    /* renamed from: a */
    public int f222168a;

    /* renamed from: b */
    public long f222169b;

    static {
        C81056n nVar = new C81056n();
        f222166c = nVar;
        C62942bv.registerDefaultInstance(C81056n.class, nVar);
    }

    private C81056n() {
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
                return newMessageInfo(f222166c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C81056n();
            case 4:
                return new C81055m();
            case 5:
                return f222166c;
            case 6:
                C63010eb ebVar = f222167d;
                if (ebVar == null) {
                    synchronized (C81056n.class) {
                        ebVar = f222167d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222166c);
                            f222167d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
