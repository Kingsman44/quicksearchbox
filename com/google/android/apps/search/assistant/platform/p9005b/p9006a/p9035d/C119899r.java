package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.r */
/* compiled from: PG */
public final class C119899r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119899r f333900c;

    /* renamed from: d */
    private static volatile C63010eb f333901d;

    /* renamed from: a */
    public int f333902a = 0;

    /* renamed from: b */
    public Object f333903b;

    static {
        C119899r rVar = new C119899r();
        f333900c = rVar;
        C62942bv.registerDefaultInstance(C119899r.class, rVar);
    }

    private C119899r() {
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
                return newMessageInfo(f333900c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C62912at.class, C62912at.class, C62912at.class});
            case 3:
                return new C119899r();
            case 4:
                return new C119897p();
            case 5:
                return f333900c;
            case 6:
                C63010eb ebVar = f333901d;
                if (ebVar == null) {
                    synchronized (C119899r.class) {
                        ebVar = f333901d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333900c);
                            f333901d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
