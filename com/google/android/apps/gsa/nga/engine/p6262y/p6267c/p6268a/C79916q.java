package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.q */
/* compiled from: PG */
public final class C79916q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C79916q f219049e;

    /* renamed from: f */
    private static volatile C63010eb f219050f;

    /* renamed from: a */
    public int f219051a;

    /* renamed from: b */
    public C62971cq f219052b = emptyProtobufList();

    /* renamed from: c */
    public int f219053c;

    /* renamed from: d */
    public String f219054d = BuildConfig.FLAVOR;

    static {
        C79916q qVar = new C79916q();
        f219049e = qVar;
        C62942bv.registerDefaultInstance(C79916q.class, qVar);
    }

    private C79916q() {
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
                return newMessageInfo(f219049e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C79918s.class, C45240c.f118157a, "d"});
            case 3:
                return new C79916q();
            case 4:
                return new C79915p();
            case 5:
                return f219049e;
            case 6:
                C63010eb ebVar = f219050f;
                if (ebVar == null) {
                    synchronized (C79916q.class) {
                        ebVar = f219050f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219049e);
                            f219050f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
