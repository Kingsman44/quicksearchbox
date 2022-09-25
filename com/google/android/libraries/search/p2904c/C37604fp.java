package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fp */
/* compiled from: PG */
public final class C37604fp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37604fp f99931c;

    /* renamed from: d */
    private static volatile C63010eb f99932d;

    /* renamed from: a */
    public int f99933a = 0;

    /* renamed from: b */
    public Object f99934b;

    static {
        C37604fp fpVar = new C37604fp();
        f99931c = fpVar;
        C62942bv.registerDefaultInstance(C37604fp.class, fpVar);
    }

    private C37604fp() {
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
                return newMessageInfo(f99931c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C37464cm.class, C37460ci.class});
            case 3:
                return new C37604fp();
            case 4:
                return new C37603fo();
            case 5:
                return f99931c;
            case 6:
                C63010eb ebVar = f99932d;
                if (ebVar == null) {
                    synchronized (C37604fp.class) {
                        ebVar = f99932d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99931c);
                            f99932d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
