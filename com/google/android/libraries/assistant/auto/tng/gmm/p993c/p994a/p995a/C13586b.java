package com.google.android.libraries.assistant.auto.tng.gmm.p993c.p994a.p995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.c.a.a.b */
/* compiled from: PG */
public final class C13586b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13586b f41593c;

    /* renamed from: d */
    private static volatile C63010eb f41594d;

    /* renamed from: a */
    public int f41595a;

    /* renamed from: b */
    public boolean f41596b;

    static {
        C13586b bVar = new C13586b();
        f41593c = bVar;
        C62942bv.registerDefaultInstance(C13586b.class, bVar);
    }

    private C13586b() {
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
                return newMessageInfo(f41593c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13586b();
            case 4:
                return new C13585a();
            case 5:
                return f41593c;
            case 6:
                C63010eb ebVar = f41594d;
                if (ebVar == null) {
                    synchronized (C13586b.class) {
                        ebVar = f41594d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41593c);
                            f41594d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
