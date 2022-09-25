package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gg */
/* compiled from: PG */
public final class C82945gg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82945gg f226304e;

    /* renamed from: f */
    private static volatile C63010eb f226305f;

    /* renamed from: a */
    public int f226306a;

    /* renamed from: b */
    public int f226307b;

    /* renamed from: c */
    public int f226308c;

    /* renamed from: d */
    public int f226309d;

    static {
        C82945gg ggVar = new C82945gg();
        f226304e = ggVar;
        C62942bv.registerDefaultInstance(C82945gg.class, ggVar);
    }

    private C82945gg() {
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
                return newMessageInfo(f226304e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C82936fy.m132432b(), C45240c.f118157a, C82944gf.m132436b(), "d", C82941gc.m132434b()});
            case 3:
                return new C82945gg();
            case 4:
                return new C82942gd();
            case 5:
                return f226304e;
            case 6:
                C63010eb ebVar = f226305f;
                if (ebVar == null) {
                    synchronized (C82945gg.class) {
                        ebVar = f226305f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226304e);
                            f226305f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
