package com.google.p4242bp.p4267h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.ad */
/* compiled from: PG */
public final class C56392ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56392ad f150392e;

    /* renamed from: f */
    private static volatile C63010eb f150393f;

    /* renamed from: a */
    public int f150394a;

    /* renamed from: b */
    public String f150395b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f150396c;

    /* renamed from: d */
    public C62971cq f150397d = C62942bv.emptyProtobufList();

    static {
        C56392ad adVar = new C56392ad();
        f150392e = adVar;
        C62942bv.registerDefaultInstance(C56392ad.class, adVar);
    }

    private C56392ad() {
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
                return newMessageInfo(f150392e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56392ad();
            case 4:
                return new C56391ac();
            case 5:
                return f150392e;
            case 6:
                C63010eb ebVar = f150393f;
                if (ebVar == null) {
                    synchronized (C56392ad.class) {
                        ebVar = f150393f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150392e);
                            f150393f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
