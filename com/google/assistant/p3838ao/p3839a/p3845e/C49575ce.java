package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.ce */
/* compiled from: PG */
public final class C49575ce extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49575ce f127917d;

    /* renamed from: e */
    private static volatile C63010eb f127918e;

    /* renamed from: a */
    public C62971cq f127919a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f127920b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f127921c = emptyProtobufList();

    static {
        C49575ce ceVar = new C49575ce();
        f127917d = ceVar;
        C62942bv.registerDefaultInstance(C49575ce.class, ceVar);
    }

    private C49575ce() {
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
                return newMessageInfo(f127917d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", C49569bz.class, "b", C49574cd.class, C45240c.f118157a, C49572cb.class});
            case 3:
                return new C49575ce();
            case 4:
                return new C49567bx();
            case 5:
                return f127917d;
            case 6:
                C63010eb ebVar = f127918e;
                if (ebVar == null) {
                    synchronized (C49575ce.class) {
                        ebVar = f127918e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127917d);
                            f127918e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
