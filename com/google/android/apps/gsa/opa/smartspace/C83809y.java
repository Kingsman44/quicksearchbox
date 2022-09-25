package com.google.android.apps.gsa.opa.smartspace;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.C50794cr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.y */
/* compiled from: PG */
public final class C83809y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83809y f228409d;

    /* renamed from: e */
    private static volatile C63010eb f228410e;

    /* renamed from: a */
    public int f228411a;

    /* renamed from: b */
    public int f228412b;

    /* renamed from: c */
    public long f228413c;

    static {
        C83809y yVar = new C83809y();
        f228409d = yVar;
        C62942bv.registerDefaultInstance(C83809y.class, yVar);
    }

    private C83809y() {
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
                return newMessageInfo(f228409d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C50794cr.m85939b(), C45240c.f118157a});
            case 3:
                return new C83809y();
            case 4:
                return new C83808x();
            case 5:
                return f228409d;
            case 6:
                C63010eb ebVar = f228410e;
                if (ebVar == null) {
                    synchronized (C83809y.class) {
                        ebVar = f228410e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228409d);
                            f228410e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
