package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.a.d */
/* compiled from: PG */
public final class C37028d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37028d f96456c;

    /* renamed from: d */
    public static final C62940bt f96457d;

    /* renamed from: e */
    private static volatile C63010eb f96458e;

    /* renamed from: a */
    public int f96459a;

    /* renamed from: b */
    public int f96460b;

    static {
        C37028d dVar = new C37028d();
        f96456c = dVar;
        C62942bv.registerDefaultInstance(C37028d.class, dVar);
        f96457d = C62942bv.newSingularGeneratedExtension(C32810be.f87993c, dVar, dVar, (C62958ce) null, 427618636, C63066gd.MESSAGE, C37028d.class);
    }

    private C37028d() {
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
                return newMessageInfo(f96456c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
            case 3:
                return new C37028d();
            case 4:
                return new C37027c();
            case 5:
                return f96456c;
            case 6:
                C63010eb ebVar = f96458e;
                if (ebVar == null) {
                    synchronized (C37028d.class) {
                        ebVar = f96458e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f96456c);
                            f96458e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
