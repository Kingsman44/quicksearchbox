package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.o */
/* compiled from: PG */
public final class C17913o extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C17913o f51320c;

    /* renamed from: e */
    private static volatile C63010eb f51321e;

    /* renamed from: a */
    public int f51322a;

    /* renamed from: b */
    public int f51323b;

    /* renamed from: d */
    private byte f51324d = 2;

    static {
        C17913o oVar = new C17913o();
        f51320c = oVar;
        C62942bv.registerDefaultInstance(C17913o.class, oVar);
    }

    private C17913o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f51324d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f51324d = b;
                return null;
            case 2:
                return newMessageInfo(f51320c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C17911m.f51319a});
            case 3:
                return new C17913o();
            case 4:
                return new C17910l();
            case 5:
                return f51320c;
            case 6:
                C63010eb ebVar = f51321e;
                if (ebVar == null) {
                    synchronized (C17913o.class) {
                        ebVar = f51321e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51320c);
                            f51321e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
