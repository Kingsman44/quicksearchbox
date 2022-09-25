package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.dn */
/* compiled from: PG */
public final class C59544dn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59544dn f158002d;

    /* renamed from: e */
    private static volatile C63010eb f158003e;

    /* renamed from: a */
    public int f158004a;

    /* renamed from: b */
    public int f158005b;

    /* renamed from: c */
    public int f158006c;

    static {
        C59544dn dnVar = new C59544dn();
        f158002d = dnVar;
        C62942bv.registerDefaultInstance(C59544dn.class, dnVar);
    }

    private C59544dn() {
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
                return newMessageInfo(f158002d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59544dn();
            case 4:
                return new C59543dm();
            case 5:
                return f158002d;
            case 6:
                C63010eb ebVar = f158003e;
                if (ebVar == null) {
                    synchronized (C59544dn.class) {
                        ebVar = f158003e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158002d);
                            f158003e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
