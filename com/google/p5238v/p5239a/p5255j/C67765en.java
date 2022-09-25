package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.en */
/* compiled from: PG */
public final class C67765en extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67765en f183853a;

    /* renamed from: b */
    private static volatile C63010eb f183854b;

    static {
        C67765en enVar = new C67765en();
        f183853a = enVar;
        C62942bv.registerDefaultInstance(C67765en.class, enVar);
    }

    private C67765en() {
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
                return newMessageInfo(f183853a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C67765en();
            case 4:
                return new C67764em();
            case 5:
                return f183853a;
            case 6:
                C63010eb ebVar = f183854b;
                if (ebVar == null) {
                    synchronized (C67765en.class) {
                        ebVar = f183854b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183853a);
                            f183854b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
