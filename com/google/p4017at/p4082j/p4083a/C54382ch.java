package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.ch */
/* compiled from: PG */
public final class C54382ch extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54382ch f142843c;

    /* renamed from: d */
    private static volatile C63010eb f142844d;

    /* renamed from: a */
    public long f142845a;

    /* renamed from: b */
    public C54364bq f142846b;

    static {
        C54382ch chVar = new C54382ch();
        f142843c = chVar;
        C62942bv.registerDefaultInstance(C54382ch.class, chVar);
    }

    private C54382ch() {
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
                return newMessageInfo(f142843c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0002\u0003\t", new Object[]{"a", "b"});
            case 3:
                return new C54382ch();
            case 4:
                return new C54381cg();
            case 5:
                return f142843c;
            case 6:
                C63010eb ebVar = f142844d;
                if (ebVar == null) {
                    synchronized (C54382ch.class) {
                        ebVar = f142844d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142843c);
                            f142844d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
