package com.google.protos.p4948ba;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ba.f */
/* compiled from: PG */
public final class C64376f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64376f f174594b;

    /* renamed from: d */
    private static volatile C63010eb f174595d;

    /* renamed from: a */
    public C62971cq f174596a = emptyProtobufList();

    /* renamed from: c */
    private byte f174597c = 2;

    static {
        C64376f fVar = new C64376f();
        f174594b = fVar;
        C62942bv.registerDefaultInstance(C64376f.class, fVar);
    }

    private C64376f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174597c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f174597c = b;
                return null;
            case 2:
                return newMessageInfo(f174594b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C64374d.class});
            case 3:
                return new C64376f();
            case 4:
                return new C64375e();
            case 5:
                return f174594b;
            case 6:
                C63010eb ebVar = f174595d;
                if (ebVar == null) {
                    synchronized (C64376f.class) {
                        ebVar = f174595d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174594b);
                            f174595d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
