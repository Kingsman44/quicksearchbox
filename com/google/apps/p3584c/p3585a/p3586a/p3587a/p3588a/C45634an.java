package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.an */
/* compiled from: PG */
public final class C45634an extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C45634an f120041e;

    /* renamed from: f */
    private static volatile C63010eb f120042f;

    /* renamed from: a */
    public int f120043a;

    /* renamed from: b */
    public int f120044b;

    /* renamed from: c */
    public String f120045c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f120046d;

    static {
        C45634an anVar = new C45634an();
        f120041e = anVar;
        C62942bv.registerDefaultInstance(C45634an.class, anVar);
    }

    private C45634an() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
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
                return newMessageInfo(f120041e, "\u0001\u0003\u0000\u0001\u0003\u000f\u0003\u0000\u0000\u0000\u0003ဇ\u0005\tဈ\u0004\u000fဌ\u0002", new Object[]{"a", "d", C45240c.f118157a, "b", C45673s.f120150a});
            case 3:
                return new C45634an();
            case 4:
                return new C45633am();
            case 5:
                return f120041e;
            case 6:
                C63010eb ebVar = f120042f;
                if (ebVar == null) {
                    synchronized (C45634an.class) {
                        ebVar = f120042f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120041e);
                            f120042f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
