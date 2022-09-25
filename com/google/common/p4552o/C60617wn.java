package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.wn */
/* compiled from: PG */
public final class C60617wn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60617wn f164453d;

    /* renamed from: e */
    private static volatile C63010eb f164454e;

    /* renamed from: a */
    public int f164455a;

    /* renamed from: b */
    public C59745eb f164456b;

    /* renamed from: c */
    public C59745eb f164457c;

    static {
        C60617wn wnVar = new C60617wn();
        f164453d = wnVar;
        C62942bv.registerDefaultInstance(C60617wn.class, wnVar);
    }

    private C60617wn() {
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
                return newMessageInfo(f164453d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60617wn();
            case 4:
                return new C60616wm();
            case 5:
                return f164453d;
            case 6:
                C63010eb ebVar = f164454e;
                if (ebVar == null) {
                    synchronized (C60617wn.class) {
                        ebVar = f164454e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164453d);
                            f164454e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
