package com.google.android.apps.search.fedora.p10096d.p10098b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.d.b.m */
/* compiled from: PG */
public final class C132768m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C132768m f362217b;

    /* renamed from: d */
    private static volatile C63010eb f362218d;

    /* renamed from: a */
    public boolean f362219a;

    /* renamed from: c */
    private int f362220c;

    static {
        C132768m mVar = new C132768m();
        f362217b = mVar;
        C62942bv.registerDefaultInstance(C132768m.class, mVar);
    }

    private C132768m() {
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
                return newMessageInfo(f362217b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C132768m();
            case 4:
                return new C132767l();
            case 5:
                return f362217b;
            case 6:
                C63010eb ebVar = f362218d;
                if (ebVar == null) {
                    synchronized (C132768m.class) {
                        ebVar = f362218d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362217b);
                            f362218d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
