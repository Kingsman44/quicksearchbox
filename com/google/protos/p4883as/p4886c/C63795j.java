package com.google.protos.p4883as.p4886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8240t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.c.j */
/* compiled from: PG */
public final class C63795j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63795j f172557a;

    /* renamed from: e */
    private static volatile C63010eb f172558e;

    /* renamed from: b */
    private int f172559b;

    /* renamed from: c */
    private C8240t f172560c;

    /* renamed from: d */
    private byte f172561d = 2;

    static {
        C63795j jVar = new C63795j();
        f172557a = jVar;
        C62942bv.registerDefaultInstance(C63795j.class, jVar);
    }

    private C63795j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172561d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172561d = b;
                return null;
            case 2:
                return newMessageInfo(f172557a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63795j();
            case 4:
                return new C63794i();
            case 5:
                return f172557a;
            case 6:
                C63010eb ebVar = f172558e;
                if (ebVar == null) {
                    synchronized (C63795j.class) {
                        ebVar = f172558e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172557a);
                            f172558e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
