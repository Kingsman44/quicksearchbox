package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.df */
/* compiled from: PG */
public final class C87778df extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87778df f237551c;

    /* renamed from: d */
    private static volatile C63010eb f237552d;

    /* renamed from: a */
    public int f237553a;

    /* renamed from: b */
    public int f237554b;

    static {
        C87778df dfVar = new C87778df();
        f237551c = dfVar;
        C62942bv.registerDefaultInstance(C87778df.class, dfVar);
    }

    private C87778df() {
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
                return newMessageInfo(f237551c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87778df();
            case 4:
                return new C87777de();
            case 5:
                return f237551c;
            case 6:
                C63010eb ebVar = f237552d;
                if (ebVar == null) {
                    synchronized (C87778df.class) {
                        ebVar = f237552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237551c);
                            f237552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
