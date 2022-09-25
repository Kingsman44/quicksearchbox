package com.google.android.apps.search.assistant.verticals.p9880a.p9883b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.b.d */
/* compiled from: PG */
public final class C130329d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C130329d f357224d;

    /* renamed from: e */
    private static volatile C63010eb f357225e;

    /* renamed from: a */
    public int f357226a;

    /* renamed from: b */
    public int f357227b;

    /* renamed from: c */
    public int f357228c;

    static {
        C130329d dVar = new C130329d();
        f357224d = dVar;
        C62942bv.registerDefaultInstance(C130329d.class, dVar);
    }

    private C130329d() {
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
                Object[] objArr = new Object[5];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C130327b.f357223a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                return newMessageInfo(f357224d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", objArr);
            case 3:
                return new C130329d();
            case 4:
                return new C130326a();
            case 5:
                return f357224d;
            case 6:
                C63010eb ebVar = f357225e;
                if (ebVar == null) {
                    synchronized (C130329d.class) {
                        ebVar = f357225e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357224d);
                            f357225e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
