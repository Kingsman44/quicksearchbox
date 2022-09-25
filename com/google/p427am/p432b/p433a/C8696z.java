package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.z */
/* compiled from: PG */
public final class C8696z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8696z f30032b;

    /* renamed from: c */
    private static volatile C63010eb f30033c;

    /* renamed from: a */
    public int f30034a;

    static {
        C8696z zVar = new C8696z();
        f30032b = zVar;
        C62942bv.registerDefaultInstance(C8696z.class, zVar);
    }

    private C8696z() {
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
                return newMessageInfo(f30032b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C8696z();
            case 4:
                return new C8694x();
            case 5:
                return f30032b;
            case 6:
                C63010eb ebVar = f30033c;
                if (ebVar == null) {
                    synchronized (C8696z.class) {
                        ebVar = f30033c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30032b);
                            f30033c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
