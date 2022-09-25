package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.o */
/* compiled from: PG */
public final class C54063o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54063o f141845d;

    /* renamed from: e */
    private static volatile C63010eb f141846e;

    /* renamed from: a */
    public int f141847a;

    /* renamed from: b */
    public int f141848b;

    /* renamed from: c */
    public int f141849c;

    static {
        C54063o oVar = new C54063o();
        f141845d = oVar;
        C62942bv.registerDefaultInstance(C54063o.class, oVar);
    }

    private C54063o() {
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
                return newMessageInfo(f141845d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54063o();
            case 4:
                return new C54062n();
            case 5:
                return f141845d;
            case 6:
                C63010eb ebVar = f141846e;
                if (ebVar == null) {
                    synchronized (C54063o.class) {
                        ebVar = f141846e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141845d);
                            f141846e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
