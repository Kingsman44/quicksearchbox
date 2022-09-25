package com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.b.c.i */
/* compiled from: PG */
public final class C36485i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C36485i f95232e;

    /* renamed from: f */
    private static volatile C63010eb f95233f;

    /* renamed from: a */
    public int f95234a;

    /* renamed from: b */
    public C36482f f95235b;

    /* renamed from: c */
    public C36480d f95236c;

    /* renamed from: d */
    public C36484h f95237d;

    static {
        C36485i iVar = new C36485i();
        f95232e = iVar;
        C62942bv.registerDefaultInstance(C36485i.class, iVar);
    }

    private C36485i() {
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
                return newMessageInfo(f95232e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C36485i();
            case 4:
                return new C36478b();
            case 5:
                return f95232e;
            case 6:
                C63010eb ebVar = f95233f;
                if (ebVar == null) {
                    synchronized (C36485i.class) {
                        ebVar = f95233f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95232e);
                            f95233f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
