package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.gk */
/* compiled from: PG */
public final class C87864gk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87864gk f237709c;

    /* renamed from: d */
    private static volatile C63010eb f237710d;

    /* renamed from: a */
    public int f237711a;

    /* renamed from: b */
    public int f237712b;

    static {
        C87864gk gkVar = new C87864gk();
        f237709c = gkVar;
        C62942bv.registerDefaultInstance(C87864gk.class, gkVar);
    }

    private C87864gk() {
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
                return newMessageInfo(f237709c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87864gk();
            case 4:
                return new C87863gj();
            case 5:
                return f237709c;
            case 6:
                C63010eb ebVar = f237710d;
                if (ebVar == null) {
                    synchronized (C87864gk.class) {
                        ebVar = f237710d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237709c);
                            f237710d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
