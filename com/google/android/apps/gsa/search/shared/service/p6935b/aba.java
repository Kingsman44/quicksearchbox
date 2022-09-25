package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aba */
/* compiled from: PG */
public final class aba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aba f237126d;

    /* renamed from: e */
    private static volatile C63010eb f237127e;

    /* renamed from: a */
    public int f237128a;

    /* renamed from: b */
    public boolean f237129b;

    /* renamed from: c */
    public long f237130c;

    static {
        aba aba = new aba();
        f237126d = aba;
        C62942bv.registerDefaultInstance(aba.class, aba);
    }

    private aba() {
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
                return newMessageInfo(f237126d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aba();
            case 4:
                return new aaz();
            case 5:
                return f237126d;
            case 6:
                C63010eb ebVar = f237127e;
                if (ebVar == null) {
                    synchronized (aba.class) {
                        ebVar = f237127e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237126d);
                            f237127e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
