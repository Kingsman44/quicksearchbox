package com.google.android.libraries.search.assistant.p2786t.p2798c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.f */
/* compiled from: PG */
public final class C36603f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36603f f95436c;

    /* renamed from: d */
    private static volatile C63010eb f95437d;

    /* renamed from: a */
    public int f95438a;

    /* renamed from: b */
    public int f95439b;

    static {
        C36603f fVar = new C36603f();
        f95436c = fVar;
        C62942bv.registerDefaultInstance(C36603f.class, fVar);
    }

    private C36603f() {
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
                return newMessageInfo(f95436c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36603f();
            case 4:
                return new C36601d();
            case 5:
                return f95436c;
            case 6:
                C63010eb ebVar = f95437d;
                if (ebVar == null) {
                    synchronized (C36603f.class) {
                        ebVar = f95437d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95436c);
                            f95437d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
