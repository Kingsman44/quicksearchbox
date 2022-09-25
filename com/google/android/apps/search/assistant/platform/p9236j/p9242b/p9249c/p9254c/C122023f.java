package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.f */
/* compiled from: PG */
public final class C122023f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C122023f f338557a;

    /* renamed from: b */
    private static volatile C63010eb f338558b;

    static {
        C122023f fVar = new C122023f();
        f338557a = fVar;
        C62942bv.registerDefaultInstance(C122023f.class, fVar);
    }

    private C122023f() {
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
                return newMessageInfo(f338557a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C122023f();
            case 4:
                return new C122022e();
            case 5:
                return f338557a;
            case 6:
                C63010eb ebVar = f338558b;
                if (ebVar == null) {
                    synchronized (C122023f.class) {
                        ebVar = f338558b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338557a);
                            f338558b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
