package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.f */
/* compiled from: PG */
public final class C80779f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80779f f221691d;

    /* renamed from: e */
    private static volatile C63010eb f221692e;

    /* renamed from: a */
    public String f221693a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f221694b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f221695c;

    static {
        C80779f fVar = new C80779f();
        f221691d = fVar;
        C62942bv.registerDefaultInstance(C80779f.class, fVar);
    }

    private C80779f() {
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
                return newMessageInfo(f221691d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80779f();
            case 4:
                return new C80752e();
            case 5:
                return f221691d;
            case 6:
                C63010eb ebVar = f221692e;
                if (ebVar == null) {
                    synchronized (C80779f.class) {
                        ebVar = f221692e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221691d);
                            f221692e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
