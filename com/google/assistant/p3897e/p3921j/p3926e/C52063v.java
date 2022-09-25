package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.v */
/* compiled from: PG */
public final class C52063v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52063v f136628a;

    /* renamed from: e */
    private static volatile C63010eb f136629e;

    /* renamed from: b */
    private int f136630b;

    /* renamed from: c */
    private C51016dg f136631c;

    /* renamed from: d */
    private byte f136632d = 2;

    static {
        C52063v vVar = new C52063v();
        f136628a = vVar;
        C62942bv.registerDefaultInstance(C52063v.class, vVar);
    }

    private C52063v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136632d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136632d = b;
                return null;
            case 2:
                return newMessageInfo(f136628a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52063v();
            case 4:
                return new C52062u();
            case 5:
                return f136628a;
            case 6:
                C63010eb ebVar = f136629e;
                if (ebVar == null) {
                    synchronized (C52063v.class) {
                        ebVar = f136629e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136628a);
                            f136629e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
