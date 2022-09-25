package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.as */
/* compiled from: PG */
public final class C54826as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54826as f143863d;

    /* renamed from: e */
    private static volatile C63010eb f143864e;

    /* renamed from: a */
    public int f143865a;

    /* renamed from: b */
    public String f143866b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143867c = BuildConfig.FLAVOR;

    static {
        C54826as asVar = new C54826as();
        f143863d = asVar;
        C62942bv.registerDefaultInstance(C54826as.class, asVar);
    }

    private C54826as() {
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
                return newMessageInfo(f143863d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54826as();
            case 4:
                return new C54825ar();
            case 5:
                return f143863d;
            case 6:
                C63010eb ebVar = f143864e;
                if (ebVar == null) {
                    synchronized (C54826as.class) {
                        ebVar = f143864e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143863d);
                            f143864e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
