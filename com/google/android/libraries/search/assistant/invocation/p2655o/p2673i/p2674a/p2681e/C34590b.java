package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e;

import com.google.android.libraries.search.p3055n.C39264an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e.b */
/* compiled from: PG */
public final class C34590b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34590b f91893c;

    /* renamed from: d */
    private static volatile C63010eb f91894d;

    /* renamed from: a */
    public int f91895a;

    /* renamed from: b */
    public C39264an f91896b;

    static {
        C34590b bVar = new C34590b();
        f91893c = bVar;
        C62942bv.registerDefaultInstance(C34590b.class, bVar);
    }

    private C34590b() {
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
                return newMessageInfo(f91893c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34590b();
            case 4:
                return new C34589a();
            case 5:
                return f91893c;
            case 6:
                C63010eb ebVar = f91894d;
                if (ebVar == null) {
                    synchronized (C34590b.class) {
                        ebVar = f91894d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91893c);
                            f91894d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
