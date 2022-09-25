package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.l */
/* compiled from: PG */
public final class C64536l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64536l f175023c;

    /* renamed from: d */
    private static volatile C63010eb f175024d;

    /* renamed from: a */
    public C64533i f175025a;

    /* renamed from: b */
    public C64535k f175026b;

    static {
        C64536l lVar = new C64536l();
        f175023c = lVar;
        C62942bv.registerDefaultInstance(C64536l.class, lVar);
    }

    private C64536l() {
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
                return newMessageInfo(f175023c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C64536l();
            case 4:
                return new C64529e();
            case 5:
                return f175023c;
            case 6:
                C63010eb ebVar = f175024d;
                if (ebVar == null) {
                    synchronized (C64536l.class) {
                        ebVar = f175024d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175023c);
                            f175024d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
