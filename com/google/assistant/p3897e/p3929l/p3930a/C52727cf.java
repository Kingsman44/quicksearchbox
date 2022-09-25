package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.cf */
/* compiled from: PG */
public final class C52727cf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52727cf f138392a;

    /* renamed from: b */
    private static volatile C63010eb f138393b;

    static {
        C52727cf cfVar = new C52727cf();
        f138392a = cfVar;
        C62942bv.registerDefaultInstance(C52727cf.class, cfVar);
    }

    private C52727cf() {
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
                return newMessageInfo(f138392a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52727cf();
            case 4:
                return new C52726ce();
            case 5:
                return f138392a;
            case 6:
                C63010eb ebVar = f138393b;
                if (ebVar == null) {
                    synchronized (C52727cf.class) {
                        ebVar = f138393b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138392a);
                            f138393b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
