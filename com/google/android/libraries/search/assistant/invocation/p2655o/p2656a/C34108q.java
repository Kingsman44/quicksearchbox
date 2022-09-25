package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.q */
/* compiled from: PG */
public final class C34108q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34108q f90841d;

    /* renamed from: e */
    private static volatile C63010eb f90842e;

    /* renamed from: a */
    public int f90843a;

    /* renamed from: b */
    public boolean f90844b;

    /* renamed from: c */
    public C37346ak f90845c;

    static {
        C34108q qVar = new C34108q();
        f90841d = qVar;
        C62942bv.registerDefaultInstance(C34108q.class, qVar);
    }

    private C34108q() {
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
                return newMessageInfo(f90841d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C34108q();
            case 4:
                return new C34107p();
            case 5:
                return f90841d;
            case 6:
                C63010eb ebVar = f90842e;
                if (ebVar == null) {
                    synchronized (C34108q.class) {
                        ebVar = f90842e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90841d);
                            f90842e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
