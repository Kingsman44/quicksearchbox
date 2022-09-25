package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.fv */
/* compiled from: PG */
public final class C7676fv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7676fv f26648c;

    /* renamed from: e */
    private static volatile C63010eb f26649e;

    /* renamed from: a */
    public int f26650a;

    /* renamed from: b */
    public C62961ch f26651b = emptyIntList();

    /* renamed from: d */
    private int f26652d;

    static {
        C7676fv fvVar = new C7676fv();
        f26648c = fvVar;
        C62942bv.registerDefaultInstance(C7676fv.class, fvVar);
    }

    private C7676fv() {
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
                return newMessageInfo(f26648c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001f", new Object[]{"d", "a", "b"});
            case 3:
                return new C7676fv();
            case 4:
                return new C7675fu();
            case 5:
                return f26648c;
            case 6:
                C63010eb ebVar = f26649e;
                if (ebVar == null) {
                    synchronized (C7676fv.class) {
                        ebVar = f26649e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26648c);
                            f26649e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
