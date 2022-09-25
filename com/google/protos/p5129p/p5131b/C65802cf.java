package com.google.protos.p5129p.p5131b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.cf */
/* compiled from: PG */
public final class C65802cf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65802cf f178865b;

    /* renamed from: d */
    private static volatile C63010eb f178866d;

    /* renamed from: a */
    public boolean f178867a;

    /* renamed from: c */
    private int f178868c;

    static {
        C65802cf cfVar = new C65802cf();
        f178865b = cfVar;
        C62942bv.registerDefaultInstance(C65802cf.class, cfVar);
    }

    private C65802cf() {
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
                return newMessageInfo(f178865b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65802cf();
            case 4:
                return new C65801ce();
            case 5:
                return f178865b;
            case 6:
                C63010eb ebVar = f178866d;
                if (ebVar == null) {
                    synchronized (C65802cf.class) {
                        ebVar = f178866d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178865b);
                            f178866d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
