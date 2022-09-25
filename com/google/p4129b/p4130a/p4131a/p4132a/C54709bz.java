package com.google.p4129b.p4130a.p4131a.p4132a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bz */
/* compiled from: PG */
public final class C54709bz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54709bz f143599d;

    /* renamed from: e */
    private static volatile C63010eb f143600e;

    /* renamed from: a */
    public String f143601a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f143602b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143603c = BuildConfig.FLAVOR;

    static {
        C54709bz bzVar = new C54709bz();
        f143599d = bzVar;
        C62942bv.registerDefaultInstance(C54709bz.class, bzVar);
    }

    private C54709bz() {
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
                return newMessageInfo(f143599d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54709bz();
            case 4:
                return new C54708by();
            case 5:
                return f143599d;
            case 6:
                C63010eb ebVar = f143600e;
                if (ebVar == null) {
                    synchronized (C54709bz.class) {
                        ebVar = f143600e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143599d);
                            f143600e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
