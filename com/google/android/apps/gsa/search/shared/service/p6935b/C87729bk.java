package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bk */
/* compiled from: PG */
public final class C87729bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87729bk f237209c;

    /* renamed from: d */
    private static volatile C63010eb f237210d;

    /* renamed from: a */
    public int f237211a;

    /* renamed from: b */
    public int f237212b;

    static {
        C87729bk bkVar = new C87729bk();
        f237209c = bkVar;
        C62942bv.registerDefaultInstance(C87729bk.class, bkVar);
    }

    private C87729bk() {
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
                return newMessageInfo(f237209c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C87726bh.m142760b()});
            case 3:
                return new C87729bk();
            case 4:
                return new C87728bj();
            case 5:
                return f237209c;
            case 6:
                C63010eb ebVar = f237210d;
                if (ebVar == null) {
                    synchronized (C87729bk.class) {
                        ebVar = f237210d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237209c);
                            f237210d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
