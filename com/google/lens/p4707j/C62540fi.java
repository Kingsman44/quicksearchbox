package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fi */
/* compiled from: PG */
public final class C62540fi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62540fi f168849b;

    /* renamed from: d */
    private static volatile C63010eb f168850d;

    /* renamed from: a */
    public long f168851a;

    /* renamed from: c */
    private int f168852c;

    static {
        C62540fi fiVar = new C62540fi();
        f168849b = fiVar;
        C62942bv.registerDefaultInstance(C62540fi.class, fiVar);
    }

    private C62540fi() {
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
                return newMessageInfo(f168849b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62540fi();
            case 4:
                return new C62539fh();
            case 5:
                return f168849b;
            case 6:
                C63010eb ebVar = f168850d;
                if (ebVar == null) {
                    synchronized (C62540fi.class) {
                        ebVar = f168850d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168849b);
                            f168850d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
