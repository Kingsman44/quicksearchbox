package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aaa */
/* compiled from: PG */
public final class aaa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aaa f237052e;

    /* renamed from: f */
    private static volatile C63010eb f237053f;

    /* renamed from: a */
    public int f237054a;

    /* renamed from: b */
    public boolean f237055b;

    /* renamed from: c */
    public long f237056c;

    /* renamed from: d */
    public boolean f237057d;

    static {
        aaa aaa = new aaa();
        f237052e = aaa;
        C62942bv.registerDefaultInstance(aaa.class, aaa);
    }

    private aaa() {
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
                return newMessageInfo(f237052e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new aaa();
            case 4:
                return new C88392zz();
            case 5:
                return f237052e;
            case 6:
                C63010eb ebVar = f237053f;
                if (ebVar == null) {
                    synchronized (aaa.class) {
                        ebVar = f237053f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237052e);
                            f237053f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
