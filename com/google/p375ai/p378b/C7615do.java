package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.do */
/* compiled from: PG */
public final class C7615do extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7615do f26312d;

    /* renamed from: e */
    private static volatile C63010eb f26313e;

    /* renamed from: a */
    public int f26314a;

    /* renamed from: b */
    public C7805kp f26315b;

    /* renamed from: c */
    public String f26316c = BuildConfig.FLAVOR;

    static {
        C7615do doVar = new C7615do();
        f26312d = doVar;
        C62942bv.registerDefaultInstance(C7615do.class, doVar);
    }

    private C7615do() {
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
                return newMessageInfo(f26312d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7615do();
            case 4:
                return new C7614dn();
            case 5:
                return f26312d;
            case 6:
                C63010eb ebVar = f26313e;
                if (ebVar == null) {
                    synchronized (C7615do.class) {
                        ebVar = f26313e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26312d);
                            f26313e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
