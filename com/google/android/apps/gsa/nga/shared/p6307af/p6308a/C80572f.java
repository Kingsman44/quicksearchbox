package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.f */
/* compiled from: PG */
public final class C80572f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80572f f221163d;

    /* renamed from: e */
    private static volatile C63010eb f221164e;

    /* renamed from: a */
    public String f221165a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f221166b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C80584r f221167c;

    static {
        C80572f fVar = new C80572f();
        f221163d = fVar;
        C62942bv.registerDefaultInstance(C80572f.class, fVar);
    }

    private C80572f() {
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
                return newMessageInfo(f221163d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80572f();
            case 4:
                return new C80571e();
            case 5:
                return f221163d;
            case 6:
                C63010eb ebVar = f221164e;
                if (ebVar == null) {
                    synchronized (C80572f.class) {
                        ebVar = f221164e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221163d);
                            f221164e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
