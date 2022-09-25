package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.bc */
/* compiled from: PG */
public final class C97904bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97904bc f273357e;

    /* renamed from: f */
    private static volatile C63010eb f273358f;

    /* renamed from: a */
    public int f273359a;

    /* renamed from: b */
    public C63113l f273360b;

    /* renamed from: c */
    public C63111j f273361c;

    /* renamed from: d */
    public C97875aa f273362d;

    static {
        C97904bc bcVar = new C97904bc();
        f273357e = bcVar;
        C62942bv.registerDefaultInstance(C97904bc.class, bcVar);
    }

    private C97904bc() {
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
                return newMessageInfo(f273357e, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0006ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C97904bc();
            case 4:
                return new C97903bb();
            case 5:
                return f273357e;
            case 6:
                C63010eb ebVar = f273358f;
                if (ebVar == null) {
                    synchronized (C97904bc.class) {
                        ebVar = f273358f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273357e);
                            f273358f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
