package com.google.protos.p4932ax.p4933a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ax.a.e */
/* compiled from: PG */
public final class C64265e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64265e f173756d;

    /* renamed from: e */
    private static volatile C63010eb f173757e;

    /* renamed from: a */
    public int f173758a;

    /* renamed from: b */
    public String f173759b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f173760c = emptyProtobufList();

    static {
        C64265e eVar = new C64265e();
        f173756d = eVar;
        C62942bv.registerDefaultInstance(C64265e.class, eVar);
    }

    private C64265e() {
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
                return newMessageInfo(f173756d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C64264d.class});
            case 3:
                return new C64265e();
            case 4:
                return new C64261a();
            case 5:
                return f173756d;
            case 6:
                C63010eb ebVar = f173757e;
                if (ebVar == null) {
                    synchronized (C64265e.class) {
                        ebVar = f173757e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173756d);
                            f173757e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
