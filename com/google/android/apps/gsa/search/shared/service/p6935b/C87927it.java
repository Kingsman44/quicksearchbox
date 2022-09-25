package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.it */
/* compiled from: PG */
public final class C87927it extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87927it f237833e;

    /* renamed from: f */
    private static volatile C63010eb f237834f;

    /* renamed from: a */
    public int f237835a;

    /* renamed from: b */
    public int f237836b = 0;

    /* renamed from: c */
    public Object f237837c;

    /* renamed from: d */
    public int f237838d;

    static {
        C87927it itVar = new C87927it();
        f237833e = itVar;
        C62942bv.registerDefaultInstance(C87927it.class, itVar);
    }

    private C87927it() {
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
                return newMessageInfo(f237833e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002်\u0000\u0003ျ\u0000\u0004့\u0000\u0005ဴ\u0000\u0006ဵ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C87927it();
            case 4:
                return new C87926is();
            case 5:
                return f237833e;
            case 6:
                C63010eb ebVar = f237834f;
                if (ebVar == null) {
                    synchronized (C87927it.class) {
                        ebVar = f237834f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237833e);
                            f237834f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
