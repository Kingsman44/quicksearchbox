package com.google.android.libraries.gsa.p1880l;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.l.l */
/* compiled from: PG */
public final class C22884l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C22884l f62985g;

    /* renamed from: h */
    private static volatile C63010eb f62986h;

    /* renamed from: a */
    public int f62987a;

    /* renamed from: b */
    public int f62988b = 0;

    /* renamed from: c */
    public Object f62989c;

    /* renamed from: d */
    public int f62990d;

    /* renamed from: e */
    public C62971cq f62991e = emptyProtobufList();

    /* renamed from: f */
    public long f62992f;

    static {
        C22884l lVar = new C22884l();
        f62985g = lVar;
        C62942bv.registerDefaultInstance(C22884l.class, lVar);
    }

    private C22884l() {
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
                return newMessageInfo(f62985g, "\u0001\u0006\u0001\u0001\u0004\t\u0006\u0000\u0001\u0000\u0004ျ\u0000\u0005ျ\u0000\u0006ဌ\u0000\u0007ျ\u0000\b\u001b\tဂ\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", C22882j.f62984a, "e", C57566aj.class, C10662f.f35572a});
            case 3:
                return new C22884l();
            case 4:
                return new C22881i();
            case 5:
                return f62985g;
            case 6:
                C63010eb ebVar = f62986h;
                if (ebVar == null) {
                    synchronized (C22884l.class) {
                        ebVar = f62986h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62985g);
                            f62986h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
