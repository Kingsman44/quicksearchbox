package com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a;

import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.a.a.f */
/* compiled from: PG */
public final class C33176f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33176f f88734c;

    /* renamed from: d */
    private static volatile C63010eb f88735d;

    /* renamed from: a */
    public int f88736a = 0;

    /* renamed from: b */
    public Object f88737b;

    static {
        C33176f fVar = new C33176f();
        f88734c = fVar;
        C62942bv.registerDefaultInstance(C33176f.class, fVar);
    }

    private C33176f() {
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
                return newMessageInfo(f88734c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C62912at.class, C33175e.class});
            case 3:
                return new C33176f();
            case 4:
                return new C33171a();
            case 5:
                return f88734c;
            case 6:
                C63010eb ebVar = f88735d;
                if (ebVar == null) {
                    synchronized (C33176f.class) {
                        ebVar = f88735d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88734c);
                            f88735d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
