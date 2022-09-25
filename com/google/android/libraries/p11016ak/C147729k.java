package com.google.android.libraries.p11016ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.k */
/* compiled from: PG */
public final class C147729k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C147729k f398642c;

    /* renamed from: d */
    private static volatile C63010eb f398643d;

    /* renamed from: a */
    public boolean f398644a;

    /* renamed from: b */
    public boolean f398645b;

    static {
        C147729k kVar = new C147729k();
        f398642c = kVar;
        C62942bv.registerDefaultInstance(C147729k.class, kVar);
    }

    private C147729k() {
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
                return newMessageInfo(f398642c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C147729k();
            case 4:
                return new C147728j();
            case 5:
                return f398642c;
            case 6:
                C63010eb ebVar = f398643d;
                if (ebVar == null) {
                    synchronized (C147729k.class) {
                        ebVar = f398643d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398642c);
                            f398643d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
