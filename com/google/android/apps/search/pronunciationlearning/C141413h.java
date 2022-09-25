package com.google.android.apps.search.pronunciationlearning;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.apz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.pronunciationlearning.h */
/* compiled from: PG */
public final class C141413h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C141413h f383852e;

    /* renamed from: f */
    private static volatile C63010eb f383853f;

    /* renamed from: a */
    public int f383854a;

    /* renamed from: b */
    public String f383855b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f383856c;

    /* renamed from: d */
    public C62971cq f383857d = C62942bv.emptyProtobufList();

    static {
        C141413h hVar = new C141413h();
        f383852e = hVar;
        C62942bv.registerDefaultInstance(C141413h.class, hVar);
    }

    private C141413h() {
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
                return newMessageInfo(f383852e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004\u001a", new Object[]{"a", "b", C45240c.f118157a, apz.f159712a, "d"});
            case 3:
                return new C141413h();
            case 4:
                return new C141412g();
            case 5:
                return f383852e;
            case 6:
                C63010eb ebVar = f383853f;
                if (ebVar == null) {
                    synchronized (C141413h.class) {
                        ebVar = f383853f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383852e);
                            f383853f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
