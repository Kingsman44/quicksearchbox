package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bp */
/* compiled from: PG */
public final class C62439bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62439bp f168603d;

    /* renamed from: e */
    private static volatile C63010eb f168604e;

    /* renamed from: a */
    public int f168605a;

    /* renamed from: b */
    public C62438bo f168606b;

    /* renamed from: c */
    public C62436bm f168607c;

    static {
        C62439bp bpVar = new C62439bp();
        f168603d = bpVar;
        C62942bv.registerDefaultInstance(C62439bp.class, bpVar);
    }

    private C62439bp() {
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
                return newMessageInfo(f168603d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62439bp();
            case 4:
                return new C62434bk();
            case 5:
                return f168603d;
            case 6:
                C63010eb ebVar = f168604e;
                if (ebVar == null) {
                    synchronized (C62439bp.class) {
                        ebVar = f168604e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168603d);
                            f168604e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
