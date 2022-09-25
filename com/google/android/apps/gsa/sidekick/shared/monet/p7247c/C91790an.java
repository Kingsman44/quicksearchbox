package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.an */
/* compiled from: PG */
public final class C91790an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91790an f255963c;

    /* renamed from: d */
    private static volatile C63010eb f255964d;

    /* renamed from: a */
    public int f255965a;

    /* renamed from: b */
    public int f255966b;

    static {
        C91790an anVar = new C91790an();
        f255963c = anVar;
        C62942bv.registerDefaultInstance(C91790an.class, anVar);
    }

    private C91790an() {
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
                return newMessageInfo(f255963c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C91790an();
            case 4:
                return new C91789am();
            case 5:
                return f255963c;
            case 6:
                C63010eb ebVar = f255964d;
                if (ebVar == null) {
                    synchronized (C91790an.class) {
                        ebVar = f255964d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255963c);
                            f255964d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
