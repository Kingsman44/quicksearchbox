package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ux */
/* compiled from: PG */
public final class C8083ux extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8083ux f28437b;

    /* renamed from: d */
    private static volatile C63010eb f28438d;

    /* renamed from: a */
    public int f28439a;

    /* renamed from: c */
    private int f28440c;

    static {
        C8083ux uxVar = new C8083ux();
        f28437b = uxVar;
        C62942bv.registerDefaultInstance(C8083ux.class, uxVar);
    }

    private C8083ux() {
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
                return newMessageInfo(f28437b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8083ux();
            case 4:
                return new C8082uw();
            case 5:
                return f28437b;
            case 6:
                C63010eb ebVar = f28438d;
                if (ebVar == null) {
                    synchronized (C8083ux.class) {
                        ebVar = f28438d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28437b);
                            f28438d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
