package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.d */
/* compiled from: PG */
public final class C80570d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80570d f221155f;

    /* renamed from: h */
    private static volatile C63010eb f221156h;

    /* renamed from: a */
    public C80572f f221157a;

    /* renamed from: b */
    public C80578l f221158b;

    /* renamed from: c */
    public C62971cq f221159c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f221160d;

    /* renamed from: e */
    public C63204j f221161e;

    /* renamed from: g */
    private byte f221162g = 2;

    static {
        C80570d dVar = new C80570d();
        f221155f = dVar;
        C62942bv.registerDefaultInstance(C80570d.class, dVar);
    }

    private C80570d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221162g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221162g = b;
                return null;
            case 2:
                return newMessageInfo(f221155f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0002\u0001\t\u0002Љ\u0003\u0004\u0004Ț\u0005Љ", new Object[]{"a", "b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C80570d();
            case 4:
                return new C80569c();
            case 5:
                return f221155f;
            case 6:
                C63010eb ebVar = f221156h;
                if (ebVar == null) {
                    synchronized (C80570d.class) {
                        ebVar = f221156h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221155f);
                            f221156h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
