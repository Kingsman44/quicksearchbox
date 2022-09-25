package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.x */
/* compiled from: PG */
public final class C145175x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C145175x f392399c;

    /* renamed from: e */
    private static volatile C63010eb f392400e;

    /* renamed from: a */
    public String f392401a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f392402b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f392403d;

    static {
        C145175x xVar = new C145175x();
        f392399c = xVar;
        C62942bv.registerDefaultInstance(C145175x.class, xVar);
    }

    private C145175x() {
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
                return newMessageInfo(f392399c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C145175x();
            case 4:
                return new C145174w();
            case 5:
                return f392399c;
            case 6:
                C63010eb ebVar = f392400e;
                if (ebVar == null) {
                    synchronized (C145175x.class) {
                        ebVar = f392400e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392399c);
                            f392400e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
