package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.a.c */
/* compiled from: PG */
public final class C33588c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C33588c f89799d;

    /* renamed from: e */
    private static volatile C63010eb f89800e;

    /* renamed from: a */
    public int f89801a;

    /* renamed from: b */
    public int f89802b;

    /* renamed from: c */
    public boolean f89803c;

    static {
        C33588c cVar = new C33588c();
        f89799d = cVar;
        C62942bv.registerDefaultInstance(C33588c.class, cVar);
    }

    private C33588c() {
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
                return newMessageInfo(f89799d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C33588c();
            case 4:
                return new C33585b();
            case 5:
                return f89799d;
            case 6:
                C63010eb ebVar = f89800e;
                if (ebVar == null) {
                    synchronized (C33588c.class) {
                        ebVar = f89800e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89799d);
                            f89800e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
