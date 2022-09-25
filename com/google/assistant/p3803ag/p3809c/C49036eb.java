package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.eb */
/* compiled from: PG */
public final class C49036eb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49036eb f126826b;

    /* renamed from: d */
    private static volatile C63010eb f126827d;

    /* renamed from: a */
    public int f126828a;

    /* renamed from: c */
    private int f126829c;

    static {
        C49036eb ebVar = new C49036eb();
        f126826b = ebVar;
        C62942bv.registerDefaultInstance(C49036eb.class, ebVar);
    }

    private C49036eb() {
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
                return newMessageInfo(f126826b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C49033dz.f126825a});
            case 3:
                return new C49036eb();
            case 4:
                return new C49032dy();
            case 5:
                return f126826b;
            case 6:
                C63010eb ebVar = f126827d;
                if (ebVar == null) {
                    synchronized (C49036eb.class) {
                        ebVar = f126827d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126826b);
                            f126827d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
