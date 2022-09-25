package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cl */
/* compiled from: PG */
public final class C62087cl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62087cl f167691a;

    /* renamed from: b */
    private static volatile C63010eb f167692b;

    static {
        C62087cl clVar = new C62087cl();
        f167691a = clVar;
        C62942bv.registerDefaultInstance(C62087cl.class, clVar);
    }

    private C62087cl() {
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
                return newMessageInfo(f167691a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62087cl();
            case 4:
                return new C62086ck();
            case 5:
                return f167691a;
            case 6:
                C63010eb ebVar = f167692b;
                if (ebVar == null) {
                    synchronized (C62087cl.class) {
                        ebVar = f167692b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167691a);
                            f167692b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
