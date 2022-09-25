package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.q */
/* compiled from: PG */
public final class C13071q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C13071q f40563a;

    /* renamed from: b */
    private static volatile C63010eb f40564b;

    static {
        C13071q qVar = new C13071q();
        f40563a = qVar;
        C62942bv.registerDefaultInstance(C13071q.class, qVar);
    }

    private C13071q() {
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
                return newMessageInfo(f40563a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C13071q();
            case 4:
                return new C13070p();
            case 5:
                return f40563a;
            case 6:
                C63010eb ebVar = f40564b;
                if (ebVar == null) {
                    synchronized (C13071q.class) {
                        ebVar = f40564b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40563a);
                            f40564b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
