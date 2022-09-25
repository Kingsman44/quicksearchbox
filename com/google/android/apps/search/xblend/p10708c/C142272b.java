package com.google.android.apps.search.xblend.p10708c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.xblend.c.b */
/* compiled from: PG */
public final class C142272b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C142272b f385977e;

    /* renamed from: f */
    private static volatile C63010eb f385978f;

    /* renamed from: a */
    public int f385979a;

    /* renamed from: b */
    public C56943g f385980b;

    /* renamed from: c */
    public boolean f385981c;

    /* renamed from: d */
    public boolean f385982d;

    static {
        C142272b bVar = new C142272b();
        f385977e = bVar;
        C62942bv.registerDefaultInstance(C142272b.class, bVar);
    }

    private C142272b() {
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
                return newMessageInfo(f385977e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C142272b();
            case 4:
                return new C142271a();
            case 5:
                return f385977e;
            case 6:
                C63010eb ebVar = f385978f;
                if (ebVar == null) {
                    synchronized (C142272b.class) {
                        ebVar = f385978f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385977e);
                            f385978f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
