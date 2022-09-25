package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.b */
/* compiled from: PG */
public final class C53090b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53090b f139119c;

    /* renamed from: d */
    private static volatile C63010eb f139120d;

    /* renamed from: a */
    public int f139121a;

    /* renamed from: b */
    public int f139122b;

    static {
        C53090b bVar = new C53090b();
        f139119c = bVar;
        C62942bv.registerDefaultInstance(C53090b.class, bVar);
    }

    private C53090b() {
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
                return newMessageInfo(f139119c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16389y.m33346b()});
            case 3:
                return new C53090b();
            case 4:
                return new C53063a();
            case 5:
                return f139119c;
            case 6:
                C63010eb ebVar = f139120d;
                if (ebVar == null) {
                    synchronized (C53090b.class) {
                        ebVar = f139120d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139119c);
                            f139120d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
