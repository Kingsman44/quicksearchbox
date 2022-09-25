package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.dy */
/* compiled from: PG */
public final class C57454dy extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C57454dy f153470d;

    /* renamed from: g */
    private static volatile C63010eb f153471g;

    /* renamed from: a */
    public int f153472a;

    /* renamed from: b */
    public int f153473b;

    /* renamed from: c */
    public int f153474c;

    /* renamed from: e */
    private int f153475e;

    /* renamed from: f */
    private byte f153476f = 2;

    static {
        C57454dy dyVar = new C57454dy();
        f153470d = dyVar;
        C62942bv.registerDefaultInstance(C57454dy.class, dyVar);
    }

    private C57454dy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153476f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153476f = b;
                return null;
            case 2:
                return newMessageInfo(f153470d, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0000\u0000\u0005င\u0000\u0006ဆ\u0001\u0007င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C57454dy();
            case 4:
                return new C57453dx();
            case 5:
                return f153470d;
            case 6:
                C63010eb ebVar = f153471g;
                if (ebVar == null) {
                    synchronized (C57454dy.class) {
                        ebVar = f153471g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153470d);
                            f153471g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
