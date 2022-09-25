package com.google.protos.youtube.p5162a.p5163a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.al */
/* compiled from: PG */
public final class C65982al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65982al f179457d;

    /* renamed from: e */
    private static volatile C63010eb f179458e;

    /* renamed from: a */
    public int f179459a;

    /* renamed from: b */
    public String f179460b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179461c = BuildConfig.FLAVOR;

    static {
        C65982al alVar = new C65982al();
        f179457d = alVar;
        C62942bv.registerDefaultInstance(C65982al.class, alVar);
    }

    private C65982al() {
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
                return newMessageInfo(f179457d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65982al();
            case 4:
                return new C65981ak();
            case 5:
                return f179457d;
            case 6:
                C63010eb ebVar = f179458e;
                if (ebVar == null) {
                    synchronized (C65982al.class) {
                        ebVar = f179458e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179457d);
                            f179458e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
