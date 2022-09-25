package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.uo */
/* compiled from: PG */
public final class C88246uo extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C88246uo f238696c;

    /* renamed from: e */
    private static volatile C63010eb f238697e;

    /* renamed from: a */
    public int f238698a;

    /* renamed from: b */
    public int f238699b = 1;

    /* renamed from: d */
    private byte f238700d = 2;

    static {
        C88246uo uoVar = new C88246uo();
        f238696c = uoVar;
        C62942bv.registerDefaultInstance(C88246uo.class, uoVar);
    }

    private C88246uo() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238700d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238700d = b;
                return null;
            case 2:
                return newMessageInfo(f238696c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88244um.m142795b()});
            case 3:
                return new C88246uo();
            case 4:
                return new C88245un();
            case 5:
                return f238696c;
            case 6:
                C63010eb ebVar = f238697e;
                if (ebVar == null) {
                    synchronized (C88246uo.class) {
                        ebVar = f238697e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238696c);
                            f238697e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
