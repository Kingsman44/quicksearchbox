package com.google.assistant.p3989p.p3990a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.p.a.f */
/* compiled from: PG */
public final class C53044f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53044f f139022f;

    /* renamed from: g */
    private static volatile C63010eb f139023g;

    /* renamed from: a */
    public int f139024a;

    /* renamed from: b */
    public int f139025b;

    /* renamed from: c */
    public C62961ch f139026c = emptyIntList();

    /* renamed from: d */
    public C63088z f139027d = C63088z.f170246b;

    /* renamed from: e */
    public C52230ka f139028e;

    static {
        C53044f fVar = new C53044f();
        f139022f = fVar;
        C62942bv.registerDefaultInstance(C53044f.class, fVar);
    }

    private C53044f() {
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
                return newMessageInfo(f139022f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u0016\u0002ည\u0002\u0004ဉ\u0004\tဌ\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", "b", C53042d.f139021a});
            case 3:
                return new C53044f();
            case 4:
                return new C53041c();
            case 5:
                return f139022f;
            case 6:
                C63010eb ebVar = f139023g;
                if (ebVar == null) {
                    synchronized (C53044f.class) {
                        ebVar = f139023g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139022f);
                            f139023g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
