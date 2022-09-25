package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.f */
/* compiled from: PG */
public final class C107527f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107527f f299158c;

    /* renamed from: d */
    private static volatile C63010eb f299159d;

    /* renamed from: a */
    public int f299160a;

    /* renamed from: b */
    public int f299161b;

    static {
        C107527f fVar = new C107527f();
        f299158c = fVar;
        C62942bv.registerDefaultInstance(C107527f.class, fVar);
    }

    private C107527f() {
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
                return newMessageInfo(f299158c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C107526e.f299157a});
            case 3:
                return new C107527f();
            case 4:
                return new C107525d();
            case 5:
                return f299158c;
            case 6:
                C63010eb ebVar = f299159d;
                if (ebVar == null) {
                    synchronized (C107527f.class) {
                        ebVar = f299159d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299158c);
                            f299159d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
