package com.google.android.apps.p464c.p465a.p466a.p467a.p468a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.c.a.a.a.a.b */
/* compiled from: PG */
public final class C9016b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9016b f31143e;

    /* renamed from: f */
    private static volatile C63010eb f31144f;

    /* renamed from: a */
    public int f31145a;

    /* renamed from: b */
    public String f31146b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f31147c;

    /* renamed from: d */
    public C62971cq f31148d = C62942bv.emptyProtobufList();

    static {
        C9016b bVar = new C9016b();
        f31143e = bVar;
        C62942bv.registerDefaultInstance(C9016b.class, bVar);
    }

    private C9016b() {
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
                return newMessageInfo(f31143e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9016b();
            case 4:
                return new C9015a();
            case 5:
                return f31143e;
            case 6:
                C63010eb ebVar = f31144f;
                if (ebVar == null) {
                    synchronized (C9016b.class) {
                        ebVar = f31144f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31143e);
                            f31144f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
