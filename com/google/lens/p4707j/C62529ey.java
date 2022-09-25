package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ey */
/* compiled from: PG */
public final class C62529ey extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62529ey f168826c;

    /* renamed from: d */
    private static volatile C63010eb f168827d;

    /* renamed from: a */
    public int f168828a;

    /* renamed from: b */
    public long f168829b;

    static {
        C62529ey eyVar = new C62529ey();
        f168826c = eyVar;
        C62942bv.registerDefaultInstance(C62529ey.class, eyVar);
    }

    private C62529ey() {
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
                return newMessageInfo(f168826c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62529ey();
            case 4:
                return new C62528ex();
            case 5:
                return f168826c;
            case 6:
                C63010eb ebVar = f168827d;
                if (ebVar == null) {
                    synchronized (C62529ey.class) {
                        ebVar = f168827d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168826c);
                            f168827d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
