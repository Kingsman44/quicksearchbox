package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hp */
/* compiled from: PG */
public final class C87896hp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87896hp f237775c;

    /* renamed from: d */
    private static volatile C63010eb f237776d;

    /* renamed from: a */
    public int f237777a;

    /* renamed from: b */
    public boolean f237778b;

    static {
        C87896hp hpVar = new C87896hp();
        f237775c = hpVar;
        C62942bv.registerDefaultInstance(C87896hp.class, hpVar);
    }

    private C87896hp() {
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
                return newMessageInfo(f237775c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87896hp();
            case 4:
                return new C87895ho();
            case 5:
                return f237775c;
            case 6:
                C63010eb ebVar = f237776d;
                if (ebVar == null) {
                    synchronized (C87896hp.class) {
                        ebVar = f237776d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237775c);
                            f237776d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
