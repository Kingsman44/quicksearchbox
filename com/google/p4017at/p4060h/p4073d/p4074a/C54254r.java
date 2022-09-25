package com.google.p4017at.p4060h.p4073d.p4074a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.r */
/* compiled from: PG */
public final class C54254r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54254r f142454c;

    /* renamed from: d */
    private static volatile C63010eb f142455d;

    /* renamed from: a */
    public int f142456a;

    /* renamed from: b */
    public int f142457b;

    static {
        C54254r rVar = new C54254r();
        f142454c = rVar;
        C62942bv.registerDefaultInstance(C54254r.class, rVar);
    }

    private C54254r() {
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
                return newMessageInfo(f142454c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0002", new Object[]{"a", "b"});
            case 3:
                return new C54254r();
            case 4:
                return new C54253q();
            case 5:
                return f142454c;
            case 6:
                C63010eb ebVar = f142455d;
                if (ebVar == null) {
                    synchronized (C54254r.class) {
                        ebVar = f142455d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142454c);
                            f142455d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
