package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.kh */
/* compiled from: PG */
public final class C87969kh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87969kh f237914d;

    /* renamed from: e */
    private static volatile C63010eb f237915e;

    /* renamed from: a */
    public int f237916a;

    /* renamed from: b */
    public int f237917b;

    /* renamed from: c */
    public long f237918c;

    static {
        C87969kh khVar = new C87969kh();
        f237914d = khVar;
        C62942bv.registerDefaultInstance(C87969kh.class, khVar);
    }

    private C87969kh() {
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
                return newMessageInfo(f237914d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87969kh();
            case 4:
                return new C87968kg();
            case 5:
                return f237914d;
            case 6:
                C63010eb ebVar = f237915e;
                if (ebVar == null) {
                    synchronized (C87969kh.class) {
                        ebVar = f237915e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237914d);
                            f237915e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
