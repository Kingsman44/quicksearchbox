package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60201dl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.eh */
/* compiled from: PG */
public final class C59751eh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59751eh f161442f;

    /* renamed from: g */
    private static volatile C63010eb f161443g;

    /* renamed from: a */
    public int f161444a;

    /* renamed from: b */
    public int f161445b;

    /* renamed from: c */
    public int f161446c;

    /* renamed from: d */
    public C62961ch f161447d = emptyIntList();

    /* renamed from: e */
    public int f161448e;

    static {
        C59751eh ehVar = new C59751eh();
        f161442f = ehVar;
        C62942bv.registerDefaultInstance(C59751eh.class, ehVar);
    }

    private C59751eh() {
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
                return newMessageInfo(f161442f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0016\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C60201dl.f162874a});
            case 3:
                return new C59751eh();
            case 4:
                return new C59750eg();
            case 5:
                return f161442f;
            case 6:
                C63010eb ebVar = f161443g;
                if (ebVar == null) {
                    synchronized (C59751eh.class) {
                        ebVar = f161443g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161442f);
                            f161443g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
