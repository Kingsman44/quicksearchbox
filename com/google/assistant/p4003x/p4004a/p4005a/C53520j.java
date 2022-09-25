package com.google.assistant.p4003x.p4004a.p4005a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.x.a.a.j */
/* compiled from: PG */
public final class C53520j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53520j f140460a;

    /* renamed from: b */
    private static volatile C63010eb f140461b;

    static {
        C53520j jVar = new C53520j();
        f140460a = jVar;
        C62942bv.registerDefaultInstance(C53520j.class, jVar);
    }

    private C53520j() {
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
                return newMessageInfo(f140460a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53520j();
            case 4:
                return new C53519i();
            case 5:
                return f140460a;
            case 6:
                C63010eb ebVar = f140461b;
                if (ebVar == null) {
                    synchronized (C53520j.class) {
                        ebVar = f140461b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140460a);
                            f140461b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
