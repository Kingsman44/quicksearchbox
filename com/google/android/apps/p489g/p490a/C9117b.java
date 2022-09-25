package com.google.android.apps.p489g.p490a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.g.a.b */
/* compiled from: PG */
public final class C9117b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9117b f31385d;

    /* renamed from: e */
    public static final C62940bt f31386e;

    /* renamed from: f */
    private static volatile C63010eb f31387f;

    /* renamed from: a */
    public int f31388a;

    /* renamed from: b */
    public boolean f31389b;

    /* renamed from: c */
    public boolean f31390c;

    static {
        C9117b bVar = new C9117b();
        f31385d = bVar;
        C62942bv.registerDefaultInstance(C9117b.class, bVar);
        f31386e = C62942bv.newSingularGeneratedExtension(C7718hj.f26927af, bVar, bVar, (C62958ce) null, 905, C63066gd.MESSAGE, C9117b.class);
    }

    private C9117b() {
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
                return newMessageInfo(f31385d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9117b();
            case 4:
                return new C9116a();
            case 5:
                return f31385d;
            case 6:
                C63010eb ebVar = f31387f;
                if (ebVar == null) {
                    synchronized (C9117b.class) {
                        ebVar = f31387f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31385d);
                            f31387f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
