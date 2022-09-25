package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ch */
/* compiled from: PG */
public final class C80340ch extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80340ch f220451d;

    /* renamed from: e */
    private static volatile C63010eb f220452e;

    /* renamed from: a */
    public int f220453a;

    /* renamed from: b */
    public C87693ab f220454b;

    /* renamed from: c */
    public int f220455c;

    static {
        C80340ch chVar = new C80340ch();
        f220451d = chVar;
        C62942bv.registerDefaultInstance(C80340ch.class, chVar);
    }

    private C80340ch() {
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
                return newMessageInfo(f220451d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80340ch();
            case 4:
                return new C80339cg();
            case 5:
                return f220451d;
            case 6:
                C63010eb ebVar = f220452e;
                if (ebVar == null) {
                    synchronized (C80340ch.class) {
                        ebVar = f220452e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220451d);
                            f220452e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
