package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48224aj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agm */
/* compiled from: PG */
public final class agm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agm f158649e;

    /* renamed from: f */
    private static volatile C63010eb f158650f;

    /* renamed from: a */
    public int f158651a;

    /* renamed from: b */
    public String f158652b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C48224aj f158653c;

    /* renamed from: d */
    public boolean f158654d;

    static {
        agm agm = new agm();
        f158649e = agm;
        C62942bv.registerDefaultInstance(agm.class, agm);
    }

    private agm() {
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
                return newMessageInfo(f158649e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new agm();
            case 4:
                return new agl();
            case 5:
                return f158649e;
            case 6:
                C63010eb ebVar = f158650f;
                if (ebVar == null) {
                    synchronized (agm.class) {
                        ebVar = f158650f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158649e);
                            f158650f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
