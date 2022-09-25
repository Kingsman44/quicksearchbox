package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.w */
/* compiled from: PG */
public final class C63684w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63684w f172193b;

    /* renamed from: d */
    private static volatile C63010eb f172194d;

    /* renamed from: a */
    public C63674m f172195a;

    /* renamed from: c */
    private int f172196c;

    static {
        C63684w wVar = new C63684w();
        f172193b = wVar;
        C62942bv.registerDefaultInstance(C63684w.class, wVar);
    }

    private C63684w() {
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
                return newMessageInfo(f172193b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63684w();
            case 4:
                return new C63683v();
            case 5:
                return f172193b;
            case 6:
                C63010eb ebVar = f172194d;
                if (ebVar == null) {
                    synchronized (C63684w.class) {
                        ebVar = f172194d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172193b);
                            f172194d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
