package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.bw */
/* compiled from: PG */
public final class C25244bw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25244bw f68702b;

    /* renamed from: c */
    private static volatile C63010eb f68703c;

    /* renamed from: a */
    public long f68704a;

    static {
        C25244bw bwVar = new C25244bw();
        f68702b = bwVar;
        C62942bv.registerDefaultInstance(C25244bw.class, bwVar);
    }

    private C25244bw() {
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
                return newMessageInfo(f68702b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C25244bw();
            case 4:
                return new C25243bv();
            case 5:
                return f68702b;
            case 6:
                C63010eb ebVar = f68703c;
                if (ebVar == null) {
                    synchronized (C25244bw.class) {
                        ebVar = f68703c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68702b);
                            f68703c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
