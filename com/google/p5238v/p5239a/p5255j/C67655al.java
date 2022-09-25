package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.al */
/* compiled from: PG */
public final class C67655al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67655al f183612b;

    /* renamed from: c */
    private static volatile C63010eb f183613c;

    /* renamed from: a */
    public int f183614a;

    static {
        C67655al alVar = new C67655al();
        f183612b = alVar;
        C62942bv.registerDefaultInstance(C67655al.class, alVar);
    }

    private C67655al() {
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
                return newMessageInfo(f183612b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"a"});
            case 3:
                return new C67655al();
            case 4:
                return new C67654ak();
            case 5:
                return f183612b;
            case 6:
                C63010eb ebVar = f183613c;
                if (ebVar == null) {
                    synchronized (C67655al.class) {
                        ebVar = f183613c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183612b);
                            f183613c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
