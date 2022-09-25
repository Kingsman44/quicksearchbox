package com.google.android.apps.search.googleapp.discover.p10203o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.o.f */
/* compiled from: PG */
public final class C134477f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134477f f366237c;

    /* renamed from: d */
    private static volatile C63010eb f366238d;

    /* renamed from: a */
    public int f366239a;

    /* renamed from: b */
    public C63042fg f366240b;

    static {
        C134477f fVar = new C134477f();
        f366237c = fVar;
        C62942bv.registerDefaultInstance(C134477f.class, fVar);
    }

    private C134477f() {
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
                return newMessageInfo(f366237c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134477f();
            case 4:
                return new C134476e();
            case 5:
                return f366237c;
            case 6:
                C63010eb ebVar = f366238d;
                if (ebVar == null) {
                    synchronized (C134477f.class) {
                        ebVar = f366238d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366237c);
                            f366238d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
