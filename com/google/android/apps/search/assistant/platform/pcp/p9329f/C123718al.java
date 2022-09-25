package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.al */
/* compiled from: PG */
public final class C123718al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123718al f341732c;

    /* renamed from: d */
    private static volatile C63010eb f341733d;

    /* renamed from: a */
    public int f341734a;

    /* renamed from: b */
    public boolean f341735b;

    static {
        C123718al alVar = new C123718al();
        f341732c = alVar;
        C62942bv.registerDefaultInstance(C123718al.class, alVar);
    }

    private C123718al() {
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
                return newMessageInfo(f341732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C123718al();
            case 4:
                return new C123717ak();
            case 5:
                return f341732c;
            case 6:
                C63010eb ebVar = f341733d;
                if (ebVar == null) {
                    synchronized (C123718al.class) {
                        ebVar = f341733d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341732c);
                            f341733d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
