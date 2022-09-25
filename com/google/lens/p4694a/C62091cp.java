package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cp */
/* compiled from: PG */
public final class C62091cp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62091cp f167696a;

    /* renamed from: c */
    private static volatile C63010eb f167697c;

    /* renamed from: b */
    private byte f167698b = 2;

    static {
        C62091cp cpVar = new C62091cp();
        f167696a = cpVar;
        C62942bv.registerDefaultInstance(C62091cp.class, cpVar);
    }

    private C62091cp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167698b);
            case 1:
                this.f167698b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167696a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62091cp();
            case 4:
                return new C62090co();
            case 5:
                return f167696a;
            case 6:
                C63010eb ebVar = f167697c;
                if (ebVar == null) {
                    synchronized (C62091cp.class) {
                        ebVar = f167697c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167696a);
                            f167697c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
