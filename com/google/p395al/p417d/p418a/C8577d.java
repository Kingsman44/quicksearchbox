package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.d */
/* compiled from: PG */
public final class C8577d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8577d f29698b;

    /* renamed from: d */
    private static volatile C63010eb f29699d;

    /* renamed from: a */
    public String f29700a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f29701c;

    static {
        C8577d dVar = new C8577d();
        f29698b = dVar;
        C62942bv.registerDefaultInstance(C8577d.class, dVar);
    }

    private C8577d() {
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
                return newMessageInfo(f29698b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8577d();
            case 4:
                return new C8576c();
            case 5:
                return f29698b;
            case 6:
                C63010eb ebVar = f29699d;
                if (ebVar == null) {
                    synchronized (C8577d.class) {
                        ebVar = f29699d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29698b);
                            f29699d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
