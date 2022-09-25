package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.ba */
/* compiled from: PG */
public final class C52878ba extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52878ba f138720b;

    /* renamed from: c */
    private static volatile C63010eb f138721c;

    /* renamed from: a */
    public int f138722a;

    static {
        C52878ba baVar = new C52878ba();
        f138720b = baVar;
        C62942bv.registerDefaultInstance(C52878ba.class, baVar);
    }

    private C52878ba() {
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
                return newMessageInfo(f138720b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C52878ba();
            case 4:
                return new C52876az();
            case 5:
                return f138720b;
            case 6:
                C63010eb ebVar = f138721c;
                if (ebVar == null) {
                    synchronized (C52878ba.class) {
                        ebVar = f138721c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138720b);
                            f138721c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
