package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.an */
/* compiled from: PG */
public final class C64912an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64912an f175824a;

    /* renamed from: c */
    private static volatile C63010eb f175825c;

    /* renamed from: b */
    private byte f175826b = 2;

    static {
        C64912an anVar = new C64912an();
        f175824a = anVar;
        C62942bv.registerDefaultInstance(C64912an.class, anVar);
    }

    private C64912an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175826b);
            case 1:
                this.f175826b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f175824a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64912an();
            case 4:
                return new C64911am();
            case 5:
                return f175824a;
            case 6:
                C63010eb ebVar = f175825c;
                if (ebVar == null) {
                    synchronized (C64912an.class) {
                        ebVar = f175825c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175824a);
                            f175825c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
