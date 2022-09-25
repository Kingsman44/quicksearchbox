package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.t */
/* compiled from: PG */
public final class C145171t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C145171t f392380f;

    /* renamed from: g */
    private static volatile C63010eb f392381g;

    /* renamed from: a */
    public int f392382a;

    /* renamed from: b */
    public String f392383b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f392384c;

    /* renamed from: d */
    public boolean f392385d;

    /* renamed from: e */
    public int f392386e;

    static {
        C145171t tVar = new C145171t();
        f392380f = tVar;
        C62942bv.registerDefaultInstance(C145171t.class, tVar);
    }

    private C145171t() {
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
                return newMessageInfo(f392380f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C145171t();
            case 4:
                return new C145170s();
            case 5:
                return f392380f;
            case 6:
                C63010eb ebVar = f392381g;
                if (ebVar == null) {
                    synchronized (C145171t.class) {
                        ebVar = f392381g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392380f);
                            f392381g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
