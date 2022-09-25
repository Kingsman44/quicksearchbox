package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.k */
/* compiled from: PG */
public final class C52783k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52783k f138485a;

    /* renamed from: d */
    private static volatile C63010eb f138486d;

    /* renamed from: b */
    private int f138487b;

    /* renamed from: c */
    private C52781i f138488c;

    static {
        C52783k kVar = new C52783k();
        f138485a = kVar;
        C62942bv.registerDefaultInstance(C52783k.class, kVar);
    }

    private C52783k() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f138485a, "\u0001\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\f", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52783k();
            case 4:
                return new C52782j();
            case 5:
                return f138485a;
            case 6:
                C63010eb ebVar = f138486d;
                if (ebVar == null) {
                    synchronized (C52783k.class) {
                        ebVar = f138486d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138485a);
                            f138486d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
