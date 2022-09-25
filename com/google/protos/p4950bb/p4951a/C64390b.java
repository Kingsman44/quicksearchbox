package com.google.protos.p4950bb.p4951a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5042u.C65356r;

/* renamed from: com.google.protos.bb.a.b */
/* compiled from: PG */
public final class C64390b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64390b f174635b;

    /* renamed from: c */
    public static final C62940bt f174636c;

    /* renamed from: e */
    private static volatile C63010eb f174637e;

    /* renamed from: a */
    public int f174638a;

    /* renamed from: d */
    private int f174639d;

    static {
        C64390b bVar = new C64390b();
        f174635b = bVar;
        C62942bv.registerDefaultInstance(C64390b.class, bVar);
        f174636c = C62942bv.newSingularGeneratedExtension(C65356r.f177743a, bVar, bVar, (C62958ce) null, 147079892, C63066gd.MESSAGE, C64390b.class);
    }

    private C64390b() {
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
                return newMessageInfo(f174635b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64390b();
            case 4:
                return new C64389a();
            case 5:
                return f174635b;
            case 6:
                C63010eb ebVar = f174637e;
                if (ebVar == null) {
                    synchronized (C64390b.class) {
                        ebVar = f174637e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174635b);
                            f174637e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
