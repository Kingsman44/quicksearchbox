package com.google.p4281bu.p4282a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.ah */
/* compiled from: PG */
public final class C56497ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56497ah f150894c;

    /* renamed from: d */
    private static volatile C63010eb f150895d;

    /* renamed from: a */
    public C62910ar f150896a;

    /* renamed from: b */
    public C62910ar f150897b;

    static {
        C56497ah ahVar = new C56497ah();
        f150894c = ahVar;
        C62942bv.registerDefaultInstance(C56497ah.class, ahVar);
    }

    private C56497ah() {
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
                return newMessageInfo(f150894c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C56497ah();
            case 4:
                return new C56496ag();
            case 5:
                return f150894c;
            case 6:
                C63010eb ebVar = f150895d;
                if (ebVar == null) {
                    synchronized (C56497ah.class) {
                        ebVar = f150895d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150894c);
                            f150895d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
