package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ak */
/* compiled from: PG */
public final class C64450ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64450ak f174831c;

    /* renamed from: d */
    private static volatile C63010eb f174832d;

    /* renamed from: a */
    public C64486bt f174833a;

    /* renamed from: b */
    public C64503cj f174834b;

    static {
        C64450ak akVar = new C64450ak();
        f174831c = akVar;
        C62942bv.registerDefaultInstance(C64450ak.class, akVar);
    }

    private C64450ak() {
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
                return newMessageInfo(f174831c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C64450ak();
            case 4:
                return new C64449aj();
            case 5:
                return f174831c;
            case 6:
                C63010eb ebVar = f174832d;
                if (ebVar == null) {
                    synchronized (C64450ak.class) {
                        ebVar = f174832d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174831c);
                            f174832d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
