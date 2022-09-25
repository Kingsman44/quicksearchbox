package com.google.speech.p5230n.p5231a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.p */
/* compiled from: PG */
public final class C67379p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67379p f183147e;

    /* renamed from: g */
    private static volatile C63010eb f183148g;

    /* renamed from: a */
    public int f183149a;

    /* renamed from: b */
    public String f183150b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f183151c;

    /* renamed from: d */
    public String f183152d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f183153f = 2;

    static {
        C67379p pVar = new C67379p();
        f183147e = pVar;
        C62942bv.registerDefaultInstance(C67379p.class, pVar);
    }

    private C67379p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183153f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183153f = b;
                return null;
            case 2:
                return newMessageInfo(f183147e, "\u0001\u0003\u0000\u0001\u0002\b\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0006ဈ\u0006\bဌ\u0005", new Object[]{"a", "b", "d", C45240c.f118157a, C67378o.f183146a});
            case 3:
                return new C67379p();
            case 4:
                return new C67377n();
            case 5:
                return f183147e;
            case 6:
                C63010eb ebVar = f183148g;
                if (ebVar == null) {
                    synchronized (C67379p.class) {
                        ebVar = f183148g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183147e);
                            f183148g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
