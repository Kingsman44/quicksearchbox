package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.android.libraries.mdi.C29690f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.k */
/* compiled from: PG */
public final class C17066k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17066k f49681c;

    /* renamed from: d */
    private static volatile C63010eb f49682d;

    /* renamed from: a */
    public int f49683a;

    /* renamed from: b */
    public C29690f f49684b;

    static {
        C17066k kVar = new C17066k();
        f49681c = kVar;
        C62942bv.registerDefaultInstance(C17066k.class, kVar);
    }

    private C17066k() {
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
                return newMessageInfo(f49681c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17066k();
            case 4:
                return new C17065j();
            case 5:
                return f49681c;
            case 6:
                C63010eb ebVar = f49682d;
                if (ebVar == null) {
                    synchronized (C17066k.class) {
                        ebVar = f49682d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49681c);
                            f49682d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
