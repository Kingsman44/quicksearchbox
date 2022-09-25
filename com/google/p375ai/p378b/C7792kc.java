package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.kc */
/* compiled from: PG */
public final class C7792kc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7792kc f27255a;

    /* renamed from: c */
    private static volatile C63010eb f27256c;

    /* renamed from: b */
    private byte f27257b = 2;

    static {
        C7792kc kcVar = new C7792kc();
        f27255a = kcVar;
        C62942bv.registerDefaultInstance(C7792kc.class, kcVar);
    }

    private C7792kc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27257b);
            case 1:
                this.f27257b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f27255a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7792kc();
            case 4:
                return new C7791kb();
            case 5:
                return f27255a;
            case 6:
                C63010eb ebVar = f27256c;
                if (ebVar == null) {
                    synchronized (C7792kc.class) {
                        ebVar = f27256c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27255a);
                            f27256c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
