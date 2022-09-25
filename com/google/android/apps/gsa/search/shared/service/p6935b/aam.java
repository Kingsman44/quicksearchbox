package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aam */
/* compiled from: PG */
public final class aam extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aam f237086e;

    /* renamed from: f */
    private static volatile C63010eb f237087f;

    /* renamed from: a */
    public int f237088a;

    /* renamed from: b */
    public String f237089b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f237090c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f237091d;

    static {
        aam aam = new aam();
        f237086e = aam;
        C62942bv.registerDefaultInstance(aam.class, aam);
    }

    private aam() {
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
                return newMessageInfo(f237086e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new aam();
            case 4:
                return new aal();
            case 5:
                return f237086e;
            case 6:
                C63010eb ebVar = f237087f;
                if (ebVar == null) {
                    synchronized (aam.class) {
                        ebVar = f237087f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237086e);
                            f237087f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
