package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.bd */
/* compiled from: PG */
public final class C88433bd extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C88433bd f239087e;

    /* renamed from: g */
    private static volatile C63010eb f239088g;

    /* renamed from: a */
    public int f239089a;

    /* renamed from: b */
    public long f239090b;

    /* renamed from: c */
    public int f239091c;

    /* renamed from: d */
    public String f239092d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f239093f = 2;

    static {
        C88433bd bdVar = new C88433bd();
        f239087e = bdVar;
        C62942bv.registerDefaultInstance(C88433bd.class, bdVar);
    }

    private C88433bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f239093f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f239093f = b;
                return null;
            case 2:
                return newMessageInfo(f239087e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဎ\u0000\u0002ဍ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88433bd();
            case 4:
                return new C88432bc();
            case 5:
                return f239087e;
            case 6:
                C63010eb ebVar = f239088g;
                if (ebVar == null) {
                    synchronized (C88433bd.class) {
                        ebVar = f239088g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239087e);
                            f239088g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
