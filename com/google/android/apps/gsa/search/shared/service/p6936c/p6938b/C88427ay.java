package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.ay */
/* compiled from: PG */
public final class C88427ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88427ay f239076c;

    /* renamed from: d */
    private static volatile C63010eb f239077d;

    /* renamed from: a */
    public int f239078a;

    /* renamed from: b */
    public long f239079b;

    static {
        C88427ay ayVar = new C88427ay();
        f239076c = ayVar;
        C62942bv.registerDefaultInstance(C88427ay.class, ayVar);
    }

    private C88427ay() {
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
                return newMessageInfo(f239076c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88427ay();
            case 4:
                return new C88426ax();
            case 5:
                return f239076c;
            case 6:
                C63010eb ebVar = f239077d;
                if (ebVar == null) {
                    synchronized (C88427ay.class) {
                        ebVar = f239077d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239076c);
                            f239077d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
