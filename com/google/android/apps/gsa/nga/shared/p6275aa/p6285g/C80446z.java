package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.z */
/* compiled from: PG */
public final class C80446z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80446z f220797e;

    /* renamed from: f */
    private static volatile C63010eb f220798f;

    /* renamed from: a */
    public int f220799a;

    /* renamed from: b */
    public int f220800b = 0;

    /* renamed from: c */
    public Object f220801c;

    /* renamed from: d */
    public String f220802d = "en-US";

    static {
        C80446z zVar = new C80446z();
        f220797e = zVar;
        C62942bv.registerDefaultInstance(C80446z.class, zVar);
    }

    private C80446z() {
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
                return newMessageInfo(f220797e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ဈ\u0002", new Object[]{C45240c.f118157a, "b", "a", C80445y.class, "d"});
            case 3:
                return new C80446z();
            case 4:
                return new C80443w();
            case 5:
                return f220797e;
            case 6:
                C63010eb ebVar = f220798f;
                if (ebVar == null) {
                    synchronized (C80446z.class) {
                        ebVar = f220798f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220797e);
                            f220798f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
