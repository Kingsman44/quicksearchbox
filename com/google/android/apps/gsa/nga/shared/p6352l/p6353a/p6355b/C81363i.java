package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80229bw;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b.i */
/* compiled from: PG */
public final class C81363i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81363i f222692d;

    /* renamed from: e */
    private static volatile C63010eb f222693e;

    /* renamed from: a */
    public int f222694a;

    /* renamed from: b */
    public C80229bw f222695b;

    /* renamed from: c */
    public C62971cq f222696c = emptyProtobufList();

    static {
        C81363i iVar = new C81363i();
        f222692d = iVar;
        C62942bv.registerDefaultInstance(C81363i.class, iVar);
    }

    private C81363i() {
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
                return newMessageInfo(f222692d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C80229bw.class});
            case 3:
                return new C81363i();
            case 4:
                return new C81362h();
            case 5:
                return f222692d;
            case 6:
                C63010eb ebVar = f222693e;
                if (ebVar == null) {
                    synchronized (C81363i.class) {
                        ebVar = f222693e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222692d);
                            f222693e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
