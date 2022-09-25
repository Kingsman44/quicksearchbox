package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.dr */
/* compiled from: PG */
public final class C54419dr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54419dr f142917c;

    /* renamed from: d */
    private static volatile C63010eb f142918d;

    /* renamed from: a */
    public long f142919a;

    /* renamed from: b */
    public C54364bq f142920b;

    static {
        C54419dr drVar = new C54419dr();
        f142917c = drVar;
        C62942bv.registerDefaultInstance(C54419dr.class, drVar);
    }

    private C54419dr() {
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
                return newMessageInfo(f142917c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54419dr();
            case 4:
                return new C54418dq();
            case 5:
                return f142917c;
            case 6:
                C63010eb ebVar = f142918d;
                if (ebVar == null) {
                    synchronized (C54419dr.class) {
                        ebVar = f142918d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142917c);
                            f142918d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
