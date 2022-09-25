package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64602g;

/* renamed from: com.google.android.libraries.lens.ondevice.n.ae */
/* compiled from: PG */
public final class C24772ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24772ae f67686d;

    /* renamed from: g */
    private static volatile C63010eb f67687g;

    /* renamed from: a */
    public int f67688a;

    /* renamed from: b */
    public C24791b f67689b;

    /* renamed from: c */
    public C64602g f67690c;

    /* renamed from: e */
    private C55731t f67691e;

    /* renamed from: f */
    private byte f67692f = 2;

    static {
        C24772ae aeVar = new C24772ae();
        f67686d = aeVar;
        C62942bv.registerDefaultInstance(C24772ae.class, aeVar);
    }

    private C24772ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f67692f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f67692f = b;
                return null;
            case 2:
                return newMessageInfo(f67686d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0003", new Object[]{"a", "b", "e", C45240c.f118157a});
            case 3:
                return new C24772ae();
            case 4:
                return new C24771ad();
            case 5:
                return f67686d;
            case 6:
                C63010eb ebVar = f67687g;
                if (ebVar == null) {
                    synchronized (C24772ae.class) {
                        ebVar = f67687g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67686d);
                            f67687g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
