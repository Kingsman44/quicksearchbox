package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.i */
/* compiled from: PG */
public final class C33681i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33681i f89994c;

    /* renamed from: d */
    private static volatile C63010eb f89995d;

    /* renamed from: a */
    public int f89996a = 0;

    /* renamed from: b */
    public Object f89997b;

    static {
        C33681i iVar = new C33681i();
        f89994c = iVar;
        C62942bv.registerDefaultInstance(C33681i.class, iVar);
    }

    private C33681i() {
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
                return newMessageInfo(f89994c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C33680h.class, C33675c.class});
            case 3:
                return new C33681i();
            case 4:
                return new C33678f();
            case 5:
                return f89994c;
            case 6:
                C63010eb ebVar = f89995d;
                if (ebVar == null) {
                    synchronized (C33681i.class) {
                        ebVar = f89995d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89994c);
                            f89995d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
