package com.google.protos.p4816ai;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aqs;
import com.google.p4242bp.p4253e.p4254a.C56188h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.ai.b */
/* compiled from: PG */
public final class C63194b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63194b f170728d;

    /* renamed from: e */
    public static final C62940bt f170729e;

    /* renamed from: f */
    private static volatile C63010eb f170730f;

    /* renamed from: a */
    public int f170731a;

    /* renamed from: b */
    public int f170732b;

    /* renamed from: c */
    public int f170733c = 1;

    static {
        C63194b bVar = new C63194b();
        f170728d = bVar;
        C62942bv.registerDefaultInstance(C63194b.class, bVar);
        f170729e = C62942bv.newSingularGeneratedExtension(aqs.f159780k, bVar, bVar, (C62958ce) null, 481, C63066gd.MESSAGE, C63194b.class);
    }

    private C63194b() {
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
                return newMessageInfo(f170728d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C56188h.m87919b()});
            case 3:
                return new C63194b();
            case 4:
                return new C63186a();
            case 5:
                return f170728d;
            case 6:
                C63010eb ebVar = f170730f;
                if (ebVar == null) {
                    synchronized (C63194b.class) {
                        ebVar = f170730f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170728d);
                            f170730f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
