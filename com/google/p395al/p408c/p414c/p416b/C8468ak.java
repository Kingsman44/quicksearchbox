package com.google.p395al.p408c.p414c.p416b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.ak */
/* compiled from: PG */
public final class C8468ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8468ak f29403b;

    /* renamed from: d */
    private static volatile C63010eb f29404d;

    /* renamed from: a */
    public C8464ag f29405a;

    /* renamed from: c */
    private int f29406c;

    static {
        C8468ak akVar = new C8468ak();
        f29403b = akVar;
        C62942bv.registerDefaultInstance(C8468ak.class, akVar);
    }

    private C8468ak() {
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
                return newMessageInfo(f29403b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8468ak();
            case 4:
                return new C8467aj();
            case 5:
                return f29403b;
            case 6:
                C63010eb ebVar = f29404d;
                if (ebVar == null) {
                    synchronized (C8468ak.class) {
                        ebVar = f29404d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29403b);
                            f29404d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
