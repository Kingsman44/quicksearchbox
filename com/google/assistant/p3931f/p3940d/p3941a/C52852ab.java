package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.ab */
/* compiled from: PG */
public final class C52852ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52852ab f138661a;

    /* renamed from: b */
    private static volatile C63010eb f138662b;

    static {
        C52852ab abVar = new C52852ab();
        f138661a = abVar;
        C62942bv.registerDefaultInstance(C52852ab.class, abVar);
    }

    private C52852ab() {
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
                return newMessageInfo(f138661a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52852ab();
            case 4:
                return new C52851aa();
            case 5:
                return f138661a;
            case 6:
                C63010eb ebVar = f138662b;
                if (ebVar == null) {
                    synchronized (C52852ab.class) {
                        ebVar = f138662b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138661a);
                            f138662b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
