package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.is */
/* compiled from: PG */
public final class C52194is extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52194is f136988e;

    /* renamed from: f */
    private static volatile C63010eb f136989f;

    /* renamed from: a */
    public int f136990a;

    /* renamed from: b */
    public C52159hk f136991b;

    /* renamed from: c */
    public double f136992c;

    /* renamed from: d */
    public double f136993d;

    static {
        C52194is isVar = new C52194is();
        f136988e = isVar;
        C62942bv.registerDefaultInstance(C52194is.class, isVar);
    }

    private C52194is() {
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
                return newMessageInfo(f136988e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52194is();
            case 4:
                return new C52193ir();
            case 5:
                return f136988e;
            case 6:
                C63010eb ebVar = f136989f;
                if (ebVar == null) {
                    synchronized (C52194is.class) {
                        ebVar = f136989f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136988e);
                            f136989f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
