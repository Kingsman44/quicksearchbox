package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fa */
/* compiled from: PG */
public final class C51064fa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51064fa f132965d;

    /* renamed from: e */
    private static volatile C63010eb f132966e;

    /* renamed from: a */
    public int f132967a;

    /* renamed from: b */
    public boolean f132968b;

    /* renamed from: c */
    public boolean f132969c;

    static {
        C51064fa faVar = new C51064fa();
        f132965d = faVar;
        C62942bv.registerDefaultInstance(C51064fa.class, faVar);
    }

    private C51064fa() {
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
                return newMessageInfo(f132965d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51064fa();
            case 4:
                return new C51062ez();
            case 5:
                return f132965d;
            case 6:
                C63010eb ebVar = f132966e;
                if (ebVar == null) {
                    synchronized (C51064fa.class) {
                        ebVar = f132966e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132965d);
                            f132966e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
