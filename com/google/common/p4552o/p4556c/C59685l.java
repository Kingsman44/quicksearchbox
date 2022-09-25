package com.google.common.p4552o.p4556c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.c.l */
/* compiled from: PG */
public final class C59685l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59685l f160022c;

    /* renamed from: f */
    private static volatile C63010eb f160023f;

    /* renamed from: a */
    public int f160024a;

    /* renamed from: b */
    public C59683j f160025b;

    /* renamed from: d */
    private C59681h f160026d;

    /* renamed from: e */
    private byte f160027e = 2;

    static {
        C59685l lVar = new C59685l();
        f160022c = lVar;
        C62942bv.registerDefaultInstance(C59685l.class, lVar);
    }

    private C59685l() {
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f160027e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f160027e = b;
                return null;
            case 2:
                return newMessageInfo(f160022c, "\u0001\u0002\u0000\u0001DK\u0002\u0000\u0000\u0001Dဉ\u0015Kᐉ\u001c", new Object[]{"a", "b", "d"});
            case 3:
                return new C59685l();
            case 4:
                return new C59684k();
            case 5:
                return f160022c;
            case 6:
                C63010eb ebVar = f160023f;
                if (ebVar == null) {
                    synchronized (C59685l.class) {
                        ebVar = f160023f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160022c);
                            f160023f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
