package com.google.assistant.p3745ab.p3746a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.v */
/* compiled from: PG */
public final class C48198v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48198v f124723a;

    /* renamed from: b */
    private static volatile C63010eb f124724b;

    static {
        C48198v vVar = new C48198v();
        f124723a = vVar;
        C62942bv.registerDefaultInstance(C48198v.class, vVar);
    }

    private C48198v() {
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
                return newMessageInfo(f124723a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48198v();
            case 4:
                return new C48197u();
            case 5:
                return f124723a;
            case 6:
                C63010eb ebVar = f124724b;
                if (ebVar == null) {
                    synchronized (C48198v.class) {
                        ebVar = f124724b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124723a);
                            f124724b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
