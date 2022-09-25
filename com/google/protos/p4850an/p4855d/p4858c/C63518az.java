package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.az */
/* compiled from: PG */
public final class C63518az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63518az f171805a;

    /* renamed from: e */
    private static volatile C63010eb f171806e;

    /* renamed from: b */
    private int f171807b;

    /* renamed from: c */
    private C63521bb f171808c;

    /* renamed from: d */
    private byte f171809d = 2;

    static {
        C63518az azVar = new C63518az();
        f171805a = azVar;
        C62942bv.registerDefaultInstance(C63518az.class, azVar);
    }

    private C63518az() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171809d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171809d = b;
                return null;
            case 2:
                return newMessageInfo(f171805a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63518az();
            case 4:
                return new C63517ay();
            case 5:
                return f171805a;
            case 6:
                C63010eb ebVar = f171806e;
                if (ebVar == null) {
                    synchronized (C63518az.class) {
                        ebVar = f171806e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171805a);
                            f171806e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
