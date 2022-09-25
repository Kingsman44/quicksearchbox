package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.c.bb */
/* compiled from: PG */
public final class C63521bb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63521bb f171812a;

    /* renamed from: e */
    private static volatile C63010eb f171813e;

    /* renamed from: b */
    private int f171814b;

    /* renamed from: c */
    private C63389bg f171815c;

    /* renamed from: d */
    private byte f171816d = 2;

    static {
        C63521bb bbVar = new C63521bb();
        f171812a = bbVar;
        C62942bv.registerDefaultInstance(C63521bb.class, bbVar);
    }

    private C63521bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171816d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171816d = b;
                return null;
            case 2:
                return newMessageInfo(f171812a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63521bb();
            case 4:
                return new C63520ba();
            case 5:
                return f171812a;
            case 6:
                C63010eb ebVar = f171813e;
                if (ebVar == null) {
                    synchronized (C63521bb.class) {
                        ebVar = f171813e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171812a);
                            f171813e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
