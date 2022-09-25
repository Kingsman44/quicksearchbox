package com.google.protos.p5127o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.at */
/* compiled from: PG */
public final class C65665at extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65665at f178422e;

    /* renamed from: f */
    private static volatile C63010eb f178423f;

    /* renamed from: a */
    public int f178424a;

    /* renamed from: b */
    public String f178425b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f178426c = emptyProtobufList();

    /* renamed from: d */
    public String f178427d = BuildConfig.FLAVOR;

    static {
        C65665at atVar = new C65665at();
        f178422e = atVar;
        C62942bv.registerDefaultInstance(C65665at.class, atVar);
    }

    private C65665at() {
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
                return newMessageInfo(f178422e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, C65686l.class, "d"});
            case 3:
                return new C65665at();
            case 4:
                return new C65664as();
            case 5:
                return f178422e;
            case 6:
                C63010eb ebVar = f178423f;
                if (ebVar == null) {
                    synchronized (C65665at.class) {
                        ebVar = f178423f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178422e);
                            f178423f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
