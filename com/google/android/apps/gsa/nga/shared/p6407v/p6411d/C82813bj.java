package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60421pp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.bj */
/* compiled from: PG */
public final class C82813bj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82813bj f225656e;

    /* renamed from: f */
    private static volatile C63010eb f225657f;

    /* renamed from: a */
    public int f225658a;

    /* renamed from: b */
    public long f225659b;

    /* renamed from: c */
    public long f225660c;

    /* renamed from: d */
    public C60421pp f225661d;

    static {
        C82813bj bjVar = new C82813bj();
        f225656e = bjVar;
        C62942bv.registerDefaultInstance(C82813bj.class, bjVar);
    }

    private C82813bj() {
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
                return newMessageInfo(f225656e, "\u0001\u0003\u0000\u0001\u00016\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u00016ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C82813bj();
            case 4:
                return new C82812bi();
            case 5:
                return f225656e;
            case 6:
                C63010eb ebVar = f225657f;
                if (ebVar == null) {
                    synchronized (C82813bj.class) {
                        ebVar = f225657f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225656e);
                            f225657f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
