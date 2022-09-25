package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fr */
/* compiled from: PG */
public final class C62549fr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62549fr f168868a;

    /* renamed from: c */
    private static volatile C63010eb f168869c;

    /* renamed from: b */
    private byte f168870b = 2;

    static {
        C62549fr frVar = new C62549fr();
        f168868a = frVar;
        C62942bv.registerDefaultInstance(C62549fr.class, frVar);
    }

    private C62549fr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168870b);
            case 1:
                this.f168870b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f168868a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62549fr();
            case 4:
                return new C62548fq();
            case 5:
                return f168868a;
            case 6:
                C63010eb ebVar = f168869c;
                if (ebVar == null) {
                    synchronized (C62549fr.class) {
                        ebVar = f168869c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168868a);
                            f168869c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
