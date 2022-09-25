package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.lens.p4707j.C62454cd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.aw */
/* compiled from: PG */
public final class C53988aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53988aw f141646b;

    /* renamed from: c */
    private static volatile C63010eb f141647c;

    /* renamed from: a */
    public C62454cd f141648a;

    static {
        C53988aw awVar = new C53988aw();
        f141646b = awVar;
        C62942bv.registerDefaultInstance(C53988aw.class, awVar);
    }

    private C53988aw() {
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
                return newMessageInfo(f141646b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C53988aw();
            case 4:
                return new C53987av();
            case 5:
                return f141646b;
            case 6:
                C63010eb ebVar = f141647c;
                if (ebVar == null) {
                    synchronized (C53988aw.class) {
                        ebVar = f141647c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141646b);
                            f141647c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
