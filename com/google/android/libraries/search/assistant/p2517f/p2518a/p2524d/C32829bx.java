package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.bx */
/* compiled from: PG */
public final class C32829bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32829bx f88025c;

    /* renamed from: e */
    private static volatile C63010eb f88026e;

    /* renamed from: a */
    public int f88027a;

    /* renamed from: b */
    public C34053bp f88028b;

    /* renamed from: d */
    private byte f88029d = 2;

    static {
        C32829bx bxVar = new C32829bx();
        f88025c = bxVar;
        C62942bv.registerDefaultInstance(C32829bx.class, bxVar);
    }

    private C32829bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f88029d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f88029d = b;
                return null;
            case 2:
                return newMessageInfo(f88025c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32829bx();
            case 4:
                return new C32828bw();
            case 5:
                return f88025c;
            case 6:
                C63010eb ebVar = f88026e;
                if (ebVar == null) {
                    synchronized (C32829bx.class) {
                        ebVar = f88026e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88025c);
                            f88026e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
