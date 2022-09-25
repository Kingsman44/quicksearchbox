package com.google.protos.p4794ae.p4795a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4794ae.p4795a.p4796a.C63147a;

/* renamed from: com.google.protos.ae.a.b */
/* compiled from: PG */
public final class C63148b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63148b f170519d;

    /* renamed from: e */
    private static volatile C63010eb f170520e;

    /* renamed from: a */
    public int f170521a;

    /* renamed from: b */
    public String f170522b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f170523c;

    static {
        C63148b bVar = new C63148b();
        f170519d = bVar;
        C62942bv.registerDefaultInstance(C63148b.class, bVar);
    }

    private C63148b() {
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
                return newMessageInfo(f170519d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C63147a.f170518a});
            case 3:
                return new C63148b();
            case 4:
                return new C63146a();
            case 5:
                return f170519d;
            case 6:
                C63010eb ebVar = f170520e;
                if (ebVar == null) {
                    synchronized (C63148b.class) {
                        ebVar = f170520e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170519d);
                            f170520e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
