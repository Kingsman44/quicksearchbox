package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.j.a.ef */
/* compiled from: PG */
public final class C54434ef extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54434ef f142949c;

    /* renamed from: d */
    private static volatile C63010eb f142950d;

    /* renamed from: a */
    public boolean f142951a;

    /* renamed from: b */
    public C63042fg f142952b;

    static {
        C54434ef efVar = new C54434ef();
        f142949c = efVar;
        C62942bv.registerDefaultInstance(C54434ef.class, efVar);
    }

    private C54434ef() {
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
                return newMessageInfo(f142949c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003\t", new Object[]{"a", "b"});
            case 3:
                return new C54434ef();
            case 4:
                return new C54433ee();
            case 5:
                return f142949c;
            case 6:
                C63010eb ebVar = f142950d;
                if (ebVar == null) {
                    synchronized (C54434ef.class) {
                        ebVar = f142950d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142949c);
                            f142950d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
