package com.google.android.apps.auto.p450a.p451a;

import com.google.common.p4552o.p4556c.C59674a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.bj */
/* compiled from: PG */
public final class C8892bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8892bj f30853c;

    /* renamed from: e */
    private static volatile C63010eb f30854e;

    /* renamed from: a */
    public int f30855a;

    /* renamed from: b */
    public long f30856b;

    /* renamed from: d */
    private int f30857d;

    static {
        C8892bj bjVar = new C8892bj();
        f30853c = bjVar;
        C62942bv.registerDefaultInstance(C8892bj.class, bjVar);
    }

    private C8892bj() {
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
                return newMessageInfo(f30853c, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဂ\u0001", new Object[]{"d", "a", C59674a.f160006a, "b"});
            case 3:
                return new C8892bj();
            case 4:
                return new C8891bi();
            case 5:
                return f30853c;
            case 6:
                C63010eb ebVar = f30854e;
                if (ebVar == null) {
                    synchronized (C8892bj.class) {
                        ebVar = f30854e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30853c);
                            f30854e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
