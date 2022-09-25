package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.as */
/* compiled from: PG */
public final class C62415as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62415as f168479d;

    /* renamed from: f */
    private static volatile C63010eb f168480f;

    /* renamed from: a */
    public double f168481a;

    /* renamed from: b */
    public double f168482b;

    /* renamed from: c */
    public double f168483c;

    /* renamed from: e */
    private int f168484e;

    static {
        C62415as asVar = new C62415as();
        f168479d = asVar;
        C62942bv.registerDefaultInstance(C62415as.class, asVar);
    }

    private C62415as() {
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
                return newMessageInfo(f168479d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C62415as();
            case 4:
                return new C62414ar();
            case 5:
                return f168479d;
            case 6:
                C63010eb ebVar = f168480f;
                if (ebVar == null) {
                    synchronized (C62415as.class) {
                        ebVar = f168480f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168479d);
                            f168480f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
