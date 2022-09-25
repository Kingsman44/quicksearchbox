package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3879aw.p3881b.C50614q;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aqc */
/* compiled from: PG */
public final class aqc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aqc f135604e;

    /* renamed from: f */
    private static volatile C63010eb f135605f;

    /* renamed from: a */
    public int f135606a;

    /* renamed from: b */
    public String f135607b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f135608c;

    /* renamed from: d */
    public String f135609d = BuildConfig.FLAVOR;

    static {
        aqc aqc = new aqc();
        f135604e = aqc;
        C62942bv.registerDefaultInstance(aqc.class, aqc);
    }

    private aqc() {
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
                return newMessageInfo(f135604e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C50614q.f131687a, "d"});
            case 3:
                return new aqc();
            case 4:
                return new aqb();
            case 5:
                return f135604e;
            case 6:
                C63010eb ebVar = f135605f;
                if (ebVar == null) {
                    synchronized (aqc.class) {
                        ebVar = f135605f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135604e);
                            f135605f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
