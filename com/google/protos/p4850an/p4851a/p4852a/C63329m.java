package com.google.protos.p4850an.p4851a.p4852a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.a.a.m */
/* compiled from: PG */
public final class C63329m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63329m f171160c;

    /* renamed from: d */
    private static volatile C63010eb f171161d;

    /* renamed from: a */
    public int f171162a;

    /* renamed from: b */
    public long f171163b;

    static {
        C63329m mVar = new C63329m();
        f171160c = mVar;
        C62942bv.registerDefaultInstance(C63329m.class, mVar);
    }

    private C63329m() {
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
                return newMessageInfo(f171160c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဂ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C63329m();
            case 4:
                return new C63328l();
            case 5:
                return f171160c;
            case 6:
                C63010eb ebVar = f171161d;
                if (ebVar == null) {
                    synchronized (C63329m.class) {
                        ebVar = f171161d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171160c);
                            f171161d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
