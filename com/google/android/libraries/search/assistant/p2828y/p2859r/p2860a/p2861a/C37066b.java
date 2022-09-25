package com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.search.assistant.y.r.a.a.b */
/* compiled from: PG */
public final class C37066b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37066b f96554c;

    /* renamed from: d */
    private static volatile C63010eb f96555d;

    /* renamed from: a */
    public int f96556a;

    /* renamed from: b */
    public int f96557b;

    static {
        C37066b bVar = new C37066b();
        f96554c = bVar;
        C62942bv.registerDefaultInstance(C37066b.class, bVar);
    }

    private C37066b() {
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
                return newMessageInfo(f96554c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C65753ak.m96798c()});
            case 3:
                return new C37066b();
            case 4:
                return new C37065a();
            case 5:
                return f96554c;
            case 6:
                C63010eb ebVar = f96555d;
                if (ebVar == null) {
                    synchronized (C37066b.class) {
                        ebVar = f96555d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f96554c);
                            f96555d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
