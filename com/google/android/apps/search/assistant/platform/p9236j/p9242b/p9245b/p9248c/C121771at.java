package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.at */
/* compiled from: PG */
public final class C121771at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C121771at f337934d;

    /* renamed from: e */
    private static volatile C63010eb f337935e;

    /* renamed from: a */
    public int f337936a = 0;

    /* renamed from: b */
    public Object f337937b;

    /* renamed from: c */
    public C37561eb f337938c;

    static {
        C121771at atVar = new C121771at();
        f337934d = atVar;
        C62942bv.registerDefaultInstance(C121771at.class, atVar);
    }

    private C121771at() {
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
                return newMessageInfo(f337934d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t", new Object[]{"b", "a", C121784bf.class, C121782bd.class, C45240c.f118157a});
            case 3:
                return new C121771at();
            case 4:
                return new C121770as();
            case 5:
                return f337934d;
            case 6:
                C63010eb ebVar = f337935e;
                if (ebVar == null) {
                    synchronized (C121771at.class) {
                        ebVar = f337935e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337934d);
                            f337935e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
