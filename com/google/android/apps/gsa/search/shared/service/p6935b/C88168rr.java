package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.rr */
/* compiled from: PG */
public final class C88168rr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C88168rr f238341g;

    /* renamed from: h */
    private static volatile C63010eb f238342h;

    /* renamed from: a */
    public int f238343a;

    /* renamed from: b */
    public C62971cq f238344b = emptyProtobufList();

    /* renamed from: c */
    public String f238345c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f238346d;

    /* renamed from: e */
    public int f238347e;

    /* renamed from: f */
    public int f238348f;

    static {
        C88168rr rrVar = new C88168rr();
        f238341g = rrVar;
        C62942bv.registerDefaultInstance(C88168rr.class, rrVar);
    }

    private C88168rr() {
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
                return newMessageInfo(f238341g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001\u0004င\u0002\u0005င\u0003", new Object[]{"a", "b", C88165ro.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C88168rr();
            case 4:
                return new C88167rq();
            case 5:
                return f238341g;
            case 6:
                C63010eb ebVar = f238342h;
                if (ebVar == null) {
                    synchronized (C88168rr.class) {
                        ebVar = f238342h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238341g);
                            f238342h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
