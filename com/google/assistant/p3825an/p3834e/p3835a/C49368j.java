package com.google.assistant.p3825an.p3834e.p3835a;

import com.google.p4129b.p4136c.C54759g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.e.a.j */
/* compiled from: PG */
public final class C49368j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49368j f127605b;

    /* renamed from: c */
    private static volatile C63010eb f127606c;

    /* renamed from: a */
    public C62971cq f127607a = emptyProtobufList();

    static {
        C49368j jVar = new C49368j();
        f127605b = jVar;
        C62942bv.registerDefaultInstance(C49368j.class, jVar);
    }

    private C49368j() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f127605b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54759g.class});
            case 3:
                return new C49368j();
            case 4:
                return new C49367i();
            case 5:
                return f127605b;
            case 6:
                C63010eb ebVar = f127606c;
                if (ebVar == null) {
                    synchronized (C49368j.class) {
                        ebVar = f127606c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127605b);
                            f127606c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
