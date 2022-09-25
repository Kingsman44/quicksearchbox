package com.google.android.libraries.search.assistant.p2497ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.ab.ac */
/* compiled from: PG */
public final class C32361ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C32361ac f86752d;

    /* renamed from: e */
    private static volatile C63010eb f86753e;

    /* renamed from: a */
    public int f86754a;

    /* renamed from: b */
    public boolean f86755b;

    /* renamed from: c */
    public int f86756c;

    static {
        C32361ac acVar = new C32361ac();
        f86752d = acVar;
        C62942bv.registerDefaultInstance(C32361ac.class, acVar);
    }

    private C32361ac() {
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
                return newMessageInfo(f86752d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C32362ad.f86757a});
            case 3:
                return new C32361ac();
            case 4:
                return new C32360ab();
            case 5:
                return f86752d;
            case 6:
                C63010eb ebVar = f86753e;
                if (ebVar == null) {
                    synchronized (C32361ac.class) {
                        ebVar = f86753e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86752d);
                            f86753e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
