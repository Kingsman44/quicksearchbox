package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ib */
/* compiled from: PG */
public final class C59978ib extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59978ib f162091e;

    /* renamed from: g */
    private static volatile C63010eb f162092g;

    /* renamed from: a */
    public int f162093a;

    /* renamed from: b */
    public int f162094b;

    /* renamed from: c */
    public int f162095c;

    /* renamed from: d */
    public int f162096d;

    /* renamed from: f */
    private int f162097f;

    static {
        C59978ib ibVar = new C59978ib();
        f162091e = ibVar;
        C62942bv.registerDefaultInstance(C59978ib.class, ibVar);
    }

    private C59978ib() {
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
                return newMessageInfo(f162091e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဌ\u0004", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d", C59862hz.f161781a});
            case 3:
                return new C59978ib();
            case 4:
                return new C59861hy();
            case 5:
                return f162091e;
            case 6:
                C63010eb ebVar = f162092g;
                if (ebVar == null) {
                    synchronized (C59978ib.class) {
                        ebVar = f162092g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162091e);
                            f162092g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
