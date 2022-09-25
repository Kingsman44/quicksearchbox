package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4953bc.p4955b.C64432b;

/* renamed from: com.google.protos.an.az */
/* compiled from: PG */
public final class C63355az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63355az f171203a;

    /* renamed from: f */
    private static volatile C63010eb f171204f;

    /* renamed from: b */
    private int f171205b;

    /* renamed from: c */
    private C63389bg f171206c;

    /* renamed from: d */
    private C64432b f171207d;

    /* renamed from: e */
    private byte f171208e = 2;

    static {
        C63355az azVar = new C63355az();
        f171203a = azVar;
        C62942bv.registerDefaultInstance(C63355az.class, azVar);
    }

    private C63355az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171208e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171208e = b;
                return null;
            case 2:
                return newMessageInfo(f171203a, "\u0001\u0002\u0000\u0001\u0002\b\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\bᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C63355az();
            case 4:
                return new C63354ay();
            case 5:
                return f171203a;
            case 6:
                C63010eb ebVar = f171204f;
                if (ebVar == null) {
                    synchronized (C63355az.class) {
                        ebVar = f171204f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171203a);
                            f171204f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
