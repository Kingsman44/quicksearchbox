package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3922a.C51646d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ca */
/* compiled from: PG */
public final class C59504ca extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59504ca f157878e;

    /* renamed from: f */
    private static volatile C63010eb f157879f;

    /* renamed from: a */
    public int f157880a;

    /* renamed from: b */
    public int f157881b;

    /* renamed from: c */
    public boolean f157882c;

    /* renamed from: d */
    public int f157883d;

    static {
        C59504ca caVar = new C59504ca();
        f157878e = caVar;
        C62942bv.registerDefaultInstance(C59504ca.class, caVar);
    }

    private C59504ca() {
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
                return newMessageInfo(f157878e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"a", "b", C51646d.f134579a, C45240c.f118157a, "d"});
            case 3:
                return new C59504ca();
            case 4:
                return new C59502bz();
            case 5:
                return f157878e;
            case 6:
                C63010eb ebVar = f157879f;
                if (ebVar == null) {
                    synchronized (C59504ca.class) {
                        ebVar = f157879f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157878e);
                            f157879f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
