package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.aj.a.a.a.n */
/* compiled from: PG */
public final class C8234n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8234n f28902a;

    /* renamed from: g */
    private static volatile C63010eb f28903g;

    /* renamed from: b */
    private int f28904b;

    /* renamed from: c */
    private int f28905c;

    /* renamed from: d */
    private int f28906d;

    /* renamed from: e */
    private C63771b f28907e;

    /* renamed from: f */
    private byte f28908f = 2;

    static {
        C8234n nVar = new C8234n();
        f28902a = nVar;
        C62942bv.registerDefaultInstance(C8234n.class, nVar);
    }

    private C8234n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28908f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28908f = b;
                return null;
            case 2:
                return newMessageInfo(f28902a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0006ᐉ\u0005", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8234n();
            case 4:
                return new C8233m();
            case 5:
                return f28902a;
            case 6:
                C63010eb ebVar = f28903g;
                if (ebVar == null) {
                    synchronized (C8234n.class) {
                        ebVar = f28903g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28902a);
                            f28903g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
