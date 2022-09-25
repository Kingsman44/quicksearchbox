package com.google.protos.p4850an.p4855d.p4863h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.h.d */
/* compiled from: PG */
public final class C63570d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63570d f171948a;

    /* renamed from: d */
    private static volatile C63010eb f171949d;

    /* renamed from: b */
    private C63576j f171950b;

    /* renamed from: c */
    private byte f171951c = 2;

    static {
        C63570d dVar = new C63570d();
        f171948a = dVar;
        C62942bv.registerDefaultInstance(C63570d.class, dVar);
    }

    private C63570d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171951c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f171951c = b;
                return null;
            case 2:
                return newMessageInfo(f171948a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0001\u0005Љ", new Object[]{"b"});
            case 3:
                return new C63570d();
            case 4:
                return new C63569c();
            case 5:
                return f171948a;
            case 6:
                C63010eb ebVar = f171949d;
                if (ebVar == null) {
                    synchronized (C63570d.class) {
                        ebVar = f171949d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171948a);
                            f171949d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
