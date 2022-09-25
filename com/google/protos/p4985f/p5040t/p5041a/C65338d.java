package com.google.protos.p4985f.p5040t.p5041a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.t.a.d */
/* compiled from: PG */
public final class C65338d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65338d f176691d;

    /* renamed from: e */
    private static volatile C63010eb f176692e;

    /* renamed from: a */
    public int f176693a;

    /* renamed from: b */
    public C62971cq f176694b = emptyProtobufList();

    /* renamed from: c */
    public String f176695c = BuildConfig.FLAVOR;

    static {
        C65338d dVar = new C65338d();
        f176691d = dVar;
        C62942bv.registerDefaultInstance(C65338d.class, dVar);
    }

    private C65338d() {
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
                return newMessageInfo(f176691d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", C65337c.class, C45240c.f118157a});
            case 3:
                return new C65338d();
            case 4:
                return new C65335a();
            case 5:
                return f176691d;
            case 6:
                C63010eb ebVar = f176692e;
                if (ebVar == null) {
                    synchronized (C65338d.class) {
                        ebVar = f176692e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176691d);
                            f176692e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
