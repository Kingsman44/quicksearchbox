package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3863av.p3873e.p3874a.C50565a;
import com.google.assistant.p3863av.p3873e.p3874a.C50566b;
import com.google.assistant.p3863av.p3873e.p3874a.C50567c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.h */
/* compiled from: PG */
public final class C65839h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C65839h f178976g;

    /* renamed from: h */
    private static volatile C63010eb f178977h;

    /* renamed from: a */
    public int f178978a;

    /* renamed from: b */
    public String f178979b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f178980c;

    /* renamed from: d */
    public int f178981d;

    /* renamed from: e */
    public long f178982e;

    /* renamed from: f */
    public int f178983f;

    static {
        C65839h hVar = new C65839h();
        f178976g = hVar;
        C62942bv.registerDefaultInstance(C65839h.class, hVar);
    }

    private C65839h() {
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
                return newMessageInfo(f178976g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C50565a.f131601a, "d", C50566b.f131602a, "e", C10662f.f35572a, C50567c.f131603a});
            case 3:
                return new C65839h();
            case 4:
                return new C65838g();
            case 5:
                return f178976g;
            case 6:
                C63010eb ebVar = f178977h;
                if (ebVar == null) {
                    synchronized (C65839h.class) {
                        ebVar = f178977h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178976g);
                            f178977h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
