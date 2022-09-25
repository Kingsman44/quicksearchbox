package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.phenotype.client.stable.b */
/* compiled from: PG */
public final class C31708b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C31708b f85249d;

    /* renamed from: e */
    private static volatile C63010eb f85250e;

    /* renamed from: a */
    public int f85251a;

    /* renamed from: b */
    public C62971cq f85252b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f85253c = BuildConfig.FLAVOR;

    static {
        C31708b bVar = new C31708b();
        f85249d = bVar;
        C62942bv.registerDefaultInstance(C31708b.class, bVar);
    }

    private C31708b() {
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
                return newMessageInfo(f85249d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C31708b();
            case 4:
                return new C31681a();
            case 5:
                return f85249d;
            case 6:
                C63010eb ebVar = f85250e;
                if (ebVar == null) {
                    synchronized (C31708b.class) {
                        ebVar = f85250e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85249d);
                            f85250e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
