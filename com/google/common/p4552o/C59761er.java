package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.er */
/* compiled from: PG */
public final class C59761er extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59761er f161468f;

    /* renamed from: h */
    private static volatile C63010eb f161469h;

    /* renamed from: a */
    public long f161470a;

    /* renamed from: b */
    public long f161471b;

    /* renamed from: c */
    public long f161472c;

    /* renamed from: d */
    public long f161473d;

    /* renamed from: e */
    public int f161474e;

    /* renamed from: g */
    private int f161475g;

    static {
        C59761er erVar = new C59761er();
        f161468f = erVar;
        C62942bv.registerDefaultInstance(C59761er.class, erVar);
    }

    private C59761er() {
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
                return newMessageInfo(f161468f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဌ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e", C59759ep.f161467a});
            case 3:
                return new C59761er();
            case 4:
                return new C59758eo();
            case 5:
                return f161468f;
            case 6:
                C63010eb ebVar = f161469h;
                if (ebVar == null) {
                    synchronized (C59761er.class) {
                        ebVar = f161469h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161468f);
                            f161469h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
