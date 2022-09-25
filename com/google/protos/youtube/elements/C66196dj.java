package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.dj */
/* compiled from: PG */
public final class C66196dj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66196dj f180004b;

    /* renamed from: d */
    private static volatile C63010eb f180005d;

    /* renamed from: a */
    public int f180006a;

    /* renamed from: c */
    private int f180007c;

    static {
        C66196dj djVar = new C66196dj();
        f180004b = djVar;
        C62942bv.registerDefaultInstance(C66196dj.class, djVar);
    }

    private C66196dj() {
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
                return newMessageInfo(f180004b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C66194dh.f180003a});
            case 3:
                return new C66196dj();
            case 4:
                return new C66193dg();
            case 5:
                return f180004b;
            case 6:
                C63010eb ebVar = f180005d;
                if (ebVar == null) {
                    synchronized (C66196dj.class) {
                        ebVar = f180005d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180004b);
                            f180005d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
