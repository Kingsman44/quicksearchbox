package com.google.speech.p5199c.p5200a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.c.a.j */
/* compiled from: PG */
public final class C66465j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66465j f180727d;

    /* renamed from: e */
    private static volatile C63010eb f180728e;

    /* renamed from: a */
    public int f180729a;

    /* renamed from: b */
    public String f180730b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f180731c = emptyProtobufList();

    static {
        C66465j jVar = new C66465j();
        f180727d = jVar;
        C62942bv.registerDefaultInstance(C66465j.class, jVar);
    }

    private C66465j() {
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
                return newMessageInfo(f180727d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C66467l.class});
            case 3:
                return new C66465j();
            case 4:
                return new C66464i();
            case 5:
                return f180727d;
            case 6:
                C63010eb ebVar = f180728e;
                if (ebVar == null) {
                    synchronized (C66465j.class) {
                        ebVar = f180728e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180727d);
                            f180728e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
