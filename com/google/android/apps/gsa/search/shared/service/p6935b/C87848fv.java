package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fv */
/* compiled from: PG */
public final class C87848fv extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C87848fv f237681d;

    /* renamed from: f */
    private static volatile C63010eb f237682f;

    /* renamed from: a */
    public int f237683a;

    /* renamed from: b */
    public int f237684b;

    /* renamed from: c */
    public int f237685c;

    /* renamed from: e */
    private byte f237686e = 2;

    static {
        C87848fv fvVar = new C87848fv();
        f237681d = fvVar;
        C62942bv.registerDefaultInstance(C87848fv.class, fvVar);
    }

    private C87848fv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237686e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237686e = b;
                return null;
            case 2:
                return newMessageInfo(f237681d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87848fv();
            case 4:
                return new C87847fu();
            case 5:
                return f237681d;
            case 6:
                C63010eb ebVar = f237682f;
                if (ebVar == null) {
                    synchronized (C87848fv.class) {
                        ebVar = f237682f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237681d);
                            f237682f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
