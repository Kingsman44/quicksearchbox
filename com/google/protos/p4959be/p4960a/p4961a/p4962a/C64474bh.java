package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bh */
/* compiled from: PG */
public final class C64474bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64474bh f174880c;

    /* renamed from: d */
    private static volatile C63010eb f174881d;

    /* renamed from: a */
    public int f174882a = 0;

    /* renamed from: b */
    public Object f174883b;

    static {
        C64474bh bhVar = new C64474bh();
        f174880c = bhVar;
        C62942bv.registerDefaultInstance(C64474bh.class, bhVar);
    }

    private C64474bh() {
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
                return newMessageInfo(f174880c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C64467ba.class, C64462aw.class, C64473bg.class, C64469bc.class, C64464ay.class, C64471be.class});
            case 3:
                return new C64474bh();
            case 4:
                return new C64460au();
            case 5:
                return f174880c;
            case 6:
                C63010eb ebVar = f174881d;
                if (ebVar == null) {
                    synchronized (C64474bh.class) {
                        ebVar = f174881d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174880c);
                            f174881d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
