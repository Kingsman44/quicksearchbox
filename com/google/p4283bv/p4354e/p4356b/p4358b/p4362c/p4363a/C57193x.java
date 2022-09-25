package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.x */
/* compiled from: PG */
public final class C57193x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57193x f152688b;

    /* renamed from: d */
    private static volatile C63010eb f152689d;

    /* renamed from: a */
    public String f152690a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f152691c;

    static {
        C57193x xVar = new C57193x();
        f152688b = xVar;
        C62942bv.registerDefaultInstance(C57193x.class, xVar);
    }

    private C57193x() {
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
                return newMessageInfo(f152688b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57193x();
            case 4:
                return new C57192w();
            case 5:
                return f152688b;
            case 6:
                C63010eb ebVar = f152689d;
                if (ebVar == null) {
                    synchronized (C57193x.class) {
                        ebVar = f152689d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152688b);
                            f152689d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
