package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.ab */
/* compiled from: PG */
public final class C33595ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33595ab f89813c;

    /* renamed from: d */
    private static volatile C63010eb f89814d;

    /* renamed from: a */
    public int f89815a = 0;

    /* renamed from: b */
    public Object f89816b;

    static {
        C33595ab abVar = new C33595ab();
        f89813c = abVar;
        C62942bv.registerDefaultInstance(C33595ab.class, abVar);
    }

    private C33595ab() {
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
                return newMessageInfo(f89813c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C33594aa.class, C33617k.class});
            case 3:
                return new C33595ab();
            case 4:
                return new C33631y();
            case 5:
                return f89813c;
            case 6:
                C63010eb ebVar = f89814d;
                if (ebVar == null) {
                    synchronized (C33595ab.class) {
                        ebVar = f89814d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89813c);
                            f89814d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
