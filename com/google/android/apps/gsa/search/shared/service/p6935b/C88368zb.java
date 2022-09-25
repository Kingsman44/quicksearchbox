package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.zb */
/* compiled from: PG */
public final class C88368zb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88368zb f238965d;

    /* renamed from: e */
    private static volatile C63010eb f238966e;

    /* renamed from: a */
    public int f238967a;

    /* renamed from: b */
    public String f238968b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f238969c;

    static {
        C88368zb zbVar = new C88368zb();
        f238965d = zbVar;
        C62942bv.registerDefaultInstance(C88368zb.class, zbVar);
    }

    private C88368zb() {
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
                return newMessageInfo(f238965d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88368zb();
            case 4:
                return new C88367za();
            case 5:
                return f238965d;
            case 6:
                C63010eb ebVar = f238966e;
                if (ebVar == null) {
                    synchronized (C88368zb.class) {
                        ebVar = f238966e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238965d);
                            f238966e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
