package com.google.android.apps.gsa.search.core.p6805i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.i.i */
/* compiled from: PG */
public final class C86113i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C86113i f232749f;

    /* renamed from: g */
    private static volatile C63010eb f232750g;

    /* renamed from: a */
    public int f232751a;

    /* renamed from: b */
    public int f232752b = 0;

    /* renamed from: c */
    public Object f232753c;

    /* renamed from: d */
    public String f232754d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f232755e;

    static {
        C86113i iVar = new C86113i();
        f232749f = iVar;
        C62942bv.registerDefaultInstance(C86113i.class, iVar);
    }

    private C86113i() {
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
                return newMessageInfo(f232749f, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002်\u0000\u0003ျ\u0000\u0004ဵ\u0000\u0005င\u0001\u0006ွ\u0000\u0007ဳ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e"});
            case 3:
                return new C86113i();
            case 4:
                return new C86112h();
            case 5:
                return f232749f;
            case 6:
                C63010eb ebVar = f232750g;
                if (ebVar == null) {
                    synchronized (C86113i.class) {
                        ebVar = f232750g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f232749f);
                            f232750g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
