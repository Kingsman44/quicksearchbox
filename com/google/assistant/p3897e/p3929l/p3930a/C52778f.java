package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.e.l.a.f */
/* compiled from: PG */
public final class C52778f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52778f f138477a;

    /* renamed from: d */
    private static volatile C63010eb f138478d;

    /* renamed from: b */
    private int f138479b;

    /* renamed from: c */
    private C63037fb f138480c;

    static {
        C52778f fVar = new C52778f();
        f138477a = fVar;
        C62942bv.registerDefaultInstance(C52778f.class, fVar);
    }

    private C52778f() {
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
                return newMessageInfo(f138477a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52778f();
            case 4:
                return new C52775e();
            case 5:
                return f138477a;
            case 6:
                C63010eb ebVar = f138478d;
                if (ebVar == null) {
                    synchronized (C52778f.class) {
                        ebVar = f138478d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138477a);
                            f138478d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
