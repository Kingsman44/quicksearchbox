package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.q */
/* compiled from: PG */
public final class C17514q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17514q f50528a;

    /* renamed from: b */
    private static volatile C63010eb f50529b;

    static {
        C17514q qVar = new C17514q();
        f50528a = qVar;
        C62942bv.registerDefaultInstance(C17514q.class, qVar);
    }

    private C17514q() {
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
                return newMessageInfo(f50528a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17514q();
            case 4:
                return new C17513p();
            case 5:
                return f50528a;
            case 6:
                C63010eb ebVar = f50529b;
                if (ebVar == null) {
                    synchronized (C17514q.class) {
                        ebVar = f50529b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50528a);
                            f50529b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
