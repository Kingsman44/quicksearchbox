package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.r */
/* compiled from: PG */
public final class C145169r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C145169r f392376b;

    /* renamed from: d */
    private static volatile C63010eb f392377d;

    /* renamed from: a */
    public String f392378a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f392379c;

    static {
        C145169r rVar = new C145169r();
        f392376b = rVar;
        C62942bv.registerDefaultInstance(C145169r.class, rVar);
    }

    private C145169r() {
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
                return newMessageInfo(f392376b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C145169r();
            case 4:
                return new C145168q();
            case 5:
                return f392376b;
            case 6:
                C63010eb ebVar = f392377d;
                if (ebVar == null) {
                    synchronized (C145169r.class) {
                        ebVar = f392377d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392376b);
                            f392377d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
