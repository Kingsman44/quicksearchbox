package com.google.common.p4552o.p4570p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.ah */
/* compiled from: PG */
public final class C60352ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60352ah f163349d;

    /* renamed from: e */
    private static volatile C63010eb f163350e;

    /* renamed from: a */
    public int f163351a;

    /* renamed from: b */
    public int f163352b;

    /* renamed from: c */
    public long f163353c;

    static {
        C60352ah ahVar = new C60352ah();
        f163349d = ahVar;
        C62942bv.registerDefaultInstance(C60352ah.class, ahVar);
    }

    private C60352ah() {
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
                return newMessageInfo(f163349d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60352ah();
            case 4:
                return new C60351ag();
            case 5:
                return f163349d;
            case 6:
                C63010eb ebVar = f163350e;
                if (ebVar == null) {
                    synchronized (C60352ah.class) {
                        ebVar = f163350e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163349d);
                            f163350e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
