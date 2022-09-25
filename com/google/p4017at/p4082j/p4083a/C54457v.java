package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.v */
/* compiled from: PG */
public final class C54457v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54457v f142992c;

    /* renamed from: d */
    private static volatile C63010eb f142993d;

    /* renamed from: a */
    public C54455t f142994a;

    /* renamed from: b */
    public int f142995b;

    static {
        C54457v vVar = new C54457v();
        f142992c = vVar;
        C62942bv.registerDefaultInstance(C54457v.class, vVar);
    }

    private C54457v() {
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
                return newMessageInfo(f142992c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C54457v();
            case 4:
                return new C54456u();
            case 5:
                return f142992c;
            case 6:
                C63010eb ebVar = f142993d;
                if (ebVar == null) {
                    synchronized (C54457v.class) {
                        ebVar = f142993d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142992c);
                            f142993d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
