package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.am */
/* compiled from: PG */
public final class C56502am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56502am f150910b;

    /* renamed from: c */
    private static volatile C63010eb f150911c;

    /* renamed from: a */
    public boolean f150912a;

    static {
        C56502am amVar = new C56502am();
        f150910b = amVar;
        C62942bv.registerDefaultInstance(C56502am.class, amVar);
    }

    private C56502am() {
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
                return newMessageInfo(f150910b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C56502am();
            case 4:
                return new C56501al();
            case 5:
                return f150910b;
            case 6:
                C63010eb ebVar = f150911c;
                if (ebVar == null) {
                    synchronized (C56502am.class) {
                        ebVar = f150911c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150910b);
                            f150911c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
