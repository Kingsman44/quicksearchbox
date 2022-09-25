package com.google.android.libraries.p590as.p593b.p596b.p604g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4934ay.p4935a.p4936a.C64272b;
import com.google.speech.p5218j.C66964g;

/* renamed from: com.google.android.libraries.as.b.b.g.g */
/* compiled from: PG */
public final class C10879g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f35957f = new C10877e();

    /* renamed from: g */
    public static final C10879g f35958g;

    /* renamed from: h */
    private static volatile C63010eb f35959h;

    /* renamed from: a */
    public int f35960a;

    /* renamed from: b */
    public String f35961b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f35962c;

    /* renamed from: d */
    public int f35963d;

    /* renamed from: e */
    public C62961ch f35964e = emptyIntList();

    static {
        C10879g gVar = new C10879g();
        f35958g = gVar;
        C62942bv.registerDefaultInstance(C10879g.class, gVar);
    }

    private C10879g() {
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
                return newMessageInfo(f35958g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004,", new Object[]{"a", "b", C45240c.f118157a, "d", C66964g.m97397b(), "e", C64272b.m96375b()});
            case 3:
                return new C10879g();
            case 4:
                return new C10878f();
            case 5:
                return f35958g;
            case 6:
                C63010eb ebVar = f35959h;
                if (ebVar == null) {
                    synchronized (C10879g.class) {
                        ebVar = f35959h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35958g);
                            f35959h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
