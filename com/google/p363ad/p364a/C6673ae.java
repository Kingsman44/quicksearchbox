package com.google.p363ad.p364a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66402e;

/* renamed from: com.google.ad.a.ae */
/* compiled from: PG */
public final class C6673ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C6673ae f19929a;

    /* renamed from: e */
    private static volatile C63010eb f19930e;

    /* renamed from: b */
    private int f19931b;

    /* renamed from: c */
    private C66402e f19932c;

    /* renamed from: d */
    private byte f19933d = 2;

    static {
        C6673ae aeVar = new C6673ae();
        f19929a = aeVar;
        C62942bv.registerDefaultInstance(C6673ae.class, aeVar);
    }

    private C6673ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f19933d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f19933d = b;
                return null;
            case 2:
                return newMessageInfo(f19929a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C6673ae();
            case 4:
                return new C6672ad();
            case 5:
                return f19929a;
            case 6:
                C63010eb ebVar = f19930e;
                if (ebVar == null) {
                    synchronized (C6673ae.class) {
                        ebVar = f19930e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19929a);
                            f19930e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
