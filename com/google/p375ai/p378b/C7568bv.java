package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bv */
/* compiled from: PG */
public final class C7568bv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7568bv f26169a;

    /* renamed from: c */
    private static volatile C63010eb f26170c;

    /* renamed from: b */
    private byte f26171b = 2;

    static {
        C7568bv bvVar = new C7568bv();
        f26169a = bvVar;
        C62942bv.registerDefaultInstance(C7568bv.class, bvVar);
    }

    private C7568bv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26171b);
            case 1:
                this.f26171b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f26169a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7568bv();
            case 4:
                return new C7567bu();
            case 5:
                return f26169a;
            case 6:
                C63010eb ebVar = f26170c;
                if (ebVar == null) {
                    synchronized (C7568bv.class) {
                        ebVar = f26170c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26169a);
                            f26170c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
