package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.y */
/* compiled from: PG */
public final class C79593y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C79593y f218377c;

    /* renamed from: e */
    private static volatile C63010eb f218378e;

    /* renamed from: a */
    public C62971cq f218379a = emptyProtobufList();

    /* renamed from: b */
    public int f218380b;

    /* renamed from: d */
    private int f218381d;

    static {
        C79593y yVar = new C79593y();
        f218377c = yVar;
        C62942bv.registerDefaultInstance(C79593y.class, yVar);
    }

    private C79593y() {
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
                return newMessageInfo(f218377c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "a", C79591w.class, "b", C79575g.f218350a});
            case 3:
                return new C79593y();
            case 4:
                return new C79592x();
            case 5:
                return f218377c;
            case 6:
                C63010eb ebVar = f218378e;
                if (ebVar == null) {
                    synchronized (C79593y.class) {
                        ebVar = f218378e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218377c);
                            f218378e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
