package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.dc */
/* compiled from: PG */
public final class C65826dc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65826dc f178949c;

    /* renamed from: d */
    public static final C62940bt f178950d;

    /* renamed from: e */
    private static volatile C63010eb f178951e;

    /* renamed from: a */
    public int f178952a;

    /* renamed from: b */
    public String f178953b = BuildConfig.FLAVOR;

    static {
        C65826dc dcVar = new C65826dc();
        f178949c = dcVar;
        C62942bv.registerDefaultInstance(C65826dc.class, dcVar);
        f178950d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, dcVar, dcVar, (C62958ce) null, 296075900, C63066gd.MESSAGE, C65826dc.class);
    }

    private C65826dc() {
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
                return newMessageInfo(f178949c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65826dc();
            case 4:
                return new C65825db();
            case 5:
                return f178949c;
            case 6:
                C63010eb ebVar = f178951e;
                if (ebVar == null) {
                    synchronized (C65826dc.class) {
                        ebVar = f178951e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178949c);
                            f178951e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
