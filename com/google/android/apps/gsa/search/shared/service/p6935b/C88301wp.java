package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wp */
/* compiled from: PG */
public final class C88301wp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88301wp f238811d;

    /* renamed from: e */
    private static volatile C63010eb f238812e;

    /* renamed from: a */
    public int f238813a;

    /* renamed from: b */
    public boolean f238814b;

    /* renamed from: c */
    public boolean f238815c;

    static {
        C88301wp wpVar = new C88301wp();
        f238811d = wpVar;
        C62942bv.registerDefaultInstance(C88301wp.class, wpVar);
    }

    private C88301wp() {
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
                return newMessageInfo(f238811d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88301wp();
            case 4:
                return new C88300wo();
            case 5:
                return f238811d;
            case 6:
                C63010eb ebVar = f238812e;
                if (ebVar == null) {
                    synchronized (C88301wp.class) {
                        ebVar = f238812e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238811d);
                            f238812e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
