package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.b.b.a.a.b */
/* compiled from: PG */
public final class C63129b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63129b f170472d;

    /* renamed from: e */
    private static volatile C63010eb f170473e;

    /* renamed from: a */
    public int f170474a;

    /* renamed from: b */
    public String f170475b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f170476c = BuildConfig.FLAVOR;

    static {
        C63129b bVar = new C63129b();
        f170472d = bVar;
        C62942bv.registerDefaultInstance(C63129b.class, bVar);
    }

    private C63129b() {
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
                return newMessageInfo(f170472d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63129b();
            case 4:
                return new C63128a();
            case 5:
                return f170472d;
            case 6:
                C63010eb ebVar = f170473e;
                if (ebVar == null) {
                    synchronized (C63129b.class) {
                        ebVar = f170473e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170472d);
                            f170473e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
