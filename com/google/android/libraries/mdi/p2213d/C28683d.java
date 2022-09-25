package com.google.android.libraries.mdi.p2213d;

import com.google.android.gms.mdisync.C145086g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.d.d */
/* compiled from: PG */
public final class C28683d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C28683d f77943f;

    /* renamed from: g */
    private static volatile C63010eb f77944g;

    /* renamed from: a */
    public int f77945a;

    /* renamed from: b */
    public int f77946b = 0;

    /* renamed from: c */
    public Object f77947c;

    /* renamed from: d */
    public int f77948d;

    /* renamed from: e */
    public C28621c f77949e;

    static {
        C28683d dVar = new C28683d();
        f77943f = dVar;
        C62942bv.registerDefaultInstance(C28683d.class, dVar);
    }

    private C28683d() {
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
                return newMessageInfo(f77943f, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002င\u0005\u0003ဉ\u0006\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C28689j.class, "d", "e", C28685f.class, C145086g.class, C28691l.class, C28687h.class});
            case 3:
                return new C28683d();
            case 4:
                return new C28612a();
            case 5:
                return f77943f;
            case 6:
                C63010eb ebVar = f77944g;
                if (ebVar == null) {
                    synchronized (C28683d.class) {
                        ebVar = f77944g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77943f);
                            f77944g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
