package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.k */
/* compiled from: PG */
public final class C13609k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C13609k f41635b;

    /* renamed from: d */
    private static volatile C63010eb f41636d;

    /* renamed from: a */
    public int f41637a;

    /* renamed from: c */
    private int f41638c;

    static {
        C13609k kVar = new C13609k();
        f41635b = kVar;
        C62942bv.registerDefaultInstance(C13609k.class, kVar);
    }

    private C13609k() {
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
                return newMessageInfo(f41635b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C13607i.f41634a});
            case 3:
                return new C13609k();
            case 4:
                return new C13606h();
            case 5:
                return f41635b;
            case 6:
                C63010eb ebVar = f41636d;
                if (ebVar == null) {
                    synchronized (C13609k.class) {
                        ebVar = f41636d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41635b);
                            f41636d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
