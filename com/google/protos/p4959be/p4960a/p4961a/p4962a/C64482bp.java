package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bp */
/* compiled from: PG */
public final class C64482bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64482bp f174899c;

    /* renamed from: d */
    private static volatile C63010eb f174900d;

    /* renamed from: a */
    public boolean f174901a;

    /* renamed from: b */
    public boolean f174902b;

    static {
        C64482bp bpVar = new C64482bp();
        f174899c = bpVar;
        C62942bv.registerDefaultInstance(C64482bp.class, bpVar);
    }

    private C64482bp() {
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
                return newMessageInfo(f174899c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C64482bp();
            case 4:
                return new C64481bo();
            case 5:
                return f174899c;
            case 6:
                C63010eb ebVar = f174900d;
                if (ebVar == null) {
                    synchronized (C64482bp.class) {
                        ebVar = f174900d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174899c);
                            f174900d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
