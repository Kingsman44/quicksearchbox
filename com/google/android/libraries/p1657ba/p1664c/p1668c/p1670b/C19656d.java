package com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.c.b.d */
/* compiled from: PG */
public final class C19656d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19656d f54674b;

    /* renamed from: d */
    private static volatile C63010eb f54675d;

    /* renamed from: a */
    public C19660h f54676a;

    /* renamed from: c */
    private int f54677c;

    static {
        C19656d dVar = new C19656d();
        f54674b = dVar;
        C62942bv.registerDefaultInstance(C19656d.class, dVar);
    }

    private C19656d() {
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
                return newMessageInfo(f54674b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C19656d();
            case 4:
                return new C19655c();
            case 5:
                return f54674b;
            case 6:
                C63010eb ebVar = f54675d;
                if (ebVar == null) {
                    synchronized (C19656d.class) {
                        ebVar = f54675d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54674b);
                            f54675d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
