package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.ap */
/* compiled from: PG */
public final class C67659ap extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67659ap f183619b;

    /* renamed from: c */
    private static volatile C63010eb f183620c;

    /* renamed from: a */
    public int f183621a;

    static {
        C67659ap apVar = new C67659ap();
        f183619b = apVar;
        C62942bv.registerDefaultInstance(C67659ap.class, apVar);
    }

    private C67659ap() {
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
                return newMessageInfo(f183619b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"a"});
            case 3:
                return new C67659ap();
            case 4:
                return new C67658ao();
            case 5:
                return f183619b;
            case 6:
                C63010eb ebVar = f183620c;
                if (ebVar == null) {
                    synchronized (C67659ap.class) {
                        ebVar = f183620c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183619b);
                            f183620c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
