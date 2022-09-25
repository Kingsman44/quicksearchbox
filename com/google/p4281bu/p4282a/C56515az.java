package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.az */
/* compiled from: PG */
public final class C56515az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56515az f150927b;

    /* renamed from: c */
    private static volatile C63010eb f150928c;

    /* renamed from: a */
    public C56513ax f150929a;

    static {
        C56515az azVar = new C56515az();
        f150927b = azVar;
        C62942bv.registerDefaultInstance(C56515az.class, azVar);
    }

    private C56515az() {
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
                return newMessageInfo(f150927b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C56515az();
            case 4:
                return new C56514ay();
            case 5:
                return f150927b;
            case 6:
                C63010eb ebVar = f150928c;
                if (ebVar == null) {
                    synchronized (C56515az.class) {
                        ebVar = f150928c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150927b);
                            f150928c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
