package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.ae */
/* compiled from: PG */
public final class C52855ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52855ae f138665c;

    /* renamed from: d */
    private static volatile C63010eb f138666d;

    /* renamed from: a */
    public int f138667a = 0;

    /* renamed from: b */
    public Object f138668b;

    static {
        C52855ae aeVar = new C52855ae();
        f138665c = aeVar;
        C62942bv.registerDefaultInstance(C52855ae.class, aeVar);
    }

    private C52855ae() {
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
                return newMessageInfo(f138665c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C52917x.class, C52852ab.class, C52919z.class, C52854ad.class});
            case 3:
                return new C52855ae();
            case 4:
                return new C52915v();
            case 5:
                return f138665c;
            case 6:
                C63010eb ebVar = f138666d;
                if (ebVar == null) {
                    synchronized (C52855ae.class) {
                        ebVar = f138666d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138665c);
                            f138666d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
