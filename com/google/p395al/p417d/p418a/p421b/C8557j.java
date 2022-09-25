package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.j */
/* compiled from: PG */
public final class C8557j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8557j f29654a;

    /* renamed from: b */
    private static volatile C63010eb f29655b;

    static {
        C8557j jVar = new C8557j();
        f29654a = jVar;
        C62942bv.registerDefaultInstance(C8557j.class, jVar);
    }

    private C8557j() {
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
                return newMessageInfo(f29654a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8557j();
            case 4:
                return new C8556i();
            case 5:
                return f29654a;
            case 6:
                C63010eb ebVar = f29655b;
                if (ebVar == null) {
                    synchronized (C8557j.class) {
                        ebVar = f29655b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29654a);
                            f29655b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
