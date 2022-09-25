package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.p */
/* compiled from: PG */
public final class C145167p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C145167p f392369f;

    /* renamed from: g */
    private static volatile C63010eb f392370g;

    /* renamed from: a */
    public int f392371a;

    /* renamed from: b */
    public int f392372b;

    /* renamed from: c */
    public String f392373c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f392374d;

    /* renamed from: e */
    public C62971cq f392375e = C62942bv.emptyProtobufList();

    static {
        C145167p pVar = new C145167p();
        f392369f = pVar;
        C62942bv.registerDefaultInstance(C145167p.class, pVar);
    }

    private C145167p() {
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
                return newMessageInfo(f392369f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"a", "b", C145165n.f392368a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C145167p();
            case 4:
                return new C145164m();
            case 5:
                return f392369f;
            case 6:
                C63010eb ebVar = f392370g;
                if (ebVar == null) {
                    synchronized (C145167p.class) {
                        ebVar = f392370g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392369f);
                            f392370g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
