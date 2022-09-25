package com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.a.a.c */
/* compiled from: PG */
public final class C33173c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33173c f88726c;

    /* renamed from: d */
    private static volatile C63010eb f88727d;

    /* renamed from: a */
    public int f88728a = 0;

    /* renamed from: b */
    public Object f88729b;

    static {
        C33173c cVar = new C33173c();
        f88726c = cVar;
        C62942bv.registerDefaultInstance(C33173c.class, cVar);
    }

    private C33173c() {
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
                return newMessageInfo(f88726c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C62912at.class, C62912at.class, C62912at.class});
            case 3:
                return new C33173c();
            case 4:
                return new C33172b();
            case 5:
                return f88726c;
            case 6:
                C63010eb ebVar = f88727d;
                if (ebVar == null) {
                    synchronized (C33173c.class) {
                        ebVar = f88727d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88726c);
                            f88727d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
