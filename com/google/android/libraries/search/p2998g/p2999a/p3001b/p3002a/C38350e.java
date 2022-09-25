package com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.g.a.b.a.e */
/* compiled from: PG */
public final class C38350e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38350e f101536d;

    /* renamed from: e */
    public static final C62940bt f101537e;

    /* renamed from: f */
    private static volatile C63010eb f101538f;

    /* renamed from: a */
    public int f101539a;

    /* renamed from: b */
    public int f101540b;

    /* renamed from: c */
    public C67962d f101541c;

    static {
        C38350e eVar = new C38350e();
        f101536d = eVar;
        C62942bv.registerDefaultInstance(C38350e.class, eVar);
        f101537e = C62942bv.newSingularGeneratedExtension(C38348c.f101533a, eVar, eVar, (C62958ce) null, 227633569, C63066gd.MESSAGE, C38350e.class);
    }

    private C38350e() {
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
                return newMessageInfo(f101536d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38350e();
            case 4:
                return new C38349d();
            case 5:
                return f101536d;
            case 6:
                C63010eb ebVar = f101538f;
                if (ebVar == null) {
                    synchronized (C38350e.class) {
                        ebVar = f101538f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101536d);
                            f101538f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
