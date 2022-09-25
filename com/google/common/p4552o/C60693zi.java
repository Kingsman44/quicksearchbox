package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zi */
/* compiled from: PG */
public final class C60693zi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60693zi f164669d;

    /* renamed from: e */
    private static volatile C63010eb f164670e;

    /* renamed from: a */
    public int f164671a;

    /* renamed from: b */
    public C62971cq f164672b = emptyProtobufList();

    /* renamed from: c */
    public String f164673c = BuildConfig.FLAVOR;

    static {
        C60693zi ziVar = new C60693zi();
        f164669d = ziVar;
        C62942bv.registerDefaultInstance(C60693zi.class, ziVar);
    }

    private C60693zi() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f164669d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", C60691zg.class, C45240c.f118157a});
            case 3:
                return new C60693zi();
            case 4:
                return new C60692zh();
            case 5:
                return f164669d;
            case 6:
                C63010eb ebVar = f164670e;
                if (ebVar == null) {
                    synchronized (C60693zi.class) {
                        ebVar = f164670e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164669d);
                            f164670e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
