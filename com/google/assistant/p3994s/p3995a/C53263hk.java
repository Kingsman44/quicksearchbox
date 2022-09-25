package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.hk */
/* compiled from: PG */
public final class C53263hk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53263hk f139627c;

    /* renamed from: d */
    private static volatile C63010eb f139628d;

    /* renamed from: a */
    public int f139629a;

    /* renamed from: b */
    public C53245gt f139630b;

    static {
        C53263hk hkVar = new C53263hk();
        f139627c = hkVar;
        C62942bv.registerDefaultInstance(C53263hk.class, hkVar);
    }

    private C53263hk() {
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
                return newMessageInfo(f139627c, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53263hk();
            case 4:
                return new C53262hj();
            case 5:
                return f139627c;
            case 6:
                C63010eb ebVar = f139628d;
                if (ebVar == null) {
                    synchronized (C53263hk.class) {
                        ebVar = f139628d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139627c);
                            f139628d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
