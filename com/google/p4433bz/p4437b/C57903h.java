package com.google.p4433bz.p4437b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.b.h */
/* compiled from: PG */
public final class C57903h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57903h f154879c;

    /* renamed from: d */
    private static volatile C63010eb f154880d;

    /* renamed from: a */
    public int f154881a = 0;

    /* renamed from: b */
    public Object f154882b;

    static {
        C57903h hVar = new C57903h();
        f154879c = hVar;
        C62942bv.registerDefaultInstance(C57903h.class, hVar);
    }

    private C57903h() {
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
                return newMessageInfo(f154879c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C57903h();
            case 4:
                return new C57902g();
            case 5:
                return f154879c;
            case 6:
                C63010eb ebVar = f154880d;
                if (ebVar == null) {
                    synchronized (C57903h.class) {
                        ebVar = f154880d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154879c);
                            f154880d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
