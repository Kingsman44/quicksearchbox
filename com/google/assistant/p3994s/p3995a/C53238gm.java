package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.gm */
/* compiled from: PG */
public final class C53238gm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53238gm f139535e;

    /* renamed from: f */
    private static volatile C63010eb f139536f;

    /* renamed from: a */
    public int f139537a;

    /* renamed from: b */
    public String f139538b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139539c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139540d = BuildConfig.FLAVOR;

    static {
        C53238gm gmVar = new C53238gm();
        f139535e = gmVar;
        C62942bv.registerDefaultInstance(C53238gm.class, gmVar);
    }

    private C53238gm() {
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
                return newMessageInfo(f139535e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53238gm();
            case 4:
                return new C53237gl();
            case 5:
                return f139535e;
            case 6:
                C63010eb ebVar = f139536f;
                if (ebVar == null) {
                    synchronized (C53238gm.class) {
                        ebVar = f139536f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139535e);
                            f139536f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
