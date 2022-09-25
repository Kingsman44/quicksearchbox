package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.p */
/* compiled from: PG */
public final class C50913p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50913p f132554c;

    /* renamed from: d */
    private static volatile C63010eb f132555d;

    /* renamed from: a */
    public int f132556a = 0;

    /* renamed from: b */
    public Object f132557b;

    static {
        C50913p pVar = new C50913p();
        f132554c = pVar;
        C62942bv.registerDefaultInstance(C50913p.class, pVar);
    }

    private C50913p() {
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
                return newMessageInfo(f132554c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C50907j.class});
            case 3:
                return new C50913p();
            case 4:
                return new C50912o();
            case 5:
                return f132554c;
            case 6:
                C63010eb ebVar = f132555d;
                if (ebVar == null) {
                    synchronized (C50913p.class) {
                        ebVar = f132555d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132554c);
                            f132555d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
