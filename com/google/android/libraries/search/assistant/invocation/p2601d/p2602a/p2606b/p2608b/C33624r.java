package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.r */
/* compiled from: PG */
public final class C33624r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33624r f89856c;

    /* renamed from: d */
    private static volatile C63010eb f89857d;

    /* renamed from: a */
    public int f89858a = 0;

    /* renamed from: b */
    public Object f89859b;

    static {
        C33624r rVar = new C33624r();
        f89856c = rVar;
        C62942bv.registerDefaultInstance(C33624r.class, rVar);
    }

    private C33624r() {
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
                return newMessageInfo(f89856c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C33614h.class, C33628v.class, C33619m.class});
            case 3:
                return new C33624r();
            case 4:
                return new C33623q();
            case 5:
                return f89856c;
            case 6:
                C63010eb ebVar = f89857d;
                if (ebVar == null) {
                    synchronized (C33624r.class) {
                        ebVar = f89857d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89856c);
                            f89857d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
