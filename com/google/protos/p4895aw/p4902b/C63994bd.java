package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.bd */
/* compiled from: PG */
public final class C63994bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63994bd f173061c;

    /* renamed from: e */
    private static volatile C63010eb f173062e;

    /* renamed from: a */
    public long f173063a;

    /* renamed from: b */
    public long f173064b;

    /* renamed from: d */
    private int f173065d;

    static {
        C63994bd bdVar = new C63994bd();
        f173061c = bdVar;
        C62942bv.registerDefaultInstance(C63994bd.class, bdVar);
    }

    private C63994bd() {
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
                return newMessageInfo(f173061c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C63994bd();
            case 4:
                return new C63993bc();
            case 5:
                return f173061c;
            case 6:
                C63010eb ebVar = f173062e;
                if (ebVar == null) {
                    synchronized (C63994bd.class) {
                        ebVar = f173062e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173061c);
                            f173062e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
