package com.google.android.libraries.gsa.actionusermodel.p1830c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c.i */
/* compiled from: PG */
public final class C22106i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C22106i f60930e;

    /* renamed from: f */
    private static volatile C63010eb f60931f;

    /* renamed from: a */
    public int f60932a;

    /* renamed from: b */
    public String f60933b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f60934c;

    /* renamed from: d */
    public C62971cq f60935d = emptyProtobufList();

    static {
        C22106i iVar = new C22106i();
        f60930e = iVar;
        C62942bv.registerDefaultInstance(C22106i.class, iVar);
    }

    private C22106i() {
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
                return newMessageInfo(f60930e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C22104g.class});
            case 3:
                return new C22106i();
            case 4:
                return new C22105h();
            case 5:
                return f60930e;
            case 6:
                C63010eb ebVar = f60931f;
                if (ebVar == null) {
                    synchronized (C22106i.class) {
                        ebVar = f60931f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60930e);
                            f60931f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
