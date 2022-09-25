package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ih */
/* compiled from: PG */
public final class C50039ih extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50039ih f130090e;

    /* renamed from: f */
    private static volatile C63010eb f130091f;

    /* renamed from: a */
    public int f130092a;

    /* renamed from: b */
    public C50034ic f130093b;

    /* renamed from: c */
    public C50032ia f130094c;

    /* renamed from: d */
    public C50067ji f130095d;

    static {
        C50039ih ihVar = new C50039ih();
        f130090e = ihVar;
        C62942bv.registerDefaultInstance(C50039ih.class, ihVar);
    }

    private C50039ih() {
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
                return newMessageInfo(f130090e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50039ih();
            case 4:
                return new C50038ig();
            case 5:
                return f130090e;
            case 6:
                C63010eb ebVar = f130091f;
                if (ebVar == null) {
                    synchronized (C50039ih.class) {
                        ebVar = f130091f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130090e);
                            f130091f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
