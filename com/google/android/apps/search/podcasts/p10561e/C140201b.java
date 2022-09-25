package com.google.android.apps.search.podcasts.p10561e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63109h;

/* renamed from: com.google.android.apps.search.podcasts.e.b */
/* compiled from: PG */
public final class C140201b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C140201b f380906e;

    /* renamed from: f */
    private static volatile C63010eb f380907f;

    /* renamed from: a */
    public int f380908a;

    /* renamed from: b */
    public C63109h f380909b;

    /* renamed from: c */
    public String f380910c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f380911d;

    static {
        C140201b bVar = new C140201b();
        f380906e = bVar;
        C62942bv.registerDefaultInstance(C140201b.class, bVar);
    }

    private C140201b() {
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
                return newMessageInfo(f380906e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C140201b();
            case 4:
                return new C140199a();
            case 5:
                return f380906e;
            case 6:
                C63010eb ebVar = f380907f;
                if (ebVar == null) {
                    synchronized (C140201b.class) {
                        ebVar = f380907f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380906e);
                            f380907f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
