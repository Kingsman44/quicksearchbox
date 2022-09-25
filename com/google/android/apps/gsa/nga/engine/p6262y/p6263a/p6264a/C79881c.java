package com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.a.a.c */
/* compiled from: PG */
public final class C79881c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79881c f218947d;

    /* renamed from: e */
    private static volatile C63010eb f218948e;

    /* renamed from: a */
    public int f218949a;

    /* renamed from: b */
    public int f218950b;

    /* renamed from: c */
    public String f218951c = BuildConfig.FLAVOR;

    static {
        C79881c cVar = new C79881c();
        f218947d = cVar;
        C62942bv.registerDefaultInstance(C79881c.class, cVar);
    }

    private C79881c() {
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
                return newMessageInfo(f218947d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", C79880b.f218946a, C45240c.f118157a});
            case 3:
                return new C79881c();
            case 4:
                return new C79879a();
            case 5:
                return f218947d;
            case 6:
                C63010eb ebVar = f218948e;
                if (ebVar == null) {
                    synchronized (C79881c.class) {
                        ebVar = f218948e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218947d);
                            f218948e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
