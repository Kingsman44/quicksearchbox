package com.google.protos.p5127o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.y */
/* compiled from: PG */
public final class C65699y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65699y f178500e;

    /* renamed from: f */
    private static volatile C63010eb f178501f;

    /* renamed from: a */
    public int f178502a;

    /* renamed from: b */
    public int f178503b;

    /* renamed from: c */
    public String f178504c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f178505d = BuildConfig.FLAVOR;

    static {
        C65699y yVar = new C65699y();
        f178500e = yVar;
        C62942bv.registerDefaultInstance(C65699y.class, yVar);
    }

    private C65699y() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f178500e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65699y();
            case 4:
                return new C65698x();
            case 5:
                return f178500e;
            case 6:
                C63010eb ebVar = f178501f;
                if (ebVar == null) {
                    synchronized (C65699y.class) {
                        ebVar = f178501f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178500e);
                            f178501f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
