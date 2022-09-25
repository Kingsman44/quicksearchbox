package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.de */
/* compiled from: PG */
public final class C49012de extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49012de f126774d;

    /* renamed from: e */
    private static volatile C63010eb f126775e;

    /* renamed from: a */
    public int f126776a;

    /* renamed from: b */
    public C49010dc f126777b;

    /* renamed from: c */
    public C49010dc f126778c;

    static {
        C49012de deVar = new C49012de();
        f126774d = deVar;
        C62942bv.registerDefaultInstance(C49012de.class, deVar);
    }

    private C49012de() {
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
                return newMessageInfo(f126774d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49012de();
            case 4:
                return new C49011dd();
            case 5:
                return f126774d;
            case 6:
                C63010eb ebVar = f126775e;
                if (ebVar == null) {
                    synchronized (C49012de.class) {
                        ebVar = f126775e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126774d);
                            f126775e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
