package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.gq */
/* compiled from: PG */
public final class C87870gq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87870gq f237721c;

    /* renamed from: d */
    private static volatile C63010eb f237722d;

    /* renamed from: a */
    public int f237723a;

    /* renamed from: b */
    public int f237724b = 1;

    static {
        C87870gq gqVar = new C87870gq();
        f237721c = gqVar;
        C62942bv.registerDefaultInstance(C87870gq.class, gqVar);
    }

    private C87870gq() {
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
                return newMessageInfo(f237721c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C87871gr.f237725a});
            case 3:
                return new C87870gq();
            case 4:
                return new C87869gp();
            case 5:
                return f237721c;
            case 6:
                C63010eb ebVar = f237722d;
                if (ebVar == null) {
                    synchronized (C87870gq.class) {
                        ebVar = f237722d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237721c);
                            f237722d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
