package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.eq */
/* compiled from: PG */
public final class C82901eq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82901eq f226139e;

    /* renamed from: f */
    private static volatile C63010eb f226140f;

    /* renamed from: a */
    public int f226141a;

    /* renamed from: b */
    public String f226142b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f226143c;

    /* renamed from: d */
    public C62971cq f226144d = emptyProtobufList();

    static {
        C82901eq eqVar = new C82901eq();
        f226139e = eqVar;
        C62942bv.registerDefaultInstance(C82901eq.class, eqVar);
    }

    private C82901eq() {
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
                return newMessageInfo(f226139e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C82900ep.m132422b(), "d", C82898en.class});
            case 3:
                return new C82901eq();
            case 4:
                return new C82894ej();
            case 5:
                return f226139e;
            case 6:
                C63010eb ebVar = f226140f;
                if (ebVar == null) {
                    synchronized (C82901eq.class) {
                        ebVar = f226140f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226139e);
                            f226140f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
