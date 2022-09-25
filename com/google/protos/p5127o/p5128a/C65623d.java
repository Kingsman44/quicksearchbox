package com.google.protos.p5127o.p5128a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.o.a.d */
/* compiled from: PG */
public final class C65623d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65623d f178328c;

    /* renamed from: d */
    private static volatile C63010eb f178329d;

    /* renamed from: a */
    public int f178330a;

    /* renamed from: b */
    public C65682h f178331b;

    static {
        C65623d dVar = new C65623d();
        f178328c = dVar;
        C62942bv.registerDefaultInstance(C65623d.class, dVar);
    }

    private C65623d() {
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
                return newMessageInfo(f178328c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65623d();
            case 4:
                return new C65622c();
            case 5:
                return f178328c;
            case 6:
                C63010eb ebVar = f178329d;
                if (ebVar == null) {
                    synchronized (C65623d.class) {
                        ebVar = f178329d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178328c);
                            f178329d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
