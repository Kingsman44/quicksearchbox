package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.yq */
/* compiled from: PG */
public final class C88356yq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88356yq f238944d;

    /* renamed from: e */
    private static volatile C63010eb f238945e;

    /* renamed from: a */
    public int f238946a;

    /* renamed from: b */
    public String f238947b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f238948c = C62942bv.emptyProtobufList();

    static {
        C88356yq yqVar = new C88356yq();
        f238944d = yqVar;
        C62942bv.registerDefaultInstance(C88356yq.class, yqVar);
    }

    private C88356yq() {
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
                return newMessageInfo(f238944d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88356yq();
            case 4:
                return new C88355yp();
            case 5:
                return f238944d;
            case 6:
                C63010eb ebVar = f238945e;
                if (ebVar == null) {
                    synchronized (C88356yq.class) {
                        ebVar = f238945e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238944d);
                            f238945e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
