package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.engine.recognition.C77567at;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.agx;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gp */
/* compiled from: PG */
public final class C82954gp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82954gp f226321e;

    /* renamed from: f */
    private static volatile C63010eb f226322f;

    /* renamed from: a */
    public int f226323a;

    /* renamed from: b */
    public int f226324b;

    /* renamed from: c */
    public int f226325c = 1;

    /* renamed from: d */
    public agx f226326d;

    static {
        C82954gp gpVar = new C82954gp();
        f226321e = gpVar;
        C62942bv.registerDefaultInstance(C82954gp.class, gpVar);
    }

    private C82954gp() {
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
                return newMessageInfo(f226321e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C82953go.f226320a, C45240c.f118157a, C77567at.f213710a, "d"});
            case 3:
                return new C82954gp();
            case 4:
                return new C82952gn();
            case 5:
                return f226321e;
            case 6:
                C63010eb ebVar = f226322f;
                if (ebVar == null) {
                    synchronized (C82954gp.class) {
                        ebVar = f226322f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226321e);
                            f226322f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
