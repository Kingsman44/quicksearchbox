package com.google.protos.p4850an.p4853b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.b.k */
/* compiled from: PG */
public final class C63367k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63367k f171252c;

    /* renamed from: d */
    private static volatile C63010eb f171253d;

    /* renamed from: a */
    public int f171254a;

    /* renamed from: b */
    public C63380x f171255b;

    static {
        C63367k kVar = new C63367k();
        f171252c = kVar;
        C62942bv.registerDefaultInstance(C63367k.class, kVar);
    }

    private C63367k() {
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
                return newMessageInfo(f171252c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63367k();
            case 4:
                return new C63366j();
            case 5:
                return f171252c;
            case 6:
                C63010eb ebVar = f171253d;
                if (ebVar == null) {
                    synchronized (C63367k.class) {
                        ebVar = f171253d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171252c);
                            f171253d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
