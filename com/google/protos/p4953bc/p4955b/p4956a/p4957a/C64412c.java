package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.a.a.c */
/* compiled from: PG */
public final class C64412c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64412c f174716a;

    /* renamed from: e */
    private static volatile C63010eb f174717e;

    /* renamed from: b */
    private int f174718b;

    /* renamed from: c */
    private C62995dn f174719c = C62995dn.f170057a;

    /* renamed from: d */
    private C64415f f174720d;

    static {
        C64412c cVar = new C64412c();
        f174716a = cVar;
        C62942bv.registerDefaultInstance(C64412c.class, cVar);
    }

    private C64412c() {
        emptyProtobufList();
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
                return newMessageInfo(f174716a, "\u0001\u0002\u0000\u0001\t\u000b\u0002\u0001\u0000\u0000\tဉ\b\u000b2", new Object[]{"b", "d", C45240c.f118157a, C64410a.f174715a});
            case 3:
                return new C64412c();
            case 4:
                return new C64411b();
            case 5:
                return f174716a;
            case 6:
                C63010eb ebVar = f174717e;
                if (ebVar == null) {
                    synchronized (C64412c.class) {
                        ebVar = f174717e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174716a);
                            f174717e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
