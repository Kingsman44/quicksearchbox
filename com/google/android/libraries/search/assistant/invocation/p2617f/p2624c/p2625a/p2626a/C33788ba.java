package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ba */
/* compiled from: PG */
public final class C33788ba extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33788ba f90238b;

    /* renamed from: c */
    private static volatile C63010eb f90239c;

    /* renamed from: a */
    public int f90240a;

    static {
        C33788ba baVar = new C33788ba();
        f90238b = baVar;
        C62942bv.registerDefaultInstance(C33788ba.class, baVar);
    }

    private C33788ba() {
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
                return newMessageInfo(f90238b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C33788ba();
            case 4:
                return new C33786az();
            case 5:
                return f90238b;
            case 6:
                C63010eb ebVar = f90239c;
                if (ebVar == null) {
                    synchronized (C33788ba.class) {
                        ebVar = f90239c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90238b);
                            f90239c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
