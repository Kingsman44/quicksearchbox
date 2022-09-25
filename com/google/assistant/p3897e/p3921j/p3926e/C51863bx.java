package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bx */
/* compiled from: PG */
public final class C51863bx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51863bx f136042a;

    /* renamed from: f */
    private static volatile C63010eb f136043f;

    /* renamed from: b */
    private int f136044b;

    /* renamed from: c */
    private C51862bw f136045c;

    /* renamed from: d */
    private C51862bw f136046d;

    /* renamed from: e */
    private byte f136047e = 2;

    static {
        C51863bx bxVar = new C51863bx();
        f136042a = bxVar;
        C62942bv.registerDefaultInstance(C51863bx.class, bxVar);
    }

    private C51863bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136047e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136047e = b;
                return null;
            case 2:
                return newMessageInfo(f136042a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C51863bx();
            case 4:
                return new C51860bu();
            case 5:
                return f136042a;
            case 6:
                C63010eb ebVar = f136043f;
                if (ebVar == null) {
                    synchronized (C51863bx.class) {
                        ebVar = f136043f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136042a);
                            f136043f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
