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

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wj */
/* compiled from: PG */
public final class C88295wj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C88295wj f238797g;

    /* renamed from: h */
    private static volatile C63010eb f238798h;

    /* renamed from: a */
    public int f238799a;

    /* renamed from: b */
    public String f238800b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f238801c = emptyProtobufList();

    /* renamed from: d */
    public C87890hj f238802d;

    /* renamed from: e */
    public String f238803e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f238804f;

    static {
        C88295wj wjVar = new C88295wj();
        f238797g = wjVar;
        C62942bv.registerDefaultInstance(C88295wj.class, wjVar);
    }

    private C88295wj() {
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
                return newMessageInfo(f238797g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, C88337xy.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C88295wj();
            case 4:
                return new C88294wi();
            case 5:
                return f238797g;
            case 6:
                C63010eb ebVar = f238798h;
                if (ebVar == null) {
                    synchronized (C88295wj.class) {
                        ebVar = f238798h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238797g);
                            f238798h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
