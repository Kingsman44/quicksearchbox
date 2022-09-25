package com.google.p4283bv.p4284a.p4285a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4463ce.p4475b.C58058c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;

/* renamed from: com.google.bv.a.a.d */
/* compiled from: PG */
public final class C56604d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C56604d f151124a;

    /* renamed from: f */
    private static volatile C63010eb f151125f;

    /* renamed from: b */
    private int f151126b;

    /* renamed from: c */
    private C58058c f151127c;

    /* renamed from: d */
    private C63171d f151128d;

    /* renamed from: e */
    private byte f151129e = 2;

    static {
        C56604d dVar = new C56604d();
        f151124a = dVar;
        C62942bv.registerDefaultInstance(C56604d.class, dVar);
    }

    private C56604d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151129e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151129e = b;
                return null;
            case 2:
                return newMessageInfo(f151124a, "\u0001\u0002\u0000\u0001\u0007\u0012\u0002\u0000\u0000\u0001\u0007ဉ\u0002\u0012ᐉ\b", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C56604d();
            case 4:
                return new C56603c();
            case 5:
                return f151124a;
            case 6:
                C63010eb ebVar = f151125f;
                if (ebVar == null) {
                    synchronized (C56604d.class) {
                        ebVar = f151125f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151124a);
                            f151125f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
