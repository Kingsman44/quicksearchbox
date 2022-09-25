package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.n */
/* compiled from: PG */
public final class C34304n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34304n f91228c;

    /* renamed from: e */
    private static volatile C63010eb f91229e;

    /* renamed from: a */
    public int f91230a = 0;

    /* renamed from: b */
    public Object f91231b;

    /* renamed from: d */
    private byte f91232d = 2;

    static {
        C34304n nVar = new C34304n();
        f91228c = nVar;
        C62942bv.registerDefaultInstance(C34304n.class, nVar);
    }

    private C34304n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f91232d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f91232d = b;
                return null;
            case 2:
                return newMessageInfo(f91228c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000", new Object[]{"b", "a", C34053bp.class, C34303m.class});
            case 3:
                return new C34304n();
            case 4:
                return new C34300j();
            case 5:
                return f91228c;
            case 6:
                C63010eb ebVar = f91229e;
                if (ebVar == null) {
                    synchronized (C34304n.class) {
                        ebVar = f91229e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91228c);
                            f91229e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
