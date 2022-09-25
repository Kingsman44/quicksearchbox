package com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.a.a.e */
/* compiled from: PG */
public final class C33175e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33175e f88730c;

    /* renamed from: d */
    private static volatile C63010eb f88731d;

    /* renamed from: a */
    public int f88732a = 0;

    /* renamed from: b */
    public Object f88733b;

    static {
        C33175e eVar = new C33175e();
        f88730c = eVar;
        C62942bv.registerDefaultInstance(C33175e.class, eVar);
    }

    private C33175e() {
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
                return newMessageInfo(f88730c, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000", new Object[]{"b", "a", C33173c.class, C62912at.class, C62912at.class});
            case 3:
                return new C33175e();
            case 4:
                return new C33174d();
            case 5:
                return f88730c;
            case 6:
                C63010eb ebVar = f88731d;
                if (ebVar == null) {
                    synchronized (C33175e.class) {
                        ebVar = f88731d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88730c);
                            f88731d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
