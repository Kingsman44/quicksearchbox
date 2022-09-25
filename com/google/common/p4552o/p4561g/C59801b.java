package com.google.common.p4552o.p4561g;

import com.google.common.p4552o.apr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.g.b */
/* compiled from: PG */
public final class C59801b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59801b f161610c;

    /* renamed from: d */
    public static final C62940bt f161611d;

    /* renamed from: e */
    private static volatile C63010eb f161612e;

    /* renamed from: a */
    public int f161613a;

    /* renamed from: b */
    public C59803d f161614b;

    static {
        C59801b bVar = new C59801b();
        f161610c = bVar;
        C62942bv.registerDefaultInstance(C59801b.class, bVar);
        f161611d = C62942bv.newSingularGeneratedExtension(apr.f159695c, bVar, bVar, (C62958ce) null, 340994226, C63066gd.MESSAGE, C59801b.class);
    }

    private C59801b() {
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
                return newMessageInfo(f161610c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59801b();
            case 4:
                return new C59800a();
            case 5:
                return f161610c;
            case 6:
                C63010eb ebVar = f161612e;
                if (ebVar == null) {
                    synchronized (C59801b.class) {
                        ebVar = f161612e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161610c);
                            f161612e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
