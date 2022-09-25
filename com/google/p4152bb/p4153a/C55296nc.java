package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.nc */
/* compiled from: PG */
public final class C55296nc extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C55296nc f145663e;

    /* renamed from: g */
    private static volatile C63010eb f145664g;

    /* renamed from: a */
    public int f145665a;

    /* renamed from: b */
    public C55401r f145666b;

    /* renamed from: c */
    public int f145667c;

    /* renamed from: d */
    public String f145668d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f145669f = 2;

    static {
        C55296nc ncVar = new C55296nc();
        f145663e = ncVar;
        C62942bv.registerDefaultInstance(C55296nc.class, ncVar);
    }

    private C55296nc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145669f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145669f = b;
                return null;
            case 2:
                return newMessageInfo(f145663e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C55416s.f146029a, "d"});
            case 3:
                return new C55296nc();
            case 4:
                return new C55295nb();
            case 5:
                return f145663e;
            case 6:
                C63010eb ebVar = f145664g;
                if (ebVar == null) {
                    synchronized (C55296nc.class) {
                        ebVar = f145664g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145663e);
                            f145664g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
