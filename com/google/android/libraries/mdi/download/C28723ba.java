package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ba */
/* compiled from: PG */
public final class C28723ba extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28723ba f78024b;

    /* renamed from: d */
    private static volatile C63010eb f78025d;

    /* renamed from: a */
    public long f78026a;

    /* renamed from: c */
    private int f78027c;

    static {
        C28723ba baVar = new C28723ba();
        f78024b = baVar;
        C62942bv.registerDefaultInstance(C28723ba.class, baVar);
    }

    private C28723ba() {
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
                return newMessageInfo(f78024b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001စ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C28723ba();
            case 4:
                return new C28720az();
            case 5:
                return f78024b;
            case 6:
                C63010eb ebVar = f78025d;
                if (ebVar == null) {
                    synchronized (C28723ba.class) {
                        ebVar = f78025d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78024b);
                            f78025d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
