package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ca */
/* compiled from: PG */
public final class C33815ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33815ca f90270b;

    /* renamed from: c */
    private static volatile C63010eb f90271c;

    /* renamed from: a */
    public long f90272a;

    static {
        C33815ca caVar = new C33815ca();
        f90270b = caVar;
        C62942bv.registerDefaultInstance(C33815ca.class, caVar);
    }

    private C33815ca() {
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
                return newMessageInfo(f90270b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C33815ca();
            case 4:
                return new C33813bz();
            case 5:
                return f90270b;
            case 6:
                C63010eb ebVar = f90271c;
                if (ebVar == null) {
                    synchronized (C33815ca.class) {
                        ebVar = f90271c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90270b);
                            f90271c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
