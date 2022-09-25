package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.j */
/* compiled from: PG */
public final class C91803j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91803j f256027c;

    /* renamed from: d */
    private static volatile C63010eb f256028d;

    /* renamed from: a */
    public int f256029a;

    /* renamed from: b */
    public int f256030b;

    static {
        C91803j jVar = new C91803j();
        f256027c = jVar;
        C62942bv.registerDefaultInstance(C91803j.class, jVar);
    }

    private C91803j() {
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
                return newMessageInfo(f256027c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C91803j();
            case 4:
                return new C91802i();
            case 5:
                return f256027c;
            case 6:
                C63010eb ebVar = f256028d;
                if (ebVar == null) {
                    synchronized (C91803j.class) {
                        ebVar = f256028d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256027c);
                            f256028d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
