package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.r */
/* compiled from: PG */
public final class C91811r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C91811r f256054e;

    /* renamed from: f */
    private static volatile C63010eb f256055f;

    /* renamed from: a */
    public int f256056a;

    /* renamed from: b */
    public boolean f256057b;

    /* renamed from: c */
    public boolean f256058c;

    /* renamed from: d */
    public boolean f256059d;

    static {
        C91811r rVar = new C91811r();
        f256054e = rVar;
        C62942bv.registerDefaultInstance(C91811r.class, rVar);
    }

    private C91811r() {
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
                return newMessageInfo(f256054e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C91811r();
            case 4:
                return new C91810q();
            case 5:
                return f256054e;
            case 6:
                C63010eb ebVar = f256055f;
                if (ebVar == null) {
                    synchronized (C91811r.class) {
                        ebVar = f256055f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256054e);
                            f256055f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
