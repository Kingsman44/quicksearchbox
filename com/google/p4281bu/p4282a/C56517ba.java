package com.google.p4281bu.p4282a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.ba */
/* compiled from: PG */
public final class C56517ba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56517ba f150934d;

    /* renamed from: e */
    private static volatile C63010eb f150935e;

    /* renamed from: a */
    public int f150936a = 0;

    /* renamed from: b */
    public Object f150937b;

    /* renamed from: c */
    public int f150938c;

    static {
        C56517ba baVar = new C56517ba();
        f150934d = baVar;
        C62942bv.registerDefaultInstance(C56517ba.class, baVar);
    }

    private C56517ba() {
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
                return newMessageInfo(f150934d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, C56515az.class, C56506aq.class, C56510au.class, C56508as.class});
            case 3:
                return new C56517ba();
            case 4:
                return new C56504ao();
            case 5:
                return f150934d;
            case 6:
                C63010eb ebVar = f150935e;
                if (ebVar == null) {
                    synchronized (C56517ba.class) {
                        ebVar = f150935e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150934d);
                            f150935e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
