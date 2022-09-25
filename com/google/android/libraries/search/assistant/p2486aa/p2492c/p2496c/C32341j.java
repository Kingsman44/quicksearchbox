package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.c.j */
/* compiled from: PG */
public final class C32341j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C32341j f86686b;

    /* renamed from: c */
    private static volatile C63010eb f86687c;

    /* renamed from: a */
    public C32849cq f86688a;

    static {
        C32341j jVar = new C32341j();
        f86686b = jVar;
        C62942bv.registerDefaultInstance(C32341j.class, jVar);
    }

    private C32341j() {
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
                return newMessageInfo(f86686b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C32341j();
            case 4:
                return new C32340i();
            case 5:
                return f86686b;
            case 6:
                C63010eb ebVar = f86687c;
                if (ebVar == null) {
                    synchronized (C32341j.class) {
                        ebVar = f86687c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86686b);
                            f86687c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
