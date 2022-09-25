package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.af */
/* compiled from: PG */
public final class C145128af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C145128af f392219d;

    /* renamed from: e */
    private static volatile C63010eb f392220e;

    /* renamed from: a */
    public int f392221a;

    /* renamed from: b */
    public String f392222b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f392223c;

    static {
        C145128af afVar = new C145128af();
        f392219d = afVar;
        C62942bv.registerDefaultInstance(C145128af.class, afVar);
    }

    private C145128af() {
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
                return newMessageInfo(f392219d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C145128af();
            case 4:
                return new C145127ae();
            case 5:
                return f392219d;
            case 6:
                C63010eb ebVar = f392220e;
                if (ebVar == null) {
                    synchronized (C145128af.class) {
                        ebVar = f392220e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392219d);
                            f392220e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
