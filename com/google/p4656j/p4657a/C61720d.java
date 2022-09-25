package com.google.p4656j.p4657a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.j.a.d */
/* compiled from: PG */
public final class C61720d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61720d f166745b;

    /* renamed from: c */
    private static volatile C63010eb f166746c;

    /* renamed from: a */
    public C62971cq f166747a = emptyProtobufList();

    static {
        C61720d dVar = new C61720d();
        f166745b = dVar;
        C62942bv.registerDefaultInstance(C61720d.class, dVar);
    }

    private C61720d() {
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
                return newMessageInfo(f166745b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C61718b.class});
            case 3:
                return new C61720d();
            case 4:
                return new C61719c();
            case 5:
                return f166745b;
            case 6:
                C63010eb ebVar = f166746c;
                if (ebVar == null) {
                    synchronized (C61720d.class) {
                        ebVar = f166746c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166745b);
                            f166746c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
