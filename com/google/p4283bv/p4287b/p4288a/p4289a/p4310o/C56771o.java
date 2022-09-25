package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.o */
/* compiled from: PG */
public final class C56771o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56771o f151498b;

    /* renamed from: c */
    private static volatile C63010eb f151499c;

    /* renamed from: a */
    public C62971cq f151500a = C62942bv.emptyProtobufList();

    static {
        C56771o oVar = new C56771o();
        f151498b = oVar;
        C62942bv.registerDefaultInstance(C56771o.class, oVar);
    }

    private C56771o() {
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
                return newMessageInfo(f151498b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C56771o();
            case 4:
                return new C56770n();
            case 5:
                return f151498b;
            case 6:
                C63010eb ebVar = f151499c;
                if (ebVar == null) {
                    synchronized (C56771o.class) {
                        ebVar = f151499c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151498b);
                            f151499c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
