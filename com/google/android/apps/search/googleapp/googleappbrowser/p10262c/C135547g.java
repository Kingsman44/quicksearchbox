package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.g */
/* compiled from: PG */
public final class C135547g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C135547g f369233d;

    /* renamed from: e */
    private static volatile C63010eb f369234e;

    /* renamed from: a */
    public int f369235a;

    /* renamed from: b */
    public boolean f369236b;

    /* renamed from: c */
    public boolean f369237c;

    static {
        C135547g gVar = new C135547g();
        f369233d = gVar;
        C62942bv.registerDefaultInstance(C135547g.class, gVar);
    }

    private C135547g() {
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
                return newMessageInfo(f369233d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C135547g();
            case 4:
                return new C135546f();
            case 5:
                return f369233d;
            case 6:
                C63010eb ebVar = f369234e;
                if (ebVar == null) {
                    synchronized (C135547g.class) {
                        ebVar = f369234e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369233d);
                            f369234e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
