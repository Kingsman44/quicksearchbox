package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.xs */
/* compiled from: PG */
public final class C52599xs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52599xs f138109b;

    /* renamed from: d */
    private static volatile C63010eb f138110d;

    /* renamed from: a */
    public C62971cq f138111a = emptyProtobufList();

    /* renamed from: c */
    private byte f138112c = 2;

    static {
        C52599xs xsVar = new C52599xs();
        f138109b = xsVar;
        C62942bv.registerDefaultInstance(C52599xs.class, xsVar);
    }

    private C52599xs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138112c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138112c = b;
                return null;
            case 2:
                return newMessageInfo(f138109b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C52598xr.class});
            case 3:
                return new C52599xs();
            case 4:
                return new C52596xp();
            case 5:
                return f138109b;
            case 6:
                C63010eb ebVar = f138110d;
                if (ebVar == null) {
                    synchronized (C52599xs.class) {
                        ebVar = f138110d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138109b);
                            f138110d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
