package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.z */
/* compiled from: PG */
public final class C83017z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83017z f226625d;

    /* renamed from: e */
    private static volatile C63010eb f226626e;

    /* renamed from: a */
    public int f226627a;

    /* renamed from: b */
    public int f226628b;

    /* renamed from: c */
    public C82907ew f226629c;

    static {
        C83017z zVar = new C83017z();
        f226625d = zVar;
        C62942bv.registerDefaultInstance(C83017z.class, zVar);
    }

    private C83017z() {
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
                return newMessageInfo(f226625d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C83016y.m132449b(), C45240c.f118157a});
            case 3:
                return new C83017z();
            case 4:
                return new C83014w();
            case 5:
                return f226625d;
            case 6:
                C63010eb ebVar = f226626e;
                if (ebVar == null) {
                    synchronized (C83017z.class) {
                        ebVar = f226626e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226625d);
                            f226626e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
