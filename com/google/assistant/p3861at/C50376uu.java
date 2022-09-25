package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.uu */
/* compiled from: PG */
public final class C50376uu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50376uu f131134d;

    /* renamed from: f */
    private static volatile C63010eb f131135f;

    /* renamed from: a */
    public C62971cq f131136a = emptyProtobufList();

    /* renamed from: b */
    public String f131137b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131138c = "other";

    /* renamed from: e */
    private int f131139e;

    static {
        C50376uu uuVar = new C50376uu();
        f131134d = uuVar;
        C62942bv.registerDefaultInstance(C50376uu.class, uuVar);
    }

    private C50376uu() {
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
                return newMessageInfo(f131134d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"e", "a", C50375ut.class, "b", C45240c.f118157a});
            case 3:
                return new C50376uu();
            case 4:
                return new C50373ur();
            case 5:
                return f131134d;
            case 6:
                C63010eb ebVar = f131135f;
                if (ebVar == null) {
                    synchronized (C50376uu.class) {
                        ebVar = f131135f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131134d);
                            f131135f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
