package com.google.common.p4552o;

import com.google.lens.p4698d.C62164c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aae */
/* compiled from: PG */
public final class aae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aae f158088c;

    /* renamed from: d */
    private static volatile C63010eb f158089d;

    /* renamed from: a */
    public int f158090a;

    /* renamed from: b */
    public int f158091b;

    static {
        aae aae = new aae();
        f158088c = aae;
        C62942bv.registerDefaultInstance(aae.class, aae);
    }

    private aae() {
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
                return newMessageInfo(f158088c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C62164c.f167823a});
            case 3:
                return new aae();
            case 4:
                return new aad();
            case 5:
                return f158088c;
            case 6:
                C63010eb ebVar = f158089d;
                if (ebVar == null) {
                    synchronized (aae.class) {
                        ebVar = f158089d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158088c);
                            f158089d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
