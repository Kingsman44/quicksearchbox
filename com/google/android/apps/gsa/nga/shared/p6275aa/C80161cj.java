package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cj */
/* compiled from: PG */
public final class C80161cj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80161cj f219962e;

    /* renamed from: f */
    private static volatile C63010eb f219963f;

    /* renamed from: a */
    public int f219964a;

    /* renamed from: b */
    public String f219965b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f219966c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f219967d = BuildConfig.FLAVOR;

    static {
        C80161cj cjVar = new C80161cj();
        f219962e = cjVar;
        C62942bv.registerDefaultInstance(C80161cj.class, cjVar);
    }

    private C80161cj() {
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
                return newMessageInfo(f219962e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80161cj();
            case 4:
                return new C80160ci();
            case 5:
                return f219962e;
            case 6:
                C63010eb ebVar = f219963f;
                if (ebVar == null) {
                    synchronized (C80161cj.class) {
                        ebVar = f219963f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219962e);
                            f219963f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
