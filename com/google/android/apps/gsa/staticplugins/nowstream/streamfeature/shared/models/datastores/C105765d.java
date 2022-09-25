package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.d */
/* compiled from: PG */
public final class C105765d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C105765d f295126d;

    /* renamed from: e */
    private static volatile C63010eb f295127e;

    /* renamed from: a */
    public int f295128a;

    /* renamed from: b */
    public int f295129b;

    /* renamed from: c */
    public int f295130c;

    static {
        C105765d dVar = new C105765d();
        f295126d = dVar;
        C62942bv.registerDefaultInstance(C105765d.class, dVar);
    }

    private C105765d() {
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
                return newMessageInfo(f295126d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0000\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C105765d();
            case 4:
                return new C105764c();
            case 5:
                return f295126d;
            case 6:
                C63010eb ebVar = f295127e;
                if (ebVar == null) {
                    synchronized (C105765d.class) {
                        ebVar = f295127e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295126d);
                            f295127e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
