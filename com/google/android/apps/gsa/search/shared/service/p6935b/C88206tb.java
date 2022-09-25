package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.tb */
/* compiled from: PG */
public final class C88206tb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88206tb f238424d;

    /* renamed from: f */
    private static volatile C63010eb f238425f;

    /* renamed from: a */
    public int f238426a;

    /* renamed from: b */
    public int f238427b;

    /* renamed from: c */
    public C54946ad f238428c;

    /* renamed from: e */
    private byte f238429e = 2;

    static {
        C88206tb tbVar = new C88206tb();
        f238424d = tbVar;
        C62942bv.registerDefaultInstance(C88206tb.class, tbVar);
    }

    private C88206tb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238429e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238429e = b;
                return null;
            case 2:
                return newMessageInfo(f238424d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဌ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C88203sz.f238423a, C45240c.f118157a});
            case 3:
                return new C88206tb();
            case 4:
                return new C88202sy();
            case 5:
                return f238424d;
            case 6:
                C63010eb ebVar = f238425f;
                if (ebVar == null) {
                    synchronized (C88206tb.class) {
                        ebVar = f238425f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238424d);
                            f238425f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
