package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.ck */
/* compiled from: PG */
public final class C48104ck extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48104ck f124503c;

    /* renamed from: d */
    private static volatile C63010eb f124504d;

    /* renamed from: a */
    public int f124505a;

    /* renamed from: b */
    public boolean f124506b;

    static {
        C48104ck ckVar = new C48104ck();
        f124503c = ckVar;
        C62942bv.registerDefaultInstance(C48104ck.class, ckVar);
    }

    private C48104ck() {
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
                return newMessageInfo(f124503c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C48104ck();
            case 4:
                return new C48103cj();
            case 5:
                return f124503c;
            case 6:
                C63010eb ebVar = f124504d;
                if (ebVar == null) {
                    synchronized (C48104ck.class) {
                        ebVar = f124504d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124503c);
                            f124504d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
