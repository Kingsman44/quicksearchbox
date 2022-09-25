package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ze */
/* compiled from: PG */
public final class C88371ze extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88371ze f238971e;

    /* renamed from: f */
    private static volatile C63010eb f238972f;

    /* renamed from: a */
    public int f238973a;

    /* renamed from: b */
    public boolean f238974b;

    /* renamed from: c */
    public boolean f238975c = true;

    /* renamed from: d */
    public boolean f238976d;

    static {
        C88371ze zeVar = new C88371ze();
        f238971e = zeVar;
        C62942bv.registerDefaultInstance(C88371ze.class, zeVar);
    }

    private C88371ze() {
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
                return newMessageInfo(f238971e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88371ze();
            case 4:
                return new C88370zd();
            case 5:
                return f238971e;
            case 6:
                C63010eb ebVar = f238972f;
                if (ebVar == null) {
                    synchronized (C88371ze.class) {
                        ebVar = f238972f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238971e);
                            f238972f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
