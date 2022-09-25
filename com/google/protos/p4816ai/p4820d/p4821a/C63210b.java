package com.google.protos.p4816ai.p4820d.p4821a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.a.b */
/* compiled from: PG */
public final class C63210b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63210b f170777e;

    /* renamed from: f */
    private static volatile C63010eb f170778f;

    /* renamed from: a */
    public int f170779a;

    /* renamed from: b */
    public int f170780b = 0;

    /* renamed from: c */
    public Object f170781c;

    /* renamed from: d */
    public String f170782d = BuildConfig.FLAVOR;

    static {
        C63210b bVar = new C63210b();
        f170777e = bVar;
        C62942bv.registerDefaultInstance(C63210b.class, bVar);
    }

    private C63210b() {
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
                return newMessageInfo(f170777e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C63216h.class, C63212d.class});
            case 3:
                return new C63210b();
            case 4:
                return new C63209a();
            case 5:
                return f170777e;
            case 6:
                C63010eb ebVar = f170778f;
                if (ebVar == null) {
                    synchronized (C63210b.class) {
                        ebVar = f170778f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170777e);
                            f170778f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
