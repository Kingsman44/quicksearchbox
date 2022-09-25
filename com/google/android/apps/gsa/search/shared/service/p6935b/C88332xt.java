package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60456qs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xt */
/* compiled from: PG */
public final class C88332xt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88332xt f238881e;

    /* renamed from: g */
    private static volatile C63010eb f238882g;

    /* renamed from: a */
    public int f238883a;

    /* renamed from: b */
    public String f238884b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C60456qs f238885c;

    /* renamed from: d */
    public C60321oe f238886d;

    /* renamed from: f */
    private byte f238887f = 2;

    static {
        C88332xt xtVar = new C88332xt();
        f238881e = xtVar;
        C62942bv.registerDefaultInstance(C88332xt.class, xtVar);
    }

    private C88332xt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238887f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238887f = b;
                return null;
            case 2:
                return newMessageInfo(f238881e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0002\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88332xt();
            case 4:
                return new C88331xs();
            case 5:
                return f238881e;
            case 6:
                C63010eb ebVar = f238882g;
                if (ebVar == null) {
                    synchronized (C88332xt.class) {
                        ebVar = f238882g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238881e);
                            f238882g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
