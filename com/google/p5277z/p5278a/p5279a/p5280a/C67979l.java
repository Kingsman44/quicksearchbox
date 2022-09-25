package com.google.p5277z.p5278a.p5279a.p5280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.a.a.a.l */
/* compiled from: PG */
public final class C67979l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67979l f184208b;

    /* renamed from: d */
    private static volatile C63010eb f184209d;

    /* renamed from: a */
    public C62971cq f184210a = emptyProtobufList();

    /* renamed from: c */
    private byte f184211c = 2;

    static {
        C67979l lVar = new C67979l();
        f184208b = lVar;
        C62942bv.registerDefaultInstance(C67979l.class, lVar);
    }

    private C67979l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184211c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184211c = b;
                return null;
            case 2:
                return newMessageInfo(f184208b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C67975h.class});
            case 3:
                return new C67979l();
            case 4:
                return new C67978k();
            case 5:
                return f184208b;
            case 6:
                C63010eb ebVar = f184209d;
                if (ebVar == null) {
                    synchronized (C67979l.class) {
                        ebVar = f184209d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184208b);
                            f184209d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
