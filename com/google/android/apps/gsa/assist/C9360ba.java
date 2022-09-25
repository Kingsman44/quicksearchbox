package com.google.android.apps.gsa.assist;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.ba */
/* compiled from: PG */
public final class C9360ba extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9360ba f32505e;

    /* renamed from: f */
    private static volatile C63010eb f32506f;

    /* renamed from: a */
    public int f32507a;

    /* renamed from: b */
    public String f32508b = "en";

    /* renamed from: c */
    public String f32509c = "US";

    /* renamed from: d */
    public String f32510d = "America/Los_Angeles";

    static {
        C9360ba baVar = new C9360ba();
        f32505e = baVar;
        C62942bv.registerDefaultInstance(C9360ba.class, baVar);
    }

    private C9360ba() {
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
                return newMessageInfo(f32505e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9360ba();
            case 4:
                return new C9355az();
            case 5:
                return f32505e;
            case 6:
                C63010eb ebVar = f32506f;
                if (ebVar == null) {
                    synchronized (C9360ba.class) {
                        ebVar = f32506f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32505e);
                            f32506f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
