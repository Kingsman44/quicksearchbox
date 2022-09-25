package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.e.cb */
/* compiled from: PG */
public final class C51868cb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51868cb f136049a;

    /* renamed from: d */
    private static volatile C63010eb f136050d;

    /* renamed from: b */
    private int f136051b;

    /* renamed from: c */
    private C63037fb f136052c;

    static {
        C51868cb cbVar = new C51868cb();
        f136049a = cbVar;
        C62942bv.registerDefaultInstance(C51868cb.class, cbVar);
    }

    private C51868cb() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f136049a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C51868cb();
            case 4:
                return new C51867ca();
            case 5:
                return f136049a;
            case 6:
                C63010eb ebVar = f136050d;
                if (ebVar == null) {
                    synchronized (C51868cb.class) {
                        ebVar = f136050d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136049a);
                            f136050d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
